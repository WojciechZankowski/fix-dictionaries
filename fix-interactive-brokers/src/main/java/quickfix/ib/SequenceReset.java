
package quickfix.ib;

import quickfix.FieldNotFound;


public class SequenceReset extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "4";
	

	public SequenceReset() {
		super();
		getHeader().setField(new quickfix.ib.field.MsgType(MSGTYPE));
	}
	
	public SequenceReset(quickfix.ib.field.NewSeqNo newSeqNo) {
		this();
		setField(newSeqNo);
	}
	
	public void set(quickfix.ib.field.GapFillFlag value) {
		setField(value);
	}

	public quickfix.ib.field.GapFillFlag get(quickfix.ib.field.GapFillFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.GapFillFlag getGapFillFlag() throws FieldNotFound {
		return get(new quickfix.ib.field.GapFillFlag());
	}

	public boolean isSet(quickfix.ib.field.GapFillFlag field) {
		return isSetField(field);
	}

	public boolean isSetGapFillFlag() {
		return isSetField(123);
	}

	public void set(quickfix.ib.field.NewSeqNo value) {
		setField(value);
	}

	public quickfix.ib.field.NewSeqNo get(quickfix.ib.field.NewSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.NewSeqNo getNewSeqNo() throws FieldNotFound {
		return get(new quickfix.ib.field.NewSeqNo());
	}

	public boolean isSet(quickfix.ib.field.NewSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetNewSeqNo() {
		return isSetField(36);
	}

}
