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


public class ContinuousUpdate extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 6275;
	public static final String USE_INITIAL_VOLATILITY_CALCULATION_ONLY = "1";
	public static final String CONTINUOUSLY_UPDATE_THE_PRICE_AS_VOLATILITY_CALCULATION_CHANGES = "2";
	public static final String PRICE_FOR_MAIN_ORDER_SPECIFIED_BY_CLIENT = "2";
	
	public ContinuousUpdate() {
		super(6275);
	}

	public ContinuousUpdate(String data) {
		super(6275, data);
	}
	
}
