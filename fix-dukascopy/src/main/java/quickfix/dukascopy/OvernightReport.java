
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class OvernightReport extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "U4";
	

	public OvernightReport() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public OvernightReport(quickfix.dukascopy.field.Account account, quickfix.dukascopy.field.Symbol symbol, quickfix.dukascopy.field.Amount amount) {
		this();
		setField(account);
		setField(symbol);
		setField(amount);
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

}
