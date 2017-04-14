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

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.ib.Logon.MSGTYPE:
				return new quickfix.ib.Logon();
	
			case quickfix.ib.Heartbeat.MSGTYPE:
				return new quickfix.ib.Heartbeat();
	
			case quickfix.ib.TestRequest.MSGTYPE:
				return new quickfix.ib.TestRequest();
	
			case quickfix.ib.ResendRequest.MSGTYPE:
				return new quickfix.ib.ResendRequest();
	
			case quickfix.ib.SequenceReset.MSGTYPE:
				return new quickfix.ib.SequenceReset();
	
			case quickfix.ib.Reject.MSGTYPE:
				return new quickfix.ib.Reject();
	
			case quickfix.ib.Logout.MSGTYPE:
				return new quickfix.ib.Logout();
	
			case quickfix.ib.NewOrderSingle.MSGTYPE:
				return new quickfix.ib.NewOrderSingle();
	
			case quickfix.ib.ExecutionReport.MSGTYPE:
				return new quickfix.ib.ExecutionReport();
	
			case quickfix.ib.OrderCancelReplaceRequest.MSGTYPE:
				return new quickfix.ib.OrderCancelReplaceRequest();
	
			case quickfix.ib.OrderCancelRequest.MSGTYPE:
				return new quickfix.ib.OrderCancelRequest();
	
			case quickfix.ib.OrderCancelReject.MSGTYPE:
				return new quickfix.ib.OrderCancelReject();
	
			case quickfix.ib.OrderStatusRequest.MSGTYPE:
				return new quickfix.ib.OrderStatusRequest();
	
			case quickfix.ib.News.MSGTYPE:
				return new quickfix.ib.News();
	
		}

		return new quickfix.ib.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
		}

		return null;
	}
}
