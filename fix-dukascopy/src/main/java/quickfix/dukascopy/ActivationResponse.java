
package quickfix.dukascopy;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ActivationResponse extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "U6";
	

	public ActivationResponse() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.dukascopy.field.UsersActivated value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UsersActivated get(quickfix.dukascopy.field.UsersActivated value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UsersActivated getUsersActivated() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UsersActivated());
	}

	public boolean isSet(quickfix.dukascopy.field.UsersActivated field) {
		return isSetField(field);
	}

	public boolean isSetUsersActivated() {
		return isSetField(7010);
	}

	public static class UsersActivated extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {553, 1, 0};

		public UsersActivated() {
			super(7010, 553, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.Username value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Username get(quickfix.dukascopy.field.Username value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Username getUsername() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Username());
	}

	public boolean isSet(quickfix.dukascopy.field.Username field) {
		return isSetField(field);
	}

	public boolean isSetUsername() {
		return isSetField(553);
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

}
