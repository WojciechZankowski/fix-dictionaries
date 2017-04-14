
package quickfix.tt;

import quickfix.FieldNotFound;


public class MarketDataRequestReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "Y";
	

	public MarketDataRequestReject() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public MarketDataRequestReject(quickfix.tt.field.MDReqID mDReqID, quickfix.tt.field.Text text) {
		this();
		setField(mDReqID);
		setField(text);
	}
	
	public void set(quickfix.tt.field.MDReqID value) {
		setField(value);
	}

	public quickfix.tt.field.MDReqID get(quickfix.tt.field.MDReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MDReqID getMDReqID() throws FieldNotFound {
		return get(new quickfix.tt.field.MDReqID());
	}

	public boolean isSet(quickfix.tt.field.MDReqID field) {
		return isSetField(field);
	}

	public boolean isSetMDReqID() {
		return isSetField(262);
	}

	public void set(quickfix.tt.field.Text value) {
		setField(value);
	}

	public quickfix.tt.field.Text get(quickfix.tt.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Text getText() throws FieldNotFound {
		return get(new quickfix.tt.field.Text());
	}

	public boolean isSet(quickfix.tt.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

}
