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

import quickfix.FieldNotFound;
  
import quickfix.field.*;

import quickfix.Group;

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
		
	public void set(quickfix.dukascopy.field.BeginString value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BeginString get(quickfix.dukascopy.field.BeginString value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BeginString getBeginString() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BeginString());
	}

	public boolean isSet(quickfix.dukascopy.field.BeginString field) {
		return isSetField(field);
	}

	public boolean isSetBeginString() {
		return isSetField(8);
	}

	public void set(quickfix.dukascopy.field.BodyLength value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BodyLength get(quickfix.dukascopy.field.BodyLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BodyLength getBodyLength() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BodyLength());
	}

	public boolean isSet(quickfix.dukascopy.field.BodyLength field) {
		return isSetField(field);
	}

	public boolean isSetBodyLength() {
		return isSetField(9);
	}

	public void set(quickfix.dukascopy.field.MsgType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MsgType get(quickfix.dukascopy.field.MsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MsgType getMsgType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MsgType());
	}

	public boolean isSet(quickfix.dukascopy.field.MsgType field) {
		return isSetField(field);
	}

	public boolean isSetMsgType() {
		return isSetField(35);
	}

	public void set(quickfix.dukascopy.field.SenderCompID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SenderCompID get(quickfix.dukascopy.field.SenderCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SenderCompID getSenderCompID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SenderCompID());
	}

	public boolean isSet(quickfix.dukascopy.field.SenderCompID field) {
		return isSetField(field);
	}

	public boolean isSetSenderCompID() {
		return isSetField(49);
	}

	public void set(quickfix.dukascopy.field.TargetCompID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TargetCompID get(quickfix.dukascopy.field.TargetCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TargetCompID getTargetCompID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TargetCompID());
	}

	public boolean isSet(quickfix.dukascopy.field.TargetCompID field) {
		return isSetField(field);
	}

	public boolean isSetTargetCompID() {
		return isSetField(56);
	}

	public void set(quickfix.dukascopy.field.OnBehalfOfCompID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OnBehalfOfCompID get(quickfix.dukascopy.field.OnBehalfOfCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OnBehalfOfCompID getOnBehalfOfCompID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OnBehalfOfCompID());
	}

	public boolean isSet(quickfix.dukascopy.field.OnBehalfOfCompID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfCompID() {
		return isSetField(115);
	}

	public void set(quickfix.dukascopy.field.DeliverToCompID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DeliverToCompID get(quickfix.dukascopy.field.DeliverToCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DeliverToCompID getDeliverToCompID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DeliverToCompID());
	}

	public boolean isSet(quickfix.dukascopy.field.DeliverToCompID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToCompID() {
		return isSetField(128);
	}

	public void set(quickfix.dukascopy.field.SecureDataLen value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SecureDataLen get(quickfix.dukascopy.field.SecureDataLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SecureDataLen getSecureDataLen() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SecureDataLen());
	}

	public boolean isSet(quickfix.dukascopy.field.SecureDataLen field) {
		return isSetField(field);
	}

	public boolean isSetSecureDataLen() {
		return isSetField(90);
	}

	public void set(quickfix.dukascopy.field.SecureData value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SecureData get(quickfix.dukascopy.field.SecureData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SecureData getSecureData() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SecureData());
	}

	public boolean isSet(quickfix.dukascopy.field.SecureData field) {
		return isSetField(field);
	}

	public boolean isSetSecureData() {
		return isSetField(91);
	}

	public void set(quickfix.dukascopy.field.MsgSeqNum value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MsgSeqNum get(quickfix.dukascopy.field.MsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MsgSeqNum getMsgSeqNum() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MsgSeqNum());
	}

	public boolean isSet(quickfix.dukascopy.field.MsgSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetMsgSeqNum() {
		return isSetField(34);
	}

	public void set(quickfix.dukascopy.field.SenderSubID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SenderSubID get(quickfix.dukascopy.field.SenderSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SenderSubID getSenderSubID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SenderSubID());
	}

	public boolean isSet(quickfix.dukascopy.field.SenderSubID field) {
		return isSetField(field);
	}

	public boolean isSetSenderSubID() {
		return isSetField(50);
	}

	public void set(quickfix.dukascopy.field.SenderLocationID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SenderLocationID get(quickfix.dukascopy.field.SenderLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SenderLocationID getSenderLocationID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SenderLocationID());
	}

	public boolean isSet(quickfix.dukascopy.field.SenderLocationID field) {
		return isSetField(field);
	}

	public boolean isSetSenderLocationID() {
		return isSetField(142);
	}

	public void set(quickfix.dukascopy.field.TargetSubID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TargetSubID get(quickfix.dukascopy.field.TargetSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TargetSubID getTargetSubID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TargetSubID());
	}

	public boolean isSet(quickfix.dukascopy.field.TargetSubID field) {
		return isSetField(field);
	}

	public boolean isSetTargetSubID() {
		return isSetField(57);
	}

	public void set(quickfix.dukascopy.field.TargetLocationID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TargetLocationID get(quickfix.dukascopy.field.TargetLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TargetLocationID getTargetLocationID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TargetLocationID());
	}

	public boolean isSet(quickfix.dukascopy.field.TargetLocationID field) {
		return isSetField(field);
	}

	public boolean isSetTargetLocationID() {
		return isSetField(143);
	}

	public void set(quickfix.dukascopy.field.OnBehalfOfSubID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OnBehalfOfSubID get(quickfix.dukascopy.field.OnBehalfOfSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OnBehalfOfSubID getOnBehalfOfSubID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OnBehalfOfSubID());
	}

	public boolean isSet(quickfix.dukascopy.field.OnBehalfOfSubID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfSubID() {
		return isSetField(116);
	}

	public void set(quickfix.dukascopy.field.OnBehalfOfLocationID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OnBehalfOfLocationID get(quickfix.dukascopy.field.OnBehalfOfLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OnBehalfOfLocationID getOnBehalfOfLocationID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OnBehalfOfLocationID());
	}

	public boolean isSet(quickfix.dukascopy.field.OnBehalfOfLocationID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfLocationID() {
		return isSetField(144);
	}

	public void set(quickfix.dukascopy.field.DeliverToSubID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DeliverToSubID get(quickfix.dukascopy.field.DeliverToSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DeliverToSubID getDeliverToSubID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DeliverToSubID());
	}

	public boolean isSet(quickfix.dukascopy.field.DeliverToSubID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToSubID() {
		return isSetField(129);
	}

	public void set(quickfix.dukascopy.field.DeliverToLocationID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DeliverToLocationID get(quickfix.dukascopy.field.DeliverToLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DeliverToLocationID getDeliverToLocationID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DeliverToLocationID());
	}

	public boolean isSet(quickfix.dukascopy.field.DeliverToLocationID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToLocationID() {
		return isSetField(145);
	}

	public void set(quickfix.dukascopy.field.PossDupFlag value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PossDupFlag get(quickfix.dukascopy.field.PossDupFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PossDupFlag getPossDupFlag() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PossDupFlag());
	}

	public boolean isSet(quickfix.dukascopy.field.PossDupFlag field) {
		return isSetField(field);
	}

	public boolean isSetPossDupFlag() {
		return isSetField(43);
	}

	public void set(quickfix.dukascopy.field.PossResend value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PossResend get(quickfix.dukascopy.field.PossResend value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PossResend getPossResend() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PossResend());
	}

	public boolean isSet(quickfix.dukascopy.field.PossResend field) {
		return isSetField(field);
	}

	public boolean isSetPossResend() {
		return isSetField(97);
	}

	public void set(quickfix.dukascopy.field.SendingTime value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SendingTime get(quickfix.dukascopy.field.SendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SendingTime getSendingTime() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SendingTime());
	}

	public boolean isSet(quickfix.dukascopy.field.SendingTime field) {
		return isSetField(field);
	}

	public boolean isSetSendingTime() {
		return isSetField(52);
	}

	public void set(quickfix.dukascopy.field.OrigSendingTime value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OrigSendingTime get(quickfix.dukascopy.field.OrigSendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OrigSendingTime getOrigSendingTime() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OrigSendingTime());
	}

	public boolean isSet(quickfix.dukascopy.field.OrigSendingTime field) {
		return isSetField(field);
	}

	public boolean isSetOrigSendingTime() {
		return isSetField(122);
	}

	public void set(quickfix.dukascopy.field.XmlDataLen value) {
		setField(value);
	}

	public quickfix.dukascopy.field.XmlDataLen get(quickfix.dukascopy.field.XmlDataLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.XmlDataLen getXmlDataLen() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.XmlDataLen());
	}

	public boolean isSet(quickfix.dukascopy.field.XmlDataLen field) {
		return isSetField(field);
	}

	public boolean isSetXmlDataLen() {
		return isSetField(212);
	}

	public void set(quickfix.dukascopy.field.XmlData value) {
		setField(value);
	}

	public quickfix.dukascopy.field.XmlData get(quickfix.dukascopy.field.XmlData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.XmlData getXmlData() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.XmlData());
	}

	public boolean isSet(quickfix.dukascopy.field.XmlData field) {
		return isSetField(field);
	}

	public boolean isSetXmlData() {
		return isSetField(213);
	}

	public void set(quickfix.dukascopy.field.MessageEncoding value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MessageEncoding get(quickfix.dukascopy.field.MessageEncoding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MessageEncoding getMessageEncoding() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MessageEncoding());
	}

	public boolean isSet(quickfix.dukascopy.field.MessageEncoding field) {
		return isSetField(field);
	}

	public boolean isSetMessageEncoding() {
		return isSetField(347);
	}

	public void set(quickfix.dukascopy.field.LastMsgSeqNumProcessed value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LastMsgSeqNumProcessed get(quickfix.dukascopy.field.LastMsgSeqNumProcessed value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LastMsgSeqNumProcessed getLastMsgSeqNumProcessed() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LastMsgSeqNumProcessed());
	}

	public boolean isSet(quickfix.dukascopy.field.LastMsgSeqNumProcessed field) {
		return isSetField(field);
	}

	public boolean isSetLastMsgSeqNumProcessed() {
		return isSetField(369);
	}

	public void set(quickfix.dukascopy.field.NoHops value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoHops get(quickfix.dukascopy.field.NoHops value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoHops getNoHops() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoHops());
	}

	public boolean isSet(quickfix.dukascopy.field.NoHops field) {
		return isSetField(field);
	}

	public boolean isSetNoHops() {
		return isSetField(627);
	}

	public static class NoHops extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {628, 629, 630, 0};

		public NoHops() {
			super(627, 628, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.HopCompID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.HopCompID get(quickfix.dukascopy.field.HopCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.HopCompID getHopCompID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.HopCompID());
	}

	public boolean isSet(quickfix.dukascopy.field.HopCompID field) {
		return isSetField(field);
	}

	public boolean isSetHopCompID() {
		return isSetField(628);
	}

	public void set(quickfix.dukascopy.field.HopSendingTime value) {
		setField(value);
	}

	public quickfix.dukascopy.field.HopSendingTime get(quickfix.dukascopy.field.HopSendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.HopSendingTime getHopSendingTime() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.HopSendingTime());
	}

	public boolean isSet(quickfix.dukascopy.field.HopSendingTime field) {
		return isSetField(field);
	}

	public boolean isSetHopSendingTime() {
		return isSetField(629);
	}

	public void set(quickfix.dukascopy.field.HopRefID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.HopRefID get(quickfix.dukascopy.field.HopRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.HopRefID getHopRefID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.HopRefID());
	}

	public boolean isSet(quickfix.dukascopy.field.HopRefID field) {
		return isSetField(field);
	}

	public boolean isSetHopRefID() {
		return isSetField(630);
	}

	}

	}
	
	
	public void set(quickfix.dukascopy.field.SignatureLength value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SignatureLength get(quickfix.dukascopy.field.SignatureLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SignatureLength getSignatureLength() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SignatureLength());
	}

	public boolean isSet(quickfix.dukascopy.field.SignatureLength field) {
		return isSetField(field);
	}

	public boolean isSetSignatureLength() {
		return isSetField(93);
	}

	public void set(quickfix.dukascopy.field.Signature value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Signature get(quickfix.dukascopy.field.Signature value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Signature getSignature() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Signature());
	}

	public boolean isSet(quickfix.dukascopy.field.Signature field) {
		return isSetField(field);
	}

	public boolean isSetSignature() {
		return isSetField(89);
	}

	public void set(quickfix.dukascopy.field.CheckSum value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CheckSum get(quickfix.dukascopy.field.CheckSum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CheckSum getCheckSum() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CheckSum());
	}

	public boolean isSet(quickfix.dukascopy.field.CheckSum field) {
		return isSetField(field);
	}

	public boolean isSetCheckSum() {
		return isSetField(10);
	}

}
