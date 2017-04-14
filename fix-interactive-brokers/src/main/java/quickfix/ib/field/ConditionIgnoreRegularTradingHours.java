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


public class ConditionIgnoreRegularTradingHours extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 6128;
	public static final char ALLOW_TRIGGERING_OUTSIDE_OF_REGULAR_TRADING_HOURS = '1';
	
	public ConditionIgnoreRegularTradingHours() {
		super(6128);
	}

	public ConditionIgnoreRegularTradingHours(String data) {
		super(6128, data);
	}
	
}
