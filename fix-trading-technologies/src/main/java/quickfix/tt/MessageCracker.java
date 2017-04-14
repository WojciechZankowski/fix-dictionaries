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

import quickfix.*;
import quickfix.tt.field.*;

public class MessageCracker {

	/**
	 * Callback for quickfix.Message message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(quickfix.Message message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}

	/**
	 * Callback for FIXHeartbeat message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Heartbeat message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXLogon message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Logon message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXTestRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TestRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXResendRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ResendRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Reject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXSequenceReset message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SequenceReset message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXLogout message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Logout message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXMarketDataRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MarketDataRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMarketDataSnapshotFullRefresh message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MarketDataSnapshotFullRefresh message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMarketDataIncrementalRefresh message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MarketDataIncrementalRefresh message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMarketDataRequestReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MarketDataRequestReject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityDefinitionRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityDefinitionRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityDefinition message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityDefinition message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityStatus message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityStatus message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNewOrderSingle message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(NewOrderSingle message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXExecutionReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ExecutionReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderCancelReplaceRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderCancelReplaceRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderCancelRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderCancelRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderCancelReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderCancelReject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXBusinessMessageReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(BusinessMessageReject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXPositionReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(PositionReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXRequestForPosition message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(RequestForPosition message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXGatewayStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(GatewayStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXGatewayStatus message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(GatewayStatus message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	public void crack(quickfix.Message message, SessionID sessionID)
			throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {
		crack42((Message) message, sessionID);
	}

	/**
	 * Cracker method for 42 messages.
	 *
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void crack42(Message message, SessionID sessionID)
			throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {

		String type = message.getHeader().getString(MsgType.FIELD);

		if (type.equals(Heartbeat.MSGTYPE))
			onMessage((Heartbeat)message, sessionID);
		else if (type.equals(Logon.MSGTYPE))
			onMessage((Logon)message, sessionID);
		else if (type.equals(TestRequest.MSGTYPE))
			onMessage((TestRequest)message, sessionID);
		else if (type.equals(ResendRequest.MSGTYPE))
			onMessage((ResendRequest)message, sessionID);
		else if (type.equals(Reject.MSGTYPE))
			onMessage((Reject)message, sessionID);
		else if (type.equals(SequenceReset.MSGTYPE))
			onMessage((SequenceReset)message, sessionID);
		else if (type.equals(Logout.MSGTYPE))
			onMessage((Logout)message, sessionID);
		else if (type.equals(MarketDataRequest.MSGTYPE))
			onMessage((MarketDataRequest)message, sessionID);
		else if (type.equals(MarketDataSnapshotFullRefresh.MSGTYPE))
			onMessage((MarketDataSnapshotFullRefresh)message, sessionID);
		else if (type.equals(MarketDataIncrementalRefresh.MSGTYPE))
			onMessage((MarketDataIncrementalRefresh)message, sessionID);
		else if (type.equals(MarketDataRequestReject.MSGTYPE))
			onMessage((MarketDataRequestReject)message, sessionID);
		else if (type.equals(SecurityDefinitionRequest.MSGTYPE))
			onMessage((SecurityDefinitionRequest)message, sessionID);
		else if (type.equals(SecurityDefinition.MSGTYPE))
			onMessage((SecurityDefinition)message, sessionID);
		else if (type.equals(SecurityStatusRequest.MSGTYPE))
			onMessage((SecurityStatusRequest)message, sessionID);
		else if (type.equals(SecurityStatus.MSGTYPE))
			onMessage((SecurityStatus)message, sessionID);
		else if (type.equals(NewOrderSingle.MSGTYPE))
			onMessage((NewOrderSingle)message, sessionID);
		else if (type.equals(ExecutionReport.MSGTYPE))
			onMessage((ExecutionReport)message, sessionID);
		else if (type.equals(OrderCancelReplaceRequest.MSGTYPE))
			onMessage((OrderCancelReplaceRequest)message, sessionID);
		else if (type.equals(OrderCancelRequest.MSGTYPE))
			onMessage((OrderCancelRequest)message, sessionID);
		else if (type.equals(OrderCancelReject.MSGTYPE))
			onMessage((OrderCancelReject)message, sessionID);
		else if (type.equals(OrderStatusRequest.MSGTYPE))
			onMessage((OrderStatusRequest)message, sessionID);
		else if (type.equals(BusinessMessageReject.MSGTYPE))
			onMessage((BusinessMessageReject)message, sessionID);
		else if (type.equals(PositionReport.MSGTYPE))
			onMessage((PositionReport)message, sessionID);
		else if (type.equals(RequestForPosition.MSGTYPE))
			onMessage((RequestForPosition)message, sessionID);
		else if (type.equals(GatewayStatusRequest.MSGTYPE))
			onMessage((GatewayStatusRequest)message, sessionID);
		else if (type.equals(GatewayStatus.MSGTYPE))
			onMessage((GatewayStatus)message, sessionID);
		else
			onMessage(message, sessionID);
	}

}
