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


public class OptionAcct extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 6122;
	public static final String CUSTOMER = "c";
	public static final String FIRM = "f";
	public static final String MARKET_MAKER = "m";
	public static final String BROKER_DEALER = "b";
	public static final String AWAY_MARKET_MAKER = "n";
	public static final String SPECIALIST_IN_UNDERLYING = "y";
	public static final String JOINT_BACK_OFFICE = "j";
	
	public OptionAcct() {
		super(6122);
	}

	public OptionAcct(String data) {
		super(6122, data);
	}
	
}
