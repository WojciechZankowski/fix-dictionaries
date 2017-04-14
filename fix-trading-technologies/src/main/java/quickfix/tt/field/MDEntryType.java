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


public class MDEntryType extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 269;
	public static final char BID = '0';
	public static final char OFFER = '1';
	public static final char TRADE = '2';
	public static final char OPENING_PRICE = '4';
	public static final char CLOSING_PRICE = '5';
	public static final char SETTLEMENT_PRICE = '6';
	public static final char TRADING_SESSION_HIGH_PRICE = '7';
	public static final char TRADING_SESSION_LOW_PRICE = '8';
	public static final char INDICATIVE_OPEN = 'p';
	public static final char INDICATIVE_CLOSE = 'q';
	public static final char MARKET_BID = 'n';
	public static final char MARKET_ASK = 'o';
	public static final char INDICATIVE_BID = 'r';
	public static final char INDICATIVE_ASK = 's';
	public static final char INDICATIVE_SETTLE = 't';
	public static final char LOCAL_BID = 'u';
	public static final char LOCAL_OFFER = 'v';
	public static final char DEALABLE_REGULAR_BID = 'w';
	public static final char DEALABLE_REGULAR_OFFER = 'x';
	public static final char NON_CREDIT_SCREENED_BID = 'y';
	public static final char NON_CREDIT_SCREENED_OFFER = 'z';
	public static final char WORKUP_PRICE = 'P';
	public static final char IMPLIED_BID = 'Y';
	public static final char IMPLIED_ASK = 'Z';
	
	public MDEntryType() {
		super(269);
	}

	public MDEntryType(char data) {
		super(269, data);
	}
	
}
