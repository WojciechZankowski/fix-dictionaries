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


public class SyntheticOrdType extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 16107;
	public static final String Time_Slicer = "1";
	public static final String Time_Duration = "2";
	public static final String Volume_Slicer = "3";
	public static final String Volume_Duration = "4";
	public static final String Iceberg = "5";
	
	public SyntheticOrdType() {
		super(16107);
	}

	public SyntheticOrdType(String data) {
		super(16107, data);
	}
	
}
