/*
 * Copyright 2008-2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */
package com.autonomy.nonaci.indexing.impl;

public class DreValidateCommand extends IndexCommandImpl {

    public enum Type {
        DISK_INDEX("DiskIndex"), NODE_TABLE("NodeTable");

        private final String actual;

        Type(final String actual) {
            this.actual = actual;
        }

        @Override
        public String toString() {
            return actual;
        }
    }

    /** Creates a new instance of <tt>DreValidateCommand</tt>. */
    public DreValidateCommand() {
        super(CMD_DREVALIDATE);
    }

    public Type getType() {
        return Type.valueOf(get(PARAM_TYPE));
    }

    public void setType(final Type type) {
        put(PARAM_TYPE, type.toString());
    }

}  // End of class DreValidateCommand...
