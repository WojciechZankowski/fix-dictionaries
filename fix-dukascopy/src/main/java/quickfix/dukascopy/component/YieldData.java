
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;


public class YieldData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 235, 236, 701, 696, 697, 698,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public YieldData() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.YieldType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.YieldType get(quickfix.dukascopy.field.YieldType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.YieldType getYieldType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.YieldType());
	}

	public boolean isSet(quickfix.dukascopy.field.YieldType field) {
		return isSetField(field);
	}

	public boolean isSetYieldType() {
		return isSetField(235);
	}

	public void set(quickfix.dukascopy.field.Yield value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Yield get(quickfix.dukascopy.field.Yield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Yield getYield() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Yield());
	}

	public boolean isSet(quickfix.dukascopy.field.Yield field) {
		return isSetField(field);
	}

	public boolean isSetYield() {
		return isSetField(236);
	}

	public void set(quickfix.dukascopy.field.YieldCalcDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.YieldCalcDate get(quickfix.dukascopy.field.YieldCalcDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.YieldCalcDate getYieldCalcDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.YieldCalcDate());
	}

	public boolean isSet(quickfix.dukascopy.field.YieldCalcDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldCalcDate() {
		return isSetField(701);
	}

	public void set(quickfix.dukascopy.field.YieldRedemptionDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.YieldRedemptionDate get(quickfix.dukascopy.field.YieldRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.YieldRedemptionDate getYieldRedemptionDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.YieldRedemptionDate());
	}

	public boolean isSet(quickfix.dukascopy.field.YieldRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionDate() {
		return isSetField(696);
	}

	public void set(quickfix.dukascopy.field.YieldRedemptionPrice value) {
		setField(value);
	}

	public quickfix.dukascopy.field.YieldRedemptionPrice get(quickfix.dukascopy.field.YieldRedemptionPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.YieldRedemptionPrice getYieldRedemptionPrice() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.YieldRedemptionPrice());
	}

	public boolean isSet(quickfix.dukascopy.field.YieldRedemptionPrice field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPrice() {
		return isSetField(697);
	}

	public void set(quickfix.dukascopy.field.YieldRedemptionPriceType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.YieldRedemptionPriceType get(quickfix.dukascopy.field.YieldRedemptionPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.YieldRedemptionPriceType getYieldRedemptionPriceType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.YieldRedemptionPriceType());
	}

	public boolean isSet(quickfix.dukascopy.field.YieldRedemptionPriceType field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPriceType() {
		return isSetField(698);
	}

}
