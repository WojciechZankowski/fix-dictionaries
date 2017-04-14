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


public class ManualOrderIndicator extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 11028;
	public static final char Order_was_sent_manually = 'Y';
	public static final char Order_was_generated_by_automated_trading_logic = 'N';
	
	public ManualOrderIndicator() {
		super(11028);
	}

	public ManualOrderIndicator(char data) {
		super(11028, data);
	}
	
}
