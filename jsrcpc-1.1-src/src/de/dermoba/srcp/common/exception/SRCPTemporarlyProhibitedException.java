/*
 * $RCSfile: SRCPTemporarlyProhibitedException.java,v $
 *
 * History
 $Log: SRCPTemporarlyProhibitedException.java,v $
 Revision 1.3  2007/12/30 13:54:04  andre_schenk
 added serialVersionUID

 Revision 1.2  2006/04/16 11:14:17  fork_ch
 - added CommanChannelListener
 - updated Exceptions to also get the cause of the exception

 Revision 1.1  2006/01/02 15:55:54  fork_ch
 - Exception generation is done by ReceivedException Handler
 - added many exceptions
 - added a "old protocol"-mode

 Revision 1.1  2005/07/09 13:11:58  harders
 balkon050709

 Revision 1.1  2005/06/30 14:41:31  harders
 Aufgero?=umte erste Version

 Revision 1.1.1.1  2002/01/08 18:21:54  osc3
 import of jsrcpd


 */

package de.dermoba.srcp.common.exception;


/**
 *
 * @author  osc
 * @version $Revision: 1.3 $
  */

public class SRCPTemporarlyProhibitedException extends SRCPCommandException {

	private static final long serialVersionUID = 3282593172997043481L;

    public final static int NUMBER = 413;

    public SRCPTemporarlyProhibitedException () {
        super(NUMBER,"temporarly prohibited");
    }

    public SRCPTemporarlyProhibitedException (Throwable cause) {
        super(NUMBER,"temporarly prohibited", cause);
    }
    public SRCPException cloneExc() {
    	return new SRCPTemporarlyProhibitedException ();
    }

}
