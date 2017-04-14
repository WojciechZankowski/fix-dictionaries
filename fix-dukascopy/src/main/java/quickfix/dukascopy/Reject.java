
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class Reject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "3";
	

	public Reject() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public Reject(quickfix.dukascopy.field.RefSeqNum refSeqNum) {
		this();
		setField(refSeqNum);
	}
	
	public void set(quickfix.dukascopy.field.RefSeqNum value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RefSeqNum get(quickfix.dukascopy.field.RefSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RefSeqNum getRefSeqNum() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RefSeqNum());
	}

	public boolean isSet(quickfix.dukascopy.field.RefSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetRefSeqNum() {
		return isSetField(45);
	}

	public void set(quickfix.dukascopy.field.RefTagID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RefTagID get(quickfix.dukascopy.field.RefTagID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RefTagID getRefTagID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RefTagID());
	}

	public boolean isSet(quickfix.dukascopy.field.RefTagID field) {
		return isSetField(field);
	}

	public boolean isSetRefTagID() {
		return isSetField(371);
	}

	public void set(quickfix.dukascopy.field.RefMsgType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RefMsgType get(quickfix.dukascopy.field.RefMsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RefMsgType getRefMsgType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RefMsgType());
	}

	public boolean isSet(quickfix.dukascopy.field.RefMsgType field) {
		return isSetField(field);
	}

	public boolean isSetRefMsgType() {
		return isSetField(372);
	}

	public void set(quickfix.dukascopy.field.SessionRejectReason value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SessionRejectReason get(quickfix.dukascopy.field.SessionRejectReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SessionRejectReason getSessionRejectReason() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SessionRejectReason());
	}

	public boolean isSet(quickfix.dukascopy.field.SessionRejectReason field) {
		return isSetField(field);
	}

	public boolean isSetSessionRejectReason() {
		return isSetField(373);
	}

	public void set(quickfix.dukascopy.field.Text value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Text get(quickfix.dukascopy.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Text getText() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Text());
	}

	public boolean isSet(quickfix.dukascopy.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

	public void set(quickfix.dukascopy.field.EncodedTextLen value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedTextLen get(quickfix.dukascopy.field.EncodedTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedTextLen());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedTextLen() {
		return isSetField(354);
	}

	public void set(quickfix.dukascopy.field.EncodedText value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedText get(quickfix.dukascopy.field.EncodedText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedText getEncodedText() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedText());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedText() {
		return isSetField(355);
	}

}
