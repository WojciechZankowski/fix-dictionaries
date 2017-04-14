
package quickfix.oanda.fix44;

import quickfix.FieldNotFound;


public class Heartbeat extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "0";
	

	public Heartbeat() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.oanda.field.TestReqID value) {
		setField(value);
	}

	public quickfix.oanda.field.TestReqID get(quickfix.oanda.field.TestReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.TestReqID getTestReqID() throws FieldNotFound {
		return get(new quickfix.oanda.field.TestReqID());
	}

	public boolean isSet(quickfix.oanda.field.TestReqID field) {
		return isSetField(field);
	}

	public boolean isSetTestReqID() {
		return isSetField(112);
	}

}
