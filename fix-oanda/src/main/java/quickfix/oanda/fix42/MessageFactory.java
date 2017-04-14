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

package quickfix.oanda.fix42;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.oanda.fix42.Heartbeat.MSGTYPE:
				return new quickfix.oanda.fix42.Heartbeat();
	
			case quickfix.oanda.fix42.Logon.MSGTYPE:
				return new quickfix.oanda.fix42.Logon();
	
			case quickfix.oanda.fix42.TestRequest.MSGTYPE:
				return new quickfix.oanda.fix42.TestRequest();
	
			case quickfix.oanda.fix42.ResendRequest.MSGTYPE:
				return new quickfix.oanda.fix42.ResendRequest();
	
			case quickfix.oanda.fix42.SequenceReset.MSGTYPE:
				return new quickfix.oanda.fix42.SequenceReset();
	
			case quickfix.oanda.fix42.News.MSGTYPE:
				return new quickfix.oanda.fix42.News();
	
			case quickfix.oanda.fix42.Logout.MSGTYPE:
				return new quickfix.oanda.fix42.Logout();
	
			case quickfix.oanda.fix42.Reject.MSGTYPE:
				return new quickfix.oanda.fix42.Reject();
	
			case quickfix.oanda.fix42.BusinessMessageReject.MSGTYPE:
				return new quickfix.oanda.fix42.BusinessMessageReject();
	
			case quickfix.oanda.fix42.MarketDataRequest.MSGTYPE:
				return new quickfix.oanda.fix42.MarketDataRequest();
	
			case quickfix.oanda.fix42.MarketDataSnapshotFullRefresh.MSGTYPE:
				return new quickfix.oanda.fix42.MarketDataSnapshotFullRefresh();
	
			case quickfix.oanda.fix42.MarketDataIncrementalRefresh.MSGTYPE:
				return new quickfix.oanda.fix42.MarketDataIncrementalRefresh();
	
			case quickfix.oanda.fix42.MarketDataRequestReject.MSGTYPE:
				return new quickfix.oanda.fix42.MarketDataRequestReject();
	
			case quickfix.oanda.fix42.NewOrderSingle.MSGTYPE:
				return new quickfix.oanda.fix42.NewOrderSingle();
	
			case quickfix.oanda.fix42.OrderCancelRequest.MSGTYPE:
				return new quickfix.oanda.fix42.OrderCancelRequest();
	
			case quickfix.oanda.fix42.OrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.oanda.fix42.OrderCancelReplaceRequest();
	
			case quickfix.oanda.fix42.ExecutionReport.MSGTYPE:
				return new quickfix.oanda.fix42.ExecutionReport();
	
			case quickfix.oanda.fix42.OrderCancelReject.MSGTYPE:
				return new quickfix.oanda.fix42.OrderCancelReject();
	
			case quickfix.oanda.fix42.OrderStatusRequest.MSGTYPE:
				return new quickfix.oanda.fix42.OrderStatusRequest();
	
		}

		return new quickfix.oanda.fix42.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.oanda.fix42.News.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.oanda.field.LinesOfText.FIELD:
					return new quickfix.oanda.fix42.News.LinesOfText();
	
				}
				break;
	
			case quickfix.oanda.fix42.MarketDataRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.oanda.field.NoMDEntryTypes.FIELD:
					return new quickfix.oanda.fix42.MarketDataRequest.NoMDEntryTypes();
	
				case quickfix.oanda.field.NoRelatedSym.FIELD:
					return new quickfix.oanda.fix42.MarketDataRequest.NoRelatedSym();
	
				}
				break;
	
			case quickfix.oanda.fix42.MarketDataSnapshotFullRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.oanda.field.NoMDEntries.FIELD:
					return new quickfix.oanda.fix42.MarketDataSnapshotFullRefresh.NoMDEntries();
	
				}
				break;
	
			case quickfix.oanda.fix42.MarketDataIncrementalRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.oanda.field.NoMDEntries.FIELD:
					return new quickfix.oanda.fix42.MarketDataIncrementalRefresh.NoMDEntries();
	
				}
				break;
	
		}

		return null;
	}
}
