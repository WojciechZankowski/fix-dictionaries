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

package quickfix.oanda.field;

import quickfix.IntField;


public class CxlRejReason extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 102;
	public static final int TOO_LATE_TO_CANCEL = 0;
	public static final int UNKNOWN_ORDER = 1;
	public static final int BROKER_OPTION = 2;
	public static final int ALREADY_PENDING = 3;
	public static final int DUPLICATE_CLORDID_RECEIVED = 6;
	public static final int OTHER = 99;
	
	public CxlRejReason() {
		super(102);
	}

	public CxlRejReason(int data) {
		super(102, data);
	}
	
}
