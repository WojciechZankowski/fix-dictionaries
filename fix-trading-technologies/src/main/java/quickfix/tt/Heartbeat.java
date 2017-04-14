
package quickfix.tt;

import quickfix.FieldNotFound;


public class Heartbeat extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "0";
	

	public Heartbeat() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.tt.field.TestReqID value) {
		setField(value);
	}

	public quickfix.tt.field.TestReqID get(quickfix.tt.field.TestReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TestReqID getTestReqID() throws FieldNotFound {
		return get(new quickfix.tt.field.TestReqID());
	}

	public boolean isSet(quickfix.tt.field.TestReqID field) {
		return isSetField(field);
	}

	public boolean isSetTestReqID() {
		return isSetField(112);
	}

}
