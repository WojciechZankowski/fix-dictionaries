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

package quickfix.oanda.fix44;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.oanda.fix44.Heartbeat.MSGTYPE:
				return new quickfix.oanda.fix44.Heartbeat();
	
			case quickfix.oanda.fix44.Logon.MSGTYPE:
				return new quickfix.oanda.fix44.Logon();
	
			case quickfix.oanda.fix44.TestRequest.MSGTYPE:
				return new quickfix.oanda.fix44.TestRequest();
	
			case quickfix.oanda.fix44.ResendRequest.MSGTYPE:
				return new quickfix.oanda.fix44.ResendRequest();
	
			case quickfix.oanda.fix44.SequenceReset.MSGTYPE:
				return new quickfix.oanda.fix44.SequenceReset();
	
			case quickfix.oanda.fix44.News.MSGTYPE:
				return new quickfix.oanda.fix44.News();
	
			case quickfix.oanda.fix44.Logout.MSGTYPE:
				return new quickfix.oanda.fix44.Logout();
	
			case quickfix.oanda.fix44.Reject.MSGTYPE:
				return new quickfix.oanda.fix44.Reject();
	
			case quickfix.oanda.fix44.BusinessMessageReject.MSGTYPE:
				return new quickfix.oanda.fix44.BusinessMessageReject();
	
			case quickfix.oanda.fix44.MarketDataRequest.MSGTYPE:
				return new quickfix.oanda.fix44.MarketDataRequest();
	
			case quickfix.oanda.fix44.MarketDataSnapshotFullRefresh.MSGTYPE:
				return new quickfix.oanda.fix44.MarketDataSnapshotFullRefresh();
	
			case quickfix.oanda.fix44.MarketDataIncrementalRefresh.MSGTYPE:
				return new quickfix.oanda.fix44.MarketDataIncrementalRefresh();
	
			case quickfix.oanda.fix44.MarketDataRequestReject.MSGTYPE:
				return new quickfix.oanda.fix44.MarketDataRequestReject();
	
			case quickfix.oanda.fix44.NewOrderSingle.MSGTYPE:
				return new quickfix.oanda.fix44.NewOrderSingle();
	
			case quickfix.oanda.fix44.OrderCancelRequest.MSGTYPE:
				return new quickfix.oanda.fix44.OrderCancelRequest();
	
			case quickfix.oanda.fix44.OrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.oanda.fix44.OrderCancelReplaceRequest();
	
			case quickfix.oanda.fix44.ExecutionReport.MSGTYPE:
				return new quickfix.oanda.fix44.ExecutionReport();
	
			case quickfix.oanda.fix44.OrderCancelReject.MSGTYPE:
				return new quickfix.oanda.fix44.OrderCancelReject();
	
			case quickfix.oanda.fix44.OrderStatusRequest.MSGTYPE:
				return new quickfix.oanda.fix44.OrderStatusRequest();
	
		}

		return new quickfix.oanda.fix44.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.oanda.fix44.News.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.oanda.field.LinesOfText.FIELD:
					return new quickfix.oanda.fix44.News.LinesOfText();
	
				}
				break;
	
			case quickfix.oanda.fix44.MarketDataRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.oanda.field.NoMDEntryTypes.FIELD:
					return new quickfix.oanda.fix44.MarketDataRequest.NoMDEntryTypes();
	
				case quickfix.oanda.field.NoRelatedSym.FIELD:
					return new quickfix.oanda.fix44.MarketDataRequest.NoRelatedSym();
	
				}
				break;
	
			case quickfix.oanda.fix44.MarketDataSnapshotFullRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.oanda.field.NoMDEntries.FIELD:
					return new quickfix.oanda.fix44.MarketDataSnapshotFullRefresh.NoMDEntries();
	
				}
				break;
	
			case quickfix.oanda.fix44.MarketDataIncrementalRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.oanda.field.NoMDEntries.FIELD:
					return new quickfix.oanda.fix44.MarketDataIncrementalRefresh.NoMDEntries();
	
				}
				break;
	
		}

		return null;
	}
}
