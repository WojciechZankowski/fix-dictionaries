
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class AccountInfoRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "U7";
	

	public AccountInfoRequest() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
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
