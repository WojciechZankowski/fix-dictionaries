
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class SettlInstructionsData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 172, 169, 170, 171,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 85,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public SettlInstructionsData() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.SettlDeliveryType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SettlDeliveryType get(quickfix.dukascopy.field.SettlDeliveryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SettlDeliveryType getSettlDeliveryType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SettlDeliveryType());
	}

	public boolean isSet(quickfix.dukascopy.field.SettlDeliveryType field) {
		return isSetField(field);
	}

	public boolean isSetSettlDeliveryType() {
		return isSetField(172);
	}

	public void set(quickfix.dukascopy.field.StandInstDbType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.StandInstDbType get(quickfix.dukascopy.field.StandInstDbType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.StandInstDbType getStandInstDbType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.StandInstDbType());
	}

	public boolean isSet(quickfix.dukascopy.field.StandInstDbType field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbType() {
		return isSetField(169);
	}

	public void set(quickfix.dukascopy.field.StandInstDbName value) {
		setField(value);
	}

	public quickfix.dukascopy.field.StandInstDbName get(quickfix.dukascopy.field.StandInstDbName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.StandInstDbName getStandInstDbName() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.StandInstDbName());
	}

	public boolean isSet(quickfix.dukascopy.field.StandInstDbName field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbName() {
		return isSetField(170);
	}

	public void set(quickfix.dukascopy.field.StandInstDbID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.StandInstDbID get(quickfix.dukascopy.field.StandInstDbID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.StandInstDbID getStandInstDbID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.StandInstDbID());
	}

	public boolean isSet(quickfix.dukascopy.field.StandInstDbID field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbID() {
		return isSetField(171);
	}

	public void set(quickfix.dukascopy.field.NoDlvyInst value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoDlvyInst get(quickfix.dukascopy.field.NoDlvyInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoDlvyInst getNoDlvyInst() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoDlvyInst());
	}

	public boolean isSet(quickfix.dukascopy.field.NoDlvyInst field) {
		return isSetField(field);
	}

	public boolean isSetNoDlvyInst() {
		return isSetField(85);
	}

	public static class NoDlvyInst extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {165, 787, 781, 0};

		public NoDlvyInst() {
			super(85, 165, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.SettlInstSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SettlInstSource get(quickfix.dukascopy.field.SettlInstSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SettlInstSource getSettlInstSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SettlInstSource());
	}

	public boolean isSet(quickfix.dukascopy.field.SettlInstSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstSource() {
		return isSetField(165);
	}

	public void set(quickfix.dukascopy.field.DlvyInstType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DlvyInstType get(quickfix.dukascopy.field.DlvyInstType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DlvyInstType getDlvyInstType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DlvyInstType());
	}

	public boolean isSet(quickfix.dukascopy.field.DlvyInstType field) {
		return isSetField(field);
	}

	public boolean isSetDlvyInstType() {
		return isSetField(787);
	}

	public void set(quickfix.dukascopy.component.SettlParties component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.SettlParties get(quickfix.dukascopy.component.SettlParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.SettlParties getSettlParties() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.SettlParties());
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

}
