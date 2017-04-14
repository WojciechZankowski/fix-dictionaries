
package quickfix.ib;

import quickfix.FieldNotFound;


public class Reject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "3";
	

	public Reject() {
		super();
		getHeader().setField(new quickfix.ib.field.MsgType(MSGTYPE));
	}
	
	public Reject(quickfix.ib.field.RefSeqNum refSeqNum) {
		this();
		setField(refSeqNum);
	}
	
	public void set(quickfix.ib.field.RefSeqNum value) {
		setField(value);
	}

	public quickfix.ib.field.RefSeqNum get(quickfix.ib.field.RefSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.RefSeqNum getRefSeqNum() throws FieldNotFound {
		return get(new quickfix.ib.field.RefSeqNum());
	}

	public boolean isSet(quickfix.ib.field.RefSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetRefSeqNum() {
		return isSetField(45);
	}

	public void set(quickfix.ib.field.Text value) {
		setField(value);
	}

	public quickfix.ib.field.Text get(quickfix.ib.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.Text getText() throws FieldNotFound {
		return get(new quickfix.ib.field.Text());
	}

	public boolean isSet(quickfix.ib.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

}
