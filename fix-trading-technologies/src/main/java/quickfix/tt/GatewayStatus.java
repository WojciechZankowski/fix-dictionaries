
package quickfix.tt;

import quickfix.FieldNotFound;

import quickfix.Group;

public class GatewayStatus extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "UAT";
	

	public GatewayStatus() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public GatewayStatus(quickfix.tt.field.GatewayStatusReqId gatewayStatusReqId) {
		this();
		setField(gatewayStatusReqId);
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

	public void set(quickfix.tt.field.UnsolicitedIndicator value) {
		setField(value);
	}

	public quickfix.tt.field.UnsolicitedIndicator get(quickfix.tt.field.UnsolicitedIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UnsolicitedIndicator getUnsolicitedIndicator() throws FieldNotFound {
		return get(new quickfix.tt.field.UnsolicitedIndicator());
	}

	public boolean isSet(quickfix.tt.field.UnsolicitedIndicator field) {
		return isSetField(field);
	}

	public boolean isSetUnsolicitedIndicator() {
		return isSetField(325);
	}

	public void set(quickfix.tt.field.NoGatewayStatus value) {
		setField(value);
	}

	public quickfix.tt.field.NoGatewayStatus get(quickfix.tt.field.NoGatewayStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.NoGatewayStatus getNoGatewayStatus() throws FieldNotFound {
		return get(new quickfix.tt.field.NoGatewayStatus());
	}

	public boolean isSet(quickfix.tt.field.NoGatewayStatus field) {
		return isSetField(field);
	}

	public boolean isSetNoGatewayStatus() {
		return isSetField(18201);
	}

	public static class NoGatewayStatus extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {18202, 207, 18203, 18204, 58, 0};

		public NoGatewayStatus() {
			super(18201, 18202, ORDER);
		}
		
	public void set(quickfix.tt.field.GatewayStatus value) {
		setField(value);
	}

	public quickfix.tt.field.GatewayStatus get(quickfix.tt.field.GatewayStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.GatewayStatus getGatewayStatus() throws FieldNotFound {
		return get(new quickfix.tt.field.GatewayStatus());
	}

	public boolean isSet(quickfix.tt.field.GatewayStatus field) {
		return isSetField(field);
	}

	public boolean isSetGatewayStatus() {
		return isSetField(18202);
	}

	public void set(quickfix.tt.field.SecurityExchange value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityExchange get(quickfix.tt.field.SecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityExchange());
	}

	public boolean isSet(quickfix.tt.field.SecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetSecurityExchange() {
		return isSetField(207);
	}

	public void set(quickfix.tt.field.ExchangeGateway value) {
		setField(value);
	}

	public quickfix.tt.field.ExchangeGateway get(quickfix.tt.field.ExchangeGateway value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExchangeGateway getExchangeGateway() throws FieldNotFound {
		return get(new quickfix.tt.field.ExchangeGateway());
	}

	public boolean isSet(quickfix.tt.field.ExchangeGateway field) {
		return isSetField(field);
	}

	public boolean isSetExchangeGateway() {
		return isSetField(18203);
	}

	public void set(quickfix.tt.field.SubExchangeGateway value) {
		setField(value);
	}

	public quickfix.tt.field.SubExchangeGateway get(quickfix.tt.field.SubExchangeGateway value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SubExchangeGateway getSubExchangeGateway() throws FieldNotFound {
		return get(new quickfix.tt.field.SubExchangeGateway());
	}

	public boolean isSet(quickfix.tt.field.SubExchangeGateway field) {
		return isSetField(field);
	}

	public boolean isSetSubExchangeGateway() {
		return isSetField(18204);
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

}
