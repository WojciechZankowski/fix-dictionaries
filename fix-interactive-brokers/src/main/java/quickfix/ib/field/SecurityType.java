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


public class SecurityType extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 167;
	public static final String COMMON_STOCK = "CS";
	public static final String FUTURE = "FUT";
	public static final String OPTION = "OPT";
	public static final String WARRANT = "WAR";
	public static final String MULTILEG_COMPONENT = "MLEG";
	public static final String BONDS = "BOND";
	public static final String FOREIGN_EXCHANGE = "CASH";
	public static final String CONTRACT_FOR_DIFFERENCE = "CFD";
	public static final String SPOT = "CMDTY";
	public static final String MUTUAL_FUND = "FUND";
	
	public SecurityType() {
		super(167);
	}

	public SecurityType(String data) {
		super(167, data);
	}
	
}
