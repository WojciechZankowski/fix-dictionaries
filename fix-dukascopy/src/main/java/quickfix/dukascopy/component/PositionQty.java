
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class PositionQty extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 702,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public PositionQty() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.NoPositions value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoPositions get(quickfix.dukascopy.field.NoPositions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoPositions getNoPositions() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoPositions());
	}

	public boolean isSet(quickfix.dukascopy.field.NoPositions field) {
		return isSetField(field);
	}

	public boolean isSetNoPositions() {
		return isSetField(702);
	}

	public static class NoPositions extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {703, 704, 705, 706, 539, 0};

		public NoPositions() {
			super(702, 703, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.PosType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PosType get(quickfix.dukascopy.field.PosType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PosType getPosType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PosType());
	}

	public boolean isSet(quickfix.dukascopy.field.PosType field) {
		return isSetField(field);
	}

	public boolean isSetPosType() {
		return isSetField(703);
	}

	public void set(quickfix.dukascopy.field.LongQty value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LongQty get(quickfix.dukascopy.field.LongQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LongQty getLongQty() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LongQty());
	}

	public boolean isSet(quickfix.dukascopy.field.LongQty field) {
		return isSetField(field);
	}

	public boolean isSetLongQty() {
		return isSetField(704);
	}

	public void set(quickfix.dukascopy.field.ShortQty value) {
		setField(value);
	}

	public quickfix.dukascopy.field.ShortQty get(quickfix.dukascopy.field.ShortQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.ShortQty getShortQty() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.ShortQty());
	}

	public boolean isSet(quickfix.dukascopy.field.ShortQty field) {
		return isSetField(field);
	}

	public boolean isSetShortQty() {
		return isSetField(705);
	}

	public void set(quickfix.dukascopy.field.PosQtyStatus value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PosQtyStatus get(quickfix.dukascopy.field.PosQtyStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PosQtyStatus getPosQtyStatus() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PosQtyStatus());
	}

	public boolean isSet(quickfix.dukascopy.field.PosQtyStatus field) {
		return isSetField(field);
	}

	public boolean isSetPosQtyStatus() {
		return isSetField(706);
	}

	public void set(quickfix.dukascopy.component.NestedParties component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.NestedParties get(quickfix.dukascopy.component.NestedParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.NestedParties getNestedParties() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.NestedParties());
	}

	public void set(quickfix.dukascopy.field.NoNestedPartyIDs value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoNestedPartyIDs get(quickfix.dukascopy.field.NoNestedPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoNestedPartyIDs());
	}

	public boolean isSet(quickfix.dukascopy.field.NoNestedPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartyIDs() {
		return isSetField(539);
	}

	public static class NoNestedPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {524, 525, 538, 804, 0};

		public NoNestedPartyIDs() {
			super(539, 524, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.NestedPartyID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NestedPartyID get(quickfix.dukascopy.field.NestedPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NestedPartyID());
	}

	public boolean isSet(quickfix.dukascopy.field.NestedPartyID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyID() {
		return isSetField(524);
	}

	public void set(quickfix.dukascopy.field.NestedPartyIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NestedPartyIDSource get(quickfix.dukascopy.field.NestedPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NestedPartyIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.NestedPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyIDSource() {
		return isSetField(525);
	}

	public void set(quickfix.dukascopy.field.NestedPartyRole value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NestedPartyRole get(quickfix.dukascopy.field.NestedPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NestedPartyRole());
	}

	public boolean isSet(quickfix.dukascopy.field.NestedPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyRole() {
		return isSetField(538);
	}

	public void set(quickfix.dukascopy.field.NoNestedPartySubIDs value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoNestedPartySubIDs get(quickfix.dukascopy.field.NoNestedPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoNestedPartySubIDs());
	}

	public boolean isSet(quickfix.dukascopy.field.NoNestedPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartySubIDs() {
		return isSetField(804);
	}

	public static class NoNestedPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {545, 805, 0};

		public NoNestedPartySubIDs() {
			super(804, 545, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.NestedPartySubID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NestedPartySubID get(quickfix.dukascopy.field.NestedPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NestedPartySubID());
	}

	public boolean isSet(quickfix.dukascopy.field.NestedPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubID() {
		return isSetField(545);
	}

	public void set(quickfix.dukascopy.field.NestedPartySubIDType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NestedPartySubIDType get(quickfix.dukascopy.field.NestedPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NestedPartySubIDType());
	}

	public boolean isSet(quickfix.dukascopy.field.NestedPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubIDType() {
		return isSetField(805);
	}

	}

	}

	}

}
