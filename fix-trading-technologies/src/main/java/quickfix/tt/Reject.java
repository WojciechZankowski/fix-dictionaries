
package quickfix.tt;

import quickfix.FieldNotFound;


public class Reject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "3";
	

	public Reject() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public Reject(quickfix.tt.field.RefSeqNum refSeqNum, quickfix.tt.field.Text text, quickfix.tt.field.RefTagID refTagID, quickfix.tt.field.RefMsgType refMsgType, quickfix.tt.field.SessionRejectReason sessionRejectReason) {
		this();
		setField(refSeqNum);
		setField(text);
		setField(refTagID);
		setField(refMsgType);
		setField(sessionRejectReason);
	}
	
	public void set(quickfix.tt.field.RefSeqNum value) {
		setField(value);
	}

	public quickfix.tt.field.RefSeqNum get(quickfix.tt.field.RefSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.RefSeqNum getRefSeqNum() throws FieldNotFound {
		return get(new quickfix.tt.field.RefSeqNum());
	}

	public boolean isSet(quickfix.tt.field.RefSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetRefSeqNum() {
		return isSetField(45);
	}

	public void set(quickfix.tt.field.Text value) {
		setField(value);
	}

	public quickfix.tt.field.Text get(quickfix.tt.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Text getText() throws FieldNotFound {
		return get(new quickfix.tt.field.Text());
	}

	public boolean isSet(quickfix.tt.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

	public void set(quickfix.tt.field.RefTagID value) {
		setField(value);
	}

	public quickfix.tt.field.RefTagID get(quickfix.tt.field.RefTagID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.RefTagID getRefTagID() throws FieldNotFound {
		return get(new quickfix.tt.field.RefTagID());
	}

	public boolean isSet(quickfix.tt.field.RefTagID field) {
		return isSetField(field);
	}

	public boolean isSetRefTagID() {
		return isSetField(371);
	}

	public void set(quickfix.tt.field.RefMsgType value) {
		setField(value);
	}

	public quickfix.tt.field.RefMsgType get(quickfix.tt.field.RefMsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.RefMsgType getRefMsgType() throws FieldNotFound {
		return get(new quickfix.tt.field.RefMsgType());
	}

	public boolean isSet(quickfix.tt.field.RefMsgType field) {
		return isSetField(field);
	}

	public boolean isSetRefMsgType() {
		return isSetField(372);
	}

	public void set(quickfix.tt.field.SessionRejectReason value) {
		setField(value);
	}

	public quickfix.tt.field.SessionRejectReason get(quickfix.tt.field.SessionRejectReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SessionRejectReason getSessionRejectReason() throws FieldNotFound {
		return get(new quickfix.tt.field.SessionRejectReason());
	}

	public boolean isSet(quickfix.tt.field.SessionRejectReason field) {
		return isSetField(field);
	}

	public boolean isSetSessionRejectReason() {
		return isSetField(373);
	}

}
