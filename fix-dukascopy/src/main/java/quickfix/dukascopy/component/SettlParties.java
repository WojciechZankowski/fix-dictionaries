
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class SettlParties extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 781,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public SettlParties() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.NoSettlPartyIDs value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoSettlPartyIDs get(quickfix.dukascopy.field.NoSettlPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoSettlPartyIDs getNoSettlPartyIDs() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoSettlPartyIDs());
	}

	public boolean isSet(quickfix.dukascopy.field.NoSettlPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartyIDs() {
		return isSetField(781);
	}

	public static class NoSettlPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {782, 783, 784, 801, 0};

		public NoSettlPartyIDs() {
			super(781, 782, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.SettlPartyID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SettlPartyID get(quickfix.dukascopy.field.SettlPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SettlPartyID getSettlPartyID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SettlPartyID());
	}

	public boolean isSet(quickfix.dukascopy.field.SettlPartyID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyID() {
		return isSetField(782);
	}

	public void set(quickfix.dukascopy.field.SettlPartyIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SettlPartyIDSource get(quickfix.dukascopy.field.SettlPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SettlPartyIDSource getSettlPartyIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SettlPartyIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.SettlPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyIDSource() {
		return isSetField(783);
	}

	public void set(quickfix.dukascopy.field.SettlPartyRole value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SettlPartyRole get(quickfix.dukascopy.field.SettlPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SettlPartyRole getSettlPartyRole() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SettlPartyRole());
	}

	public boolean isSet(quickfix.dukascopy.field.SettlPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyRole() {
		return isSetField(784);
	}

	public void set(quickfix.dukascopy.field.NoSettlPartySubIDs value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoSettlPartySubIDs get(quickfix.dukascopy.field.NoSettlPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoSettlPartySubIDs getNoSettlPartySubIDs() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoSettlPartySubIDs());
	}

	public boolean isSet(quickfix.dukascopy.field.NoSettlPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartySubIDs() {
		return isSetField(801);
	}

	public static class NoSettlPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {785, 786, 0};

		public NoSettlPartySubIDs() {
			super(801, 785, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.SettlPartySubID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SettlPartySubID get(quickfix.dukascopy.field.SettlPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SettlPartySubID getSettlPartySubID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SettlPartySubID());
	}

	public boolean isSet(quickfix.dukascopy.field.SettlPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubID() {
		return isSetField(785);
	}

	public void set(quickfix.dukascopy.field.SettlPartySubIDType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SettlPartySubIDType get(quickfix.dukascopy.field.SettlPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SettlPartySubIDType getSettlPartySubIDType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SettlPartySubIDType());
	}

	public boolean isSet(quickfix.dukascopy.field.SettlPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubIDType() {
		return isSetField(786);
	}

	}

	}

}
