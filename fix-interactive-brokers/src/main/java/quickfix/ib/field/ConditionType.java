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


public class ConditionType extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 6222;
	public static final char PRICE = '1';
	public static final char TIME = '3';
	public static final char MARGIN_CUSHION = '4';
	public static final char TRADE = '5';
	public static final char VOLUME = '6';
	
	public ConditionType() {
		super(6222);
	}

	public ConditionType(String data) {
		super(6222, data);
	}
	
}
