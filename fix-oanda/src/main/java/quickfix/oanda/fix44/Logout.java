
package quickfix.oanda.fix44;

import quickfix.FieldNotFound;


public class Logout extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "5";
	

	public Logout() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
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

}
