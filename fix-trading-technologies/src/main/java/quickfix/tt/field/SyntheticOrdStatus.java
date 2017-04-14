/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.tt.field;

import quickfix.StringField;


public class SyntheticOrdStatus extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 16101;
	public static final String Waiting = "N";
	public static final String Pending_Trigger = "T";
	public static final String Rejected = "J";
	public static final String Working = "W";
	public static final String Hold = "H";
	public static final String Paused = "P";
	public static final String Deleting = "E";
	public static final String Deleted = "D";
	public static final String Pulling = "L";
	public static final String Pausing = "S";
	public static final String Resuming = "M";
	public static final String Initializing = "I";
	public static final String Recovering = "R";
	public static final String Filled = "F";
	public static final String Expired = "X";
	public static final String Unmanaged = "U";
	
	public SyntheticOrdStatus() {
		super(16101);
	}

	public SyntheticOrdStatus(String data) {
		super(16101, data);
	}
	
}
