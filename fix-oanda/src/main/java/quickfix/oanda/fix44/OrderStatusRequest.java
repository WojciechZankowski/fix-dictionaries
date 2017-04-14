
package quickfix.oanda.fix44;

import quickfix.FieldNotFound;


public class OrderStatusRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "H";
	

	public OrderStatusRequest() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public OrderStatusRequest(quickfix.oanda.field.ClOrdID clOrdID, quickfix.oanda.field.Symbol symbol, quickfix.oanda.field.Side side) {
		this();
		setField(clOrdID);
		setField(symbol);
		setField(side);
	}
	
	public void set(quickfix.oanda.field.OrderID value) {
		setField(value);
	}

	public quickfix.oanda.field.OrderID get(quickfix.oanda.field.OrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.OrderID getOrderID() throws FieldNotFound {
		return get(new quickfix.oanda.field.OrderID());
	}

	public boolean isSet(quickfix.oanda.field.OrderID field) {
		return isSetField(field);
	}

	public boolean isSetOrderID() {
		return isSetField(37);
	}

	public void set(quickfix.oanda.field.ClOrdID value) {
		setField(value);
	}

	public quickfix.oanda.field.ClOrdID get(quickfix.oanda.field.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new quickfix.oanda.field.ClOrdID());
	}

	public boolean isSet(quickfix.oanda.field.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

	public void set(quickfix.oanda.field.OrdStatusReqID value) {
		setField(value);
	}

	public quickfix.oanda.field.OrdStatusReqID get(quickfix.oanda.field.OrdStatusReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.OrdStatusReqID getOrdStatusReqID() throws FieldNotFound {
		return get(new quickfix.oanda.field.OrdStatusReqID());
	}

	public boolean isSet(quickfix.oanda.field.OrdStatusReqID field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatusReqID() {
		return isSetField(790);
	}

	public void set(quickfix.oanda.field.Symbol value) {
		setField(value);
	}

	public quickfix.oanda.field.Symbol get(quickfix.oanda.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.oanda.field.Symbol());
	}

	public boolean isSet(quickfix.oanda.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(quickfix.oanda.field.Side value) {
		setField(value);
	}

	public quickfix.oanda.field.Side get(quickfix.oanda.field.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.Side getSide() throws FieldNotFound {
		return get(new quickfix.oanda.field.Side());
	}

	public boolean isSet(quickfix.oanda.field.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
	}

}
