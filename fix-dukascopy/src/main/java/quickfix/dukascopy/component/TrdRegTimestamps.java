
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TrdRegTimestamps extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 768,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public TrdRegTimestamps() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.NoTrdRegTimestamps value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoTrdRegTimestamps get(quickfix.dukascopy.field.NoTrdRegTimestamps value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoTrdRegTimestamps getNoTrdRegTimestamps() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoTrdRegTimestamps());
	}

	public boolean isSet(quickfix.dukascopy.field.NoTrdRegTimestamps field) {
		return isSetField(field);
	}

	public boolean isSetNoTrdRegTimestamps() {
		return isSetField(768);
	}

	public static class NoTrdRegTimestamps extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {769, 770, 771, 0};

		public NoTrdRegTimestamps() {
			super(768, 769, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.TrdRegTimestamp value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TrdRegTimestamp get(quickfix.dukascopy.field.TrdRegTimestamp value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TrdRegTimestamp getTrdRegTimestamp() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TrdRegTimestamp());
	}

	public boolean isSet(quickfix.dukascopy.field.TrdRegTimestamp field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestamp() {
		return isSetField(769);
	}

	public void set(quickfix.dukascopy.field.TrdRegTimestampType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TrdRegTimestampType get(quickfix.dukascopy.field.TrdRegTimestampType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TrdRegTimestampType getTrdRegTimestampType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TrdRegTimestampType());
	}

	public boolean isSet(quickfix.dukascopy.field.TrdRegTimestampType field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampType() {
		return isSetField(770);
	}

	public void set(quickfix.dukascopy.field.TrdRegTimestampOrigin value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TrdRegTimestampOrigin get(quickfix.dukascopy.field.TrdRegTimestampOrigin value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TrdRegTimestampOrigin getTrdRegTimestampOrigin() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TrdRegTimestampOrigin());
	}

	public boolean isSet(quickfix.dukascopy.field.TrdRegTimestampOrigin field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampOrigin() {
		return isSetField(771);
	}

	}

}
