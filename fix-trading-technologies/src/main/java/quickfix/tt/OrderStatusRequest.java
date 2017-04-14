
package quickfix.tt;

import quickfix.FieldNotFound;


public class OrderStatusRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "H";
	

	public OrderStatusRequest() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
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

}
