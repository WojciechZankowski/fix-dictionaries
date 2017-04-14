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

import quickfix.StringField;


public class TrailingPriceType extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 16131;
	public static final String LTP = "0";
	public static final String Bid = "1";
	public static final String Ask = "2";
	public static final String SameSide = "3";
	public static final String OppositeSide = "4";
	
	public TrailingPriceType() {
		super(16131);
	}

	public TrailingPriceType(String data) {
		super(16131, data);
	}
	
}
