
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class ResendRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "2";
	

	public ResendRequest() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public ResendRequest(quickfix.dukascopy.field.BeginSeqNo beginSeqNo, quickfix.dukascopy.field.EndSeqNo endSeqNo) {
		this();
		setField(beginSeqNo);
		setField(endSeqNo);
	}
	
	public void set(quickfix.dukascopy.field.BeginSeqNo value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BeginSeqNo get(quickfix.dukascopy.field.BeginSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BeginSeqNo getBeginSeqNo() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BeginSeqNo());
	}

	public boolean isSet(quickfix.dukascopy.field.BeginSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetBeginSeqNo() {
		return isSetField(7);
	}

	public void set(quickfix.dukascopy.field.EndSeqNo value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EndSeqNo get(quickfix.dukascopy.field.EndSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EndSeqNo getEndSeqNo() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EndSeqNo());
	}

	public boolean isSet(quickfix.dukascopy.field.EndSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetEndSeqNo() {
		return isSetField(16);
	}

}
