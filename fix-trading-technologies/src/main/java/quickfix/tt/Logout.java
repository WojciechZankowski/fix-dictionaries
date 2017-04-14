
package quickfix.tt;

import quickfix.FieldNotFound;


public class Logout extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "5";
	

	public Logout() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
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

	public void set(quickfix.tt.field.ForceLogout value) {
		setField(value);
	}

	public quickfix.tt.field.ForceLogout get(quickfix.tt.field.ForceLogout value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ForceLogout getForceLogout() throws FieldNotFound {
		return get(new quickfix.tt.field.ForceLogout());
	}

	public boolean isSet(quickfix.tt.field.ForceLogout field) {
		return isSetField(field);
	}

	public boolean isSetForceLogout() {
		return isSetField(18000);
	}

}
