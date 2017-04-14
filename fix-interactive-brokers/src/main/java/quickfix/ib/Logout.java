
package quickfix.ib;

import quickfix.FieldNotFound;


public class Logout extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "5";
	

	public Logout() {
		super();
		getHeader().setField(new quickfix.ib.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.ib.field.Text value) {
		setField(value);
	}

	public quickfix.ib.field.Text get(quickfix.ib.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.Text getText() throws FieldNotFound {
		return get(new quickfix.ib.field.Text());
	}

	public boolean isSet(quickfix.ib.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

}
