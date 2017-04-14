
package quickfix.oanda.fix44;

import quickfix.FieldNotFound;


public class BusinessMessageReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "j";
	

	public BusinessMessageReject() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public BusinessMessageReject(quickfix.oanda.field.RefMsgType refMsgType, quickfix.oanda.field.BusinessRejectReason businessRejectReason) {
		this();
		setField(refMsgType);
		setField(businessRejectReason);
	}
	
	public void set(quickfix.oanda.field.RefSeqNum value) {
		setField(value);
	}

	public quickfix.oanda.field.RefSeqNum get(quickfix.oanda.field.RefSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.RefSeqNum getRefSeqNum() throws FieldNotFound {
		return get(new quickfix.oanda.field.RefSeqNum());
	}

	public boolean isSet(quickfix.oanda.field.RefSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetRefSeqNum() {
		return isSetField(45);
	}

	public void set(quickfix.oanda.field.RefMsgType value) {
		setField(value);
	}

	public quickfix.oanda.field.RefMsgType get(quickfix.oanda.field.RefMsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.RefMsgType getRefMsgType() throws FieldNotFound {
		return get(new quickfix.oanda.field.RefMsgType());
	}

	public boolean isSet(quickfix.oanda.field.RefMsgType field) {
		return isSetField(field);
	}

	public boolean isSetRefMsgType() {
		return isSetField(372);
	}

	public void set(quickfix.oanda.field.BusinessRejectRefID value) {
		setField(value);
	}

	public quickfix.oanda.field.BusinessRejectRefID get(quickfix.oanda.field.BusinessRejectRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.BusinessRejectRefID getBusinessRejectRefID() throws FieldNotFound {
		return get(new quickfix.oanda.field.BusinessRejectRefID());
	}

	public boolean isSet(quickfix.oanda.field.BusinessRejectRefID field) {
		return isSetField(field);
	}

	public boolean isSetBusinessRejectRefID() {
		return isSetField(379);
	}

	public void set(quickfix.oanda.field.BusinessRejectReason value) {
		setField(value);
	}

	public quickfix.oanda.field.BusinessRejectReason get(quickfix.oanda.field.BusinessRejectReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.BusinessRejectReason getBusinessRejectReason() throws FieldNotFound {
		return get(new quickfix.oanda.field.BusinessRejectReason());
	}

	public boolean isSet(quickfix.oanda.field.BusinessRejectReason field) {
		return isSetField(field);
	}

	public boolean isSetBusinessRejectReason() {
		return isSetField(380);
	}

	public void set(quickfix.oanda.field.Text value) {
		setField(value);
	}

	public quickfix.oanda.field.Text get(quickfix.oanda.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.Text getText() throws FieldNotFound {
		return get(new quickfix.oanda.field.Text());
	}

	public boolean isSet(quickfix.oanda.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

	public void set(quickfix.oanda.field.EncodedTextLen value) {
		setField(value);
	}

	public quickfix.oanda.field.EncodedTextLen get(quickfix.oanda.field.EncodedTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
		return get(new quickfix.oanda.field.EncodedTextLen());
	}

	public boolean isSet(quickfix.oanda.field.EncodedTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedTextLen() {
		return isSetField(354);
	}

	public void set(quickfix.oanda.field.EncodedText value) {
		setField(value);
	}

	public quickfix.oanda.field.EncodedText get(quickfix.oanda.field.EncodedText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.EncodedText getEncodedText() throws FieldNotFound {
		return get(new quickfix.oanda.field.EncodedText());
	}

	public boolean isSet(quickfix.oanda.field.EncodedText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedText() {
		return isSetField(355);
	}

}
