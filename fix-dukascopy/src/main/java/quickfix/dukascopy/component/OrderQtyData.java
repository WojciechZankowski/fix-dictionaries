
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;


public class OrderQtyData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 38, 152, 516, 468, 469,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public OrderQtyData() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.OrderQty value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OrderQty get(quickfix.dukascopy.field.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OrderQty getOrderQty() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OrderQty());
	}

	public boolean isSet(quickfix.dukascopy.field.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
	}

	public void set(quickfix.dukascopy.field.CashOrderQty value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CashOrderQty get(quickfix.dukascopy.field.CashOrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CashOrderQty getCashOrderQty() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CashOrderQty());
	}

	public boolean isSet(quickfix.dukascopy.field.CashOrderQty field) {
		return isSetField(field);
	}

	public boolean isSetCashOrderQty() {
		return isSetField(152);
	}

	public void set(quickfix.dukascopy.field.OrderPercent value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OrderPercent get(quickfix.dukascopy.field.OrderPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OrderPercent getOrderPercent() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OrderPercent());
	}

	public boolean isSet(quickfix.dukascopy.field.OrderPercent field) {
		return isSetField(field);
	}

	public boolean isSetOrderPercent() {
		return isSetField(516);
	}

	public void set(quickfix.dukascopy.field.RoundingDirection value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RoundingDirection get(quickfix.dukascopy.field.RoundingDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RoundingDirection getRoundingDirection() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RoundingDirection());
	}

	public boolean isSet(quickfix.dukascopy.field.RoundingDirection field) {
		return isSetField(field);
	}

	public boolean isSetRoundingDirection() {
		return isSetField(468);
	}

	public void set(quickfix.dukascopy.field.RoundingModulus value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RoundingModulus get(quickfix.dukascopy.field.RoundingModulus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RoundingModulus getRoundingModulus() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RoundingModulus());
	}

	public boolean isSet(quickfix.dukascopy.field.RoundingModulus field) {
		return isSetField(field);
	}

	public boolean isSetRoundingModulus() {
		return isSetField(469);
	}

}
