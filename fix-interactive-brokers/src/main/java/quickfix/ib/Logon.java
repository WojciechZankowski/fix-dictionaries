
package quickfix.ib;

import quickfix.FieldNotFound;


public class Logon extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "A";
	

	public Logon() {
		super();
		getHeader().setField(new quickfix.ib.field.MsgType(MSGTYPE));
	}
	
	public Logon(quickfix.ib.field.EncryptMethod encryptMethod, quickfix.ib.field.HeartBtInt heartBtInt) {
		this();
		setField(encryptMethod);
		setField(heartBtInt);
	}
	
	public void set(quickfix.ib.field.EncryptMethod value) {
		setField(value);
	}

	public quickfix.ib.field.EncryptMethod get(quickfix.ib.field.EncryptMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.EncryptMethod getEncryptMethod() throws FieldNotFound {
		return get(new quickfix.ib.field.EncryptMethod());
	}

	public boolean isSet(quickfix.ib.field.EncryptMethod field) {
		return isSetField(field);
	}

	public boolean isSetEncryptMethod() {
		return isSetField(98);
	}

	public void set(quickfix.ib.field.HeartBtInt value) {
		setField(value);
	}

	public quickfix.ib.field.HeartBtInt get(quickfix.ib.field.HeartBtInt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.HeartBtInt getHeartBtInt() throws FieldNotFound {
		return get(new quickfix.ib.field.HeartBtInt());
	}

	public boolean isSet(quickfix.ib.field.HeartBtInt field) {
		return isSetField(field);
	}

	public boolean isSetHeartBtInt() {
		return isSetField(108);
	}

	public void set(quickfix.ib.field.ResetSeqNumFlag value) {
		setField(value);
	}

	public quickfix.ib.field.ResetSeqNumFlag get(quickfix.ib.field.ResetSeqNumFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ResetSeqNumFlag getResetSeqNumFlag() throws FieldNotFound {
		return get(new quickfix.ib.field.ResetSeqNumFlag());
	}

	public boolean isSet(quickfix.ib.field.ResetSeqNumFlag field) {
		return isSetField(field);
	}

	public boolean isSetResetSeqNumFlag() {
		return isSetField(141);
	}

}
