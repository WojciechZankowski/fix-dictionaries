
package quickfix.tt;

import quickfix.FieldNotFound;


public class SequenceReset extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "4";
	

	public SequenceReset() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public SequenceReset(quickfix.tt.field.NewSeqNo newSeqNo) {
		this();
		setField(newSeqNo);
	}
	
	public void set(quickfix.tt.field.GapFillFlag value) {
		setField(value);
	}

	public quickfix.tt.field.GapFillFlag get(quickfix.tt.field.GapFillFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.GapFillFlag getGapFillFlag() throws FieldNotFound {
		return get(new quickfix.tt.field.GapFillFlag());
	}

	public boolean isSet(quickfix.tt.field.GapFillFlag field) {
		return isSetField(field);
	}

	public boolean isSetGapFillFlag() {
		return isSetField(123);
	}

	public void set(quickfix.tt.field.NewSeqNo value) {
		setField(value);
	}

	public quickfix.tt.field.NewSeqNo get(quickfix.tt.field.NewSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.NewSeqNo getNewSeqNo() throws FieldNotFound {
		return get(new quickfix.tt.field.NewSeqNo());
	}

	public boolean isSet(quickfix.tt.field.NewSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetNewSeqNo() {
		return isSetField(36);
	}

}
