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


public class PartyRole extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 452;
	public static final int EXECUTING_FIRM = 1;
	public static final int BROKER_OF_CREDIT = 2;
	public static final int CLIENT_ID = 3;
	public static final int CLEARING_FIRM = 4;
	public static final int INVESTOR_ID = 5;
	public static final int INTRODUCING_FIRM = 6;
	public static final int ENTERING_FIRM = 7;
	public static final int LOCATE_LENDING_FIRM = 8;
	public static final int FUND_MANAGER_CLIENT_ID = 9;
	
	public PartyRole() {
		super(452);
	}

	public PartyRole(int data) {
		super(452, data);
	}
	
}
