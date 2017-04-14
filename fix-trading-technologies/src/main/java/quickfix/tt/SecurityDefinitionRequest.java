
package quickfix.tt;

import quickfix.FieldNotFound;


public class SecurityDefinitionRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "c";
	

	public SecurityDefinitionRequest() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public SecurityDefinitionRequest(quickfix.tt.field.SecurityReqID securityReqID) {
		this();
		setField(securityReqID);
	}
	
	public void set(quickfix.tt.field.SecurityReqID value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityReqID get(quickfix.tt.field.SecurityReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityReqID getSecurityReqID() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityReqID());
	}

	public boolean isSet(quickfix.tt.field.SecurityReqID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityReqID() {
		return isSetField(320);
	}

	public void set(quickfix.tt.field.SecurityRequestType value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityRequestType get(quickfix.tt.field.SecurityRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityRequestType getSecurityRequestType() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityRequestType());
	}

	public boolean isSet(quickfix.tt.field.SecurityRequestType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityRequestType() {
		return isSetField(321);
	}

	public void set(quickfix.tt.field.RequestTickTable value) {
		setField(value);
	}

	public quickfix.tt.field.RequestTickTable get(quickfix.tt.field.RequestTickTable value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.RequestTickTable getRequestTickTable() throws FieldNotFound {
		return get(new quickfix.tt.field.RequestTickTable());
	}

	public boolean isSet(quickfix.tt.field.RequestTickTable field) {
		return isSetField(field);
	}

	public boolean isSetRequestTickTable() {
		return isSetField(17000);
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

}
