
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;


public class SpreadOrBenchmarkCurveData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 218, 220, 221, 222, 662, 663, 699, 761,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public SpreadOrBenchmarkCurveData() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.Spread value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Spread get(quickfix.dukascopy.field.Spread value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Spread getSpread() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Spread());
	}

	public boolean isSet(quickfix.dukascopy.field.Spread field) {
		return isSetField(field);
	}

	public boolean isSetSpread() {
		return isSetField(218);
	}

	public void set(quickfix.dukascopy.field.BenchmarkCurveCurrency value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkCurveCurrency get(quickfix.dukascopy.field.BenchmarkCurveCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkCurveCurrency getBenchmarkCurveCurrency() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkCurveCurrency());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkCurveCurrency field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveCurrency() {
		return isSetField(220);
	}

	public void set(quickfix.dukascopy.field.BenchmarkCurveName value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkCurveName get(quickfix.dukascopy.field.BenchmarkCurveName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkCurveName getBenchmarkCurveName() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkCurveName());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkCurveName field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveName() {
		return isSetField(221);
	}

	public void set(quickfix.dukascopy.field.BenchmarkCurvePoint value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkCurvePoint get(quickfix.dukascopy.field.BenchmarkCurvePoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkCurvePoint getBenchmarkCurvePoint() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkCurvePoint());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkCurvePoint field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurvePoint() {
		return isSetField(222);
	}

	public void set(quickfix.dukascopy.field.BenchmarkPrice value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkPrice get(quickfix.dukascopy.field.BenchmarkPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkPrice getBenchmarkPrice() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkPrice());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkPrice field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPrice() {
		return isSetField(662);
	}

	public void set(quickfix.dukascopy.field.BenchmarkPriceType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkPriceType get(quickfix.dukascopy.field.BenchmarkPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkPriceType getBenchmarkPriceType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkPriceType());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkPriceType field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPriceType() {
		return isSetField(663);
	}

	public void set(quickfix.dukascopy.field.BenchmarkSecurityID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkSecurityID get(quickfix.dukascopy.field.BenchmarkSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkSecurityID getBenchmarkSecurityID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkSecurityID());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityID() {
		return isSetField(699);
	}

	public void set(quickfix.dukascopy.field.BenchmarkSecurityIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkSecurityIDSource get(quickfix.dukascopy.field.BenchmarkSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkSecurityIDSource getBenchmarkSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkSecurityIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityIDSource() {
		return isSetField(761);
	}

}
