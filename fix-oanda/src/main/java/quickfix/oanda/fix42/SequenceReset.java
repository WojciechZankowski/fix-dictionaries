
package quickfix.oanda.fix42;

import quickfix.FieldNotFound;


public class SequenceReset extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "4";
	

	public SequenceReset() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public SequenceReset(quickfix.oanda.field.NewSeqNo newSeqNo) {
		this();
		setField(newSeqNo);
	}
	
	public void set(quickfix.oanda.field.GapFillFlag value) {
		setField(value);
	}

	public quickfix.oanda.field.GapFillFlag get(quickfix.oanda.field.GapFillFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.GapFillFlag getGapFillFlag() throws FieldNotFound {
		return get(new quickfix.oanda.field.GapFillFlag());
	}

	public boolean isSet(quickfix.oanda.field.GapFillFlag field) {
		return isSetField(field);
	}

	public boolean isSetGapFillFlag() {
		return isSetField(123);
	}

	public void set(quickfix.oanda.field.NewSeqNo value) {
		setField(value);
	}

	public quickfix.oanda.field.NewSeqNo get(quickfix.oanda.field.NewSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.NewSeqNo getNewSeqNo() throws FieldNotFound {
		return get(new quickfix.oanda.field.NewSeqNo());
	}

	public boolean isSet(quickfix.oanda.field.NewSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetNewSeqNo() {
		return isSetField(36);
	}

}
