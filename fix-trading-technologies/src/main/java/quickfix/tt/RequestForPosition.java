
package quickfix.tt;

import quickfix.FieldNotFound;


public class RequestForPosition extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "UAN";
	

	public RequestForPosition() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public RequestForPosition(quickfix.tt.field.PosReqId posReqId, quickfix.tt.field.PosReqType posReqType) {
		this();
		setField(posReqId);
		setField(posReqType);
	}
	
	public void set(quickfix.tt.field.Account value) {
		setField(value);
	}

	public quickfix.tt.field.Account get(quickfix.tt.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Account getAccount() throws FieldNotFound {
		return get(new quickfix.tt.field.Account());
	}

	public boolean isSet(quickfix.tt.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(quickfix.tt.field.PosReqId value) {
		setField(value);
	}

	public quickfix.tt.field.PosReqId get(quickfix.tt.field.PosReqId value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.PosReqId getPosReqId() throws FieldNotFound {
		return get(new quickfix.tt.field.PosReqId());
	}

	public boolean isSet(quickfix.tt.field.PosReqId field) {
		return isSetField(field);
	}

	public boolean isSetPosReqId() {
		return isSetField(16710);
	}

	public void set(quickfix.tt.field.PosReqType value) {
		setField(value);
	}

	public quickfix.tt.field.PosReqType get(quickfix.tt.field.PosReqType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.PosReqType getPosReqType() throws FieldNotFound {
		return get(new quickfix.tt.field.PosReqType());
	}

	public boolean isSet(quickfix.tt.field.PosReqType field) {
		return isSetField(field);
	}

	public boolean isSetPosReqType() {
		return isSetField(16724);
	}

	public void set(quickfix.tt.field.SubscriptionRequestType value) {
		setField(value);
	}

	public quickfix.tt.field.SubscriptionRequestType get(quickfix.tt.field.SubscriptionRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
		return get(new quickfix.tt.field.SubscriptionRequestType());
	}

	public boolean isSet(quickfix.tt.field.SubscriptionRequestType field) {
		return isSetField(field);
	}

	public boolean isSetSubscriptionRequestType() {
		return isSetField(263);
	}

	public void set(quickfix.tt.field.IncludeHistoricalFills value) {
		setField(value);
	}

	public quickfix.tt.field.IncludeHistoricalFills get(quickfix.tt.field.IncludeHistoricalFills value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.IncludeHistoricalFills getIncludeHistoricalFills() throws FieldNotFound {
		return get(new quickfix.tt.field.IncludeHistoricalFills());
	}

	public boolean isSet(quickfix.tt.field.IncludeHistoricalFills field) {
		return isSetField(field);
	}

	public boolean isSetIncludeHistoricalFills() {
		return isSetField(18213);
	}

	public void set(quickfix.tt.field.BrokerID value) {
		setField(value);
	}

	public quickfix.tt.field.BrokerID get(quickfix.tt.field.BrokerID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.BrokerID getBrokerID() throws FieldNotFound {
		return get(new quickfix.tt.field.BrokerID());
	}

	public boolean isSet(quickfix.tt.field.BrokerID field) {
		return isSetField(field);
	}

	public boolean isSetBrokerID() {
		return isSetField(18220);
	}

	public void set(quickfix.tt.field.CompanyID value) {
		setField(value);
	}

	public quickfix.tt.field.CompanyID get(quickfix.tt.field.CompanyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.CompanyID getCompanyID() throws FieldNotFound {
		return get(new quickfix.tt.field.CompanyID());
	}

	public boolean isSet(quickfix.tt.field.CompanyID field) {
		return isSetField(field);
	}

	public boolean isSetCompanyID() {
		return isSetField(18221);
	}

}
