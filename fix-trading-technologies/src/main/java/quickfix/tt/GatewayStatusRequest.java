
package quickfix.tt;

import quickfix.FieldNotFound;


public class GatewayStatusRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "UAR";
	

	public GatewayStatusRequest() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public GatewayStatusRequest(quickfix.tt.field.GatewayStatusReqId gatewayStatusReqId, quickfix.tt.field.SubscriptionRequestType subscriptionRequestType) {
		this();
		setField(gatewayStatusReqId);
		setField(subscriptionRequestType);
	}
	
	public void set(quickfix.tt.field.GatewayStatusReqId value) {
		setField(value);
	}

	public quickfix.tt.field.GatewayStatusReqId get(quickfix.tt.field.GatewayStatusReqId value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.GatewayStatusReqId getGatewayStatusReqId() throws FieldNotFound {
		return get(new quickfix.tt.field.GatewayStatusReqId());
	}

	public boolean isSet(quickfix.tt.field.GatewayStatusReqId field) {
		return isSetField(field);
	}

	public boolean isSetGatewayStatusReqId() {
		return isSetField(18200);
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

}
