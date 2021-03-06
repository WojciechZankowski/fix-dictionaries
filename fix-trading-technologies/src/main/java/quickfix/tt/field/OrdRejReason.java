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

import quickfix.IntField;


public class OrdRejReason extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 103;
	public static final int BROKER_OPTION = 0;
	public static final int UNKNOWN_ORDER = 5;
	public static final int INSUFFICIENT_TTUS_PERMISSIONS = 99;
	public static final int TIMED_OUT = 100;
	
	public OrdRejReason() {
		super(103);
	}

	public OrdRejReason(int data) {
		super(103, data);
	}
	
}
