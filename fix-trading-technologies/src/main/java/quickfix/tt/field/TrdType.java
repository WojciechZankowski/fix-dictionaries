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

import quickfix.IntField;


public class TrdType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 10828;
	public static final int Block_Trade = 1;
	public static final int Exchange_For_Swap_EFS = 12;
	public static final int Committed = 89;
	public static final int Exchange_for_Physical_Equity_Index = 90;
	public static final int Exchange_for_Physical_Fixed_Income = 91;
	public static final int Cross = 92;
	public static final int One_Sided = 93;
	public static final int Against_Actual = 94;
	public static final int Asset_Allocation = 95;
	public static final int Basis = 96;
	public static final int Guaranteed_Cross = 97;
	public static final int Prof_Trade = 98;
	public static final int Vola = 99;
	
	public TrdType() {
		super(10828);
	}

	public TrdType(int data) {
		super(10828, data);
	}
	
}
