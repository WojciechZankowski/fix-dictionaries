
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class AccountInfo extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "U2";
	

	public AccountInfo() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public AccountInfo(quickfix.dukascopy.field.AccountName accountName, quickfix.dukascopy.field.Currency currency, quickfix.dukascopy.field.Leverage leverage, quickfix.dukascopy.field.UsableMargin usableMargin, quickfix.dukascopy.field.Equity equity) {
		this();
		setField(accountName);
		setField(currency);
		setField(leverage);
		setField(usableMargin);
		setField(equity);
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

	public void set(quickfix.dukascopy.field.Currency value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Currency get(quickfix.dukascopy.field.Currency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Currency getCurrency() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Currency());
	}

	public boolean isSet(quickfix.dukascopy.field.Currency field) {
		return isSetField(field);
	}

	public boolean isSetCurrency() {
		return isSetField(15);
	}

	public void set(quickfix.dukascopy.field.Leverage value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Leverage get(quickfix.dukascopy.field.Leverage value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Leverage getLeverage() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Leverage());
	}

	public boolean isSet(quickfix.dukascopy.field.Leverage field) {
		return isSetField(field);
	}

	public boolean isSetLeverage() {
		return isSetField(7005);
	}

	public void set(quickfix.dukascopy.field.UsableMargin value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UsableMargin get(quickfix.dukascopy.field.UsableMargin value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UsableMargin getUsableMargin() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UsableMargin());
	}

	public boolean isSet(quickfix.dukascopy.field.UsableMargin field) {
		return isSetField(field);
	}

	public boolean isSetUsableMargin() {
		return isSetField(7006);
	}

	public void set(quickfix.dukascopy.field.Equity value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Equity get(quickfix.dukascopy.field.Equity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Equity getEquity() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Equity());
	}

	public boolean isSet(quickfix.dukascopy.field.Equity field) {
		return isSetField(field);
	}

	public boolean isSetEquity() {
		return isSetField(7007);
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

	public void set(quickfix.dukascopy.field.TrdType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TrdType get(quickfix.dukascopy.field.TrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TrdType getTrdType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TrdType());
	}

	public boolean isSet(quickfix.dukascopy.field.TrdType field) {
		return isSetField(field);
	}

	public boolean isSetTrdType() {
		return isSetField(828);
	}

}
