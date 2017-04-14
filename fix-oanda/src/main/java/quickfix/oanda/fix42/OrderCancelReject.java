
package quickfix.oanda.fix42;

import quickfix.FieldNotFound;


public class OrderCancelReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "9";
	

	public OrderCancelReject() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public OrderCancelReject(quickfix.oanda.field.OrderID orderID, quickfix.oanda.field.ClOrdID clOrdID, quickfix.oanda.field.OrigClOrdID origClOrdID, quickfix.oanda.field.OrdStatus ordStatus, quickfix.oanda.field.CxlRejResponseTo cxlRejResponseTo) {
		this();
		setField(orderID);
		setField(clOrdID);
		setField(origClOrdID);
		setField(ordStatus);
		setField(cxlRejResponseTo);
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

	public void set(quickfix.oanda.field.OrdStatus value) {
		setField(value);
	}

	public quickfix.oanda.field.OrdStatus get(quickfix.oanda.field.OrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.OrdStatus getOrdStatus() throws FieldNotFound {
		return get(new quickfix.oanda.field.OrdStatus());
	}

	public boolean isSet(quickfix.oanda.field.OrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatus() {
		return isSetField(39);
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

	public void set(quickfix.oanda.field.CxlRejResponseTo value) {
		setField(value);
	}

	public quickfix.oanda.field.CxlRejResponseTo get(quickfix.oanda.field.CxlRejResponseTo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.CxlRejResponseTo getCxlRejResponseTo() throws FieldNotFound {
		return get(new quickfix.oanda.field.CxlRejResponseTo());
	}

	public boolean isSet(quickfix.oanda.field.CxlRejResponseTo field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejResponseTo() {
		return isSetField(434);
	}

	public void set(quickfix.oanda.field.CxlRejReason value) {
		setField(value);
	}

	public quickfix.oanda.field.CxlRejReason get(quickfix.oanda.field.CxlRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.CxlRejReason getCxlRejReason() throws FieldNotFound {
		return get(new quickfix.oanda.field.CxlRejReason());
	}

	public boolean isSet(quickfix.oanda.field.CxlRejReason field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejReason() {
		return isSetField(102);
	}

	public void set(quickfix.oanda.field.Text value) {
		setField(value);
	}

	public quickfix.oanda.field.Text get(quickfix.oanda.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.Text getText() throws FieldNotFound {
		return get(new quickfix.oanda.field.Text());
	}

	public boolean isSet(quickfix.oanda.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

}
