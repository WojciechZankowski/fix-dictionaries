
package quickfix.oanda.fix42;

import quickfix.FieldNotFound;


public class OrderCancelRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "F";
	

	public OrderCancelRequest() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public OrderCancelRequest(quickfix.oanda.field.OrigClOrdID origClOrdID, quickfix.oanda.field.ClOrdID clOrdID, quickfix.oanda.field.Symbol symbol, quickfix.oanda.field.Side side, quickfix.oanda.field.TransactTime transactTime) {
		this();
		setField(origClOrdID);
		setField(clOrdID);
		setField(symbol);
		setField(side);
		setField(transactTime);
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

	public void set(quickfix.oanda.field.OrigClOrdID value) {
		setField(value);
	}

	public quickfix.oanda.field.OrigClOrdID get(quickfix.oanda.field.OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		return get(new quickfix.oanda.field.OrigClOrdID());
	}

	public boolean isSet(quickfix.oanda.field.OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(41);
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

	public void set(quickfix.oanda.field.Account value) {
		setField(value);
	}

	public quickfix.oanda.field.Account get(quickfix.oanda.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.Account getAccount() throws FieldNotFound {
		return get(new quickfix.oanda.field.Account());
	}

	public boolean isSet(quickfix.oanda.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
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

	public void set(quickfix.oanda.field.TransactTime value) {
		setField(value);
	}

	public quickfix.oanda.field.TransactTime get(quickfix.oanda.field.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.TransactTime getTransactTime() throws FieldNotFound {
		return get(new quickfix.oanda.field.TransactTime());
	}

	public boolean isSet(quickfix.oanda.field.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
	}

}
