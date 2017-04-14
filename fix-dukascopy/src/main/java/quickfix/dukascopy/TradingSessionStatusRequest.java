
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class TradingSessionStatusRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "g";
	

	public TradingSessionStatusRequest() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public TradingSessionStatusRequest(quickfix.dukascopy.field.TradSesReqID tradSesReqID, quickfix.dukascopy.field.SubscriptionRequestType subscriptionRequestType, quickfix.dukascopy.field.Account account) {
		this();
		setField(tradSesReqID);
		setField(subscriptionRequestType);
		setField(account);
	}
	
	public void set(quickfix.dukascopy.field.TradSesReqID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradSesReqID get(quickfix.dukascopy.field.TradSesReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradSesReqID getTradSesReqID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradSesReqID());
	}

	public boolean isSet(quickfix.dukascopy.field.TradSesReqID field) {
		return isSetField(field);
	}

	public boolean isSetTradSesReqID() {
		return isSetField(335);
	}

	public void set(quickfix.dukascopy.field.TradingSessionID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradingSessionID get(quickfix.dukascopy.field.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradingSessionID());
	}

	public boolean isSet(quickfix.dukascopy.field.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(quickfix.dukascopy.field.TradingSessionSubID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradingSessionSubID get(quickfix.dukascopy.field.TradingSessionSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradingSessionSubID());
	}

	public boolean isSet(quickfix.dukascopy.field.TradingSessionSubID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionSubID() {
		return isSetField(625);
	}

	public void set(quickfix.dukascopy.field.TradSesMethod value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradSesMethod get(quickfix.dukascopy.field.TradSesMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradSesMethod getTradSesMethod() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradSesMethod());
	}

	public boolean isSet(quickfix.dukascopy.field.TradSesMethod field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMethod() {
		return isSetField(338);
	}

	public void set(quickfix.dukascopy.field.TradSesMode value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradSesMode get(quickfix.dukascopy.field.TradSesMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradSesMode getTradSesMode() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradSesMode());
	}

	public boolean isSet(quickfix.dukascopy.field.TradSesMode field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMode() {
		return isSetField(339);
	}

	public void set(quickfix.dukascopy.field.SubscriptionRequestType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SubscriptionRequestType get(quickfix.dukascopy.field.SubscriptionRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SubscriptionRequestType());
	}

	public boolean isSet(quickfix.dukascopy.field.SubscriptionRequestType field) {
		return isSetField(field);
	}

	public boolean isSetSubscriptionRequestType() {
		return isSetField(263);
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
