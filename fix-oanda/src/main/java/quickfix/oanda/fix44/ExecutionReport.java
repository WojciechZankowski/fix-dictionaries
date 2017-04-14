
package quickfix.oanda.fix44;

import quickfix.FieldNotFound;


public class ExecutionReport extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "8";
	

	public ExecutionReport() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public ExecutionReport(quickfix.oanda.field.OrderID orderID, quickfix.oanda.field.ExecID execID, quickfix.oanda.field.ExecTransType execTransType, quickfix.oanda.field.ExecType execType, quickfix.oanda.field.OrdStatus ordStatus, quickfix.oanda.field.Symbol symbol, quickfix.oanda.field.Side side, quickfix.oanda.field.LeavesQty leavesQty, quickfix.oanda.field.CumQty cumQty, quickfix.oanda.field.AvgPx avgPx) {
		this();
		setField(orderID);
		setField(execID);
		setField(execTransType);
		setField(execType);
		setField(ordStatus);
		setField(symbol);
		setField(side);
		setField(leavesQty);
		setField(cumQty);
		setField(avgPx);
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

	public void set(quickfix.oanda.field.ExecID value) {
		setField(value);
	}

	public quickfix.oanda.field.ExecID get(quickfix.oanda.field.ExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.ExecID getExecID() throws FieldNotFound {
		return get(new quickfix.oanda.field.ExecID());
	}

	public boolean isSet(quickfix.oanda.field.ExecID field) {
		return isSetField(field);
	}

	public boolean isSetExecID() {
		return isSetField(17);
	}

	public void set(quickfix.oanda.field.ExecTransType value) {
		setField(value);
	}

	public quickfix.oanda.field.ExecTransType get(quickfix.oanda.field.ExecTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.ExecTransType getExecTransType() throws FieldNotFound {
		return get(new quickfix.oanda.field.ExecTransType());
	}

	public boolean isSet(quickfix.oanda.field.ExecTransType field) {
		return isSetField(field);
	}

	public boolean isSetExecTransType() {
		return isSetField(20);
	}

	public void set(quickfix.oanda.field.ExecType value) {
		setField(value);
	}

	public quickfix.oanda.field.ExecType get(quickfix.oanda.field.ExecType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.ExecType getExecType() throws FieldNotFound {
		return get(new quickfix.oanda.field.ExecType());
	}

	public boolean isSet(quickfix.oanda.field.ExecType field) {
		return isSetField(field);
	}

	public boolean isSetExecType() {
		return isSetField(150);
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

	public void set(quickfix.oanda.field.OrdRejReason value) {
		setField(value);
	}

	public quickfix.oanda.field.OrdRejReason get(quickfix.oanda.field.OrdRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.OrdRejReason getOrdRejReason() throws FieldNotFound {
		return get(new quickfix.oanda.field.OrdRejReason());
	}

	public boolean isSet(quickfix.oanda.field.OrdRejReason field) {
		return isSetField(field);
	}

	public boolean isSetOrdRejReason() {
		return isSetField(103);
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

	public void set(quickfix.oanda.field.CFICode value) {
		setField(value);
	}

	public quickfix.oanda.field.CFICode get(quickfix.oanda.field.CFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.CFICode getCFICode() throws FieldNotFound {
		return get(new quickfix.oanda.field.CFICode());
	}

	public boolean isSet(quickfix.oanda.field.CFICode field) {
		return isSetField(field);
	}

	public boolean isSetCFICode() {
		return isSetField(461);
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

	public void set(quickfix.oanda.field.LastShares value) {
		setField(value);
	}

	public quickfix.oanda.field.LastShares get(quickfix.oanda.field.LastShares value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.LastShares getLastShares() throws FieldNotFound {
		return get(new quickfix.oanda.field.LastShares());
	}

	public boolean isSet(quickfix.oanda.field.LastShares field) {
		return isSetField(field);
	}

	public boolean isSetLastShares() {
		return isSetField(32);
	}

	public void set(quickfix.oanda.field.LastPx value) {
		setField(value);
	}

	public quickfix.oanda.field.LastPx get(quickfix.oanda.field.LastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.LastPx getLastPx() throws FieldNotFound {
		return get(new quickfix.oanda.field.LastPx());
	}

	public boolean isSet(quickfix.oanda.field.LastPx field) {
		return isSetField(field);
	}

	public boolean isSetLastPx() {
		return isSetField(31);
	}

	public void set(quickfix.oanda.field.LeavesQty value) {
		setField(value);
	}

	public quickfix.oanda.field.LeavesQty get(quickfix.oanda.field.LeavesQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.LeavesQty getLeavesQty() throws FieldNotFound {
		return get(new quickfix.oanda.field.LeavesQty());
	}

	public boolean isSet(quickfix.oanda.field.LeavesQty field) {
		return isSetField(field);
	}

	public boolean isSetLeavesQty() {
		return isSetField(151);
	}

	public void set(quickfix.oanda.field.CumQty value) {
		setField(value);
	}

	public quickfix.oanda.field.CumQty get(quickfix.oanda.field.CumQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.CumQty getCumQty() throws FieldNotFound {
		return get(new quickfix.oanda.field.CumQty());
	}

	public boolean isSet(quickfix.oanda.field.CumQty field) {
		return isSetField(field);
	}

	public boolean isSetCumQty() {
		return isSetField(14);
	}

	public void set(quickfix.oanda.field.AvgPx value) {
		setField(value);
	}

	public quickfix.oanda.field.AvgPx get(quickfix.oanda.field.AvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.AvgPx getAvgPx() throws FieldNotFound {
		return get(new quickfix.oanda.field.AvgPx());
	}

	public boolean isSet(quickfix.oanda.field.AvgPx field) {
		return isSetField(field);
	}

	public boolean isSetAvgPx() {
		return isSetField(6);
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
