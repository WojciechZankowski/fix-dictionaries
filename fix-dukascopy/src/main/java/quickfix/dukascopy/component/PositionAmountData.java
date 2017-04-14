
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class PositionAmountData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 753,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public PositionAmountData() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.NoPosAmt value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoPosAmt get(quickfix.dukascopy.field.NoPosAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoPosAmt getNoPosAmt() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoPosAmt());
	}

	public boolean isSet(quickfix.dukascopy.field.NoPosAmt field) {
		return isSetField(field);
	}

	public boolean isSetNoPosAmt() {
		return isSetField(753);
	}

	public static class NoPosAmt extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {707, 708, 0};

		public NoPosAmt() {
			super(753, 707, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.PosAmtType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PosAmtType get(quickfix.dukascopy.field.PosAmtType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PosAmtType getPosAmtType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PosAmtType());
	}

	public boolean isSet(quickfix.dukascopy.field.PosAmtType field) {
		return isSetField(field);
	}

	public boolean isSetPosAmtType() {
		return isSetField(707);
	}

	public void set(quickfix.dukascopy.field.PosAmt value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PosAmt get(quickfix.dukascopy.field.PosAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PosAmt getPosAmt() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PosAmt());
	}

	public boolean isSet(quickfix.dukascopy.field.PosAmt field) {
		return isSetField(field);
	}

	public boolean isSetPosAmt() {
		return isSetField(708);
	}

	}

}
