
package quickfix.tt;

import quickfix.FieldNotFound;


public class SecurityStatus extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "f";
	

	public SecurityStatus() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public SecurityStatus(quickfix.tt.field.SecurityStatusReqID securityStatusReqID, quickfix.tt.field.Symbol symbol, quickfix.tt.field.SecurityType securityType, quickfix.tt.field.SecurityID securityID, quickfix.tt.field.SecurityExchange securityExchange, quickfix.tt.field.SecurityTradingStatus securityTradingStatus) {
		this();
		setField(securityStatusReqID);
		setField(symbol);
		setField(securityType);
		setField(securityID);
		setField(securityExchange);
		setField(securityTradingStatus);
	}
	
	public void set(quickfix.tt.field.SecurityStatusReqID value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityStatusReqID get(quickfix.tt.field.SecurityStatusReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityStatusReqID getSecurityStatusReqID() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityStatusReqID());
	}

	public boolean isSet(quickfix.tt.field.SecurityStatusReqID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityStatusReqID() {
		return isSetField(324);
	}

	public void set(quickfix.tt.field.Symbol value) {
		setField(value);
	}

	public quickfix.tt.field.Symbol get(quickfix.tt.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.tt.field.Symbol());
	}

	public boolean isSet(quickfix.tt.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(quickfix.tt.field.SecurityType value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityType get(quickfix.tt.field.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityType getSecurityType() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityType());
	}

	public boolean isSet(quickfix.tt.field.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(quickfix.tt.field.MaturityMonthYear value) {
		setField(value);
	}

	public quickfix.tt.field.MaturityMonthYear get(quickfix.tt.field.MaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.tt.field.MaturityMonthYear());
	}

	public boolean isSet(quickfix.tt.field.MaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYear() {
		return isSetField(200);
	}

	public void set(quickfix.tt.field.MaturityDay value) {
		setField(value);
	}

	public quickfix.tt.field.MaturityDay get(quickfix.tt.field.MaturityDay value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MaturityDay getMaturityDay() throws FieldNotFound {
		return get(new quickfix.tt.field.MaturityDay());
	}

	public boolean isSet(quickfix.tt.field.MaturityDay field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDay() {
		return isSetField(205);
	}

	public void set(quickfix.tt.field.PutOrCall value) {
		setField(value);
	}

	public quickfix.tt.field.PutOrCall get(quickfix.tt.field.PutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.PutOrCall getPutOrCall() throws FieldNotFound {
		return get(new quickfix.tt.field.PutOrCall());
	}

	public boolean isSet(quickfix.tt.field.PutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetPutOrCall() {
		return isSetField(201);
	}

	public void set(quickfix.tt.field.StrikePrice value) {
		setField(value);
	}

	public quickfix.tt.field.StrikePrice get(quickfix.tt.field.StrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.StrikePrice getStrikePrice() throws FieldNotFound {
		return get(new quickfix.tt.field.StrikePrice());
	}

	public boolean isSet(quickfix.tt.field.StrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetStrikePrice() {
		return isSetField(202);
	}

	public void set(quickfix.tt.field.OptAttribute value) {
		setField(value);
	}

	public quickfix.tt.field.OptAttribute get(quickfix.tt.field.OptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OptAttribute getOptAttribute() throws FieldNotFound {
		return get(new quickfix.tt.field.OptAttribute());
	}

	public boolean isSet(quickfix.tt.field.OptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetOptAttribute() {
		return isSetField(206);
	}

	public void set(quickfix.tt.field.SecurityID value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityID get(quickfix.tt.field.SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityID getSecurityID() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityID());
	}

	public boolean isSet(quickfix.tt.field.SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(48);
	}

	public void set(quickfix.tt.field.SecurityAltID value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityAltID get(quickfix.tt.field.SecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityAltID getSecurityAltID() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityAltID());
	}

	public boolean isSet(quickfix.tt.field.SecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltID() {
		return isSetField(10455);
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

	public void set(quickfix.tt.field.DeliveryTerm value) {
		setField(value);
	}

	public quickfix.tt.field.DeliveryTerm get(quickfix.tt.field.DeliveryTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.DeliveryTerm getDeliveryTerm() throws FieldNotFound {
		return get(new quickfix.tt.field.DeliveryTerm());
	}

	public boolean isSet(quickfix.tt.field.DeliveryTerm field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryTerm() {
		return isSetField(18211);
	}

	public void set(quickfix.tt.field.SettlType value) {
		setField(value);
	}

	public quickfix.tt.field.SettlType get(quickfix.tt.field.SettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SettlType getSettlType() throws FieldNotFound {
		return get(new quickfix.tt.field.SettlType());
	}

	public boolean isSet(quickfix.tt.field.SettlType field) {
		return isSetField(field);
	}

	public boolean isSetSettlType() {
		return isSetField(63);
	}

	public void set(quickfix.tt.field.SecurityTradingStatus value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityTradingStatus get(quickfix.tt.field.SecurityTradingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityTradingStatus getSecurityTradingStatus() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityTradingStatus());
	}

	public boolean isSet(quickfix.tt.field.SecurityTradingStatus field) {
		return isSetField(field);
	}

	public boolean isSetSecurityTradingStatus() {
		return isSetField(326);
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

	public void set(quickfix.tt.field.Currency value) {
		setField(value);
	}

	public quickfix.tt.field.Currency get(quickfix.tt.field.Currency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Currency getCurrency() throws FieldNotFound {
		return get(new quickfix.tt.field.Currency());
	}

	public boolean isSet(quickfix.tt.field.Currency field) {
		return isSetField(field);
	}

	public boolean isSetCurrency() {
		return isSetField(15);
	}

}
