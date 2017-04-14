
package quickfix.oanda.fix44;

import quickfix.FieldNotFound;


public class MarketDataRequestReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "Y";
	

	public MarketDataRequestReject() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public MarketDataRequestReject(quickfix.oanda.field.MDReqID mDReqID) {
		this();
		setField(mDReqID);
	}
	
	public void set(quickfix.oanda.field.MDReqID value) {
		setField(value);
	}

	public quickfix.oanda.field.MDReqID get(quickfix.oanda.field.MDReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MDReqID getMDReqID() throws FieldNotFound {
		return get(new quickfix.oanda.field.MDReqID());
	}

	public boolean isSet(quickfix.oanda.field.MDReqID field) {
		return isSetField(field);
	}

	public boolean isSetMDReqID() {
		return isSetField(262);
	}

	public void set(quickfix.oanda.field.MDReqRejReason value) {
		setField(value);
	}

	public quickfix.oanda.field.MDReqRejReason get(quickfix.oanda.field.MDReqRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MDReqRejReason getMDReqRejReason() throws FieldNotFound {
		return get(new quickfix.oanda.field.MDReqRejReason());
	}

	public boolean isSet(quickfix.oanda.field.MDReqRejReason field) {
		return isSetField(field);
	}

	public boolean isSetMDReqRejReason() {
		return isSetField(281);
	}

	public void set(quickfix.oanda.field.Text value) {
		setField(value);
	}

	public quickfix.oanda.field.Text get(quickfix.oanda.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.Text getText() throws FieldNotFound {
		return get(new quickfix.oanda.field.Text());
	}

	public boolean isSet(quickfix.oanda.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

}
