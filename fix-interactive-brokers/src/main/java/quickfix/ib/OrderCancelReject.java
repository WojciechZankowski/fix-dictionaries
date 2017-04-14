
package quickfix.ib;

import quickfix.FieldNotFound;


public class OrderCancelReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "9";
	

	public OrderCancelReject() {
		super();
		getHeader().setField(new quickfix.ib.field.MsgType(MSGTYPE));
	}
	
	public OrderCancelReject(quickfix.ib.field.OrderID orderID, quickfix.ib.field.ClOrdID clOrdID, quickfix.ib.field.OrigClOrdID origClOrdID, quickfix.ib.field.CxlRejResponseTo cxlRejResponseTo) {
		this();
		setField(orderID);
		setField(clOrdID);
		setField(origClOrdID);
		setField(cxlRejResponseTo);
	}
	
	public void set(quickfix.ib.field.OrderID value) {
		setField(value);
	}

	public quickfix.ib.field.OrderID get(quickfix.ib.field.OrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.OrderID getOrderID() throws FieldNotFound {
		return get(new quickfix.ib.field.OrderID());
	}

	public boolean isSet(quickfix.ib.field.OrderID field) {
		return isSetField(field);
	}

	public boolean isSetOrderID() {
		return isSetField(37);
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

	public void set(quickfix.ib.field.CxlRejReason value) {
		setField(value);
	}

	public quickfix.ib.field.CxlRejReason get(quickfix.ib.field.CxlRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.CxlRejReason getCxlRejReason() throws FieldNotFound {
		return get(new quickfix.ib.field.CxlRejReason());
	}

	public boolean isSet(quickfix.ib.field.CxlRejReason field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejReason() {
		return isSetField(102);
	}

	public void set(quickfix.ib.field.CxlRejResponseTo value) {
		setField(value);
	}

	public quickfix.ib.field.CxlRejResponseTo get(quickfix.ib.field.CxlRejResponseTo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.CxlRejResponseTo getCxlRejResponseTo() throws FieldNotFound {
		return get(new quickfix.ib.field.CxlRejResponseTo());
	}

	public boolean isSet(quickfix.ib.field.CxlRejResponseTo field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejResponseTo() {
		return isSetField(434);
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
