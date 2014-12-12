/*
 * $Id$
 *
 * Copyright (c) 2008 - 2009, Autonomy Systems Ltd.
 *
 * DreExportXmlCommand.java
 * Created on 03-Jul-2008, 19:43:56
 * Last modified by $Author$ on $Date$
 */
package com.autonomy.nonaci.indexing.impl;

/**
 * Allows you to export XML documents from one or more IDOL databases (use <strong>DREEXPORTIDX</strong> to export IDX 
 * documents).
 * <p />
 * <strong>Note:</strong>
 * <ul>
 *   <li>Multisection documents are not split across chunks, so the <strong>BatchSize</strong> specified  in the 
 *       configuration file is not used exactly if this would require a document section to be split.</li>
 *   <li>You do not need to uncompress compressed XML files before indexing them. For example, the command <strong>
 *       DREADD?output-0.xml.gz</strong> indexes the <strong>output-0.xml.gz</strong> file correctly without you 
 *       uncompressing the file first.</li>
 *  </ul>
 *
 * @author boba
 * @version $Revision$ $Date$
 */
public class DreExportXmlCommand extends AbstractExportCommand {
    
    /** Creates a new instance of DreExportXmlCommand */
    public DreExportXmlCommand() {
        super(CMD_DREEXPORTXML);
    }
    
} // End of class DreExportXmlCommand...
