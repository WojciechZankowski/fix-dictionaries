
package quickfix.oanda.fix42;

import quickfix.FieldNotFound;


public class NewOrderSingle extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "D";
	

	public NewOrderSingle() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public NewOrderSingle(quickfix.oanda.field.ClOrdID clOrdID, quickfix.oanda.field.HandlInst handlInst, quickfix.oanda.field.Symbol symbol, quickfix.oanda.field.Side side, quickfix.oanda.field.TransactTime transactTime, quickfix.oanda.field.OrdType ordType) {
		this();
		setField(clOrdID);
		setField(handlInst);
		setField(symbol);
		setField(side);
		setField(transactTime);
		setField(ordType);
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

	public void set(quickfix.oanda.field.HandlInst value) {
		setField(value);
	}

	public quickfix.oanda.field.HandlInst get(quickfix.oanda.field.HandlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.HandlInst getHandlInst() throws FieldNotFound {
		return get(new quickfix.oanda.field.HandlInst());
	}

	public boolean isSet(quickfix.oanda.field.HandlInst field) {
		return isSetField(field);
	}

	public boolean isSetHandlInst() {
		return isSetField(21);
	}

	public void set(quickfix.oanda.field.MinQty value) {
		setField(value);
	}

	public quickfix.oanda.field.MinQty get(quickfix.oanda.field.MinQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MinQty getMinQty() throws FieldNotFound {
		return get(new quickfix.oanda.field.MinQty());
	}

	public boolean isSet(quickfix.oanda.field.MinQty field) {
		return isSetField(field);
	}

	public boolean isSetMinQty() {
		return isSetField(110);
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

	public void set(quickfix.oanda.field.OrderQty value) {
		setField(value);
	}

	public quickfix.oanda.field.OrderQty get(quickfix.oanda.field.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.OrderQty getOrderQty() throws FieldNotFound {
		return get(new quickfix.oanda.field.OrderQty());
	}

	public boolean isSet(quickfix.oanda.field.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
	}

	public void set(quickfix.oanda.field.OrdType value) {
		setField(value);
	}

	public quickfix.oanda.field.OrdType get(quickfix.oanda.field.OrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.OrdType getOrdType() throws FieldNotFound {
		return get(new quickfix.oanda.field.OrdType());
	}

	public boolean isSet(quickfix.oanda.field.OrdType field) {
		return isSetField(field);
	}

	public boolean isSetOrdType() {
		return isSetField(40);
	}

	public void set(quickfix.oanda.field.Price value) {
		setField(value);
	}

	public quickfix.oanda.field.Price get(quickfix.oanda.field.Price value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.Price getPrice() throws FieldNotFound {
		return get(new quickfix.oanda.field.Price());
	}

	public boolean isSet(quickfix.oanda.field.Price field) {
		return isSetField(field);
	}

	public boolean isSetPrice() {
		return isSetField(44);
	}

	public void set(quickfix.oanda.field.StopPx value) {
		setField(value);
	}

	public quickfix.oanda.field.StopPx get(quickfix.oanda.field.StopPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.StopPx getStopPx() throws FieldNotFound {
		return get(new quickfix.oanda.field.StopPx());
	}

	public boolean isSet(quickfix.oanda.field.StopPx field) {
		return isSetField(field);
	}

	public boolean isSetStopPx() {
		return isSetField(99);
	}

	public void set(quickfix.oanda.field.TimeInForce value) {
		setField(value);
	}

	public quickfix.oanda.field.TimeInForce get(quickfix.oanda.field.TimeInForce value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.TimeInForce getTimeInForce() throws FieldNotFound {
		return get(new quickfix.oanda.field.TimeInForce());
	}

	public boolean isSet(quickfix.oanda.field.TimeInForce field) {
		return isSetField(field);
	}

	public boolean isSetTimeInForce() {
		return isSetField(59);
	}

	public void set(quickfix.oanda.field.ExpireDate value) {
		setField(value);
	}

	public quickfix.oanda.field.ExpireDate get(quickfix.oanda.field.ExpireDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.ExpireDate getExpireDate() throws FieldNotFound {
		return get(new quickfix.oanda.field.ExpireDate());
	}

	public boolean isSet(quickfix.oanda.field.ExpireDate field) {
		return isSetField(field);
	}

	public boolean isSetExpireDate() {
		return isSetField(432);
	}

	public void set(quickfix.oanda.field.ExpireTime value) {
		setField(value);
	}

	public quickfix.oanda.field.ExpireTime get(quickfix.oanda.field.ExpireTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.ExpireTime getExpireTime() throws FieldNotFound {
		return get(new quickfix.oanda.field.ExpireTime());
	}

	public boolean isSet(quickfix.oanda.field.ExpireTime field) {
		return isSetField(field);
	}

	public boolean isSetExpireTime() {
		return isSetField(126);
	}

}
