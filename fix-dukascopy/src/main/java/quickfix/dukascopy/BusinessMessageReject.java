
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class BusinessMessageReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "j";
	

	public BusinessMessageReject() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public BusinessMessageReject(quickfix.dukascopy.field.RefMsgType refMsgType, quickfix.dukascopy.field.BusinessRejectReason businessRejectReason) {
		this();
		setField(refMsgType);
		setField(businessRejectReason);
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

	public void set(quickfix.dukascopy.field.BusinessRejectRefID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BusinessRejectRefID get(quickfix.dukascopy.field.BusinessRejectRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BusinessRejectRefID getBusinessRejectRefID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BusinessRejectRefID());
	}

	public boolean isSet(quickfix.dukascopy.field.BusinessRejectRefID field) {
		return isSetField(field);
	}

	public boolean isSetBusinessRejectRefID() {
		return isSetField(379);
	}

	public void set(quickfix.dukascopy.field.BusinessRejectReason value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BusinessRejectReason get(quickfix.dukascopy.field.BusinessRejectReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BusinessRejectReason getBusinessRejectReason() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BusinessRejectReason());
	}

	public boolean isSet(quickfix.dukascopy.field.BusinessRejectReason field) {
		return isSetField(field);
	}

	public boolean isSetBusinessRejectReason() {
		return isSetField(380);
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

	public void set(quickfix.dukascopy.field.Account value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Account get(quickfix.dukascopy.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Account getAccount() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Account());
	}

	public boolean isSet(quickfix.dukascopy.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

}
