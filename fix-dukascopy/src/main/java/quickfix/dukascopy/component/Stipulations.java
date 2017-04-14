
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class Stipulations extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 232,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public Stipulations() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.NoStipulations value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoStipulations get(quickfix.dukascopy.field.NoStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoStipulations getNoStipulations() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoStipulations());
	}

	public boolean isSet(quickfix.dukascopy.field.NoStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoStipulations() {
		return isSetField(232);
	}

	public static class NoStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {233, 234, 0};

		public NoStipulations() {
			super(232, 233, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.StipulationType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.StipulationType get(quickfix.dukascopy.field.StipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.StipulationType getStipulationType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.StipulationType());
	}

	public boolean isSet(quickfix.dukascopy.field.StipulationType field) {
		return isSetField(field);
	}

	public boolean isSetStipulationType() {
		return isSetField(233);
	}

	public void set(quickfix.dukascopy.field.StipulationValue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.StipulationValue get(quickfix.dukascopy.field.StipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.StipulationValue getStipulationValue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.StipulationValue());
	}

	public boolean isSet(quickfix.dukascopy.field.StipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetStipulationValue() {
		return isSetField(234);
	}

	}

}
