
package quickfix.ib;

import quickfix.FieldNotFound;


public class ResendRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "2";
	

	public ResendRequest() {
		super();
		getHeader().setField(new quickfix.ib.field.MsgType(MSGTYPE));
	}
	
	public ResendRequest(quickfix.ib.field.BeginSeqNo beginSeqNo, quickfix.ib.field.EndSeqNo endSeqNo) {
		this();
		setField(beginSeqNo);
		setField(endSeqNo);
	}
	
	public void set(quickfix.ib.field.BeginSeqNo value) {
		setField(value);
	}

	public quickfix.ib.field.BeginSeqNo get(quickfix.ib.field.BeginSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.BeginSeqNo getBeginSeqNo() throws FieldNotFound {
		return get(new quickfix.ib.field.BeginSeqNo());
	}

	public boolean isSet(quickfix.ib.field.BeginSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetBeginSeqNo() {
		return isSetField(7);
	}

	public void set(quickfix.ib.field.EndSeqNo value) {
		setField(value);
	}

	public quickfix.ib.field.EndSeqNo get(quickfix.ib.field.EndSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.EndSeqNo getEndSeqNo() throws FieldNotFound {
		return get(new quickfix.ib.field.EndSeqNo());
	}

	public boolean isSet(quickfix.ib.field.EndSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetEndSeqNo() {
		return isSetField(16);
	}

}
