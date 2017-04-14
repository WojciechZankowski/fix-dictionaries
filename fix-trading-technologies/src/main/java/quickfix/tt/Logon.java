
package quickfix.tt;

import quickfix.FieldNotFound;


public class Logon extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "A";
	

	public Logon() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public Logon(quickfix.tt.field.EncryptMethod encryptMethod, quickfix.tt.field.HeartBtInt heartBtInt) {
		this();
		setField(encryptMethod);
		setField(heartBtInt);
	}
	
	public void set(quickfix.tt.field.RawData value) {
		setField(value);
	}

	public quickfix.tt.field.RawData get(quickfix.tt.field.RawData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.RawData getRawData() throws FieldNotFound {
		return get(new quickfix.tt.field.RawData());
	}

	public boolean isSet(quickfix.tt.field.RawData field) {
		return isSetField(field);
	}

	public boolean isSetRawData() {
		return isSetField(96);
	}

	public void set(quickfix.tt.field.EncryptMethod value) {
		setField(value);
	}

	public quickfix.tt.field.EncryptMethod get(quickfix.tt.field.EncryptMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.EncryptMethod getEncryptMethod() throws FieldNotFound {
		return get(new quickfix.tt.field.EncryptMethod());
	}

	public boolean isSet(quickfix.tt.field.EncryptMethod field) {
		return isSetField(field);
	}

	public boolean isSetEncryptMethod() {
		return isSetField(98);
	}

	public void set(quickfix.tt.field.HeartBtInt value) {
		setField(value);
	}

	public quickfix.tt.field.HeartBtInt get(quickfix.tt.field.HeartBtInt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.HeartBtInt getHeartBtInt() throws FieldNotFound {
		return get(new quickfix.tt.field.HeartBtInt());
	}

	public boolean isSet(quickfix.tt.field.HeartBtInt field) {
		return isSetField(field);
	}

	public boolean isSetHeartBtInt() {
		return isSetField(108);
	}

	public void set(quickfix.tt.field.ResetSeqNumFlag value) {
		setField(value);
	}

	public quickfix.tt.field.ResetSeqNumFlag get(quickfix.tt.field.ResetSeqNumFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ResetSeqNumFlag getResetSeqNumFlag() throws FieldNotFound {
		return get(new quickfix.tt.field.ResetSeqNumFlag());
	}

	public boolean isSet(quickfix.tt.field.ResetSeqNumFlag field) {
		return isSetField(field);
	}

	public boolean isSetResetSeqNumFlag() {
		return isSetField(141);
	}

}
