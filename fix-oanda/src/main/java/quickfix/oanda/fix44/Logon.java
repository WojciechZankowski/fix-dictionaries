
package quickfix.oanda.fix44;

import quickfix.FieldNotFound;


public class Logon extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "A";
	

	public Logon() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public Logon(quickfix.oanda.field.EncryptMethod encryptMethod, quickfix.oanda.field.HeartBtInt heartBtInt, quickfix.oanda.field.Password password) {
		this();
		setField(encryptMethod);
		setField(heartBtInt);
		setField(password);
	}
	
	public void set(quickfix.oanda.field.EncryptMethod value) {
		setField(value);
	}

	public quickfix.oanda.field.EncryptMethod get(quickfix.oanda.field.EncryptMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.EncryptMethod getEncryptMethod() throws FieldNotFound {
		return get(new quickfix.oanda.field.EncryptMethod());
	}

	public boolean isSet(quickfix.oanda.field.EncryptMethod field) {
		return isSetField(field);
	}

	public boolean isSetEncryptMethod() {
		return isSetField(98);
	}

	public void set(quickfix.oanda.field.HeartBtInt value) {
		setField(value);
	}

	public quickfix.oanda.field.HeartBtInt get(quickfix.oanda.field.HeartBtInt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.HeartBtInt getHeartBtInt() throws FieldNotFound {
		return get(new quickfix.oanda.field.HeartBtInt());
	}

	public boolean isSet(quickfix.oanda.field.HeartBtInt field) {
		return isSetField(field);
	}

	public boolean isSetHeartBtInt() {
		return isSetField(108);
	}

	public void set(quickfix.oanda.field.Password value) {
		setField(value);
	}

	public quickfix.oanda.field.Password get(quickfix.oanda.field.Password value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.Password getPassword() throws FieldNotFound {
		return get(new quickfix.oanda.field.Password());
	}

	public boolean isSet(quickfix.oanda.field.Password field) {
		return isSetField(field);
	}

	public boolean isSetPassword() {
		return isSetField(554);
	}

	public void set(quickfix.oanda.field.ResetSeqNumFlag value) {
		setField(value);
	}

	public quickfix.oanda.field.ResetSeqNumFlag get(quickfix.oanda.field.ResetSeqNumFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.ResetSeqNumFlag getResetSeqNumFlag() throws FieldNotFound {
		return get(new quickfix.oanda.field.ResetSeqNumFlag());
	}

	public boolean isSet(quickfix.oanda.field.ResetSeqNumFlag field) {
		return isSetField(field);
	}

	public boolean isSetResetSeqNumFlag() {
		return isSetField(141);
	}

}
