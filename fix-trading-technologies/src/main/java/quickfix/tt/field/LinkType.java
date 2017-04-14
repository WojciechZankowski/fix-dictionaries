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


public class LinkType extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 16114;
	public static final char SPREAD_QUOTING = '1';
	public static final char SPREAD_HEDGE = '2';
	public static final char SPREAD_POSITION_RESERVE = '3';
	public static final char SYNTHETIC_CHILD = '5';
	public static final char SYNTHETIC_CHILD_POSITION_RESERVE = '6';
	public static final char STAGED_CHILD = '7';
	public static final char ALGO_CHILD = 'A';
	public static final char UNKNOWN = 'U';
	
	public LinkType() {
		super(16114);
	}

	public LinkType(char data) {
		super(16114, data);
	}
	
}
