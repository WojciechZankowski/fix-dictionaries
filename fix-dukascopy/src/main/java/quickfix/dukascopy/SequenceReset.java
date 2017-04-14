
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class SequenceReset extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "4";
	

	public SequenceReset() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public SequenceReset(quickfix.dukascopy.field.NewSeqNo newSeqNo) {
		this();
		setField(newSeqNo);
	}
	
	public void set(quickfix.dukascopy.field.GapFillFlag value) {
		setField(value);
	}

	public quickfix.dukascopy.field.GapFillFlag get(quickfix.dukascopy.field.GapFillFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.GapFillFlag getGapFillFlag() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.GapFillFlag());
	}

	public boolean isSet(quickfix.dukascopy.field.GapFillFlag field) {
		return isSetField(field);
	}

	public boolean isSetGapFillFlag() {
		return isSetField(123);
	}

	public void set(quickfix.dukascopy.field.NewSeqNo value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NewSeqNo get(quickfix.dukascopy.field.NewSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NewSeqNo getNewSeqNo() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NewSeqNo());
	}

	public boolean isSet(quickfix.dukascopy.field.NewSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetNewSeqNo() {
		return isSetField(36);
	}

}
