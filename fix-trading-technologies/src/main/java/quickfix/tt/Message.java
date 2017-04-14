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

import quickfix.FieldNotFound;
  
import quickfix.field.*;


public class Message extends quickfix.Message {

	static final long serialVersionUID = 20050617;

	public Message() {
		this(null);
	}

	protected Message(int[] fieldOrder) {
		super(fieldOrder);
		header = new Header(this);
		trailer = new Trailer();
		
		getHeader().setField(new BeginString("FIX.4.2"));
			
	}

	public static class Header extends quickfix.Message.Header {

		static final long serialVersionUID = 20050617;

		public Header(Message msg) {
			// JNI compatibility
		}
		
	public void set(quickfix.tt.field.BeginString value) {
		setField(value);
	}

	public quickfix.tt.field.BeginString get(quickfix.tt.field.BeginString value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.BeginString getBeginString() throws FieldNotFound {
		return get(new quickfix.tt.field.BeginString());
	}

	public boolean isSet(quickfix.tt.field.BeginString field) {
		return isSetField(field);
	}

	public boolean isSetBeginString() {
		return isSetField(8);
	}

	public void set(quickfix.tt.field.BodyLength value) {
		setField(value);
	}

	public quickfix.tt.field.BodyLength get(quickfix.tt.field.BodyLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.BodyLength getBodyLength() throws FieldNotFound {
		return get(new quickfix.tt.field.BodyLength());
	}

	public boolean isSet(quickfix.tt.field.BodyLength field) {
		return isSetField(field);
	}

	public boolean isSetBodyLength() {
		return isSetField(9);
	}

	public void set(quickfix.tt.field.MsgType value) {
		setField(value);
	}

	public quickfix.tt.field.MsgType get(quickfix.tt.field.MsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MsgType getMsgType() throws FieldNotFound {
		return get(new quickfix.tt.field.MsgType());
	}

	public boolean isSet(quickfix.tt.field.MsgType field) {
		return isSetField(field);
	}

	public boolean isSetMsgType() {
		return isSetField(35);
	}

	public void set(quickfix.tt.field.SenderCompID value) {
		setField(value);
	}

	public quickfix.tt.field.SenderCompID get(quickfix.tt.field.SenderCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SenderCompID getSenderCompID() throws FieldNotFound {
		return get(new quickfix.tt.field.SenderCompID());
	}

	public boolean isSet(quickfix.tt.field.SenderCompID field) {
		return isSetField(field);
	}

	public boolean isSetSenderCompID() {
		return isSetField(49);
	}

	public void set(quickfix.tt.field.TargetCompID value) {
		setField(value);
	}

	public quickfix.tt.field.TargetCompID get(quickfix.tt.field.TargetCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TargetCompID getTargetCompID() throws FieldNotFound {
		return get(new quickfix.tt.field.TargetCompID());
	}

	public boolean isSet(quickfix.tt.field.TargetCompID field) {
		return isSetField(field);
	}

	public boolean isSetTargetCompID() {
		return isSetField(56);
	}

	public void set(quickfix.tt.field.MsgSeqNum value) {
		setField(value);
	}

	public quickfix.tt.field.MsgSeqNum get(quickfix.tt.field.MsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MsgSeqNum getMsgSeqNum() throws FieldNotFound {
		return get(new quickfix.tt.field.MsgSeqNum());
	}

	public boolean isSet(quickfix.tt.field.MsgSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetMsgSeqNum() {
		return isSetField(34);
	}

	public void set(quickfix.tt.field.SenderSubID value) {
		setField(value);
	}

	public quickfix.tt.field.SenderSubID get(quickfix.tt.field.SenderSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SenderSubID getSenderSubID() throws FieldNotFound {
		return get(new quickfix.tt.field.SenderSubID());
	}

	public boolean isSet(quickfix.tt.field.SenderSubID field) {
		return isSetField(field);
	}

	public boolean isSetSenderSubID() {
		return isSetField(50);
	}

	public void set(quickfix.tt.field.TargetSubID value) {
		setField(value);
	}

	public quickfix.tt.field.TargetSubID get(quickfix.tt.field.TargetSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TargetSubID getTargetSubID() throws FieldNotFound {
		return get(new quickfix.tt.field.TargetSubID());
	}

	public boolean isSet(quickfix.tt.field.TargetSubID field) {
		return isSetField(field);
	}

	public boolean isSetTargetSubID() {
		return isSetField(57);
	}

	public void set(quickfix.tt.field.OnBehalfOfSubID value) {
		setField(value);
	}

	public quickfix.tt.field.OnBehalfOfSubID get(quickfix.tt.field.OnBehalfOfSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OnBehalfOfSubID getOnBehalfOfSubID() throws FieldNotFound {
		return get(new quickfix.tt.field.OnBehalfOfSubID());
	}

	public boolean isSet(quickfix.tt.field.OnBehalfOfSubID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfSubID() {
		return isSetField(116);
	}

	public void set(quickfix.tt.field.DeliverToSubID value) {
		setField(value);
	}

	public quickfix.tt.field.DeliverToSubID get(quickfix.tt.field.DeliverToSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.DeliverToSubID getDeliverToSubID() throws FieldNotFound {
		return get(new quickfix.tt.field.DeliverToSubID());
	}

	public boolean isSet(quickfix.tt.field.DeliverToSubID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToSubID() {
		return isSetField(129);
	}

	public void set(quickfix.tt.field.PossDupFlag value) {
		setField(value);
	}

	public quickfix.tt.field.PossDupFlag get(quickfix.tt.field.PossDupFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.PossDupFlag getPossDupFlag() throws FieldNotFound {
		return get(new quickfix.tt.field.PossDupFlag());
	}

	public boolean isSet(quickfix.tt.field.PossDupFlag field) {
		return isSetField(field);
	}

	public boolean isSetPossDupFlag() {
		return isSetField(43);
	}

	public void set(quickfix.tt.field.PossResendFlag value) {
		setField(value);
	}

	public quickfix.tt.field.PossResendFlag get(quickfix.tt.field.PossResendFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.PossResendFlag getPossResendFlag() throws FieldNotFound {
		return get(new quickfix.tt.field.PossResendFlag());
	}

	public boolean isSet(quickfix.tt.field.PossResendFlag field) {
		return isSetField(field);
	}

	public boolean isSetPossResendFlag() {
		return isSetField(97);
	}

	public void set(quickfix.tt.field.SendingTime value) {
		setField(value);
	}

	public quickfix.tt.field.SendingTime get(quickfix.tt.field.SendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SendingTime getSendingTime() throws FieldNotFound {
		return get(new quickfix.tt.field.SendingTime());
	}

	public boolean isSet(quickfix.tt.field.SendingTime field) {
		return isSetField(field);
	}

	public boolean isSetSendingTime() {
		return isSetField(52);
	}

	public void set(quickfix.tt.field.OrigSendingTime value) {
		setField(value);
	}

	public quickfix.tt.field.OrigSendingTime get(quickfix.tt.field.OrigSendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrigSendingTime getOrigSendingTime() throws FieldNotFound {
		return get(new quickfix.tt.field.OrigSendingTime());
	}

	public boolean isSet(quickfix.tt.field.OrigSendingTime field) {
		return isSetField(field);
	}

	public boolean isSetOrigSendingTime() {
		return isSetField(122);
	}

	}
	
	
	public void set(quickfix.tt.field.CheckSum value) {
		setField(value);
	}

	public quickfix.tt.field.CheckSum get(quickfix.tt.field.CheckSum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.CheckSum getCheckSum() throws FieldNotFound {
		return get(new quickfix.tt.field.CheckSum());
	}

	public boolean isSet(quickfix.tt.field.CheckSum field) {
		return isSetField(field);
	}

	public boolean isSetCheckSum() {
		return isSetField(10);
	}

}
