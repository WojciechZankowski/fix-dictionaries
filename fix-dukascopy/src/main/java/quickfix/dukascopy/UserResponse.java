
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class UserResponse extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BF";
	

	public UserResponse() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.dukascopy.field.UserRequestID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UserRequestID get(quickfix.dukascopy.field.UserRequestID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UserRequestID getUserRequestID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UserRequestID());
	}

	public boolean isSet(quickfix.dukascopy.field.UserRequestID field) {
		return isSetField(field);
	}

	public boolean isSetUserRequestID() {
		return isSetField(923);
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

	public void set(quickfix.dukascopy.field.UserStatus value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UserStatus get(quickfix.dukascopy.field.UserStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UserStatus getUserStatus() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UserStatus());
	}

	public boolean isSet(quickfix.dukascopy.field.UserStatus field) {
		return isSetField(field);
	}

	public boolean isSetUserStatus() {
		return isSetField(926);
	}

	public void set(quickfix.dukascopy.field.UserStatusText value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UserStatusText get(quickfix.dukascopy.field.UserStatusText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UserStatusText getUserStatusText() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UserStatusText());
	}

	public boolean isSet(quickfix.dukascopy.field.UserStatusText field) {
		return isSetField(field);
	}

	public boolean isSetUserStatusText() {
		return isSetField(927);
	}

}
