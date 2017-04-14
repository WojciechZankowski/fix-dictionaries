
package quickfix.tt;

import quickfix.FieldNotFound;


public class ResendRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "2";
	

	public ResendRequest() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public ResendRequest(quickfix.tt.field.BeginSeqNo beginSeqNo, quickfix.tt.field.EndSeqNo endSeqNo) {
		this();
		setField(beginSeqNo);
		setField(endSeqNo);
	}
	
	public void set(quickfix.tt.field.BeginSeqNo value) {
		setField(value);
	}

	public quickfix.tt.field.BeginSeqNo get(quickfix.tt.field.BeginSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.BeginSeqNo getBeginSeqNo() throws FieldNotFound {
		return get(new quickfix.tt.field.BeginSeqNo());
	}

	public boolean isSet(quickfix.tt.field.BeginSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetBeginSeqNo() {
		return isSetField(7);
	}

	public void set(quickfix.tt.field.EndSeqNo value) {
		setField(value);
	}

	public quickfix.tt.field.EndSeqNo get(quickfix.tt.field.EndSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.EndSeqNo getEndSeqNo() throws FieldNotFound {
		return get(new quickfix.tt.field.EndSeqNo());
	}

	public boolean isSet(quickfix.tt.field.EndSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetEndSeqNo() {
		return isSetField(16);
	}

}
