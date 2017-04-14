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

package quickfix.ib;

import quickfix.*;
import quickfix.ib.field.*;

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
	 * Callback for FIXNews message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(News message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
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

		if (type.equals(Logon.MSGTYPE))
			onMessage((Logon)message, sessionID);
		else if (type.equals(Heartbeat.MSGTYPE))
			onMessage((Heartbeat)message, sessionID);
		else if (type.equals(TestRequest.MSGTYPE))
			onMessage((TestRequest)message, sessionID);
		else if (type.equals(ResendRequest.MSGTYPE))
			onMessage((ResendRequest)message, sessionID);
		else if (type.equals(SequenceReset.MSGTYPE))
			onMessage((SequenceReset)message, sessionID);
		else if (type.equals(Reject.MSGTYPE))
			onMessage((Reject)message, sessionID);
		else if (type.equals(Logout.MSGTYPE))
			onMessage((Logout)message, sessionID);
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
		else if (type.equals(News.MSGTYPE))
			onMessage((News)message, sessionID);
		else
			onMessage(message, sessionID);
	}

}
