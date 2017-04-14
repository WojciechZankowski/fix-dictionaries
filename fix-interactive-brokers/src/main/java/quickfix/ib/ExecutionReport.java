
package quickfix.ib;

import quickfix.FieldNotFound;


public class ExecutionReport extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "8";
	

	public ExecutionReport() {
		super();
		getHeader().setField(new quickfix.ib.field.MsgType(MSGTYPE));
	}
	
	public ExecutionReport(quickfix.ib.field.OrderID orderID, quickfix.ib.field.ExecID execID, quickfix.ib.field.ExecTransType execTransType, quickfix.ib.field.OrdStatus ordStatus, quickfix.ib.field.ExecType execType, quickfix.ib.field.LeavesQty leavesQty, quickfix.ib.field.Symbol symbol, quickfix.ib.field.Side side, quickfix.ib.field.OrderQty orderQty, quickfix.ib.field.LastShares lastShares, quickfix.ib.field.LastPx lastPx, quickfix.ib.field.CumQty cumQty, quickfix.ib.field.AvgPx avgPx, quickfix.ib.field.ClearingFirm clearingFirm) {
		this();
		setField(orderID);
		setField(execID);
		setField(execTransType);
		setField(ordStatus);
		setField(execType);
		setField(leavesQty);
		setField(symbol);
		setField(side);
		setField(orderQty);
		setField(lastShares);
		setField(lastPx);
		setField(cumQty);
		setField(avgPx);
		setField(clearingFirm);
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

	public void set(quickfix.ib.field.ExecID value) {
		setField(value);
	}

	public quickfix.ib.field.ExecID get(quickfix.ib.field.ExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ExecID getExecID() throws FieldNotFound {
		return get(new quickfix.ib.field.ExecID());
	}

	public boolean isSet(quickfix.ib.field.ExecID field) {
		return isSetField(field);
	}

	public boolean isSetExecID() {
		return isSetField(17);
	}

	public void set(quickfix.ib.field.ExecTransType value) {
		setField(value);
	}

	public quickfix.ib.field.ExecTransType get(quickfix.ib.field.ExecTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ExecTransType getExecTransType() throws FieldNotFound {
		return get(new quickfix.ib.field.ExecTransType());
	}

	public boolean isSet(quickfix.ib.field.ExecTransType field) {
		return isSetField(field);
	}

	public boolean isSetExecTransType() {
		return isSetField(20);
	}

	public void set(quickfix.ib.field.ExecRefID value) {
		setField(value);
	}

	public quickfix.ib.field.ExecRefID get(quickfix.ib.field.ExecRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ExecRefID getExecRefID() throws FieldNotFound {
		return get(new quickfix.ib.field.ExecRefID());
	}

	public boolean isSet(quickfix.ib.field.ExecRefID field) {
		return isSetField(field);
	}

	public boolean isSetExecRefID() {
		return isSetField(19);
	}

	public void set(quickfix.ib.field.OrdStatus value) {
		setField(value);
	}

	public quickfix.ib.field.OrdStatus get(quickfix.ib.field.OrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.OrdStatus getOrdStatus() throws FieldNotFound {
		return get(new quickfix.ib.field.OrdStatus());
	}

	public boolean isSet(quickfix.ib.field.OrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatus() {
		return isSetField(39);
	}

	public void set(quickfix.ib.field.OrdRejReason value) {
		setField(value);
	}

	public quickfix.ib.field.OrdRejReason get(quickfix.ib.field.OrdRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.OrdRejReason getOrdRejReason() throws FieldNotFound {
		return get(new quickfix.ib.field.OrdRejReason());
	}

	public boolean isSet(quickfix.ib.field.OrdRejReason field) {
		return isSetField(field);
	}

	public boolean isSetOrdRejReason() {
		return isSetField(103);
	}

	public void set(quickfix.ib.field.ExecType value) {
		setField(value);
	}

	public quickfix.ib.field.ExecType get(quickfix.ib.field.ExecType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ExecType getExecType() throws FieldNotFound {
		return get(new quickfix.ib.field.ExecType());
	}

	public boolean isSet(quickfix.ib.field.ExecType field) {
		return isSetField(field);
	}

	public boolean isSetExecType() {
		return isSetField(150);
	}

	public void set(quickfix.ib.field.LeavesQty value) {
		setField(value);
	}

	public quickfix.ib.field.LeavesQty get(quickfix.ib.field.LeavesQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.LeavesQty getLeavesQty() throws FieldNotFound {
		return get(new quickfix.ib.field.LeavesQty());
	}

	public boolean isSet(quickfix.ib.field.LeavesQty field) {
		return isSetField(field);
	}

	public boolean isSetLeavesQty() {
		return isSetField(151);
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

	public void set(quickfix.ib.field.LastShares value) {
		setField(value);
	}

	public quickfix.ib.field.LastShares get(quickfix.ib.field.LastShares value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.LastShares getLastShares() throws FieldNotFound {
		return get(new quickfix.ib.field.LastShares());
	}

	public boolean isSet(quickfix.ib.field.LastShares field) {
		return isSetField(field);
	}

	public boolean isSetLastShares() {
		return isSetField(32);
	}

	public void set(quickfix.ib.field.LastPx value) {
		setField(value);
	}

	public quickfix.ib.field.LastPx get(quickfix.ib.field.LastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.LastPx getLastPx() throws FieldNotFound {
		return get(new quickfix.ib.field.LastPx());
	}

	public boolean isSet(quickfix.ib.field.LastPx field) {
		return isSetField(field);
	}

	public boolean isSetLastPx() {
		return isSetField(31);
	}

	public void set(quickfix.ib.field.CumQty value) {
		setField(value);
	}

	public quickfix.ib.field.CumQty get(quickfix.ib.field.CumQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.CumQty getCumQty() throws FieldNotFound {
		return get(new quickfix.ib.field.CumQty());
	}

	public boolean isSet(quickfix.ib.field.CumQty field) {
		return isSetField(field);
	}

	public boolean isSetCumQty() {
		return isSetField(14);
	}

	public void set(quickfix.ib.field.AvgPx value) {
		setField(value);
	}

	public quickfix.ib.field.AvgPx get(quickfix.ib.field.AvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.AvgPx getAvgPx() throws FieldNotFound {
		return get(new quickfix.ib.field.AvgPx());
	}

	public boolean isSet(quickfix.ib.field.AvgPx field) {
		return isSetField(field);
	}

	public boolean isSetAvgPx() {
		return isSetField(6);
	}

	public void set(quickfix.ib.field.TransactTime value) {
		setField(value);
	}

	public quickfix.ib.field.TransactTime get(quickfix.ib.field.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.TransactTime getTransactTime() throws FieldNotFound {
		return get(new quickfix.ib.field.TransactTime());
	}

	public boolean isSet(quickfix.ib.field.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
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

	public void set(quickfix.ib.field.SecurityType value) {
		setField(value);
	}

	public quickfix.ib.field.SecurityType get(quickfix.ib.field.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.SecurityType getSecurityType() throws FieldNotFound {
		return get(new quickfix.ib.field.SecurityType());
	}

	public boolean isSet(quickfix.ib.field.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(quickfix.ib.field.PutOrCall value) {
		setField(value);
	}

	public quickfix.ib.field.PutOrCall get(quickfix.ib.field.PutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.PutOrCall getPutOrCall() throws FieldNotFound {
		return get(new quickfix.ib.field.PutOrCall());
	}

	public boolean isSet(quickfix.ib.field.PutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetPutOrCall() {
		return isSetField(201);
	}

	public void set(quickfix.ib.field.StrikePrice value) {
		setField(value);
	}

	public quickfix.ib.field.StrikePrice get(quickfix.ib.field.StrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.StrikePrice getStrikePrice() throws FieldNotFound {
		return get(new quickfix.ib.field.StrikePrice());
	}

	public boolean isSet(quickfix.ib.field.StrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetStrikePrice() {
		return isSetField(202);
	}

	public void set(quickfix.ib.field.MaturityMonthYear value) {
		setField(value);
	}

	public quickfix.ib.field.MaturityMonthYear get(quickfix.ib.field.MaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.ib.field.MaturityMonthYear());
	}

	public boolean isSet(quickfix.ib.field.MaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYear() {
		return isSetField(200);
	}

	public void set(quickfix.ib.field.MaturityDay value) {
		setField(value);
	}

	public quickfix.ib.field.MaturityDay get(quickfix.ib.field.MaturityDay value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.MaturityDay getMaturityDay() throws FieldNotFound {
		return get(new quickfix.ib.field.MaturityDay());
	}

	public boolean isSet(quickfix.ib.field.MaturityDay field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDay() {
		return isSetField(205);
	}

	public void set(quickfix.ib.field.SecurityExchange value) {
		setField(value);
	}

	public quickfix.ib.field.SecurityExchange get(quickfix.ib.field.SecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
		return get(new quickfix.ib.field.SecurityExchange());
	}

	public boolean isSet(quickfix.ib.field.SecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetSecurityExchange() {
		return isSetField(207);
	}

	public void set(quickfix.ib.field.ExDestination value) {
		setField(value);
	}

	public quickfix.ib.field.ExDestination get(quickfix.ib.field.ExDestination value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ExDestination getExDestination() throws FieldNotFound {
		return get(new quickfix.ib.field.ExDestination());
	}

	public boolean isSet(quickfix.ib.field.ExDestination field) {
		return isSetField(field);
	}

	public boolean isSetExDestination() {
		return isSetField(100);
	}

	public void set(quickfix.ib.field.LastMkt value) {
		setField(value);
	}

	public quickfix.ib.field.LastMkt get(quickfix.ib.field.LastMkt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.LastMkt getLastMkt() throws FieldNotFound {
		return get(new quickfix.ib.field.LastMkt());
	}

	public boolean isSet(quickfix.ib.field.LastMkt field) {
		return isSetField(field);
	}

	public boolean isSetLastMkt() {
		return isSetField(30);
	}

	public void set(quickfix.ib.field.CustomerOrFirm value) {
		setField(value);
	}

	public quickfix.ib.field.CustomerOrFirm get(quickfix.ib.field.CustomerOrFirm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.CustomerOrFirm getCustomerOrFirm() throws FieldNotFound {
		return get(new quickfix.ib.field.CustomerOrFirm());
	}

	public boolean isSet(quickfix.ib.field.CustomerOrFirm field) {
		return isSetField(field);
	}

	public boolean isSetCustomerOrFirm() {
		return isSetField(204);
	}

	public void set(quickfix.ib.field.ComboLegInformation value) {
		setField(value);
	}

	public quickfix.ib.field.ComboLegInformation get(quickfix.ib.field.ComboLegInformation value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ComboLegInformation getComboLegInformation() throws FieldNotFound {
		return get(new quickfix.ib.field.ComboLegInformation());
	}

	public boolean isSet(quickfix.ib.field.ComboLegInformation field) {
		return isSetField(field);
	}

	public boolean isSetComboLegInformation() {
		return isSetField(6013);
	}

	public void set(quickfix.ib.field.PipExchanges value) {
		setField(value);
	}

	public quickfix.ib.field.PipExchanges get(quickfix.ib.field.PipExchanges value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.PipExchanges getPipExchanges() throws FieldNotFound {
		return get(new quickfix.ib.field.PipExchanges());
	}

	public boolean isSet(quickfix.ib.field.PipExchanges field) {
		return isSetField(field);
	}

	public boolean isSetPipExchanges() {
		return isSetField(6273);
	}

}
