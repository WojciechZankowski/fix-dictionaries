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


public class CustomerOrFirm extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 204;
	public static final int CUSTOMER = 0;
	public static final int FIRM = 1;
	public static final int THIRD_AGENT_ACCOUNT_OR_GIVEUP_OR_SYSTEM_ALLOCATION = 2;
	public static final int FOURTH_AGENT_ACCOUNT = 3;
	public static final int FIFTH_AGENT_ACCOUNT = 4;
	public static final int SIXTH_AGENT_ACCOUNT = 5;
	public static final int SEVENTH_AGENT_ACCOUNT = 6;
	public static final int EIGHTH_AGENT_ACCOUNT = 7;
	public static final int NINTH_AGENT_ACCOUNT = 8;
	
	public CustomerOrFirm() {
		super(204);
	}

	public CustomerOrFirm(int data) {
		super(204, data);
	}
	
}
