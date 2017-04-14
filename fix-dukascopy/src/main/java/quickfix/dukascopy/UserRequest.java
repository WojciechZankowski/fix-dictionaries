
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class UserRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BE";
	

	public UserRequest() {
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

	public void set(quickfix.dukascopy.field.UserRequestType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UserRequestType get(quickfix.dukascopy.field.UserRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UserRequestType getUserRequestType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UserRequestType());
	}

	public boolean isSet(quickfix.dukascopy.field.UserRequestType field) {
		return isSetField(field);
	}

	public boolean isSetUserRequestType() {
		return isSetField(924);
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

	public void set(quickfix.dukascopy.field.Password value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Password get(quickfix.dukascopy.field.Password value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Password getPassword() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Password());
	}

	public boolean isSet(quickfix.dukascopy.field.Password field) {
		return isSetField(field);
	}

	public boolean isSetPassword() {
		return isSetField(554);
	}

	public void set(quickfix.dukascopy.field.NewPassword value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NewPassword get(quickfix.dukascopy.field.NewPassword value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NewPassword getNewPassword() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NewPassword());
	}

	public boolean isSet(quickfix.dukascopy.field.NewPassword field) {
		return isSetField(field);
	}

	public boolean isSetNewPassword() {
		return isSetField(925);
	}

	public void set(quickfix.dukascopy.field.RawDataLength value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RawDataLength get(quickfix.dukascopy.field.RawDataLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RawDataLength getRawDataLength() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RawDataLength());
	}

	public boolean isSet(quickfix.dukascopy.field.RawDataLength field) {
		return isSetField(field);
	}

	public boolean isSetRawDataLength() {
		return isSetField(95);
	}

	public void set(quickfix.dukascopy.field.RawData value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RawData get(quickfix.dukascopy.field.RawData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RawData getRawData() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RawData());
	}

	public boolean isSet(quickfix.dukascopy.field.RawData field) {
		return isSetField(field);
	}

	public boolean isSetRawData() {
		return isSetField(96);
	}

}
