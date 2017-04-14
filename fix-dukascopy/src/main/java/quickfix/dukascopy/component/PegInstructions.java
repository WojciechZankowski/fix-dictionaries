
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;


public class PegInstructions extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 211, 835, 836, 837, 838, 840,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public PegInstructions() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.PegOffsetValue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PegOffsetValue get(quickfix.dukascopy.field.PegOffsetValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PegOffsetValue getPegOffsetValue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PegOffsetValue());
	}

	public boolean isSet(quickfix.dukascopy.field.PegOffsetValue field) {
		return isSetField(field);
	}

	public boolean isSetPegOffsetValue() {
		return isSetField(211);
	}

	public void set(quickfix.dukascopy.field.PegMoveType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PegMoveType get(quickfix.dukascopy.field.PegMoveType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PegMoveType getPegMoveType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PegMoveType());
	}

	public boolean isSet(quickfix.dukascopy.field.PegMoveType field) {
		return isSetField(field);
	}

	public boolean isSetPegMoveType() {
		return isSetField(835);
	}

	public void set(quickfix.dukascopy.field.PegOffsetType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PegOffsetType get(quickfix.dukascopy.field.PegOffsetType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PegOffsetType getPegOffsetType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PegOffsetType());
	}

	public boolean isSet(quickfix.dukascopy.field.PegOffsetType field) {
		return isSetField(field);
	}

	public boolean isSetPegOffsetType() {
		return isSetField(836);
	}

	public void set(quickfix.dukascopy.field.PegLimitType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PegLimitType get(quickfix.dukascopy.field.PegLimitType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PegLimitType getPegLimitType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PegLimitType());
	}

	public boolean isSet(quickfix.dukascopy.field.PegLimitType field) {
		return isSetField(field);
	}

	public boolean isSetPegLimitType() {
		return isSetField(837);
	}

	public void set(quickfix.dukascopy.field.PegRoundDirection value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PegRoundDirection get(quickfix.dukascopy.field.PegRoundDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PegRoundDirection getPegRoundDirection() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PegRoundDirection());
	}

	public boolean isSet(quickfix.dukascopy.field.PegRoundDirection field) {
		return isSetField(field);
	}

	public boolean isSetPegRoundDirection() {
		return isSetField(838);
	}

	public void set(quickfix.dukascopy.field.PegScope value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PegScope get(quickfix.dukascopy.field.PegScope value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PegScope getPegScope() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PegScope());
	}

	public boolean isSet(quickfix.dukascopy.field.PegScope field) {
		return isSetField(field);
	}

	public boolean isSetPegScope() {
		return isSetField(840);
	}

}
