
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class Heartbeat extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "0";
	

	public Heartbeat() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.dukascopy.field.TestReqID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TestReqID get(quickfix.dukascopy.field.TestReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TestReqID getTestReqID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TestReqID());
	}

	public boolean isSet(quickfix.dukascopy.field.TestReqID field) {
		return isSetField(field);
	}

	public boolean isSetTestReqID() {
		return isSetField(112);
	}

}
