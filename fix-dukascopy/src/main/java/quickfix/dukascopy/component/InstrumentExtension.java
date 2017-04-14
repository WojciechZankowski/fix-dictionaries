
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class InstrumentExtension extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 668, 869,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 870,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public InstrumentExtension() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.DeliveryForm value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DeliveryForm get(quickfix.dukascopy.field.DeliveryForm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DeliveryForm getDeliveryForm() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DeliveryForm());
	}

	public boolean isSet(quickfix.dukascopy.field.DeliveryForm field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryForm() {
		return isSetField(668);
	}

	public void set(quickfix.dukascopy.field.PctAtRisk value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PctAtRisk get(quickfix.dukascopy.field.PctAtRisk value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PctAtRisk getPctAtRisk() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PctAtRisk());
	}

	public boolean isSet(quickfix.dukascopy.field.PctAtRisk field) {
		return isSetField(field);
	}

	public boolean isSetPctAtRisk() {
		return isSetField(869);
	}

	public void set(quickfix.dukascopy.field.NoInstrAttrib value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoInstrAttrib get(quickfix.dukascopy.field.NoInstrAttrib value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoInstrAttrib getNoInstrAttrib() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoInstrAttrib());
	}

	public boolean isSet(quickfix.dukascopy.field.NoInstrAttrib field) {
		return isSetField(field);
	}

	public boolean isSetNoInstrAttrib() {
		return isSetField(870);
	}

	public static class NoInstrAttrib extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {871, 872, 0};

		public NoInstrAttrib() {
			super(870, 871, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.InstrAttribType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.InstrAttribType get(quickfix.dukascopy.field.InstrAttribType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.InstrAttribType getInstrAttribType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.InstrAttribType());
	}

	public boolean isSet(quickfix.dukascopy.field.InstrAttribType field) {
		return isSetField(field);
	}

	public boolean isSetInstrAttribType() {
		return isSetField(871);
	}

	public void set(quickfix.dukascopy.field.InstrAttribValue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.InstrAttribValue get(quickfix.dukascopy.field.InstrAttribValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.InstrAttribValue getInstrAttribValue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.InstrAttribValue());
	}

	public boolean isSet(quickfix.dukascopy.field.InstrAttribValue field) {
		return isSetField(field);
	}

	public boolean isSetInstrAttribValue() {
		return isSetField(872);
	}

	}

}
