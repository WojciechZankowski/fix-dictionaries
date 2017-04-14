
package quickfix.dukascopy;

import quickfix.FieldNotFound;

import quickfix.Group;

public class Logon extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "A";
	

	public Logon() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public Logon(quickfix.dukascopy.field.EncryptMethod encryptMethod, quickfix.dukascopy.field.HeartBtInt heartBtInt) {
		this();
		setField(encryptMethod);
		setField(heartBtInt);
	}
	
	public void set(quickfix.dukascopy.field.EncryptMethod value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncryptMethod get(quickfix.dukascopy.field.EncryptMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncryptMethod getEncryptMethod() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncryptMethod());
	}

	public boolean isSet(quickfix.dukascopy.field.EncryptMethod field) {
		return isSetField(field);
	}

	public boolean isSetEncryptMethod() {
		return isSetField(98);
	}

	public void set(quickfix.dukascopy.field.HeartBtInt value) {
		setField(value);
	}

	public quickfix.dukascopy.field.HeartBtInt get(quickfix.dukascopy.field.HeartBtInt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.HeartBtInt getHeartBtInt() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.HeartBtInt());
	}

	public boolean isSet(quickfix.dukascopy.field.HeartBtInt field) {
		return isSetField(field);
	}

	public boolean isSetHeartBtInt() {
		return isSetField(108);
	}

	public void set(quickfix.dukascopy.field.RawDataLength value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RawDataLength get(quickfix.dukascopy.field.RawDataLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RawDataLength getRawDataLength() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RawDataLength());
	}

	public boolean isSet(quickfix.dukascopy.field.RawDataLength field) {
		return isSetField(field);
	}

	public boolean isSetRawDataLength() {
		return isSetField(95);
	}

	public void set(quickfix.dukascopy.field.RawData value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RawData get(quickfix.dukascopy.field.RawData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RawData getRawData() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RawData());
	}

	public boolean isSet(quickfix.dukascopy.field.RawData field) {
		return isSetField(field);
	}

	public boolean isSetRawData() {
		return isSetField(96);
	}

	public void set(quickfix.dukascopy.field.ResetSeqNumFlag value) {
		setField(value);
	}

	public quickfix.dukascopy.field.ResetSeqNumFlag get(quickfix.dukascopy.field.ResetSeqNumFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.ResetSeqNumFlag getResetSeqNumFlag() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.ResetSeqNumFlag());
	}

	public boolean isSet(quickfix.dukascopy.field.ResetSeqNumFlag field) {
		return isSetField(field);
	}

	public boolean isSetResetSeqNumFlag() {
		return isSetField(141);
	}

	public void set(quickfix.dukascopy.field.NextExpectedMsgSeqNum value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NextExpectedMsgSeqNum get(quickfix.dukascopy.field.NextExpectedMsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NextExpectedMsgSeqNum getNextExpectedMsgSeqNum() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NextExpectedMsgSeqNum());
	}

	public boolean isSet(quickfix.dukascopy.field.NextExpectedMsgSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetNextExpectedMsgSeqNum() {
		return isSetField(789);
	}

	public void set(quickfix.dukascopy.field.MaxMessageSize value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MaxMessageSize get(quickfix.dukascopy.field.MaxMessageSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MaxMessageSize getMaxMessageSize() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MaxMessageSize());
	}

	public boolean isSet(quickfix.dukascopy.field.MaxMessageSize field) {
		return isSetField(field);
	}

	public boolean isSetMaxMessageSize() {
		return isSetField(383);
	}

	public void set(quickfix.dukascopy.field.NoMsgTypes value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoMsgTypes get(quickfix.dukascopy.field.NoMsgTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoMsgTypes getNoMsgTypes() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoMsgTypes());
	}

	public boolean isSet(quickfix.dukascopy.field.NoMsgTypes field) {
		return isSetField(field);
	}

	public boolean isSetNoMsgTypes() {
		return isSetField(384);
	}

	public static class NoMsgTypes extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {372, 385, 0};

		public NoMsgTypes() {
			super(384, 372, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.RefMsgType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RefMsgType get(quickfix.dukascopy.field.RefMsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RefMsgType getRefMsgType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RefMsgType());
	}

	public boolean isSet(quickfix.dukascopy.field.RefMsgType field) {
		return isSetField(field);
	}

	public boolean isSetRefMsgType() {
		return isSetField(372);
	}

	public void set(quickfix.dukascopy.field.MsgDirection value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MsgDirection get(quickfix.dukascopy.field.MsgDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MsgDirection getMsgDirection() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MsgDirection());
	}

	public boolean isSet(quickfix.dukascopy.field.MsgDirection field) {
		return isSetField(field);
	}

	public boolean isSetMsgDirection() {
		return isSetField(385);
	}

	}

	public void set(quickfix.dukascopy.field.TestMessageIndicator value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TestMessageIndicator get(quickfix.dukascopy.field.TestMessageIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TestMessageIndicator getTestMessageIndicator() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TestMessageIndicator());
	}

	public boolean isSet(quickfix.dukascopy.field.TestMessageIndicator field) {
		return isSetField(field);
	}

	public boolean isSetTestMessageIndicator() {
		return isSetField(464);
	}

	public void set(quickfix.dukascopy.field.Username value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Username get(quickfix.dukascopy.field.Username value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Username getUsername() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Username());
	}

	public boolean isSet(quickfix.dukascopy.field.Username field) {
		return isSetField(field);
	}

	public boolean isSetUsername() {
		return isSetField(553);
	}

	public void set(quickfix.dukascopy.field.Password value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Password get(quickfix.dukascopy.field.Password value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Password getPassword() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Password());
	}

	public boolean isSet(quickfix.dukascopy.field.Password field) {
		return isSetField(field);
	}

	public boolean isSetPassword() {
		return isSetField(554);
	}

}
