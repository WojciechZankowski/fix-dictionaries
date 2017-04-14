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


public class SecuritySubType extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 10762;
	public static final String UNKNOWN = "Unknown";
	public static final String STRANGLE = "Strangle";
	public static final String STRADDLE = "Straddle";
	public static final String GUTS = "Guts";
	public static final String LADDER = "Ladder";
	public static final String VOLA = "Volatility Trade";
	public static final String IRON_BUTTERFLY = "Iron BFly";
	public static final String BOX = "Box";
	public static final String COMBO = "Combo";
	public static final String _2X1RATIO = "2X1 Ratio";
	public static final String CALLPUT = "Misc. Call/Put Spread";
	public static final String CONV_REVERS = "Conversion/Reversal";
	public static final String DIAG_CALENDAR = "Diag Calendar";
	public static final String STRAD_CALENDAR = "Strad Calendar";
	public static final String DIAG_STRAD_CAL = "Diag Strad Calendar";
	public static final String INTERPROD = "Inter-Product";
	public static final String CALENDAR = "Calendar";
	public static final String CONDOR = "Condor";
	public static final String BUTTERFLY = "Butterfly";
	public static final String STRIP = "Strip";
	public static final String PACK = "Pack";
	public static final String BUNDLE = "Bundle";
	public static final String SYNTH_CONV_REVERS = "Synthetic Conv/Rev";
	public static final String CALL_SPREAD_VERS_PUT = "Call Spread vs. Put";
	public static final String PUT_SPREAD_VERS_CALL = "Put Spread vs. Call";
	public static final String STRAD_VERS_CALLPUT = "Straddle vs. Call/Put";
	public static final String HEDGED_CALLPUT = "Hedged Call/Put Spread";
	public static final String HEDGED_STRAD = "Hedged Straddle";
	public static final String HEDGED_CALL_SPREAD_VERS_PUT = "Hedged Call Spread versus Put";
	public static final String HEDGED_PUT_SPREAD_VERS_CALL = "Hedged Put Spread versus Call";
	public static final String HEDGED_CALLPUT_LADDER = "Hedged Ladder";
	public static final String HEDGED_COMBO = "Hedged Combo";
	public static final String HEDGED_2X1RATIO = "Vol 1x2 Ratio";
	public static final String HEDGED_CALENDAR = "Vol Calendar";
	public static final String JELLY_ROLL = "Jelly Roll";
	public static final String IRON_CONDOR = "Iron Condor";
	public static final String OPTION_STRIP = "Option Strip";
	public static final String REDUCED_TICK_SPREAD = "Reduced Tick Spread";
	public static final String HEDGED_STRANGLE = "Hedged Strangle";
	public static final String FUTURE_SPREAD = "Spread";
	public static final String HEDGED_DIAG_CALENDAR = "Hedged Call/Put Diag Calendar Spread";
	public static final String HEDGED_STRAD_CALENDAR = "Hedged Straddle Calendar Spread";
	public static final String HEDGED_DIAG_STRAD_CAL = "Hedged Diagonal Straddle Calendar Spread";
	public static final String HEDGED_BUTTERFLY = "Hedged Butterfly";
	public static final String HEDGED_IRON_CONDOR = "Hedged Iron Condor";
	public static final String HEDGED_CONDOR = "Hedged Condor";
	public static final String HEDGED_IRON_BUTTERFLY = "Hedged Iron Butterfly";
	public static final String HEDGED_GUTS = "Hedged Guts";
	public static final String CABINET = "Cabinet";
	public static final String HEDGED_CONV_REVERS = "Conversion/Reversal vs. Short U/L";
	public static final String BUY_WRITE = "Buy/Write";
	public static final String VERTICAL = "Vertical";
	public static final String CUSTOM_MARKET = "Custom Market";
	public static final String COVERED = "Covered";
	public static final String HORIZONTAL = "Horizontal";
	public static final String XMAS_TREE = "X-Mas Tree";
	public static final String RISK_REVERSAL = "Risk Reversal";
	public static final String HORIZONTAL_STRADDLE = "Horizontal Straddle";
	public static final String DOUBLE = "Double";
	public static final String COND_CURVE = "Conditional Curve";
	public static final String STRADDLE_STRIP = "Straddle Strip";
	public static final String _3WAY = "3-Way";
	public static final String _1X2RATIO = "1x2 Ratio";
	public static final String _1X3RATIO = "1x3 Ratio";
	public static final String _2X3RATIO = "2x3 Ratio";
	public static final String PACK_BUTTERFLY = "Pack Butterfly";
	public static final String DOUBLE_BUTTERFLY = "Double Butterfly";
	public static final String MONTH_PACK = "Month vs. Pack";
	public static final String CRACK = "Crack";
	public static final String HEDGED_VERTICAL = "Hedged Vertical";
	public static final String HEDGED_HORIZONTAL = "Hedged Horizontal";
	public static final String HEDGED_XMAS_TREE = "Hedged X-Mas Tree";
	public static final String HEDGED_STRIP = "Hedged Strip";
	public static final String HEDGED_RISK_REVERSAL = "Hedged Risk Reversal";
	public static final String HEDGED_HORIZONTAL_STRADDLE = "Hedged Horizontal Straddle";
	public static final String HEDGED_DOUBLE = "Hedged Double";
	public static final String HEDGED_COND_CURVE = "Hedged Conditional Curve";
	public static final String HEDGED_STRADDLE_STRIP = "Hedged Straddle Strip";
	public static final String HEDGED_3WAY = "Hedged 3-Way";
	public static final String HEDGED_BOX = "Hedged Box";
	public static final String TAILOR_MADE = "Tailor Made Combinations";
	public static final String ICS = "ICS";
	public static final String NON_STANDARD_COMBINATION = "Non Standard Combination";
	public static final String _3WAY_CALL = "3-Way Straddle vs. Call";
	public static final String _3WAY_PUT = "3-Way Straddle vs. Put";
	public static final String CUSTOM_CARRY = "Custom Carry";
	public static final String RRTCS = "Reverse Reduced Tick Calendar Spread";
	
	public SecuritySubType() {
		super(10762);
	}

	public SecuritySubType(String data) {
		super(10762, data);
	}
	
}
