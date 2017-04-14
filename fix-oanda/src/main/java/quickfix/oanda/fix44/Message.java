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
		
		getHeader().setField(new BeginString("FIX.4.4"));
			
	}

	public static class Header extends quickfix.Message.Header {

		static final long serialVersionUID = 20050617;

		public Header(Message msg) {
			// JNI compatibility
		}
		
	public void set(quickfix.oanda.field.BeginString value) {
		setField(value);
	}

	public quickfix.oanda.field.BeginString get(quickfix.oanda.field.BeginString value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.BeginString getBeginString() throws FieldNotFound {
		return get(new quickfix.oanda.field.BeginString());
	}

	public boolean isSet(quickfix.oanda.field.BeginString field) {
		return isSetField(field);
	}

	public boolean isSetBeginString() {
		return isSetField(8);
	}

	public void set(quickfix.oanda.field.BodyLength value) {
		setField(value);
	}

	public quickfix.oanda.field.BodyLength get(quickfix.oanda.field.BodyLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.BodyLength getBodyLength() throws FieldNotFound {
		return get(new quickfix.oanda.field.BodyLength());
	}

	public boolean isSet(quickfix.oanda.field.BodyLength field) {
		return isSetField(field);
	}

	public boolean isSetBodyLength() {
		return isSetField(9);
	}

	public void set(quickfix.oanda.field.MsgType value) {
		setField(value);
	}

	public quickfix.oanda.field.MsgType get(quickfix.oanda.field.MsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MsgType getMsgType() throws FieldNotFound {
		return get(new quickfix.oanda.field.MsgType());
	}

	public boolean isSet(quickfix.oanda.field.MsgType field) {
		return isSetField(field);
	}

	public boolean isSetMsgType() {
		return isSetField(35);
	}

	public void set(quickfix.oanda.field.SenderCompID value) {
		setField(value);
	}

	public quickfix.oanda.field.SenderCompID get(quickfix.oanda.field.SenderCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.SenderCompID getSenderCompID() throws FieldNotFound {
		return get(new quickfix.oanda.field.SenderCompID());
	}

	public boolean isSet(quickfix.oanda.field.SenderCompID field) {
		return isSetField(field);
	}

	public boolean isSetSenderCompID() {
		return isSetField(49);
	}

	public void set(quickfix.oanda.field.TargetCompID value) {
		setField(value);
	}

	public quickfix.oanda.field.TargetCompID get(quickfix.oanda.field.TargetCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.TargetCompID getTargetCompID() throws FieldNotFound {
		return get(new quickfix.oanda.field.TargetCompID());
	}

	public boolean isSet(quickfix.oanda.field.TargetCompID field) {
		return isSetField(field);
	}

	public boolean isSetTargetCompID() {
		return isSetField(56);
	}

	public void set(quickfix.oanda.field.OnBehalfOfCompID value) {
		setField(value);
	}

	public quickfix.oanda.field.OnBehalfOfCompID get(quickfix.oanda.field.OnBehalfOfCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.OnBehalfOfCompID getOnBehalfOfCompID() throws FieldNotFound {
		return get(new quickfix.oanda.field.OnBehalfOfCompID());
	}

	public boolean isSet(quickfix.oanda.field.OnBehalfOfCompID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfCompID() {
		return isSetField(115);
	}

	public void set(quickfix.oanda.field.DeliverToCompID value) {
		setField(value);
	}

	public quickfix.oanda.field.DeliverToCompID get(quickfix.oanda.field.DeliverToCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.DeliverToCompID getDeliverToCompID() throws FieldNotFound {
		return get(new quickfix.oanda.field.DeliverToCompID());
	}

	public boolean isSet(quickfix.oanda.field.DeliverToCompID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToCompID() {
		return isSetField(128);
	}

	public void set(quickfix.oanda.field.SecureDataLen value) {
		setField(value);
	}

	public quickfix.oanda.field.SecureDataLen get(quickfix.oanda.field.SecureDataLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.SecureDataLen getSecureDataLen() throws FieldNotFound {
		return get(new quickfix.oanda.field.SecureDataLen());
	}

	public boolean isSet(quickfix.oanda.field.SecureDataLen field) {
		return isSetField(field);
	}

	public boolean isSetSecureDataLen() {
		return isSetField(90);
	}

	public void set(quickfix.oanda.field.SecureData value) {
		setField(value);
	}

	public quickfix.oanda.field.SecureData get(quickfix.oanda.field.SecureData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.SecureData getSecureData() throws FieldNotFound {
		return get(new quickfix.oanda.field.SecureData());
	}

	public boolean isSet(quickfix.oanda.field.SecureData field) {
		return isSetField(field);
	}

	public boolean isSetSecureData() {
		return isSetField(91);
	}

	public void set(quickfix.oanda.field.MsgSeqNum value) {
		setField(value);
	}

	public quickfix.oanda.field.MsgSeqNum get(quickfix.oanda.field.MsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MsgSeqNum getMsgSeqNum() throws FieldNotFound {
		return get(new quickfix.oanda.field.MsgSeqNum());
	}

	public boolean isSet(quickfix.oanda.field.MsgSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetMsgSeqNum() {
		return isSetField(34);
	}

	public void set(quickfix.oanda.field.SenderSubID value) {
		setField(value);
	}

	public quickfix.oanda.field.SenderSubID get(quickfix.oanda.field.SenderSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.SenderSubID getSenderSubID() throws FieldNotFound {
		return get(new quickfix.oanda.field.SenderSubID());
	}

	public boolean isSet(quickfix.oanda.field.SenderSubID field) {
		return isSetField(field);
	}

	public boolean isSetSenderSubID() {
		return isSetField(50);
	}

	public void set(quickfix.oanda.field.SenderLocationID value) {
		setField(value);
	}

	public quickfix.oanda.field.SenderLocationID get(quickfix.oanda.field.SenderLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.SenderLocationID getSenderLocationID() throws FieldNotFound {
		return get(new quickfix.oanda.field.SenderLocationID());
	}

	public boolean isSet(quickfix.oanda.field.SenderLocationID field) {
		return isSetField(field);
	}

	public boolean isSetSenderLocationID() {
		return isSetField(142);
	}

	public void set(quickfix.oanda.field.TargetSubID value) {
		setField(value);
	}

	public quickfix.oanda.field.TargetSubID get(quickfix.oanda.field.TargetSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.TargetSubID getTargetSubID() throws FieldNotFound {
		return get(new quickfix.oanda.field.TargetSubID());
	}

	public boolean isSet(quickfix.oanda.field.TargetSubID field) {
		return isSetField(field);
	}

	public boolean isSetTargetSubID() {
		return isSetField(57);
	}

	public void set(quickfix.oanda.field.TargetLocationID value) {
		setField(value);
	}

	public quickfix.oanda.field.TargetLocationID get(quickfix.oanda.field.TargetLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.TargetLocationID getTargetLocationID() throws FieldNotFound {
		return get(new quickfix.oanda.field.TargetLocationID());
	}

	public boolean isSet(quickfix.oanda.field.TargetLocationID field) {
		return isSetField(field);
	}

	public boolean isSetTargetLocationID() {
		return isSetField(143);
	}

	public void set(quickfix.oanda.field.OnBehalfOfSubID value) {
		setField(value);
	}

	public quickfix.oanda.field.OnBehalfOfSubID get(quickfix.oanda.field.OnBehalfOfSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.OnBehalfOfSubID getOnBehalfOfSubID() throws FieldNotFound {
		return get(new quickfix.oanda.field.OnBehalfOfSubID());
	}

	public boolean isSet(quickfix.oanda.field.OnBehalfOfSubID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfSubID() {
		return isSetField(116);
	}

	public void set(quickfix.oanda.field.OnBehalfOfLocationID value) {
		setField(value);
	}

	public quickfix.oanda.field.OnBehalfOfLocationID get(quickfix.oanda.field.OnBehalfOfLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.OnBehalfOfLocationID getOnBehalfOfLocationID() throws FieldNotFound {
		return get(new quickfix.oanda.field.OnBehalfOfLocationID());
	}

	public boolean isSet(quickfix.oanda.field.OnBehalfOfLocationID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfLocationID() {
		return isSetField(144);
	}

	public void set(quickfix.oanda.field.DeliverToSubID value) {
		setField(value);
	}

	public quickfix.oanda.field.DeliverToSubID get(quickfix.oanda.field.DeliverToSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.DeliverToSubID getDeliverToSubID() throws FieldNotFound {
		return get(new quickfix.oanda.field.DeliverToSubID());
	}

	public boolean isSet(quickfix.oanda.field.DeliverToSubID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToSubID() {
		return isSetField(129);
	}

	public void set(quickfix.oanda.field.DeliverToLocationID value) {
		setField(value);
	}

	public quickfix.oanda.field.DeliverToLocationID get(quickfix.oanda.field.DeliverToLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.DeliverToLocationID getDeliverToLocationID() throws FieldNotFound {
		return get(new quickfix.oanda.field.DeliverToLocationID());
	}

	public boolean isSet(quickfix.oanda.field.DeliverToLocationID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToLocationID() {
		return isSetField(145);
	}

	public void set(quickfix.oanda.field.PossDupFlag value) {
		setField(value);
	}

	public quickfix.oanda.field.PossDupFlag get(quickfix.oanda.field.PossDupFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.PossDupFlag getPossDupFlag() throws FieldNotFound {
		return get(new quickfix.oanda.field.PossDupFlag());
	}

	public boolean isSet(quickfix.oanda.field.PossDupFlag field) {
		return isSetField(field);
	}

	public boolean isSetPossDupFlag() {
		return isSetField(43);
	}

	public void set(quickfix.oanda.field.PossResend value) {
		setField(value);
	}

	public quickfix.oanda.field.PossResend get(quickfix.oanda.field.PossResend value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.PossResend getPossResend() throws FieldNotFound {
		return get(new quickfix.oanda.field.PossResend());
	}

	public boolean isSet(quickfix.oanda.field.PossResend field) {
		return isSetField(field);
	}

	public boolean isSetPossResend() {
		return isSetField(97);
	}

	public void set(quickfix.oanda.field.SendingTime value) {
		setField(value);
	}

	public quickfix.oanda.field.SendingTime get(quickfix.oanda.field.SendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.SendingTime getSendingTime() throws FieldNotFound {
		return get(new quickfix.oanda.field.SendingTime());
	}

	public boolean isSet(quickfix.oanda.field.SendingTime field) {
		return isSetField(field);
	}

	public boolean isSetSendingTime() {
		return isSetField(52);
	}

	public void set(quickfix.oanda.field.OrigSendingTime value) {
		setField(value);
	}

	public quickfix.oanda.field.OrigSendingTime get(quickfix.oanda.field.OrigSendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.OrigSendingTime getOrigSendingTime() throws FieldNotFound {
		return get(new quickfix.oanda.field.OrigSendingTime());
	}

	public boolean isSet(quickfix.oanda.field.OrigSendingTime field) {
		return isSetField(field);
	}

	public boolean isSetOrigSendingTime() {
		return isSetField(122);
	}

	public void set(quickfix.oanda.field.XmlDataLen value) {
		setField(value);
	}

	public quickfix.oanda.field.XmlDataLen get(quickfix.oanda.field.XmlDataLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.XmlDataLen getXmlDataLen() throws FieldNotFound {
		return get(new quickfix.oanda.field.XmlDataLen());
	}

	public boolean isSet(quickfix.oanda.field.XmlDataLen field) {
		return isSetField(field);
	}

	public boolean isSetXmlDataLen() {
		return isSetField(212);
	}

	public void set(quickfix.oanda.field.XmlData value) {
		setField(value);
	}

	public quickfix.oanda.field.XmlData get(quickfix.oanda.field.XmlData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.XmlData getXmlData() throws FieldNotFound {
		return get(new quickfix.oanda.field.XmlData());
	}

	public boolean isSet(quickfix.oanda.field.XmlData field) {
		return isSetField(field);
	}

	public boolean isSetXmlData() {
		return isSetField(213);
	}

	public void set(quickfix.oanda.field.MessageEncoding value) {
		setField(value);
	}

	public quickfix.oanda.field.MessageEncoding get(quickfix.oanda.field.MessageEncoding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MessageEncoding getMessageEncoding() throws FieldNotFound {
		return get(new quickfix.oanda.field.MessageEncoding());
	}

	public boolean isSet(quickfix.oanda.field.MessageEncoding field) {
		return isSetField(field);
	}

	public boolean isSetMessageEncoding() {
		return isSetField(347);
	}

	public void set(quickfix.oanda.field.LastMsgSeqNumProcessed value) {
		setField(value);
	}

	public quickfix.oanda.field.LastMsgSeqNumProcessed get(quickfix.oanda.field.LastMsgSeqNumProcessed value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.LastMsgSeqNumProcessed getLastMsgSeqNumProcessed() throws FieldNotFound {
		return get(new quickfix.oanda.field.LastMsgSeqNumProcessed());
	}

	public boolean isSet(quickfix.oanda.field.LastMsgSeqNumProcessed field) {
		return isSetField(field);
	}

	public boolean isSetLastMsgSeqNumProcessed() {
		return isSetField(369);
	}

	public void set(quickfix.oanda.field.OnBehalfOfSendingTime value) {
		setField(value);
	}

	public quickfix.oanda.field.OnBehalfOfSendingTime get(quickfix.oanda.field.OnBehalfOfSendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.OnBehalfOfSendingTime getOnBehalfOfSendingTime() throws FieldNotFound {
		return get(new quickfix.oanda.field.OnBehalfOfSendingTime());
	}

	public boolean isSet(quickfix.oanda.field.OnBehalfOfSendingTime field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfSendingTime() {
		return isSetField(370);
	}

	}
	
	
	public void set(quickfix.oanda.field.SignatureLength value) {
		setField(value);
	}

	public quickfix.oanda.field.SignatureLength get(quickfix.oanda.field.SignatureLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.SignatureLength getSignatureLength() throws FieldNotFound {
		return get(new quickfix.oanda.field.SignatureLength());
	}

	public boolean isSet(quickfix.oanda.field.SignatureLength field) {
		return isSetField(field);
	}

	public boolean isSetSignatureLength() {
		return isSetField(93);
	}

	public void set(quickfix.oanda.field.Signature value) {
		setField(value);
	}

	public quickfix.oanda.field.Signature get(quickfix.oanda.field.Signature value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.Signature getSignature() throws FieldNotFound {
		return get(new quickfix.oanda.field.Signature());
	}

	public boolean isSet(quickfix.oanda.field.Signature field) {
		return isSetField(field);
	}

	public boolean isSetSignature() {
		return isSetField(89);
	}

	public void set(quickfix.oanda.field.CheckSum value) {
		setField(value);
	}

	public quickfix.oanda.field.CheckSum get(quickfix.oanda.field.CheckSum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.CheckSum getCheckSum() throws FieldNotFound {
		return get(new quickfix.oanda.field.CheckSum());
	}

	public boolean isSet(quickfix.oanda.field.CheckSum field) {
		return isSetField(field);
	}

	public boolean isSetCheckSum() {
		return isSetField(10);
	}

}
