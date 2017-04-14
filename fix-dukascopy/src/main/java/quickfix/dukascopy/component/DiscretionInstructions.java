
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;


public class DiscretionInstructions extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 388, 389, 841, 842, 843, 844, 846,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public DiscretionInstructions() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.DiscretionInst value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DiscretionInst get(quickfix.dukascopy.field.DiscretionInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DiscretionInst getDiscretionInst() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DiscretionInst());
	}

	public boolean isSet(quickfix.dukascopy.field.DiscretionInst field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionInst() {
		return isSetField(388);
	}

	public void set(quickfix.dukascopy.field.DiscretionOffsetValue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DiscretionOffsetValue get(quickfix.dukascopy.field.DiscretionOffsetValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DiscretionOffsetValue getDiscretionOffsetValue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DiscretionOffsetValue());
	}

	public boolean isSet(quickfix.dukascopy.field.DiscretionOffsetValue field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionOffsetValue() {
		return isSetField(389);
	}

	public void set(quickfix.dukascopy.field.DiscretionMoveType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DiscretionMoveType get(quickfix.dukascopy.field.DiscretionMoveType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DiscretionMoveType getDiscretionMoveType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DiscretionMoveType());
	}

	public boolean isSet(quickfix.dukascopy.field.DiscretionMoveType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionMoveType() {
		return isSetField(841);
	}

	public void set(quickfix.dukascopy.field.DiscretionOffsetType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DiscretionOffsetType get(quickfix.dukascopy.field.DiscretionOffsetType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DiscretionOffsetType getDiscretionOffsetType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DiscretionOffsetType());
	}

	public boolean isSet(quickfix.dukascopy.field.DiscretionOffsetType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionOffsetType() {
		return isSetField(842);
	}

	public void set(quickfix.dukascopy.field.DiscretionLimitType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DiscretionLimitType get(quickfix.dukascopy.field.DiscretionLimitType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DiscretionLimitType getDiscretionLimitType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DiscretionLimitType());
	}

	public boolean isSet(quickfix.dukascopy.field.DiscretionLimitType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionLimitType() {
		return isSetField(843);
	}

	public void set(quickfix.dukascopy.field.DiscretionRoundDirection value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DiscretionRoundDirection get(quickfix.dukascopy.field.DiscretionRoundDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DiscretionRoundDirection getDiscretionRoundDirection() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DiscretionRoundDirection());
	}

	public boolean isSet(quickfix.dukascopy.field.DiscretionRoundDirection field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionRoundDirection() {
		return isSetField(844);
	}

	public void set(quickfix.dukascopy.field.DiscretionScope value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DiscretionScope get(quickfix.dukascopy.field.DiscretionScope value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DiscretionScope getDiscretionScope() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DiscretionScope());
	}

	public boolean isSet(quickfix.dukascopy.field.DiscretionScope field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionScope() {
		return isSetField(846);
	}

}
