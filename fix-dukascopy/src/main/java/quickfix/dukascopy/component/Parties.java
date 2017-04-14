
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class Parties extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 453,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public Parties() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.NoPartyIDs value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoPartyIDs get(quickfix.dukascopy.field.NoPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoPartyIDs());
	}

	public boolean isSet(quickfix.dukascopy.field.NoPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartyIDs() {
		return isSetField(453);
	}

	public static class NoPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {448, 447, 452, 802, 0};

		public NoPartyIDs() {
			super(453, 448, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.PartyID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PartyID get(quickfix.dukascopy.field.PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PartyID getPartyID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PartyID());
	}

	public boolean isSet(quickfix.dukascopy.field.PartyID field) {
		return isSetField(field);
	}

	public boolean isSetPartyID() {
		return isSetField(448);
	}

	public void set(quickfix.dukascopy.field.PartyIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PartyIDSource get(quickfix.dukascopy.field.PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PartyIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetPartyIDSource() {
		return isSetField(447);
	}

	public void set(quickfix.dukascopy.field.PartyRole value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PartyRole get(quickfix.dukascopy.field.PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PartyRole getPartyRole() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PartyRole());
	}

	public boolean isSet(quickfix.dukascopy.field.PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetPartyRole() {
		return isSetField(452);
	}

	public void set(quickfix.dukascopy.field.NoPartySubIDs value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoPartySubIDs get(quickfix.dukascopy.field.NoPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoPartySubIDs());
	}

	public boolean isSet(quickfix.dukascopy.field.NoPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartySubIDs() {
		return isSetField(802);
	}

	public static class NoPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {523, 803, 0};

		public NoPartySubIDs() {
			super(802, 523, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.PartySubID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PartySubID get(quickfix.dukascopy.field.PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PartySubID getPartySubID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PartySubID());
	}

	public boolean isSet(quickfix.dukascopy.field.PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetPartySubID() {
		return isSetField(523);
	}

	public void set(quickfix.dukascopy.field.PartySubIDType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PartySubIDType get(quickfix.dukascopy.field.PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PartySubIDType());
	}

	public boolean isSet(quickfix.dukascopy.field.PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetPartySubIDType() {
		return isSetField(803);
	}

	}

	}

}
