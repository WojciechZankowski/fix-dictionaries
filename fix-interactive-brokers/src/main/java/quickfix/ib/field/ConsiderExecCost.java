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


public class ConsiderExecCost extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 6559;
	public static final char HIGHEST_REBATE = '1';
	public static final char PRIMARY_EXCHANGE = '2';
	public static final char HIGHEST_VOLUME_EXCHANGE_WITH_REBATE = '3';
	public static final char HIGHEST_VOLUME_EXCHAGNE_WITH_LOWEST_FEE = '4';
	
	public ConsiderExecCost() {
		super(6559);
	}

	public ConsiderExecCost(String data) {
		super(6559, data);
	}
	
}
