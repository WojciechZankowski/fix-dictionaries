
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class InstrumentPositionInfo extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "U3";
	

	public InstrumentPositionInfo() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public InstrumentPositionInfo(quickfix.dukascopy.field.AccountName accountName, quickfix.dukascopy.field.Symbol symbol, quickfix.dukascopy.field.Amount amount, quickfix.dukascopy.field.Price price) {
		this();
		setField(accountName);
		setField(symbol);
		setField(amount);
		setField(price);
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

	public void set(quickfix.dukascopy.field.Symbol value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Symbol get(quickfix.dukascopy.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Symbol());
	}

	public boolean isSet(quickfix.dukascopy.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(quickfix.dukascopy.field.Amount value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Amount get(quickfix.dukascopy.field.Amount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Amount getAmount() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Amount());
	}

	public boolean isSet(quickfix.dukascopy.field.Amount field) {
		return isSetField(field);
	}

	public boolean isSetAmount() {
		return isSetField(7008);
	}

	public void set(quickfix.dukascopy.field.Price value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Price get(quickfix.dukascopy.field.Price value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Price getPrice() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Price());
	}

	public boolean isSet(quickfix.dukascopy.field.Price field) {
		return isSetField(field);
	}

	public boolean isSetPrice() {
		return isSetField(44);
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
