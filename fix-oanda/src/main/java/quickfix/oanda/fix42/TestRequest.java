
package quickfix.oanda.fix42;

import quickfix.FieldNotFound;


public class TestRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "1";
	

	public TestRequest() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public TestRequest(quickfix.oanda.field.TestReqID testReqID) {
		this();
		setField(testReqID);
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
