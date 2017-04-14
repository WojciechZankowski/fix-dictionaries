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

package quickfix.tt;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.tt.Heartbeat.MSGTYPE:
				return new quickfix.tt.Heartbeat();
	
			case quickfix.tt.Logon.MSGTYPE:
				return new quickfix.tt.Logon();
	
			case quickfix.tt.TestRequest.MSGTYPE:
				return new quickfix.tt.TestRequest();
	
			case quickfix.tt.ResendRequest.MSGTYPE:
				return new quickfix.tt.ResendRequest();
	
			case quickfix.tt.Reject.MSGTYPE:
				return new quickfix.tt.Reject();
	
			case quickfix.tt.SequenceReset.MSGTYPE:
				return new quickfix.tt.SequenceReset();
	
			case quickfix.tt.Logout.MSGTYPE:
				return new quickfix.tt.Logout();
	
			case quickfix.tt.MarketDataRequest.MSGTYPE:
				return new quickfix.tt.MarketDataRequest();
	
			case quickfix.tt.MarketDataSnapshotFullRefresh.MSGTYPE:
				return new quickfix.tt.MarketDataSnapshotFullRefresh();
	
			case quickfix.tt.MarketDataIncrementalRefresh.MSGTYPE:
				return new quickfix.tt.MarketDataIncrementalRefresh();
	
			case quickfix.tt.MarketDataRequestReject.MSGTYPE:
				return new quickfix.tt.MarketDataRequestReject();
	
			case quickfix.tt.SecurityDefinitionRequest.MSGTYPE:
				return new quickfix.tt.SecurityDefinitionRequest();
	
			case quickfix.tt.SecurityDefinition.MSGTYPE:
				return new quickfix.tt.SecurityDefinition();
	
			case quickfix.tt.SecurityStatusRequest.MSGTYPE:
				return new quickfix.tt.SecurityStatusRequest();
	
			case quickfix.tt.SecurityStatus.MSGTYPE:
				return new quickfix.tt.SecurityStatus();
	
			case quickfix.tt.NewOrderSingle.MSGTYPE:
				return new quickfix.tt.NewOrderSingle();
	
			case quickfix.tt.ExecutionReport.MSGTYPE:
				return new quickfix.tt.ExecutionReport();
	
			case quickfix.tt.OrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.tt.OrderCancelReplaceRequest();
	
			case quickfix.tt.OrderCancelRequest.MSGTYPE:
				return new quickfix.tt.OrderCancelRequest();
	
			case quickfix.tt.OrderCancelReject.MSGTYPE:
				return new quickfix.tt.OrderCancelReject();
	
			case quickfix.tt.OrderStatusRequest.MSGTYPE:
				return new quickfix.tt.OrderStatusRequest();
	
			case quickfix.tt.BusinessMessageReject.MSGTYPE:
				return new quickfix.tt.BusinessMessageReject();
	
			case quickfix.tt.PositionReport.MSGTYPE:
				return new quickfix.tt.PositionReport();
	
			case quickfix.tt.RequestForPosition.MSGTYPE:
				return new quickfix.tt.RequestForPosition();
	
			case quickfix.tt.GatewayStatusRequest.MSGTYPE:
				return new quickfix.tt.GatewayStatusRequest();
	
			case quickfix.tt.GatewayStatus.MSGTYPE:
				return new quickfix.tt.GatewayStatus();
	
		}

		return new quickfix.tt.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.tt.MarketDataRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.tt.field.NoMDEntryTypes.FIELD:
					return new quickfix.tt.MarketDataRequest.NoMDEntryTypes();
	
				case quickfix.tt.field.NoRelatedSym.FIELD:
					return new quickfix.tt.MarketDataRequest.NoRelatedSym();
	
				}
				break;
	
			case quickfix.tt.MarketDataSnapshotFullRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.tt.field.NoMDEntries.FIELD:
					return new quickfix.tt.MarketDataSnapshotFullRefresh.NoMDEntries();
	
				}
				break;
	
			case quickfix.tt.MarketDataIncrementalRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.tt.field.NoMDEntries.FIELD:
					return new quickfix.tt.MarketDataIncrementalRefresh.NoMDEntries();
	
				}
				break;
	
			case quickfix.tt.SecurityDefinition.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.tt.field.NoRelatedSym.FIELD:
					return new quickfix.tt.SecurityDefinition.NoRelatedSym();
	
				case quickfix.tt.field.NumTickTblEntries.FIELD:
					return new quickfix.tt.SecurityDefinition.NumTickTblEntries();
	
				case quickfix.tt.field.NoEvents.FIELD:
					return new quickfix.tt.SecurityDefinition.NoEvents();
	
				case quickfix.tt.field.NoGateways.FIELD:
					return new quickfix.tt.SecurityDefinition.NoGateways();
	
				}
				break;
	
			case quickfix.tt.NewOrderSingle.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.tt.field.NoRelatedSym.FIELD:
					return new quickfix.tt.NewOrderSingle.NoRelatedSym();
	
				}
				break;
	
			case quickfix.tt.ExecutionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.tt.field.NoMiscFees.FIELD:
					return new quickfix.tt.ExecutionReport.NoMiscFees();
	
				case quickfix.tt.field.NoRelatedSym.FIELD:
					return new quickfix.tt.ExecutionReport.NoRelatedSym();
	
				case quickfix.tt.field.NoLinks.FIELD:
					return new quickfix.tt.ExecutionReport.NoLinks();
	
				}
				break;
	
			case quickfix.tt.OrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.tt.field.NoRelatedSym.FIELD:
					return new quickfix.tt.OrderCancelReplaceRequest.NoRelatedSym();
	
				}
				break;
	
			case quickfix.tt.PositionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.tt.field.NoMiscFees.FIELD:
					return new quickfix.tt.PositionReport.NoMiscFees();
	
				case quickfix.tt.field.NoRelatedSym.FIELD:
					return new quickfix.tt.PositionReport.NoRelatedSym();
	
				case quickfix.tt.field.NoLinks.FIELD:
					return new quickfix.tt.PositionReport.NoLinks();
	
				}
				break;
	
			case quickfix.tt.GatewayStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.tt.field.NoGatewayStatus.FIELD:
					return new quickfix.tt.GatewayStatus.NoGatewayStatus();
	
				}
				break;
	
		}

		return null;
	}
}
