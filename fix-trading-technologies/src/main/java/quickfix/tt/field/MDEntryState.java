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


public class MDEntryState extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 16486;
	public static final int NONE = 1;
	public static final int PUBLIC_WORKUP_AGGRESSOR_HIT = 2;
	public static final int PUBLIC_WORKUP_AGGRESSOR_TAKE = 3;
	public static final int PRIVATE_WORKUP_AGGRESSOR_HIT = 4;
	public static final int PRIVATE_WORKUP_AGGRESSOR_TAKE = 5;
	
	public MDEntryState() {
		super(16486);
	}

	public MDEntryState(int data) {
		super(16486, data);
	}
	
}
