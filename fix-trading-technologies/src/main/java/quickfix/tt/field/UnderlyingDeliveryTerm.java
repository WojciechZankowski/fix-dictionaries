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


public class UnderlyingDeliveryTerm extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 18212;
	public static final char DAY = 'D';
	public static final char WEEK = 'W';
	public static final char BALANCE = 'B';
	public static final char QUARTER = 'Q';
	public static final char SEASON = 'S';
	public static final char YEAR = 'Y';
	public static final char VARIABLE = 'V';
	
	public UnderlyingDeliveryTerm() {
		super(18212);
	}

	public UnderlyingDeliveryTerm(char data) {
		super(18212, data);
	}
	
}
