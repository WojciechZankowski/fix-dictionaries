
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class Notification extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "U1";
	

	public Notification() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public Notification(quickfix.dukascopy.field.AccountName accountName, quickfix.dukascopy.field.NotifPriority notifPriority, quickfix.dukascopy.field.Text text) {
		this();
		setField(accountName);
		setField(notifPriority);
		setField(text);
	}
	
	public void set(quickfix.dukascopy.field.AccountName value) {
		setField(value);
	}

	public quickfix.dukascopy.field.AccountName get(quickfix.dukascopy.field.AccountName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.AccountName getAccountName() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.AccountName());
	}

	public boolean isSet(quickfix.dukascopy.field.AccountName field) {
		return isSetField(field);
	}

	public boolean isSetAccountName() {
		return isSetField(7004);
	}

	public void set(quickfix.dukascopy.field.NotifPriority value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NotifPriority get(quickfix.dukascopy.field.NotifPriority value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NotifPriority getNotifPriority() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NotifPriority());
	}

	public boolean isSet(quickfix.dukascopy.field.NotifPriority field) {
		return isSetField(field);
	}

	public boolean isSetNotifPriority() {
		return isSetField(7003);
	}

	public void set(quickfix.dukascopy.field.Text value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Text get(quickfix.dukascopy.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Text getText() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Text());
	}

	public boolean isSet(quickfix.dukascopy.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
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
