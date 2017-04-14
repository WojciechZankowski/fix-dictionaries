
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;


public class CommissionData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 12, 13, 479, 497,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public CommissionData() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.Commission value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Commission get(quickfix.dukascopy.field.Commission value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Commission getCommission() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Commission());
	}

	public boolean isSet(quickfix.dukascopy.field.Commission field) {
		return isSetField(field);
	}

	public boolean isSetCommission() {
		return isSetField(12);
	}

	public void set(quickfix.dukascopy.field.CommType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CommType get(quickfix.dukascopy.field.CommType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CommType getCommType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CommType());
	}

	public boolean isSet(quickfix.dukascopy.field.CommType field) {
		return isSetField(field);
	}

	public boolean isSetCommType() {
		return isSetField(13);
	}

	public void set(quickfix.dukascopy.field.CommCurrency value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CommCurrency get(quickfix.dukascopy.field.CommCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CommCurrency getCommCurrency() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CommCurrency());
	}

	public boolean isSet(quickfix.dukascopy.field.CommCurrency field) {
		return isSetField(field);
	}

	public boolean isSetCommCurrency() {
		return isSetField(479);
	}

	public void set(quickfix.dukascopy.field.FundRenewWaiv value) {
		setField(value);
	}

	public quickfix.dukascopy.field.FundRenewWaiv get(quickfix.dukascopy.field.FundRenewWaiv value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.FundRenewWaiv getFundRenewWaiv() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.FundRenewWaiv());
	}

	public boolean isSet(quickfix.dukascopy.field.FundRenewWaiv field) {
		return isSetField(field);
	}

	public boolean isSetFundRenewWaiv() {
		return isSetField(497);
	}

}
