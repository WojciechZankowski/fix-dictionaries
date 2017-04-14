
package quickfix.tt;

import quickfix.FieldNotFound;


public class BusinessMessageReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "j";
	

	public BusinessMessageReject() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public BusinessMessageReject(quickfix.tt.field.RefSeqNum refSeqNum, quickfix.tt.field.RefMsgType refMsgType, quickfix.tt.field.BusinessRejectReason businessRejectReason) {
		this();
		setField(refSeqNum);
		setField(refMsgType);
		setField(businessRejectReason);
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

	public void set(quickfix.tt.field.BusinessRejectRefID value) {
		setField(value);
	}

	public quickfix.tt.field.BusinessRejectRefID get(quickfix.tt.field.BusinessRejectRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.BusinessRejectRefID getBusinessRejectRefID() throws FieldNotFound {
		return get(new quickfix.tt.field.BusinessRejectRefID());
	}

	public boolean isSet(quickfix.tt.field.BusinessRejectRefID field) {
		return isSetField(field);
	}

	public boolean isSetBusinessRejectRefID() {
		return isSetField(379);
	}

	public void set(quickfix.tt.field.BusinessRejectReason value) {
		setField(value);
	}

	public quickfix.tt.field.BusinessRejectReason get(quickfix.tt.field.BusinessRejectReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.BusinessRejectReason getBusinessRejectReason() throws FieldNotFound {
		return get(new quickfix.tt.field.BusinessRejectReason());
	}

	public boolean isSet(quickfix.tt.field.BusinessRejectReason field) {
		return isSetField(field);
	}

	public boolean isSetBusinessRejectReason() {
		return isSetField(380);
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

}
