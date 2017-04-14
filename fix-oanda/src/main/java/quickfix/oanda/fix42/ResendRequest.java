
package quickfix.oanda.fix42;

import quickfix.FieldNotFound;


public class ResendRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "2";
	

	public ResendRequest() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public ResendRequest(quickfix.oanda.field.BeginSeqNo beginSeqNo, quickfix.oanda.field.EndSeqNo endSeqNo) {
		this();
		setField(beginSeqNo);
		setField(endSeqNo);
	}
	
	public void set(quickfix.oanda.field.BeginSeqNo value) {
		setField(value);
	}

	public quickfix.oanda.field.BeginSeqNo get(quickfix.oanda.field.BeginSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.BeginSeqNo getBeginSeqNo() throws FieldNotFound {
		return get(new quickfix.oanda.field.BeginSeqNo());
	}

	public boolean isSet(quickfix.oanda.field.BeginSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetBeginSeqNo() {
		return isSetField(7);
	}

	public void set(quickfix.oanda.field.EndSeqNo value) {
		setField(value);
	}

	public quickfix.oanda.field.EndSeqNo get(quickfix.oanda.field.EndSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.EndSeqNo getEndSeqNo() throws FieldNotFound {
		return get(new quickfix.oanda.field.EndSeqNo());
	}

	public boolean isSet(quickfix.oanda.field.EndSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetEndSeqNo() {
		return isSetField(16);
	}

}
