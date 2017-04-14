
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class LegStipulations extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 683,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public LegStipulations() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.NoLegStipulations value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoLegStipulations get(quickfix.dukascopy.field.NoLegStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoLegStipulations());
	}

	public boolean isSet(quickfix.dukascopy.field.NoLegStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoLegStipulations() {
		return isSetField(683);
	}

	public static class NoLegStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {688, 689, 0};

		public NoLegStipulations() {
			super(683, 688, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.LegStipulationType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegStipulationType get(quickfix.dukascopy.field.LegStipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegStipulationType getLegStipulationType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegStipulationType());
	}

	public boolean isSet(quickfix.dukascopy.field.LegStipulationType field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationType() {
		return isSetField(688);
	}

	public void set(quickfix.dukascopy.field.LegStipulationValue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegStipulationValue get(quickfix.dukascopy.field.LegStipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegStipulationValue());
	}

	public boolean isSet(quickfix.dukascopy.field.LegStipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationValue() {
		return isSetField(689);
	}

	}

}
