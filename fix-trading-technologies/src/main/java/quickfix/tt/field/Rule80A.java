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

import quickfix.CharField;


public class Rule80A extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 47;
	public static final char AGENCY_SINGLE_ORDER = 'A';
	public static final char REGISTERED_EQUITY_MARKET_MAKER_TRADES = 'E';
	public static final char PRINCIPAL = 'P';
	public static final char GIVEUP = 'W';
	public static final char UNKNOWN = '0';
	
	public Rule80A() {
		super(47);
	}

	public Rule80A(char data) {
		super(47, data);
	}
	
}
