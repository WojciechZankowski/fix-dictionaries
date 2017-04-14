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

package quickfix.ib.field;

import quickfix.StringField;


public class StrategyParameterValue extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 5960;
	public static final String AGGRESIVE = "Aggressive";
	public static final String PASSIVE = "Passive";
	public static final String NEUTRAL = "Neutral";
	public static final String GET_DONE = "Get Done";
	
	public StrategyParameterValue() {
		super(5960);
	}

	public StrategyParameterValue(String data) {
		super(5960, data);
	}
	
}
