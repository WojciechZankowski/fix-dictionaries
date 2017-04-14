
package quickfix.ib;

import quickfix.FieldNotFound;


public class TestRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "1";
	

	public TestRequest() {
		super();
		getHeader().setField(new quickfix.ib.field.MsgType(MSGTYPE));
	}
	
	public TestRequest(quickfix.ib.field.TestReqID testReqID) {
		this();
		setField(testReqID);
	}
	
	public void set(quickfix.ib.field.TestReqID value) {
		setField(value);
	}

	public quickfix.ib.field.TestReqID get(quickfix.ib.field.TestReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.TestReqID getTestReqID() throws FieldNotFound {
		return get(new quickfix.ib.field.TestReqID());
	}

	public boolean isSet(quickfix.ib.field.TestReqID field) {
		return isSetField(field);
	}

	public boolean isSetTestReqID() {
		return isSetField(112);
	}

}
