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

import quickfix.StringField;


public class MsgType extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 35;
	public static final String HEARTBEAT = "0";
	public static final String REJECT = "3";
	public static final String LOGOUT = "5";
	public static final String EXECUTION_REPORT = "8";
	public static final String ORDER_CANCEL_REJECT = "9";
	public static final String LOGON = "A";
	public static final String NEWS = "B";
	public static final String ORDER_SINGLE = "D";
	public static final String ORDER_CANCEL_REQUEST = "F";
	public static final String ORDER_CANCEL = "G";
	public static final String ORDER_STATUS_REQUEST = "H";
	public static final String MARKET_DATA_REQUEST = "V";
	public static final String MARKET_DATA_SNAPSHOT = "W";
	public static final String MARKET_DATA_INCREMENTAL_REFRESH = "X";
	public static final String MARKET_DATA_REQUEST_REJECT = "Y";
	public static final String BUSINESS_MESSAGE_REJECT = "j";
	
	public MsgType() {
		super(35);
	}

	public MsgType(String data) {
		super(35, data);
	}
	
}
