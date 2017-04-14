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


public class LeftAction extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 16155;
	public static final String Leave = "0";
	public static final String Merge = "1";
	public static final String Market = "2";
	public static final String Payup = "3";
	
	public LeftAction() {
		super(16155);
	}

	public LeftAction(String data) {
		super(16155, data);
	}
	
}
