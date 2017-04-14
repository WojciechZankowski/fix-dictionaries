
package quickfix.ib;

import quickfix.FieldNotFound;


public class OrderStatusRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "H";
	

	public OrderStatusRequest() {
		super();
		getHeader().setField(new quickfix.ib.field.MsgType(MSGTYPE));
	}
	
	public OrderStatusRequest(quickfix.ib.field.ClOrdID clOrdID) {
		this();
		setField(clOrdID);
	}
	
	public void set(quickfix.ib.field.ClOrdID value) {
		setField(value);
	}

	public quickfix.ib.field.ClOrdID get(quickfix.ib.field.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new quickfix.ib.field.ClOrdID());
	}

	public boolean isSet(quickfix.ib.field.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

}
