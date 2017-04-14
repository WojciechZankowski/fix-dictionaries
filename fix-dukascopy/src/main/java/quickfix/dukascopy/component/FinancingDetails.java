
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;


public class FinancingDetails extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 913, 914, 915, 918, 788, 916, 917, 919, 898,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public FinancingDetails() {
		super();
	}
	
	public void set(quickfix.dukascopy.field.AgreementDesc value) {
		setField(value);
	}

	public quickfix.dukascopy.field.AgreementDesc get(quickfix.dukascopy.field.AgreementDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.AgreementDesc getAgreementDesc() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.AgreementDesc());
	}

	public boolean isSet(quickfix.dukascopy.field.AgreementDesc field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDesc() {
		return isSetField(913);
	}

	public void set(quickfix.dukascopy.field.AgreementID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.AgreementID get(quickfix.dukascopy.field.AgreementID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.AgreementID getAgreementID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.AgreementID());
	}

	public boolean isSet(quickfix.dukascopy.field.AgreementID field) {
		return isSetField(field);
	}

	public boolean isSetAgreementID() {
		return isSetField(914);
	}

	public void set(quickfix.dukascopy.field.AgreementDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.AgreementDate get(quickfix.dukascopy.field.AgreementDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.AgreementDate getAgreementDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.AgreementDate());
	}

	public boolean isSet(quickfix.dukascopy.field.AgreementDate field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDate() {
		return isSetField(915);
	}

	public void set(quickfix.dukascopy.field.AgreementCurrency value) {
		setField(value);
	}

	public quickfix.dukascopy.field.AgreementCurrency get(quickfix.dukascopy.field.AgreementCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.AgreementCurrency getAgreementCurrency() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.AgreementCurrency());
	}

	public boolean isSet(quickfix.dukascopy.field.AgreementCurrency field) {
		return isSetField(field);
	}

	public boolean isSetAgreementCurrency() {
		return isSetField(918);
	}

	public void set(quickfix.dukascopy.field.TerminationType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TerminationType get(quickfix.dukascopy.field.TerminationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TerminationType getTerminationType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TerminationType());
	}

	public boolean isSet(quickfix.dukascopy.field.TerminationType field) {
		return isSetField(field);
	}

	public boolean isSetTerminationType() {
		return isSetField(788);
	}

	public void set(quickfix.dukascopy.field.StartDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.StartDate get(quickfix.dukascopy.field.StartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.StartDate getStartDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.StartDate());
	}

	public boolean isSet(quickfix.dukascopy.field.StartDate field) {
		return isSetField(field);
	}

	public boolean isSetStartDate() {
		return isSetField(916);
	}

	public void set(quickfix.dukascopy.field.EndDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EndDate get(quickfix.dukascopy.field.EndDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EndDate getEndDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EndDate());
	}

	public boolean isSet(quickfix.dukascopy.field.EndDate field) {
		return isSetField(field);
	}

	public boolean isSetEndDate() {
		return isSetField(917);
	}

	public void set(quickfix.dukascopy.field.DeliveryType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DeliveryType get(quickfix.dukascopy.field.DeliveryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DeliveryType getDeliveryType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DeliveryType());
	}

	public boolean isSet(quickfix.dukascopy.field.DeliveryType field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryType() {
		return isSetField(919);
	}

	public void set(quickfix.dukascopy.field.MarginRatio value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MarginRatio get(quickfix.dukascopy.field.MarginRatio value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MarginRatio getMarginRatio() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MarginRatio());
	}

	public boolean isSet(quickfix.dukascopy.field.MarginRatio field) {
		return isSetField(field);
	}

	public boolean isSetMarginRatio() {
		return isSetField(898);
	}

}
