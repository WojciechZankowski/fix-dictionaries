
package quickfix.tt;

import quickfix.FieldNotFound;


public class OrderCancelRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "F";
	

	public OrderCancelRequest() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public OrderCancelRequest(quickfix.tt.field.ClOrdID clOrdID) {
		this();
		setField(clOrdID);
	}
	
	public void set(quickfix.tt.field.OrigClOrdID value) {
		setField(value);
	}

	public quickfix.tt.field.OrigClOrdID get(quickfix.tt.field.OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		return get(new quickfix.tt.field.OrigClOrdID());
	}

	public boolean isSet(quickfix.tt.field.OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(41);
	}

	public void set(quickfix.tt.field.ClOrdID value) {
		setField(value);
	}

	public quickfix.tt.field.ClOrdID get(quickfix.tt.field.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new quickfix.tt.field.ClOrdID());
	}

	public boolean isSet(quickfix.tt.field.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

	public void set(quickfix.tt.field.OrderID value) {
		setField(value);
	}

	public quickfix.tt.field.OrderID get(quickfix.tt.field.OrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrderID getOrderID() throws FieldNotFound {
		return get(new quickfix.tt.field.OrderID());
	}

	public boolean isSet(quickfix.tt.field.OrderID field) {
		return isSetField(field);
	}

	public boolean isSetOrderID() {
		return isSetField(37);
	}

	public void set(quickfix.tt.field.Account value) {
		setField(value);
	}

	public quickfix.tt.field.Account get(quickfix.tt.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Account getAccount() throws FieldNotFound {
		return get(new quickfix.tt.field.Account());
	}

	public boolean isSet(quickfix.tt.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(quickfix.tt.field.FFT2 value) {
		setField(value);
	}

	public quickfix.tt.field.FFT2 get(quickfix.tt.field.FFT2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.FFT2 getFFT2() throws FieldNotFound {
		return get(new quickfix.tt.field.FFT2());
	}

	public boolean isSet(quickfix.tt.field.FFT2 field) {
		return isSetField(field);
	}

	public boolean isSetFFT2() {
		return isSetField(16102);
	}

	public void set(quickfix.tt.field.FFT3 value) {
		setField(value);
	}

	public quickfix.tt.field.FFT3 get(quickfix.tt.field.FFT3 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.FFT3 getFFT3() throws FieldNotFound {
		return get(new quickfix.tt.field.FFT3());
	}

	public boolean isSet(quickfix.tt.field.FFT3 field) {
		return isSetField(field);
	}

	public boolean isSetFFT3() {
		return isSetField(16103);
	}

	public void set(quickfix.tt.field.Rule80A value) {
		setField(value);
	}

	public quickfix.tt.field.Rule80A get(quickfix.tt.field.Rule80A value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Rule80A getRule80A() throws FieldNotFound {
		return get(new quickfix.tt.field.Rule80A());
	}

	public boolean isSet(quickfix.tt.field.Rule80A field) {
		return isSetField(field);
	}

	public boolean isSetRule80A() {
		return isSetField(47);
	}

	public void set(quickfix.tt.field.CustomerOrFirm value) {
		setField(value);
	}

	public quickfix.tt.field.CustomerOrFirm get(quickfix.tt.field.CustomerOrFirm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.CustomerOrFirm getCustomerOrFirm() throws FieldNotFound {
		return get(new quickfix.tt.field.CustomerOrFirm());
	}

	public boolean isSet(quickfix.tt.field.CustomerOrFirm field) {
		return isSetField(field);
	}

	public boolean isSetCustomerOrFirm() {
		return isSetField(204);
	}

	public void set(quickfix.tt.field.ClearingAccount value) {
		setField(value);
	}

	public quickfix.tt.field.ClearingAccount get(quickfix.tt.field.ClearingAccount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ClearingAccount getClearingAccount() throws FieldNotFound {
		return get(new quickfix.tt.field.ClearingAccount());
	}

	public boolean isSet(quickfix.tt.field.ClearingAccount field) {
		return isSetField(field);
	}

	public boolean isSetClearingAccount() {
		return isSetField(440);
	}

	public void set(quickfix.tt.field.ManualOrderIndicator value) {
		setField(value);
	}

	public quickfix.tt.field.ManualOrderIndicator get(quickfix.tt.field.ManualOrderIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ManualOrderIndicator getManualOrderIndicator() throws FieldNotFound {
		return get(new quickfix.tt.field.ManualOrderIndicator());
	}

	public boolean isSet(quickfix.tt.field.ManualOrderIndicator field) {
		return isSetField(field);
	}

	public boolean isSetManualOrderIndicator() {
		return isSetField(11028);
	}

	public void set(quickfix.tt.field.OrderOriginationID value) {
		setField(value);
	}

	public quickfix.tt.field.OrderOriginationID get(quickfix.tt.field.OrderOriginationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrderOriginationID getOrderOriginationID() throws FieldNotFound {
		return get(new quickfix.tt.field.OrderOriginationID());
	}

	public boolean isSet(quickfix.tt.field.OrderOriginationID field) {
		return isSetField(field);
	}

	public boolean isSetOrderOriginationID() {
		return isSetField(16142);
	}

}
