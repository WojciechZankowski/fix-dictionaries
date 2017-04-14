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


public class ExecInst extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 18;
	public static final char UNKNOWN = '0';
	public static final char NOT_HELD = '1';
	public static final char HELD = '5';
	
	public ExecInst() {
		super(18);
	}

	public ExecInst(char data) {
		super(18, data);
	}
	
}
