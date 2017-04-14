
package quickfix.ib;

import quickfix.FieldNotFound;


public class OrderCancelRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "F";
	

	public OrderCancelRequest() {
		super();
		getHeader().setField(new quickfix.ib.field.MsgType(MSGTYPE));
	}
	
	public OrderCancelRequest(quickfix.ib.field.ClOrdID clOrdID, quickfix.ib.field.OrigClOrdID origClOrdID, quickfix.ib.field.Symbol symbol, quickfix.ib.field.Side side, quickfix.ib.field.OrderQty orderQty) {
		this();
		setField(clOrdID);
		setField(origClOrdID);
		setField(symbol);
		setField(side);
		setField(orderQty);
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

	public void set(quickfix.ib.field.OrigClOrdID value) {
		setField(value);
	}

	public quickfix.ib.field.OrigClOrdID get(quickfix.ib.field.OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		return get(new quickfix.ib.field.OrigClOrdID());
	}

	public boolean isSet(quickfix.ib.field.OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(41);
	}

	public void set(quickfix.ib.field.Symbol value) {
		setField(value);
	}

	public quickfix.ib.field.Symbol get(quickfix.ib.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.ib.field.Symbol());
	}

	public boolean isSet(quickfix.ib.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(quickfix.ib.field.SecurityID value) {
		setField(value);
	}

	public quickfix.ib.field.SecurityID get(quickfix.ib.field.SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.SecurityID getSecurityID() throws FieldNotFound {
		return get(new quickfix.ib.field.SecurityID());
	}

	public boolean isSet(quickfix.ib.field.SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(48);
	}

	public void set(quickfix.ib.field.IDSource value) {
		setField(value);
	}

	public quickfix.ib.field.IDSource get(quickfix.ib.field.IDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.IDSource getIDSource() throws FieldNotFound {
		return get(new quickfix.ib.field.IDSource());
	}

	public boolean isSet(quickfix.ib.field.IDSource field) {
		return isSetField(field);
	}

	public boolean isSetIDSource() {
		return isSetField(22);
	}

	public void set(quickfix.ib.field.Side value) {
		setField(value);
	}

	public quickfix.ib.field.Side get(quickfix.ib.field.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.Side getSide() throws FieldNotFound {
		return get(new quickfix.ib.field.Side());
	}

	public boolean isSet(quickfix.ib.field.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
	}

	public void set(quickfix.ib.field.OrderQty value) {
		setField(value);
	}

	public quickfix.ib.field.OrderQty get(quickfix.ib.field.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.OrderQty getOrderQty() throws FieldNotFound {
		return get(new quickfix.ib.field.OrderQty());
	}

	public boolean isSet(quickfix.ib.field.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
	}

	public void set(quickfix.ib.field.Text value) {
		setField(value);
	}

	public quickfix.ib.field.Text get(quickfix.ib.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.Text getText() throws FieldNotFound {
		return get(new quickfix.ib.field.Text());
	}

	public boolean isSet(quickfix.ib.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

}
