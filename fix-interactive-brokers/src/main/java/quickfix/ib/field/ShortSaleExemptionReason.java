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

package quickfix.ib.field;

import quickfix.StringField;


public class ShortSaleExemptionReason extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 1688;
	public static final char EXEMPTION_REASON_UNKNOWN = '0';
	public static final char INCOMING_SHORT_SALE_EXEMPT = '1';
	public static final char DELAYED_DELIVERY = '3';
	public static final char ODD_LOT = '4';
	public static final char DOMESTIC_ARBITRAGE = '5';
	public static final char INTERNATIONAL_ARBITRAGE = '6';
	public static final char UNDERWRITER_OR_SYNDICATE_DISTRIBUTION = '7';
	public static final char RISKLESS_PRINCIPAL = '8';
	public static final char VWAP = '9';
	
	public ShortSaleExemptionReason() {
		super(1688);
	}

	public ShortSaleExemptionReason(String data) {
		super(1688, data);
	}
	
}
