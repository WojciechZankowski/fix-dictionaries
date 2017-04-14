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

package quickfix.dukascopy;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.dukascopy.Heartbeat.MSGTYPE:
				return new quickfix.dukascopy.Heartbeat();
	
			case quickfix.dukascopy.Logon.MSGTYPE:
				return new quickfix.dukascopy.Logon();
	
			case quickfix.dukascopy.TestRequest.MSGTYPE:
				return new quickfix.dukascopy.TestRequest();
	
			case quickfix.dukascopy.ResendRequest.MSGTYPE:
				return new quickfix.dukascopy.ResendRequest();
	
			case quickfix.dukascopy.Reject.MSGTYPE:
				return new quickfix.dukascopy.Reject();
	
			case quickfix.dukascopy.SequenceReset.MSGTYPE:
				return new quickfix.dukascopy.SequenceReset();
	
			case quickfix.dukascopy.Logout.MSGTYPE:
				return new quickfix.dukascopy.Logout();
	
			case quickfix.dukascopy.BusinessMessageReject.MSGTYPE:
				return new quickfix.dukascopy.BusinessMessageReject();
	
			case quickfix.dukascopy.UserRequest.MSGTYPE:
				return new quickfix.dukascopy.UserRequest();
	
			case quickfix.dukascopy.UserResponse.MSGTYPE:
				return new quickfix.dukascopy.UserResponse();
	
			case quickfix.dukascopy.MarketDataRequest.MSGTYPE:
				return new quickfix.dukascopy.MarketDataRequest();
	
			case quickfix.dukascopy.MarketDataRequestReject.MSGTYPE:
				return new quickfix.dukascopy.MarketDataRequestReject();
	
			case quickfix.dukascopy.MarketDataSnapshotFullRefresh.MSGTYPE:
				return new quickfix.dukascopy.MarketDataSnapshotFullRefresh();
	
			case quickfix.dukascopy.NewOrderSingle.MSGTYPE:
				return new quickfix.dukascopy.NewOrderSingle();
	
			case quickfix.dukascopy.ExecutionReport.MSGTYPE:
				return new quickfix.dukascopy.ExecutionReport();
	
			case quickfix.dukascopy.OrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.dukascopy.OrderCancelReplaceRequest();
	
			case quickfix.dukascopy.OrderCancelRequest.MSGTYPE:
				return new quickfix.dukascopy.OrderCancelRequest();
	
			case quickfix.dukascopy.OrderMassStatusRequest.MSGTYPE:
				return new quickfix.dukascopy.OrderMassStatusRequest();
	
			case quickfix.dukascopy.OrderCancelReject.MSGTYPE:
				return new quickfix.dukascopy.OrderCancelReject();
	
			case quickfix.dukascopy.QuoteStatusReport.MSGTYPE:
				return new quickfix.dukascopy.QuoteStatusReport();
	
			case quickfix.dukascopy.QuoteRequest.MSGTYPE:
				return new quickfix.dukascopy.QuoteRequest();
	
			case quickfix.dukascopy.TradingSessionStatusRequest.MSGTYPE:
				return new quickfix.dukascopy.TradingSessionStatusRequest();
	
			case quickfix.dukascopy.TradingSessionStatus.MSGTYPE:
				return new quickfix.dukascopy.TradingSessionStatus();
	
			case quickfix.dukascopy.Notification.MSGTYPE:
				return new quickfix.dukascopy.Notification();
	
			case quickfix.dukascopy.AccountInfo.MSGTYPE:
				return new quickfix.dukascopy.AccountInfo();
	
			case quickfix.dukascopy.InstrumentPositionInfo.MSGTYPE:
				return new quickfix.dukascopy.InstrumentPositionInfo();
	
			case quickfix.dukascopy.OvernightReport.MSGTYPE:
				return new quickfix.dukascopy.OvernightReport();
	
			case quickfix.dukascopy.ActivationRequest.MSGTYPE:
				return new quickfix.dukascopy.ActivationRequest();
	
			case quickfix.dukascopy.ActivationResponse.MSGTYPE:
				return new quickfix.dukascopy.ActivationResponse();
	
			case quickfix.dukascopy.AccountInfoRequest.MSGTYPE:
				return new quickfix.dukascopy.AccountInfoRequest();
	
		}

		return new quickfix.dukascopy.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.dukascopy.Logon.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.dukascopy.field.NoMsgTypes.FIELD:
					return new quickfix.dukascopy.Logon.NoMsgTypes();
	
				}
				break;
	
			case quickfix.dukascopy.MarketDataRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.dukascopy.field.NoMDEntryTypes.FIELD:
					return new quickfix.dukascopy.MarketDataRequest.NoMDEntryTypes();
	
				case quickfix.dukascopy.field.NoRelatedSym.FIELD:
					return new quickfix.dukascopy.MarketDataRequest.NoRelatedSym();
	
				case quickfix.dukascopy.field.NoUnderlyings.FIELD:
					return new quickfix.dukascopy.MarketDataRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.dukascopy.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.dukascopy.MarketDataRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.dukascopy.field.NoLegs.FIELD:
					return new quickfix.dukascopy.MarketDataRequest.NoRelatedSym.NoLegs();
	
				case quickfix.dukascopy.field.NoLegSecurityAltID.FIELD:
					return new quickfix.dukascopy.MarketDataRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case quickfix.dukascopy.field.NoSecurityAltID.FIELD:
					return new quickfix.dukascopy.MarketDataRequest.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.dukascopy.field.NoEvents.FIELD:
					return new quickfix.dukascopy.MarketDataRequest.NoRelatedSym.NoEvents();
	
				case quickfix.dukascopy.field.NoTradingSessions.FIELD:
					return new quickfix.dukascopy.MarketDataRequest.NoTradingSessions();
	
				}
				break;
	
			case quickfix.dukascopy.MarketDataRequestReject.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.dukascopy.field.NoAltMDSource.FIELD:
					return new quickfix.dukascopy.MarketDataRequestReject.NoAltMDSource();
	
				}
				break;
	
			case quickfix.dukascopy.MarketDataSnapshotFullRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.dukascopy.field.NoUnderlyings.FIELD:
					return new quickfix.dukascopy.MarketDataSnapshotFullRefresh.NoUnderlyings();
	
				case quickfix.dukascopy.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.dukascopy.MarketDataSnapshotFullRefresh.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.dukascopy.field.NoLegs.FIELD:
					return new quickfix.dukascopy.MarketDataSnapshotFullRefresh.NoLegs();
	
				case quickfix.dukascopy.field.NoLegSecurityAltID.FIELD:
					return new quickfix.dukascopy.MarketDataSnapshotFullRefresh.NoLegs.NoLegSecurityAltID();
	
				case quickfix.dukascopy.field.NoMDEntries.FIELD:
					return new quickfix.dukascopy.MarketDataSnapshotFullRefresh.NoMDEntries();
	
				case quickfix.dukascopy.field.NoSecurityAltID.FIELD:
					return new quickfix.dukascopy.MarketDataSnapshotFullRefresh.NoSecurityAltID();
	
				case quickfix.dukascopy.field.NoEvents.FIELD:
					return new quickfix.dukascopy.MarketDataSnapshotFullRefresh.NoEvents();
	
				}
				break;
	
			case quickfix.dukascopy.NewOrderSingle.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.dukascopy.field.NoAllocs.FIELD:
					return new quickfix.dukascopy.NewOrderSingle.NoAllocs();
	
				case quickfix.dukascopy.field.NoNestedPartyIDs.FIELD:
					return new quickfix.dukascopy.NewOrderSingle.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.dukascopy.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.dukascopy.NewOrderSingle.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.dukascopy.field.NoTradingSessions.FIELD:
					return new quickfix.dukascopy.NewOrderSingle.NoTradingSessions();
	
				case quickfix.dukascopy.field.NoUnderlyings.FIELD:
					return new quickfix.dukascopy.NewOrderSingle.NoUnderlyings();
	
				case quickfix.dukascopy.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.dukascopy.NewOrderSingle.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.dukascopy.field.NoPartyIDs.FIELD:
					return new quickfix.dukascopy.NewOrderSingle.NoPartyIDs();
	
				case quickfix.dukascopy.field.NoPartySubIDs.FIELD:
					return new quickfix.dukascopy.NewOrderSingle.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.dukascopy.field.NoSecurityAltID.FIELD:
					return new quickfix.dukascopy.NewOrderSingle.NoSecurityAltID();
	
				case quickfix.dukascopy.field.NoEvents.FIELD:
					return new quickfix.dukascopy.NewOrderSingle.NoEvents();
	
				case quickfix.dukascopy.field.NoStipulations.FIELD:
					return new quickfix.dukascopy.NewOrderSingle.NoStipulations();
	
				}
				break;
	
			case quickfix.dukascopy.ExecutionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.dukascopy.field.NoContraBrokers.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoContraBrokers();
	
				case quickfix.dukascopy.field.NoUnderlyings.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoUnderlyings();
	
				case quickfix.dukascopy.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.dukascopy.field.NoContAmts.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoContAmts();
	
				case quickfix.dukascopy.field.NoLegs.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoLegs();
	
				case quickfix.dukascopy.field.NoLegSecurityAltID.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoLegs.NoLegSecurityAltID();
	
				case quickfix.dukascopy.field.NoLegStipulations.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoLegs.NoLegStipulations();
	
				case quickfix.dukascopy.field.NoNestedPartyIDs.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.dukascopy.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.dukascopy.field.NoMiscFees.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoMiscFees();
	
				case quickfix.dukascopy.field.NoPartyIDs.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoPartyIDs();
	
				case quickfix.dukascopy.field.NoPartySubIDs.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.dukascopy.field.NoSecurityAltID.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoSecurityAltID();
	
				case quickfix.dukascopy.field.NoEvents.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoEvents();
	
				case quickfix.dukascopy.field.NoStipulations.FIELD:
					return new quickfix.dukascopy.ExecutionReport.NoStipulations();
	
				}
				break;
	
			case quickfix.dukascopy.OrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.dukascopy.field.NoAllocs.FIELD:
					return new quickfix.dukascopy.OrderCancelReplaceRequest.NoAllocs();
	
				case quickfix.dukascopy.field.NoNestedPartyIDs.FIELD:
					return new quickfix.dukascopy.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.dukascopy.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.dukascopy.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.dukascopy.field.NoTradingSessions.FIELD:
					return new quickfix.dukascopy.OrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.dukascopy.field.NoUnderlyings.FIELD:
					return new quickfix.dukascopy.OrderCancelReplaceRequest.NoUnderlyings();
	
				case quickfix.dukascopy.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.dukascopy.OrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.dukascopy.field.NoPartyIDs.FIELD:
					return new quickfix.dukascopy.OrderCancelReplaceRequest.NoPartyIDs();
	
				case quickfix.dukascopy.field.NoPartySubIDs.FIELD:
					return new quickfix.dukascopy.OrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.dukascopy.field.NoSecurityAltID.FIELD:
					return new quickfix.dukascopy.OrderCancelReplaceRequest.NoSecurityAltID();
	
				case quickfix.dukascopy.field.NoEvents.FIELD:
					return new quickfix.dukascopy.OrderCancelReplaceRequest.NoEvents();
	
				}
				break;
	
			case quickfix.dukascopy.OrderCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.dukascopy.field.NoUnderlyings.FIELD:
					return new quickfix.dukascopy.OrderCancelRequest.NoUnderlyings();
	
				case quickfix.dukascopy.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.dukascopy.OrderCancelRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.dukascopy.field.NoPartyIDs.FIELD:
					return new quickfix.dukascopy.OrderCancelRequest.NoPartyIDs();
	
				case quickfix.dukascopy.field.NoPartySubIDs.FIELD:
					return new quickfix.dukascopy.OrderCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.dukascopy.field.NoSecurityAltID.FIELD:
					return new quickfix.dukascopy.OrderCancelRequest.NoSecurityAltID();
	
				case quickfix.dukascopy.field.NoEvents.FIELD:
					return new quickfix.dukascopy.OrderCancelRequest.NoEvents();
	
				}
				break;
	
			case quickfix.dukascopy.OrderMassStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.dukascopy.field.NoPartyIDs.FIELD:
					return new quickfix.dukascopy.OrderMassStatusRequest.NoPartyIDs();
	
				case quickfix.dukascopy.field.NoPartySubIDs.FIELD:
					return new quickfix.dukascopy.OrderMassStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.dukascopy.field.NoSecurityAltID.FIELD:
					return new quickfix.dukascopy.OrderMassStatusRequest.NoSecurityAltID();
	
				case quickfix.dukascopy.field.NoEvents.FIELD:
					return new quickfix.dukascopy.OrderMassStatusRequest.NoEvents();
	
				case quickfix.dukascopy.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.dukascopy.OrderMassStatusRequest.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case quickfix.dukascopy.QuoteStatusReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.dukascopy.field.NoUnderlyings.FIELD:
					return new quickfix.dukascopy.QuoteStatusReport.NoUnderlyings();
	
				case quickfix.dukascopy.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.dukascopy.QuoteStatusReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.dukascopy.field.NoLegs.FIELD:
					return new quickfix.dukascopy.QuoteStatusReport.NoLegs();
	
				case quickfix.dukascopy.field.NoLegSecurityAltID.FIELD:
					return new quickfix.dukascopy.QuoteStatusReport.NoLegs.NoLegSecurityAltID();
	
				case quickfix.dukascopy.field.NoLegStipulations.FIELD:
					return new quickfix.dukascopy.QuoteStatusReport.NoLegs.NoLegStipulations();
	
				case quickfix.dukascopy.field.NoNestedPartyIDs.FIELD:
					return new quickfix.dukascopy.QuoteStatusReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.dukascopy.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.dukascopy.QuoteStatusReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.dukascopy.field.NoQuoteQualifiers.FIELD:
					return new quickfix.dukascopy.QuoteStatusReport.NoQuoteQualifiers();
	
				case quickfix.dukascopy.field.NoPartyIDs.FIELD:
					return new quickfix.dukascopy.QuoteStatusReport.NoPartyIDs();
	
				case quickfix.dukascopy.field.NoPartySubIDs.FIELD:
					return new quickfix.dukascopy.QuoteStatusReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.dukascopy.field.NoSecurityAltID.FIELD:
					return new quickfix.dukascopy.QuoteStatusReport.NoSecurityAltID();
	
				case quickfix.dukascopy.field.NoEvents.FIELD:
					return new quickfix.dukascopy.QuoteStatusReport.NoEvents();
	
				case quickfix.dukascopy.field.NoStipulations.FIELD:
					return new quickfix.dukascopy.QuoteStatusReport.NoStipulations();
	
				}
				break;
	
			case quickfix.dukascopy.QuoteRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.dukascopy.field.NoRelatedSym.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym();
	
				case quickfix.dukascopy.field.NoUnderlyings.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.dukascopy.field.NoUnderlyingSecurityAltID.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case quickfix.dukascopy.field.NoLegs.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym.NoLegs();
	
				case quickfix.dukascopy.field.NoLegSecurityAltID.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case quickfix.dukascopy.field.NoLegStipulations.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case quickfix.dukascopy.field.NoNestedPartyIDs.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case quickfix.dukascopy.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.dukascopy.field.NoQuoteQualifiers.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym.NoQuoteQualifiers();
	
				case quickfix.dukascopy.field.NoSecurityAltID.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym.NoSecurityAltID();
	
				case quickfix.dukascopy.field.NoEvents.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym.NoEvents();
	
				case quickfix.dukascopy.field.NoStipulations.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym.NoStipulations();
	
				case quickfix.dukascopy.field.NoPartyIDs.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym.NoPartyIDs();
	
				case quickfix.dukascopy.field.NoPartySubIDs.FIELD:
					return new quickfix.dukascopy.QuoteRequest.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case quickfix.dukascopy.ActivationResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.dukascopy.field.UsersActivated.FIELD:
					return new quickfix.dukascopy.ActivationResponse.UsersActivated();
	
				}
				break;
	
		}

		return null;
	}
}
