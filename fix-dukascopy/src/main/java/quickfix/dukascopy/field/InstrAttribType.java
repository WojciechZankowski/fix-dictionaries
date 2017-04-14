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

package quickfix.dukascopy.field;

import quickfix.IntField;


public class InstrAttribType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 871;
	public static final int FLAT = 1;
	public static final int ZERO_COUPON = 2;
	public static final int INTEREST_BEARING = 3;
	public static final int NO_PERIODIC_PAYMENTS = 4;
	public static final int VARIABLE_RATE = 5;
	public static final int LESS_FEE_FOR_PUT = 6;
	public static final int STEPPED_COUPON = 7;
	public static final int COUPON_PERIOD = 8;
	public static final int WHEN_AND_IF_ISSUED = 9;
	
	public InstrAttribType() {
		super(871);
	}

	public InstrAttribType(int data) {
		super(871, data);
	}
	
}
