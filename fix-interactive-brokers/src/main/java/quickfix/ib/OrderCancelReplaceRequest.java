
package quickfix.ib;

import quickfix.FieldNotFound;


public class OrderCancelReplaceRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "G";
	

	public OrderCancelReplaceRequest() {
		super();
		getHeader().setField(new quickfix.ib.field.MsgType(MSGTYPE));
	}
	
	public OrderCancelReplaceRequest(quickfix.ib.field.HandlInst handlInst, quickfix.ib.field.OrigClOrdID origClOrdID, quickfix.ib.field.ClOrdID clOrdID, quickfix.ib.field.Symbol symbol, quickfix.ib.field.Side side, quickfix.ib.field.OrderQty orderQty, quickfix.ib.field.OrdType ordType) {
		this();
		setField(handlInst);
		setField(origClOrdID);
		setField(clOrdID);
		setField(symbol);
		setField(side);
		setField(orderQty);
		setField(ordType);
	}
	
	public void set(quickfix.ib.field.HandlInst value) {
		setField(value);
	}

	public quickfix.ib.field.HandlInst get(quickfix.ib.field.HandlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.HandlInst getHandlInst() throws FieldNotFound {
		return get(new quickfix.ib.field.HandlInst());
	}

	public boolean isSet(quickfix.ib.field.HandlInst field) {
		return isSetField(field);
	}

	public boolean isSetHandlInst() {
		return isSetField(21);
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

	public void set(quickfix.ib.field.SttlmntTyp value) {
		setField(value);
	}

	public quickfix.ib.field.SttlmntTyp get(quickfix.ib.field.SttlmntTyp value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.SttlmntTyp getSttlmntTyp() throws FieldNotFound {
		return get(new quickfix.ib.field.SttlmntTyp());
	}

	public boolean isSet(quickfix.ib.field.SttlmntTyp field) {
		return isSetField(field);
	}

	public boolean isSetSttlmntTyp() {
		return isSetField(63);
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

	public void set(quickfix.ib.field.OrdType value) {
		setField(value);
	}

	public quickfix.ib.field.OrdType get(quickfix.ib.field.OrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.OrdType getOrdType() throws FieldNotFound {
		return get(new quickfix.ib.field.OrdType());
	}

	public boolean isSet(quickfix.ib.field.OrdType field) {
		return isSetField(field);
	}

	public boolean isSetOrdType() {
		return isSetField(40);
	}

	public void set(quickfix.ib.field.Price value) {
		setField(value);
	}

	public quickfix.ib.field.Price get(quickfix.ib.field.Price value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.Price getPrice() throws FieldNotFound {
		return get(new quickfix.ib.field.Price());
	}

	public boolean isSet(quickfix.ib.field.Price field) {
		return isSetField(field);
	}

	public boolean isSetPrice() {
		return isSetField(44);
	}

	public void set(quickfix.ib.field.StopPx value) {
		setField(value);
	}

	public quickfix.ib.field.StopPx get(quickfix.ib.field.StopPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.StopPx getStopPx() throws FieldNotFound {
		return get(new quickfix.ib.field.StopPx());
	}

	public boolean isSet(quickfix.ib.field.StopPx field) {
		return isSetField(field);
	}

	public boolean isSetStopPx() {
		return isSetField(99);
	}

	public void set(quickfix.ib.field.TimeInForce value) {
		setField(value);
	}

	public quickfix.ib.field.TimeInForce get(quickfix.ib.field.TimeInForce value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.TimeInForce getTimeInForce() throws FieldNotFound {
		return get(new quickfix.ib.field.TimeInForce());
	}

	public boolean isSet(quickfix.ib.field.TimeInForce field) {
		return isSetField(field);
	}

	public boolean isSetTimeInForce() {
		return isSetField(59);
	}

	public void set(quickfix.ib.field.Rule80A value) {
		setField(value);
	}

	public quickfix.ib.field.Rule80A get(quickfix.ib.field.Rule80A value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.Rule80A getRule80A() throws FieldNotFound {
		return get(new quickfix.ib.field.Rule80A());
	}

	public boolean isSet(quickfix.ib.field.Rule80A field) {
		return isSetField(field);
	}

	public boolean isSetRule80A() {
		return isSetField(47);
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

	public void set(quickfix.ib.field.ExpireTime value) {
		setField(value);
	}

	public quickfix.ib.field.ExpireTime get(quickfix.ib.field.ExpireTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ExpireTime getExpireTime() throws FieldNotFound {
		return get(new quickfix.ib.field.ExpireTime());
	}

	public boolean isSet(quickfix.ib.field.ExpireTime field) {
		return isSetField(field);
	}

	public boolean isSetExpireTime() {
		return isSetField(126);
	}

	public void set(quickfix.ib.field.ExpireDate value) {
		setField(value);
	}

	public quickfix.ib.field.ExpireDate get(quickfix.ib.field.ExpireDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ExpireDate getExpireDate() throws FieldNotFound {
		return get(new quickfix.ib.field.ExpireDate());
	}

	public boolean isSet(quickfix.ib.field.ExpireDate field) {
		return isSetField(field);
	}

	public boolean isSetExpireDate() {
		return isSetField(432);
	}

	public void set(quickfix.ib.field.ClearingFirm value) {
		setField(value);
	}

	public quickfix.ib.field.ClearingFirm get(quickfix.ib.field.ClearingFirm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ClearingFirm getClearingFirm() throws FieldNotFound {
		return get(new quickfix.ib.field.ClearingFirm());
	}

	public boolean isSet(quickfix.ib.field.ClearingFirm field) {
		return isSetField(field);
	}

	public boolean isSetClearingFirm() {
		return isSetField(439);
	}

	public void set(quickfix.ib.field.ClearingAccount value) {
		setField(value);
	}

	public quickfix.ib.field.ClearingAccount get(quickfix.ib.field.ClearingAccount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ClearingAccount getClearingAccount() throws FieldNotFound {
		return get(new quickfix.ib.field.ClearingAccount());
	}

	public boolean isSet(quickfix.ib.field.ClearingAccount field) {
		return isSetField(field);
	}

	public boolean isSetClearingAccount() {
		return isSetField(440);
	}

	public void set(quickfix.ib.field.OrderReferenceAccount value) {
		setField(value);
	}

	public quickfix.ib.field.OrderReferenceAccount get(quickfix.ib.field.OrderReferenceAccount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.OrderReferenceAccount getOrderReferenceAccount() throws FieldNotFound {
		return get(new quickfix.ib.field.OrderReferenceAccount());
	}

	public boolean isSet(quickfix.ib.field.OrderReferenceAccount field) {
		return isSetField(field);
	}

	public boolean isSetOrderReferenceAccount() {
		return isSetField(6010);
	}

	public void set(quickfix.ib.field.OptionOrigin value) {
		setField(value);
	}

	public quickfix.ib.field.OptionOrigin get(quickfix.ib.field.OptionOrigin value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.OptionOrigin getOptionOrigin() throws FieldNotFound {
		return get(new quickfix.ib.field.OptionOrigin());
	}

	public boolean isSet(quickfix.ib.field.OptionOrigin field) {
		return isSetField(field);
	}

	public boolean isSetOptionOrigin() {
		return isSetField(6037);
	}

	public void set(quickfix.ib.field.NoBarriers value) {
		setField(value);
	}

	public quickfix.ib.field.NoBarriers get(quickfix.ib.field.NoBarriers value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.NoBarriers getNoBarriers() throws FieldNotFound {
		return get(new quickfix.ib.field.NoBarriers());
	}

	public boolean isSet(quickfix.ib.field.NoBarriers field) {
		return isSetField(field);
	}

	public boolean isSetNoBarriers() {
		return isSetField(6257);
	}

	public void set(quickfix.ib.field.BarrierPrice value) {
		setField(value);
	}

	public quickfix.ib.field.BarrierPrice get(quickfix.ib.field.BarrierPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.BarrierPrice getBarrierPrice() throws FieldNotFound {
		return get(new quickfix.ib.field.BarrierPrice());
	}

	public boolean isSet(quickfix.ib.field.BarrierPrice field) {
		return isSetField(field);
	}

	public boolean isSetBarrierPrice() {
		return isSetField(6258);
	}

	public void set(quickfix.ib.field.BarrierStopPrice value) {
		setField(value);
	}

	public quickfix.ib.field.BarrierStopPrice get(quickfix.ib.field.BarrierStopPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.BarrierStopPrice getBarrierStopPrice() throws FieldNotFound {
		return get(new quickfix.ib.field.BarrierStopPrice());
	}

	public boolean isSet(quickfix.ib.field.BarrierStopPrice field) {
		return isSetField(field);
	}

	public boolean isSetBarrierStopPrice() {
		return isSetField(6259);
	}

	public void set(quickfix.ib.field.BarrierTrailingAmt value) {
		setField(value);
	}

	public quickfix.ib.field.BarrierTrailingAmt get(quickfix.ib.field.BarrierTrailingAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.BarrierTrailingAmt getBarrierTrailingAmt() throws FieldNotFound {
		return get(new quickfix.ib.field.BarrierTrailingAmt());
	}

	public boolean isSet(quickfix.ib.field.BarrierTrailingAmt field) {
		return isSetField(field);
	}

	public boolean isSetBarrierTrailingAmt() {
		return isSetField(6260);
	}

	public void set(quickfix.ib.field.BarrierPriceDelimiter value) {
		setField(value);
	}

	public quickfix.ib.field.BarrierPriceDelimiter get(quickfix.ib.field.BarrierPriceDelimiter value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.BarrierPriceDelimiter getBarrierPriceDelimiter() throws FieldNotFound {
		return get(new quickfix.ib.field.BarrierPriceDelimiter());
	}

	public boolean isSet(quickfix.ib.field.BarrierPriceDelimiter field) {
		return isSetField(field);
	}

	public boolean isSetBarrierPriceDelimiter() {
		return isSetField(6261);
	}

	public void set(quickfix.ib.field.BarrierLimitPrice value) {
		setField(value);
	}

	public quickfix.ib.field.BarrierLimitPrice get(quickfix.ib.field.BarrierLimitPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.BarrierLimitPrice getBarrierLimitPrice() throws FieldNotFound {
		return get(new quickfix.ib.field.BarrierLimitPrice());
	}

	public boolean isSet(quickfix.ib.field.BarrierLimitPrice field) {
		return isSetField(field);
	}

	public boolean isSetBarrierLimitPrice() {
		return isSetField(6262);
	}

	public void set(quickfix.ib.field.BarrierTrailingAmtUnit value) {
		setField(value);
	}

	public quickfix.ib.field.BarrierTrailingAmtUnit get(quickfix.ib.field.BarrierTrailingAmtUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.BarrierTrailingAmtUnit getBarrierTrailingAmtUnit() throws FieldNotFound {
		return get(new quickfix.ib.field.BarrierTrailingAmtUnit());
	}

	public boolean isSet(quickfix.ib.field.BarrierTrailingAmtUnit field) {
		return isSetField(field);
	}

	public boolean isSetBarrierTrailingAmtUnit() {
		return isSetField(6269);
	}

}
