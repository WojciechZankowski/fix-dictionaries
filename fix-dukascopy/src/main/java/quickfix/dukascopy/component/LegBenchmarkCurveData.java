
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;


public class LegBenchmarkCurveData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 676, 677, 678, 679, 680,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public LegBenchmarkCurveData() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.LegBenchmarkCurveCurrency value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegBenchmarkCurveCurrency get(quickfix.dukascopy.field.LegBenchmarkCurveCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegBenchmarkCurveCurrency getLegBenchmarkCurveCurrency() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegBenchmarkCurveCurrency());
	}

	public boolean isSet(quickfix.dukascopy.field.LegBenchmarkCurveCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkCurveCurrency() {
		return isSetField(676);
	}

	public void set(quickfix.dukascopy.field.LegBenchmarkCurveName value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegBenchmarkCurveName get(quickfix.dukascopy.field.LegBenchmarkCurveName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegBenchmarkCurveName getLegBenchmarkCurveName() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegBenchmarkCurveName());
	}

	public boolean isSet(quickfix.dukascopy.field.LegBenchmarkCurveName field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkCurveName() {
		return isSetField(677);
	}

	public void set(quickfix.dukascopy.field.LegBenchmarkCurvePoint value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegBenchmarkCurvePoint get(quickfix.dukascopy.field.LegBenchmarkCurvePoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegBenchmarkCurvePoint getLegBenchmarkCurvePoint() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegBenchmarkCurvePoint());
	}

	public boolean isSet(quickfix.dukascopy.field.LegBenchmarkCurvePoint field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkCurvePoint() {
		return isSetField(678);
	}

	public void set(quickfix.dukascopy.field.LegBenchmarkPrice value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegBenchmarkPrice get(quickfix.dukascopy.field.LegBenchmarkPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegBenchmarkPrice getLegBenchmarkPrice() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegBenchmarkPrice());
	}

	public boolean isSet(quickfix.dukascopy.field.LegBenchmarkPrice field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkPrice() {
		return isSetField(679);
	}

	public void set(quickfix.dukascopy.field.LegBenchmarkPriceType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegBenchmarkPriceType get(quickfix.dukascopy.field.LegBenchmarkPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegBenchmarkPriceType getLegBenchmarkPriceType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegBenchmarkPriceType());
	}

	public boolean isSet(quickfix.dukascopy.field.LegBenchmarkPriceType field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkPriceType() {
		return isSetField(680);
	}

}
