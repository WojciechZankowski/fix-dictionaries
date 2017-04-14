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
		
	public void set(quickfix.ib.field.BeginString value) {
		setField(value);
	}

	public quickfix.ib.field.BeginString get(quickfix.ib.field.BeginString value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.BeginString getBeginString() throws FieldNotFound {
		return get(new quickfix.ib.field.BeginString());
	}

	public boolean isSet(quickfix.ib.field.BeginString field) {
		return isSetField(field);
	}

	public boolean isSetBeginString() {
		return isSetField(8);
	}

	public void set(quickfix.ib.field.BodyLength value) {
		setField(value);
	}

	public quickfix.ib.field.BodyLength get(quickfix.ib.field.BodyLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.BodyLength getBodyLength() throws FieldNotFound {
		return get(new quickfix.ib.field.BodyLength());
	}

	public boolean isSet(quickfix.ib.field.BodyLength field) {
		return isSetField(field);
	}

	public boolean isSetBodyLength() {
		return isSetField(9);
	}

	public void set(quickfix.ib.field.MsgType value) {
		setField(value);
	}

	public quickfix.ib.field.MsgType get(quickfix.ib.field.MsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.MsgType getMsgType() throws FieldNotFound {
		return get(new quickfix.ib.field.MsgType());
	}

	public boolean isSet(quickfix.ib.field.MsgType field) {
		return isSetField(field);
	}

	public boolean isSetMsgType() {
		return isSetField(35);
	}

	public void set(quickfix.ib.field.SenderCompID value) {
		setField(value);
	}

	public quickfix.ib.field.SenderCompID get(quickfix.ib.field.SenderCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.SenderCompID getSenderCompID() throws FieldNotFound {
		return get(new quickfix.ib.field.SenderCompID());
	}

	public boolean isSet(quickfix.ib.field.SenderCompID field) {
		return isSetField(field);
	}

	public boolean isSetSenderCompID() {
		return isSetField(49);
	}

	public void set(quickfix.ib.field.SenderSubID value) {
		setField(value);
	}

	public quickfix.ib.field.SenderSubID get(quickfix.ib.field.SenderSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.SenderSubID getSenderSubID() throws FieldNotFound {
		return get(new quickfix.ib.field.SenderSubID());
	}

	public boolean isSet(quickfix.ib.field.SenderSubID field) {
		return isSetField(field);
	}

	public boolean isSetSenderSubID() {
		return isSetField(50);
	}

	public void set(quickfix.ib.field.TargetCompID value) {
		setField(value);
	}

	public quickfix.ib.field.TargetCompID get(quickfix.ib.field.TargetCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.TargetCompID getTargetCompID() throws FieldNotFound {
		return get(new quickfix.ib.field.TargetCompID());
	}

	public boolean isSet(quickfix.ib.field.TargetCompID field) {
		return isSetField(field);
	}

	public boolean isSetTargetCompID() {
		return isSetField(56);
	}

	public void set(quickfix.ib.field.TargetSubID value) {
		setField(value);
	}

	public quickfix.ib.field.TargetSubID get(quickfix.ib.field.TargetSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.TargetSubID getTargetSubID() throws FieldNotFound {
		return get(new quickfix.ib.field.TargetSubID());
	}

	public boolean isSet(quickfix.ib.field.TargetSubID field) {
		return isSetField(field);
	}

	public boolean isSetTargetSubID() {
		return isSetField(57);
	}

	public void set(quickfix.ib.field.MsgSeqNum value) {
		setField(value);
	}

	public quickfix.ib.field.MsgSeqNum get(quickfix.ib.field.MsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.MsgSeqNum getMsgSeqNum() throws FieldNotFound {
		return get(new quickfix.ib.field.MsgSeqNum());
	}

	public boolean isSet(quickfix.ib.field.MsgSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetMsgSeqNum() {
		return isSetField(34);
	}

	public void set(quickfix.ib.field.PossDupFlag value) {
		setField(value);
	}

	public quickfix.ib.field.PossDupFlag get(quickfix.ib.field.PossDupFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.PossDupFlag getPossDupFlag() throws FieldNotFound {
		return get(new quickfix.ib.field.PossDupFlag());
	}

	public boolean isSet(quickfix.ib.field.PossDupFlag field) {
		return isSetField(field);
	}

	public boolean isSetPossDupFlag() {
		return isSetField(43);
	}

	public void set(quickfix.ib.field.PossResend value) {
		setField(value);
	}

	public quickfix.ib.field.PossResend get(quickfix.ib.field.PossResend value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.PossResend getPossResend() throws FieldNotFound {
		return get(new quickfix.ib.field.PossResend());
	}

	public boolean isSet(quickfix.ib.field.PossResend field) {
		return isSetField(field);
	}

	public boolean isSetPossResend() {
		return isSetField(97);
	}

	public void set(quickfix.ib.field.SendingTime value) {
		setField(value);
	}

	public quickfix.ib.field.SendingTime get(quickfix.ib.field.SendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.SendingTime getSendingTime() throws FieldNotFound {
		return get(new quickfix.ib.field.SendingTime());
	}

	public boolean isSet(quickfix.ib.field.SendingTime field) {
		return isSetField(field);
	}

	public boolean isSetSendingTime() {
		return isSetField(52);
	}

	public void set(quickfix.ib.field.OrigSendingTime value) {
		setField(value);
	}

	public quickfix.ib.field.OrigSendingTime get(quickfix.ib.field.OrigSendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.OrigSendingTime getOrigSendingTime() throws FieldNotFound {
		return get(new quickfix.ib.field.OrigSendingTime());
	}

	public boolean isSet(quickfix.ib.field.OrigSendingTime field) {
		return isSetField(field);
	}

	public boolean isSetOrigSendingTime() {
		return isSetField(122);
	}

	}
	
	
	public void set(quickfix.ib.field.CheckSum value) {
		setField(value);
	}

	public quickfix.ib.field.CheckSum get(quickfix.ib.field.CheckSum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.CheckSum getCheckSum() throws FieldNotFound {
		return get(new quickfix.ib.field.CheckSum());
	}

	public boolean isSet(quickfix.ib.field.CheckSum field) {
		return isSetField(field);
	}

	public boolean isSetCheckSum() {
		return isSetField(10);
	}

}
