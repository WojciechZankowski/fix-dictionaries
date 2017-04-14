
package quickfix.tt;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ExecutionReport extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "8";
	

	public ExecutionReport() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public ExecutionReport(quickfix.tt.field.ExecID execID, quickfix.tt.field.OrderID orderID, quickfix.tt.field.ExecType execType, quickfix.tt.field.OrdStatus ordStatus, quickfix.tt.field.LeavesQty leavesQty, quickfix.tt.field.CumQty cumQty, quickfix.tt.field.ExecTransType execTransType, quickfix.tt.field.AvgPx avgPx, quickfix.tt.field.TransactTime transactTime) {
		this();
		setField(execID);
		setField(orderID);
		setField(execType);
		setField(ordStatus);
		setField(leavesQty);
		setField(cumQty);
		setField(execTransType);
		setField(avgPx);
		setField(transactTime);
	}
	
	public void set(quickfix.tt.field.ExecID value) {
		setField(value);
	}

	public quickfix.tt.field.ExecID get(quickfix.tt.field.ExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExecID getExecID() throws FieldNotFound {
		return get(new quickfix.tt.field.ExecID());
	}

	public boolean isSet(quickfix.tt.field.ExecID field) {
		return isSetField(field);
	}

	public boolean isSetExecID() {
		return isSetField(17);
	}

	public void set(quickfix.tt.field.SecondaryExecID value) {
		setField(value);
	}

	public quickfix.tt.field.SecondaryExecID get(quickfix.tt.field.SecondaryExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecondaryExecID getSecondaryExecID() throws FieldNotFound {
		return get(new quickfix.tt.field.SecondaryExecID());
	}

	public boolean isSet(quickfix.tt.field.SecondaryExecID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryExecID() {
		return isSetField(10527);
	}

	public void set(quickfix.tt.field.OrderID value) {
		setField(value);
	}

	public quickfix.tt.field.OrderID get(quickfix.tt.field.OrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrderID getOrderID() throws FieldNotFound {
		return get(new quickfix.tt.field.OrderID());
	}

	public boolean isSet(quickfix.tt.field.OrderID field) {
		return isSetField(field);
	}

	public boolean isSetOrderID() {
		return isSetField(37);
	}

	public void set(quickfix.tt.field.SecondaryOrderID value) {
		setField(value);
	}

	public quickfix.tt.field.SecondaryOrderID get(quickfix.tt.field.SecondaryOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound {
		return get(new quickfix.tt.field.SecondaryOrderID());
	}

	public boolean isSet(quickfix.tt.field.SecondaryOrderID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryOrderID() {
		return isSetField(198);
	}

	public void set(quickfix.tt.field.ClOrdID value) {
		setField(value);
	}

	public quickfix.tt.field.ClOrdID get(quickfix.tt.field.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new quickfix.tt.field.ClOrdID());
	}

	public boolean isSet(quickfix.tt.field.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

	public void set(quickfix.tt.field.ExecType value) {
		setField(value);
	}

	public quickfix.tt.field.ExecType get(quickfix.tt.field.ExecType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExecType getExecType() throws FieldNotFound {
		return get(new quickfix.tt.field.ExecType());
	}

	public boolean isSet(quickfix.tt.field.ExecType field) {
		return isSetField(field);
	}

	public boolean isSetExecType() {
		return isSetField(150);
	}

	public void set(quickfix.tt.field.OrigClOrdID value) {
		setField(value);
	}

	public quickfix.tt.field.OrigClOrdID get(quickfix.tt.field.OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		return get(new quickfix.tt.field.OrigClOrdID());
	}

	public boolean isSet(quickfix.tt.field.OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(41);
	}

	public void set(quickfix.tt.field.OrdRejReason value) {
		setField(value);
	}

	public quickfix.tt.field.OrdRejReason get(quickfix.tt.field.OrdRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrdRejReason getOrdRejReason() throws FieldNotFound {
		return get(new quickfix.tt.field.OrdRejReason());
	}

	public boolean isSet(quickfix.tt.field.OrdRejReason field) {
		return isSetField(field);
	}

	public boolean isSetOrdRejReason() {
		return isSetField(103);
	}

	public void set(quickfix.tt.field.LastShares value) {
		setField(value);
	}

	public quickfix.tt.field.LastShares get(quickfix.tt.field.LastShares value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.LastShares getLastShares() throws FieldNotFound {
		return get(new quickfix.tt.field.LastShares());
	}

	public boolean isSet(quickfix.tt.field.LastShares field) {
		return isSetField(field);
	}

	public boolean isSetLastShares() {
		return isSetField(32);
	}

	public void set(quickfix.tt.field.MultiLegReportingType value) {
		setField(value);
	}

	public quickfix.tt.field.MultiLegReportingType get(quickfix.tt.field.MultiLegReportingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MultiLegReportingType getMultiLegReportingType() throws FieldNotFound {
		return get(new quickfix.tt.field.MultiLegReportingType());
	}

	public boolean isSet(quickfix.tt.field.MultiLegReportingType field) {
		return isSetField(field);
	}

	public boolean isSetMultiLegReportingType() {
		return isSetField(442);
	}

	public void set(quickfix.tt.field.OrdStatus value) {
		setField(value);
	}

	public quickfix.tt.field.OrdStatus get(quickfix.tt.field.OrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrdStatus getOrdStatus() throws FieldNotFound {
		return get(new quickfix.tt.field.OrdStatus());
	}

	public boolean isSet(quickfix.tt.field.OrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatus() {
		return isSetField(39);
	}

	public void set(quickfix.tt.field.LeavesQty value) {
		setField(value);
	}

	public quickfix.tt.field.LeavesQty get(quickfix.tt.field.LeavesQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.LeavesQty getLeavesQty() throws FieldNotFound {
		return get(new quickfix.tt.field.LeavesQty());
	}

	public boolean isSet(quickfix.tt.field.LeavesQty field) {
		return isSetField(field);
	}

	public boolean isSetLeavesQty() {
		return isSetField(151);
	}

	public void set(quickfix.tt.field.CumQty value) {
		setField(value);
	}

	public quickfix.tt.field.CumQty get(quickfix.tt.field.CumQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.CumQty getCumQty() throws FieldNotFound {
		return get(new quickfix.tt.field.CumQty());
	}

	public boolean isSet(quickfix.tt.field.CumQty field) {
		return isSetField(field);
	}

	public boolean isSetCumQty() {
		return isSetField(14);
	}

	public void set(quickfix.tt.field.Text value) {
		setField(value);
	}

	public quickfix.tt.field.Text get(quickfix.tt.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Text getText() throws FieldNotFound {
		return get(new quickfix.tt.field.Text());
	}

	public boolean isSet(quickfix.tt.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

	public void set(quickfix.tt.field.ExecRefID value) {
		setField(value);
	}

	public quickfix.tt.field.ExecRefID get(quickfix.tt.field.ExecRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExecRefID getExecRefID() throws FieldNotFound {
		return get(new quickfix.tt.field.ExecRefID());
	}

	public boolean isSet(quickfix.tt.field.ExecRefID field) {
		return isSetField(field);
	}

	public boolean isSetExecRefID() {
		return isSetField(19);
	}

	public void set(quickfix.tt.field.ExecTransType value) {
		setField(value);
	}

	public quickfix.tt.field.ExecTransType get(quickfix.tt.field.ExecTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExecTransType getExecTransType() throws FieldNotFound {
		return get(new quickfix.tt.field.ExecTransType());
	}

	public boolean isSet(quickfix.tt.field.ExecTransType field) {
		return isSetField(field);
	}

	public boolean isSetExecTransType() {
		return isSetField(20);
	}

	public void set(quickfix.tt.field.OrigExecID value) {
		setField(value);
	}

	public quickfix.tt.field.OrigExecID get(quickfix.tt.field.OrigExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrigExecID getOrigExecID() throws FieldNotFound {
		return get(new quickfix.tt.field.OrigExecID());
	}

	public boolean isSet(quickfix.tt.field.OrigExecID field) {
		return isSetField(field);
	}

	public boolean isSetOrigExecID() {
		return isSetField(16017);
	}

	public void set(quickfix.tt.field.TTSessionID value) {
		setField(value);
	}

	public quickfix.tt.field.TTSessionID get(quickfix.tt.field.TTSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TTSessionID getTTSessionID() throws FieldNotFound {
		return get(new quickfix.tt.field.TTSessionID());
	}

	public boolean isSet(quickfix.tt.field.TTSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTTSessionID() {
		return isSetField(16018);
	}

	public void set(quickfix.tt.field.TotalNumOrders value) {
		setField(value);
	}

	public quickfix.tt.field.TotalNumOrders get(quickfix.tt.field.TotalNumOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TotalNumOrders getTotalNumOrders() throws FieldNotFound {
		return get(new quickfix.tt.field.TotalNumOrders());
	}

	public boolean isSet(quickfix.tt.field.TotalNumOrders field) {
		return isSetField(field);
	}

	public boolean isSetTotalNumOrders() {
		return isSetField(16728);
	}

	public void set(quickfix.tt.field.Symbol value) {
		setField(value);
	}

	public quickfix.tt.field.Symbol get(quickfix.tt.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.tt.field.Symbol());
	}

	public boolean isSet(quickfix.tt.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(quickfix.tt.field.SecurityType value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityType get(quickfix.tt.field.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityType getSecurityType() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityType());
	}

	public boolean isSet(quickfix.tt.field.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(quickfix.tt.field.MaturityMonthYear value) {
		setField(value);
	}

	public quickfix.tt.field.MaturityMonthYear get(quickfix.tt.field.MaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.tt.field.MaturityMonthYear());
	}

	public boolean isSet(quickfix.tt.field.MaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYear() {
		return isSetField(200);
	}

	public void set(quickfix.tt.field.MaturityDay value) {
		setField(value);
	}

	public quickfix.tt.field.MaturityDay get(quickfix.tt.field.MaturityDay value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MaturityDay getMaturityDay() throws FieldNotFound {
		return get(new quickfix.tt.field.MaturityDay());
	}

	public boolean isSet(quickfix.tt.field.MaturityDay field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDay() {
		return isSetField(205);
	}

	public void set(quickfix.tt.field.PutOrCall value) {
		setField(value);
	}

	public quickfix.tt.field.PutOrCall get(quickfix.tt.field.PutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.PutOrCall getPutOrCall() throws FieldNotFound {
		return get(new quickfix.tt.field.PutOrCall());
	}

	public boolean isSet(quickfix.tt.field.PutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetPutOrCall() {
		return isSetField(201);
	}

	public void set(quickfix.tt.field.StrikePrice value) {
		setField(value);
	}

	public quickfix.tt.field.StrikePrice get(quickfix.tt.field.StrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.StrikePrice getStrikePrice() throws FieldNotFound {
		return get(new quickfix.tt.field.StrikePrice());
	}

	public boolean isSet(quickfix.tt.field.StrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetStrikePrice() {
		return isSetField(202);
	}

	public void set(quickfix.tt.field.OptAttribute value) {
		setField(value);
	}

	public quickfix.tt.field.OptAttribute get(quickfix.tt.field.OptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OptAttribute getOptAttribute() throws FieldNotFound {
		return get(new quickfix.tt.field.OptAttribute());
	}

	public boolean isSet(quickfix.tt.field.OptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetOptAttribute() {
		return isSetField(206);
	}

	public void set(quickfix.tt.field.SecurityID value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityID get(quickfix.tt.field.SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityID getSecurityID() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityID());
	}

	public boolean isSet(quickfix.tt.field.SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(48);
	}

	public void set(quickfix.tt.field.SecurityAltID value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityAltID get(quickfix.tt.field.SecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityAltID getSecurityAltID() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityAltID());
	}

	public boolean isSet(quickfix.tt.field.SecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltID() {
		return isSetField(10455);
	}

	public void set(quickfix.tt.field.SecurityExchange value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityExchange get(quickfix.tt.field.SecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityExchange());
	}

	public boolean isSet(quickfix.tt.field.SecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetSecurityExchange() {
		return isSetField(207);
	}

	public void set(quickfix.tt.field.DeliveryTerm value) {
		setField(value);
	}

	public quickfix.tt.field.DeliveryTerm get(quickfix.tt.field.DeliveryTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.DeliveryTerm getDeliveryTerm() throws FieldNotFound {
		return get(new quickfix.tt.field.DeliveryTerm());
	}

	public boolean isSet(quickfix.tt.field.DeliveryTerm field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryTerm() {
		return isSetField(18211);
	}

	public void set(quickfix.tt.field.SettlType value) {
		setField(value);
	}

	public quickfix.tt.field.SettlType get(quickfix.tt.field.SettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SettlType getSettlType() throws FieldNotFound {
		return get(new quickfix.tt.field.SettlType());
	}

	public boolean isSet(quickfix.tt.field.SettlType field) {
		return isSetField(field);
	}

	public boolean isSetSettlType() {
		return isSetField(63);
	}

	public void set(quickfix.tt.field.Account value) {
		setField(value);
	}

	public quickfix.tt.field.Account get(quickfix.tt.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Account getAccount() throws FieldNotFound {
		return get(new quickfix.tt.field.Account());
	}

	public boolean isSet(quickfix.tt.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(quickfix.tt.field.ClearingAccount value) {
		setField(value);
	}

	public quickfix.tt.field.ClearingAccount get(quickfix.tt.field.ClearingAccount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ClearingAccount getClearingAccount() throws FieldNotFound {
		return get(new quickfix.tt.field.ClearingAccount());
	}

	public boolean isSet(quickfix.tt.field.ClearingAccount field) {
		return isSetField(field);
	}

	public boolean isSetClearingAccount() {
		return isSetField(440);
	}

	public void set(quickfix.tt.field.FFT2 value) {
		setField(value);
	}

	public quickfix.tt.field.FFT2 get(quickfix.tt.field.FFT2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.FFT2 getFFT2() throws FieldNotFound {
		return get(new quickfix.tt.field.FFT2());
	}

	public boolean isSet(quickfix.tt.field.FFT2 field) {
		return isSetField(field);
	}

	public boolean isSetFFT2() {
		return isSetField(16102);
	}

	public void set(quickfix.tt.field.FFT3 value) {
		setField(value);
	}

	public quickfix.tt.field.FFT3 get(quickfix.tt.field.FFT3 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.FFT3 getFFT3() throws FieldNotFound {
		return get(new quickfix.tt.field.FFT3());
	}

	public boolean isSet(quickfix.tt.field.FFT3 field) {
		return isSetField(field);
	}

	public boolean isSetFFT3() {
		return isSetField(16103);
	}

	public void set(quickfix.tt.field.Rule80A value) {
		setField(value);
	}

	public quickfix.tt.field.Rule80A get(quickfix.tt.field.Rule80A value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Rule80A getRule80A() throws FieldNotFound {
		return get(new quickfix.tt.field.Rule80A());
	}

	public boolean isSet(quickfix.tt.field.Rule80A field) {
		return isSetField(field);
	}

	public boolean isSetRule80A() {
		return isSetField(47);
	}

	public void set(quickfix.tt.field.CustomerOrFirm value) {
		setField(value);
	}

	public quickfix.tt.field.CustomerOrFirm get(quickfix.tt.field.CustomerOrFirm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.CustomerOrFirm getCustomerOrFirm() throws FieldNotFound {
		return get(new quickfix.tt.field.CustomerOrFirm());
	}

	public boolean isSet(quickfix.tt.field.CustomerOrFirm field) {
		return isSetField(field);
	}

	public boolean isSetCustomerOrFirm() {
		return isSetField(204);
	}

	public void set(quickfix.tt.field.Price value) {
		setField(value);
	}

	public quickfix.tt.field.Price get(quickfix.tt.field.Price value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Price getPrice() throws FieldNotFound {
		return get(new quickfix.tt.field.Price());
	}

	public boolean isSet(quickfix.tt.field.Price field) {
		return isSetField(field);
	}

	public boolean isSetPrice() {
		return isSetField(44);
	}

	public void set(quickfix.tt.field.StopPx value) {
		setField(value);
	}

	public quickfix.tt.field.StopPx get(quickfix.tt.field.StopPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.StopPx getStopPx() throws FieldNotFound {
		return get(new quickfix.tt.field.StopPx());
	}

	public boolean isSet(quickfix.tt.field.StopPx field) {
		return isSetField(field);
	}

	public boolean isSetStopPx() {
		return isSetField(99);
	}

	public void set(quickfix.tt.field.OrderQty value) {
		setField(value);
	}

	public quickfix.tt.field.OrderQty get(quickfix.tt.field.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrderQty getOrderQty() throws FieldNotFound {
		return get(new quickfix.tt.field.OrderQty());
	}

	public boolean isSet(quickfix.tt.field.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
	}

	public void set(quickfix.tt.field.MinQty value) {
		setField(value);
	}

	public quickfix.tt.field.MinQty get(quickfix.tt.field.MinQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MinQty getMinQty() throws FieldNotFound {
		return get(new quickfix.tt.field.MinQty());
	}

	public boolean isSet(quickfix.tt.field.MinQty field) {
		return isSetField(field);
	}

	public boolean isSetMinQty() {
		return isSetField(110);
	}

	public void set(quickfix.tt.field.MaxShow value) {
		setField(value);
	}

	public quickfix.tt.field.MaxShow get(quickfix.tt.field.MaxShow value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MaxShow getMaxShow() throws FieldNotFound {
		return get(new quickfix.tt.field.MaxShow());
	}

	public boolean isSet(quickfix.tt.field.MaxShow field) {
		return isSetField(field);
	}

	public boolean isSetMaxShow() {
		return isSetField(210);
	}

	public void set(quickfix.tt.field.Side value) {
		setField(value);
	}

	public quickfix.tt.field.Side get(quickfix.tt.field.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Side getSide() throws FieldNotFound {
		return get(new quickfix.tt.field.Side());
	}

	public boolean isSet(quickfix.tt.field.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
	}

	public void set(quickfix.tt.field.OrdType value) {
		setField(value);
	}

	public quickfix.tt.field.OrdType get(quickfix.tt.field.OrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrdType getOrdType() throws FieldNotFound {
		return get(new quickfix.tt.field.OrdType());
	}

	public boolean isSet(quickfix.tt.field.OrdType field) {
		return isSetField(field);
	}

	public boolean isSetOrdType() {
		return isSetField(40);
	}

	public void set(quickfix.tt.field.OpenClose value) {
		setField(value);
	}

	public quickfix.tt.field.OpenClose get(quickfix.tt.field.OpenClose value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OpenClose getOpenClose() throws FieldNotFound {
		return get(new quickfix.tt.field.OpenClose());
	}

	public boolean isSet(quickfix.tt.field.OpenClose field) {
		return isSetField(field);
	}

	public boolean isSetOpenClose() {
		return isSetField(77);
	}

	public void set(quickfix.tt.field.TimeInForce value) {
		setField(value);
	}

	public quickfix.tt.field.TimeInForce get(quickfix.tt.field.TimeInForce value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TimeInForce getTimeInForce() throws FieldNotFound {
		return get(new quickfix.tt.field.TimeInForce());
	}

	public boolean isSet(quickfix.tt.field.TimeInForce field) {
		return isSetField(field);
	}

	public boolean isSetTimeInForce() {
		return isSetField(59);
	}

	public void set(quickfix.tt.field.ContraBroker value) {
		setField(value);
	}

	public quickfix.tt.field.ContraBroker get(quickfix.tt.field.ContraBroker value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ContraBroker getContraBroker() throws FieldNotFound {
		return get(new quickfix.tt.field.ContraBroker());
	}

	public boolean isSet(quickfix.tt.field.ContraBroker field) {
		return isSetField(field);
	}

	public boolean isSetContraBroker() {
		return isSetField(375);
	}

	public void set(quickfix.tt.field.ExecBroker value) {
		setField(value);
	}

	public quickfix.tt.field.ExecBroker get(quickfix.tt.field.ExecBroker value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExecBroker getExecBroker() throws FieldNotFound {
		return get(new quickfix.tt.field.ExecBroker());
	}

	public boolean isSet(quickfix.tt.field.ExecBroker field) {
		return isSetField(field);
	}

	public boolean isSetExecBroker() {
		return isSetField(76);
	}

	public void set(quickfix.tt.field.ExpireDate value) {
		setField(value);
	}

	public quickfix.tt.field.ExpireDate get(quickfix.tt.field.ExpireDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExpireDate getExpireDate() throws FieldNotFound {
		return get(new quickfix.tt.field.ExpireDate());
	}

	public boolean isSet(quickfix.tt.field.ExpireDate field) {
		return isSetField(field);
	}

	public boolean isSetExpireDate() {
		return isSetField(432);
	}

	public void set(quickfix.tt.field.ExecRestatementReason value) {
		setField(value);
	}

	public quickfix.tt.field.ExecRestatementReason get(quickfix.tt.field.ExecRestatementReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExecRestatementReason getExecRestatementReason() throws FieldNotFound {
		return get(new quickfix.tt.field.ExecRestatementReason());
	}

	public boolean isSet(quickfix.tt.field.ExecRestatementReason field) {
		return isSetField(field);
	}

	public boolean isSetExecRestatementReason() {
		return isSetField(378);
	}

	public void set(quickfix.tt.field.PassiveAggressive value) {
		setField(value);
	}

	public quickfix.tt.field.PassiveAggressive get(quickfix.tt.field.PassiveAggressive value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.PassiveAggressive getPassiveAggressive() throws FieldNotFound {
		return get(new quickfix.tt.field.PassiveAggressive());
	}

	public boolean isSet(quickfix.tt.field.PassiveAggressive field) {
		return isSetField(field);
	}

	public boolean isSetPassiveAggressive() {
		return isSetField(16480);
	}

	public void set(quickfix.tt.field.AutoAggressive value) {
		setField(value);
	}

	public quickfix.tt.field.AutoAggressive get(quickfix.tt.field.AutoAggressive value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.AutoAggressive getAutoAggressive() throws FieldNotFound {
		return get(new quickfix.tt.field.AutoAggressive());
	}

	public boolean isSet(quickfix.tt.field.AutoAggressive field) {
		return isSetField(field);
	}

	public boolean isSetAutoAggressive() {
		return isSetField(16481);
	}

	public void set(quickfix.tt.field.LastPx value) {
		setField(value);
	}

	public quickfix.tt.field.LastPx get(quickfix.tt.field.LastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.LastPx getLastPx() throws FieldNotFound {
		return get(new quickfix.tt.field.LastPx());
	}

	public boolean isSet(quickfix.tt.field.LastPx field) {
		return isSetField(field);
	}

	public boolean isSetLastPx() {
		return isSetField(31);
	}

	public void set(quickfix.tt.field.AvgPx value) {
		setField(value);
	}

	public quickfix.tt.field.AvgPx get(quickfix.tt.field.AvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.AvgPx getAvgPx() throws FieldNotFound {
		return get(new quickfix.tt.field.AvgPx());
	}

	public boolean isSet(quickfix.tt.field.AvgPx field) {
		return isSetField(field);
	}

	public boolean isSetAvgPx() {
		return isSetField(6);
	}

	public void set(quickfix.tt.field.OrderEnteredTime value) {
		setField(value);
	}

	public quickfix.tt.field.OrderEnteredTime get(quickfix.tt.field.OrderEnteredTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrderEnteredTime getOrderEnteredTime() throws FieldNotFound {
		return get(new quickfix.tt.field.OrderEnteredTime());
	}

	public boolean isSet(quickfix.tt.field.OrderEnteredTime field) {
		return isSetField(field);
	}

	public boolean isSetOrderEnteredTime() {
		return isSetField(6038);
	}

	public void set(quickfix.tt.field.TransactTime value) {
		setField(value);
	}

	public quickfix.tt.field.TransactTime get(quickfix.tt.field.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TransactTime getTransactTime() throws FieldNotFound {
		return get(new quickfix.tt.field.TransactTime());
	}

	public boolean isSet(quickfix.tt.field.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
	}

	public void set(quickfix.tt.field.SecuritySubType value) {
		setField(value);
	}

	public quickfix.tt.field.SecuritySubType get(quickfix.tt.field.SecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecuritySubType getSecuritySubType() throws FieldNotFound {
		return get(new quickfix.tt.field.SecuritySubType());
	}

	public boolean isSet(quickfix.tt.field.SecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySubType() {
		return isSetField(10762);
	}

	public void set(quickfix.tt.field.LastParPx value) {
		setField(value);
	}

	public quickfix.tt.field.LastParPx get(quickfix.tt.field.LastParPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.LastParPx getLastParPx() throws FieldNotFound {
		return get(new quickfix.tt.field.LastParPx());
	}

	public boolean isSet(quickfix.tt.field.LastParPx field) {
		return isSetField(field);
	}

	public boolean isSetLastParPx() {
		return isSetField(669);
	}

	public void set(quickfix.tt.field.ExchangeGateway value) {
		setField(value);
	}

	public quickfix.tt.field.ExchangeGateway get(quickfix.tt.field.ExchangeGateway value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExchangeGateway getExchangeGateway() throws FieldNotFound {
		return get(new quickfix.tt.field.ExchangeGateway());
	}

	public boolean isSet(quickfix.tt.field.ExchangeGateway field) {
		return isSetField(field);
	}

	public boolean isSetExchangeGateway() {
		return isSetField(18203);
	}

	public void set(quickfix.tt.field.TTAccountType value) {
		setField(value);
	}

	public quickfix.tt.field.TTAccountType get(quickfix.tt.field.TTAccountType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TTAccountType getTTAccountType() throws FieldNotFound {
		return get(new quickfix.tt.field.TTAccountType());
	}

	public boolean isSet(quickfix.tt.field.TTAccountType field) {
		return isSetField(field);
	}

	public boolean isSetTTAccountType() {
		return isSetField(18205);
	}

	public void set(quickfix.tt.field.TTUsername value) {
		setField(value);
	}

	public quickfix.tt.field.TTUsername get(quickfix.tt.field.TTUsername value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TTUsername getTTUsername() throws FieldNotFound {
		return get(new quickfix.tt.field.TTUsername());
	}

	public boolean isSet(quickfix.tt.field.TTUsername field) {
		return isSetField(field);
	}

	public boolean isSetTTUsername() {
		return isSetField(10553);
	}

	public void set(quickfix.tt.field.Currency value) {
		setField(value);
	}

	public quickfix.tt.field.Currency get(quickfix.tt.field.Currency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Currency getCurrency() throws FieldNotFound {
		return get(new quickfix.tt.field.Currency());
	}

	public boolean isSet(quickfix.tt.field.Currency field) {
		return isSetField(field);
	}

	public boolean isSetCurrency() {
		return isSetField(15);
	}

	public void set(quickfix.tt.field.TradeDate value) {
		setField(value);
	}

	public quickfix.tt.field.TradeDate get(quickfix.tt.field.TradeDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TradeDate getTradeDate() throws FieldNotFound {
		return get(new quickfix.tt.field.TradeDate());
	}

	public boolean isSet(quickfix.tt.field.TradeDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeDate() {
		return isSetField(75);
	}

	public void set(quickfix.tt.field.FixingDate value) {
		setField(value);
	}

	public quickfix.tt.field.FixingDate get(quickfix.tt.field.FixingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.FixingDate getFixingDate() throws FieldNotFound {
		return get(new quickfix.tt.field.FixingDate());
	}

	public boolean isSet(quickfix.tt.field.FixingDate field) {
		return isSetField(field);
	}

	public boolean isSetFixingDate() {
		return isSetField(10541);
	}

	public void set(quickfix.tt.field.ManualOrderIndicator value) {
		setField(value);
	}

	public quickfix.tt.field.ManualOrderIndicator get(quickfix.tt.field.ManualOrderIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ManualOrderIndicator getManualOrderIndicator() throws FieldNotFound {
		return get(new quickfix.tt.field.ManualOrderIndicator());
	}

	public boolean isSet(quickfix.tt.field.ManualOrderIndicator field) {
		return isSetField(field);
	}

	public boolean isSetManualOrderIndicator() {
		return isSetField(11028);
	}

	public void set(quickfix.tt.field.OrderOriginationID value) {
		setField(value);
	}

	public quickfix.tt.field.OrderOriginationID get(quickfix.tt.field.OrderOriginationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrderOriginationID getOrderOriginationID() throws FieldNotFound {
		return get(new quickfix.tt.field.OrderOriginationID());
	}

	public boolean isSet(quickfix.tt.field.OrderOriginationID field) {
		return isSetField(field);
	}

	public boolean isSetOrderOriginationID() {
		return isSetField(16142);
	}

	public void set(quickfix.tt.field.RelativePriceType value) {
		setField(value);
	}

	public quickfix.tt.field.RelativePriceType get(quickfix.tt.field.RelativePriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.RelativePriceType getRelativePriceType() throws FieldNotFound {
		return get(new quickfix.tt.field.RelativePriceType());
	}

	public boolean isSet(quickfix.tt.field.RelativePriceType field) {
		return isSetField(field);
	}

	public boolean isSetRelativePriceType() {
		return isSetField(16116);
	}

	public void set(quickfix.tt.field.RelativePriceOffset value) {
		setField(value);
	}

	public quickfix.tt.field.RelativePriceOffset get(quickfix.tt.field.RelativePriceOffset value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.RelativePriceOffset getRelativePriceOffset() throws FieldNotFound {
		return get(new quickfix.tt.field.RelativePriceOffset());
	}

	public boolean isSet(quickfix.tt.field.RelativePriceOffset field) {
		return isSetField(field);
	}

	public boolean isSetRelativePriceOffset() {
		return isSetField(16117);
	}

	public void set(quickfix.tt.field.StartDateTime value) {
		setField(value);
	}

	public quickfix.tt.field.StartDateTime get(quickfix.tt.field.StartDateTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.StartDateTime getStartDateTime() throws FieldNotFound {
		return get(new quickfix.tt.field.StartDateTime());
	}

	public boolean isSet(quickfix.tt.field.StartDateTime field) {
		return isSetField(field);
	}

	public boolean isSetStartDateTime() {
		return isSetField(16118);
	}

	public void set(quickfix.tt.field.EndDateTime value) {
		setField(value);
	}

	public quickfix.tt.field.EndDateTime get(quickfix.tt.field.EndDateTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.EndDateTime getEndDateTime() throws FieldNotFound {
		return get(new quickfix.tt.field.EndDateTime());
	}

	public boolean isSet(quickfix.tt.field.EndDateTime field) {
		return isSetField(field);
	}

	public boolean isSetEndDateTime() {
		return isSetField(16119);
	}

	public void set(quickfix.tt.field.EndDateTimeAction value) {
		setField(value);
	}

	public quickfix.tt.field.EndDateTimeAction get(quickfix.tt.field.EndDateTimeAction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.EndDateTimeAction getEndDateTimeAction() throws FieldNotFound {
		return get(new quickfix.tt.field.EndDateTimeAction());
	}

	public boolean isSet(quickfix.tt.field.EndDateTimeAction field) {
		return isSetField(field);
	}

	public boolean isSetEndDateTimeAction() {
		return isSetField(16120);
	}

	public void set(quickfix.tt.field.WATType value) {
		setField(value);
	}

	public quickfix.tt.field.WATType get(quickfix.tt.field.WATType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.WATType getWATType() throws FieldNotFound {
		return get(new quickfix.tt.field.WATType());
	}

	public boolean isSet(quickfix.tt.field.WATType field) {
		return isSetField(field);
	}

	public boolean isSetWATType() {
		return isSetField(16121);
	}

	public void set(quickfix.tt.field.WATValue value) {
		setField(value);
	}

	public quickfix.tt.field.WATValue get(quickfix.tt.field.WATValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.WATValue getWATValue() throws FieldNotFound {
		return get(new quickfix.tt.field.WATValue());
	}

	public boolean isSet(quickfix.tt.field.WATValue field) {
		return isSetField(field);
	}

	public boolean isSetWATValue() {
		return isSetField(16122);
	}

	public void set(quickfix.tt.field.MGNumRetries value) {
		setField(value);
	}

	public quickfix.tt.field.MGNumRetries get(quickfix.tt.field.MGNumRetries value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MGNumRetries getMGNumRetries() throws FieldNotFound {
		return get(new quickfix.tt.field.MGNumRetries());
	}

	public boolean isSet(quickfix.tt.field.MGNumRetries field) {
		return isSetField(field);
	}

	public boolean isSetMGNumRetries() {
		return isSetField(16123);
	}

	public void set(quickfix.tt.field.MGRetryInterval value) {
		setField(value);
	}

	public quickfix.tt.field.MGRetryInterval get(quickfix.tt.field.MGRetryInterval value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MGRetryInterval getMGRetryInterval() throws FieldNotFound {
		return get(new quickfix.tt.field.MGRetryInterval());
	}

	public boolean isSet(quickfix.tt.field.MGRetryInterval field) {
		return isSetField(field);
	}

	public boolean isSetMGRetryInterval() {
		return isSetField(16124);
	}

	public void set(quickfix.tt.field.TriggerPrice value) {
		setField(value);
	}

	public quickfix.tt.field.TriggerPrice get(quickfix.tt.field.TriggerPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TriggerPrice getTriggerPrice() throws FieldNotFound {
		return get(new quickfix.tt.field.TriggerPrice());
	}

	public boolean isSet(quickfix.tt.field.TriggerPrice field) {
		return isSetField(field);
	}

	public boolean isSetTriggerPrice() {
		return isSetField(16125);
	}

	public void set(quickfix.tt.field.TriggerPriceType value) {
		setField(value);
	}

	public quickfix.tt.field.TriggerPriceType get(quickfix.tt.field.TriggerPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TriggerPriceType getTriggerPriceType() throws FieldNotFound {
		return get(new quickfix.tt.field.TriggerPriceType());
	}

	public boolean isSet(quickfix.tt.field.TriggerPriceType field) {
		return isSetField(field);
	}

	public boolean isSetTriggerPriceType() {
		return isSetField(16126);
	}

	public void set(quickfix.tt.field.TriggerQtyType value) {
		setField(value);
	}

	public quickfix.tt.field.TriggerQtyType get(quickfix.tt.field.TriggerQtyType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TriggerQtyType getTriggerQtyType() throws FieldNotFound {
		return get(new quickfix.tt.field.TriggerQtyType());
	}

	public boolean isSet(quickfix.tt.field.TriggerQtyType field) {
		return isSetField(field);
	}

	public boolean isSetTriggerQtyType() {
		return isSetField(16127);
	}

	public void set(quickfix.tt.field.TriggerQtyOperator value) {
		setField(value);
	}

	public quickfix.tt.field.TriggerQtyOperator get(quickfix.tt.field.TriggerQtyOperator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TriggerQtyOperator getTriggerQtyOperator() throws FieldNotFound {
		return get(new quickfix.tt.field.TriggerQtyOperator());
	}

	public boolean isSet(quickfix.tt.field.TriggerQtyOperator field) {
		return isSetField(field);
	}

	public boolean isSetTriggerQtyOperator() {
		return isSetField(16128);
	}

	public void set(quickfix.tt.field.SyntheticOrdType value) {
		setField(value);
	}

	public quickfix.tt.field.SyntheticOrdType get(quickfix.tt.field.SyntheticOrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SyntheticOrdType getSyntheticOrdType() throws FieldNotFound {
		return get(new quickfix.tt.field.SyntheticOrdType());
	}

	public boolean isSet(quickfix.tt.field.SyntheticOrdType field) {
		return isSetField(field);
	}

	public boolean isSetSyntheticOrdType() {
		return isSetField(16107);
	}

	public void set(quickfix.tt.field.SyntheticOrdStatus value) {
		setField(value);
	}

	public quickfix.tt.field.SyntheticOrdStatus get(quickfix.tt.field.SyntheticOrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SyntheticOrdStatus getSyntheticOrdStatus() throws FieldNotFound {
		return get(new quickfix.tt.field.SyntheticOrdStatus());
	}

	public boolean isSet(quickfix.tt.field.SyntheticOrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetSyntheticOrdStatus() {
		return isSetField(16101);
	}

	public void set(quickfix.tt.field.SyntheticOrdMod value) {
		setField(value);
	}

	public quickfix.tt.field.SyntheticOrdMod get(quickfix.tt.field.SyntheticOrdMod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SyntheticOrdMod getSyntheticOrdMod() throws FieldNotFound {
		return get(new quickfix.tt.field.SyntheticOrdMod());
	}

	public boolean isSet(quickfix.tt.field.SyntheticOrdMod field) {
		return isSetField(field);
	}

	public boolean isSetSyntheticOrdMod() {
		return isSetField(16108);
	}

	public void set(quickfix.tt.field.TriggerQty value) {
		setField(value);
	}

	public quickfix.tt.field.TriggerQty get(quickfix.tt.field.TriggerQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TriggerQty getTriggerQty() throws FieldNotFound {
		return get(new quickfix.tt.field.TriggerQty());
	}

	public boolean isSet(quickfix.tt.field.TriggerQty field) {
		return isSetField(field);
	}

	public boolean isSetTriggerQty() {
		return isSetField(16129);
	}

	public void set(quickfix.tt.field.TrailingOffset value) {
		setField(value);
	}

	public quickfix.tt.field.TrailingOffset get(quickfix.tt.field.TrailingOffset value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TrailingOffset getTrailingOffset() throws FieldNotFound {
		return get(new quickfix.tt.field.TrailingOffset());
	}

	public boolean isSet(quickfix.tt.field.TrailingOffset field) {
		return isSetField(field);
	}

	public boolean isSetTrailingOffset() {
		return isSetField(16130);
	}

	public void set(quickfix.tt.field.TrailingPriceType value) {
		setField(value);
	}

	public quickfix.tt.field.TrailingPriceType get(quickfix.tt.field.TrailingPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TrailingPriceType getTrailingPriceType() throws FieldNotFound {
		return get(new quickfix.tt.field.TrailingPriceType());
	}

	public boolean isSet(quickfix.tt.field.TrailingPriceType field) {
		return isSetField(field);
	}

	public boolean isSetTrailingPriceType() {
		return isSetField(16131);
	}

	public void set(quickfix.tt.field.SlicerIntervalValue value) {
		setField(value);
	}

	public quickfix.tt.field.SlicerIntervalValue get(quickfix.tt.field.SlicerIntervalValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SlicerIntervalValue getSlicerIntervalValue() throws FieldNotFound {
		return get(new quickfix.tt.field.SlicerIntervalValue());
	}

	public boolean isSet(quickfix.tt.field.SlicerIntervalValue field) {
		return isSetField(field);
	}

	public boolean isSetSlicerIntervalValue() {
		return isSetField(16147);
	}

	public void set(quickfix.tt.field.SlicerIntervalUnit value) {
		setField(value);
	}

	public quickfix.tt.field.SlicerIntervalUnit get(quickfix.tt.field.SlicerIntervalUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SlicerIntervalUnit getSlicerIntervalUnit() throws FieldNotFound {
		return get(new quickfix.tt.field.SlicerIntervalUnit());
	}

	public boolean isSet(quickfix.tt.field.SlicerIntervalUnit field) {
		return isSetField(field);
	}

	public boolean isSetSlicerIntervalUnit() {
		return isSetField(16148);
	}

	public void set(quickfix.tt.field.DurationType value) {
		setField(value);
	}

	public quickfix.tt.field.DurationType get(quickfix.tt.field.DurationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.DurationType getDurationType() throws FieldNotFound {
		return get(new quickfix.tt.field.DurationType());
	}

	public boolean isSet(quickfix.tt.field.DurationType field) {
		return isSetField(field);
	}

	public boolean isSetDurationType() {
		return isSetField(16149);
	}

	public void set(quickfix.tt.field.DurationValue value) {
		setField(value);
	}

	public quickfix.tt.field.DurationValue get(quickfix.tt.field.DurationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.DurationValue getDurationValue() throws FieldNotFound {
		return get(new quickfix.tt.field.DurationValue());
	}

	public boolean isSet(quickfix.tt.field.DurationValue field) {
		return isSetField(field);
	}

	public boolean isSetDurationValue() {
		return isSetField(16150);
	}

	public void set(quickfix.tt.field.DurationUnit value) {
		setField(value);
	}

	public quickfix.tt.field.DurationUnit get(quickfix.tt.field.DurationUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.DurationUnit getDurationUnit() throws FieldNotFound {
		return get(new quickfix.tt.field.DurationUnit());
	}

	public boolean isSet(quickfix.tt.field.DurationUnit field) {
		return isSetField(field);
	}

	public boolean isSetDurationUnit() {
		return isSetField(16151);
	}

	public void set(quickfix.tt.field.DurationBeginTime value) {
		setField(value);
	}

	public quickfix.tt.field.DurationBeginTime get(quickfix.tt.field.DurationBeginTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.DurationBeginTime getDurationBeginTime() throws FieldNotFound {
		return get(new quickfix.tt.field.DurationBeginTime());
	}

	public boolean isSet(quickfix.tt.field.DurationBeginTime field) {
		return isSetField(field);
	}

	public boolean isSetDurationBeginTime() {
		return isSetField(16152);
	}

	public void set(quickfix.tt.field.DurationEndTime value) {
		setField(value);
	}

	public quickfix.tt.field.DurationEndTime get(quickfix.tt.field.DurationEndTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.DurationEndTime getDurationEndTime() throws FieldNotFound {
		return get(new quickfix.tt.field.DurationEndTime());
	}

	public boolean isSet(quickfix.tt.field.DurationEndTime field) {
		return isSetField(field);
	}

	public boolean isSetDurationEndTime() {
		return isSetField(16153);
	}

	public void set(quickfix.tt.field.DisclosedQtyValue value) {
		setField(value);
	}

	public quickfix.tt.field.DisclosedQtyValue get(quickfix.tt.field.DisclosedQtyValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.DisclosedQtyValue getDisclosedQtyValue() throws FieldNotFound {
		return get(new quickfix.tt.field.DisclosedQtyValue());
	}

	public boolean isSet(quickfix.tt.field.DisclosedQtyValue field) {
		return isSetField(field);
	}

	public boolean isSetDisclosedQtyValue() {
		return isSetField(16144);
	}

	public void set(quickfix.tt.field.DisclosedQtyVariance value) {
		setField(value);
	}

	public quickfix.tt.field.DisclosedQtyVariance get(quickfix.tt.field.DisclosedQtyVariance value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.DisclosedQtyVariance getDisclosedQtyVariance() throws FieldNotFound {
		return get(new quickfix.tt.field.DisclosedQtyVariance());
	}

	public boolean isSet(quickfix.tt.field.DisclosedQtyVariance field) {
		return isSetField(field);
	}

	public boolean isSetDisclosedQtyVariance() {
		return isSetField(16145);
	}

	public void set(quickfix.tt.field.LeftActionTrigger value) {
		setField(value);
	}

	public quickfix.tt.field.LeftActionTrigger get(quickfix.tt.field.LeftActionTrigger value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.LeftActionTrigger getLeftActionTrigger() throws FieldNotFound {
		return get(new quickfix.tt.field.LeftActionTrigger());
	}

	public boolean isSet(quickfix.tt.field.LeftActionTrigger field) {
		return isSetField(field);
	}

	public boolean isSetLeftActionTrigger() {
		return isSetField(16154);
	}

	public void set(quickfix.tt.field.LeftAction value) {
		setField(value);
	}

	public quickfix.tt.field.LeftAction get(quickfix.tt.field.LeftAction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.LeftAction getLeftAction() throws FieldNotFound {
		return get(new quickfix.tt.field.LeftAction());
	}

	public boolean isSet(quickfix.tt.field.LeftAction field) {
		return isSetField(field);
	}

	public boolean isSetLeftAction() {
		return isSetField(16155);
	}

	public void set(quickfix.tt.field.LeftPayupTicks value) {
		setField(value);
	}

	public quickfix.tt.field.LeftPayupTicks get(quickfix.tt.field.LeftPayupTicks value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.LeftPayupTicks getLeftPayupTicks() throws FieldNotFound {
		return get(new quickfix.tt.field.LeftPayupTicks());
	}

	public boolean isSet(quickfix.tt.field.LeftPayupTicks field) {
		return isSetField(field);
	}

	public boolean isSetLeftPayupTicks() {
		return isSetField(16156);
	}

	public void set(quickfix.tt.field.BrokerID value) {
		setField(value);
	}

	public quickfix.tt.field.BrokerID get(quickfix.tt.field.BrokerID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.BrokerID getBrokerID() throws FieldNotFound {
		return get(new quickfix.tt.field.BrokerID());
	}

	public boolean isSet(quickfix.tt.field.BrokerID field) {
		return isSetField(field);
	}

	public boolean isSetBrokerID() {
		return isSetField(18220);
	}

	public void set(quickfix.tt.field.CompanyID value) {
		setField(value);
	}

	public quickfix.tt.field.CompanyID get(quickfix.tt.field.CompanyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.CompanyID getCompanyID() throws FieldNotFound {
		return get(new quickfix.tt.field.CompanyID());
	}

	public boolean isSet(quickfix.tt.field.CompanyID field) {
		return isSetField(field);
	}

	public boolean isSetCompanyID() {
		return isSetField(18221);
	}

	public void set(quickfix.tt.field.MarketOrderLimit value) {
		setField(value);
	}

	public quickfix.tt.field.MarketOrderLimit get(quickfix.tt.field.MarketOrderLimit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MarketOrderLimit getMarketOrderLimit() throws FieldNotFound {
		return get(new quickfix.tt.field.MarketOrderLimit());
	}

	public boolean isSet(quickfix.tt.field.MarketOrderLimit field) {
		return isSetField(field);
	}

	public boolean isSetMarketOrderLimit() {
		return isSetField(16157);
	}

	public void set(quickfix.tt.field.TrdType value) {
		setField(value);
	}

	public quickfix.tt.field.TrdType get(quickfix.tt.field.TrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TrdType getTrdType() throws FieldNotFound {
		return get(new quickfix.tt.field.TrdType());
	}

	public boolean isSet(quickfix.tt.field.TrdType field) {
		return isSetField(field);
	}

	public boolean isSetTrdType() {
		return isSetField(10828);
	}

	public void set(quickfix.tt.field.NoMiscFees value) {
		setField(value);
	}

	public quickfix.tt.field.NoMiscFees get(quickfix.tt.field.NoMiscFees value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.NoMiscFees getNoMiscFees() throws FieldNotFound {
		return get(new quickfix.tt.field.NoMiscFees());
	}

	public boolean isSet(quickfix.tt.field.NoMiscFees field) {
		return isSetField(field);
	}

	public boolean isSetNoMiscFees() {
		return isSetField(136);
	}

	public static class NoMiscFees extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {137, 0};

		public NoMiscFees() {
			super(136, 137, ORDER);
		}
		
	public void set(quickfix.tt.field.MiscFeeAmt value) {
		setField(value);
	}

	public quickfix.tt.field.MiscFeeAmt get(quickfix.tt.field.MiscFeeAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MiscFeeAmt getMiscFeeAmt() throws FieldNotFound {
		return get(new quickfix.tt.field.MiscFeeAmt());
	}

	public boolean isSet(quickfix.tt.field.MiscFeeAmt field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeAmt() {
		return isSetField(137);
	}

	}

	public void set(quickfix.tt.field.NoRelatedSym value) {
		setField(value);
	}

	public quickfix.tt.field.NoRelatedSym get(quickfix.tt.field.NoRelatedSym value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.NoRelatedSym getNoRelatedSym() throws FieldNotFound {
		return get(new quickfix.tt.field.NoRelatedSym());
	}

	public boolean isSet(quickfix.tt.field.NoRelatedSym field) {
		return isSetField(field);
	}

	public boolean isSetNoRelatedSym() {
		return isSetField(146);
	}

	public static class NoRelatedSym extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {311, 309, 310, 313, 316, 315, 314, 317, 308, 10456, 18212, 16624, 319, 318, 10566, 0};

		public NoRelatedSym() {
			super(146, 311, ORDER);
		}
		
	public void set(quickfix.tt.field.UnderlyingSymbol value) {
		setField(value);
	}

	public quickfix.tt.field.UnderlyingSymbol get(quickfix.tt.field.UnderlyingSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UnderlyingSymbol getUnderlyingSymbol() throws FieldNotFound {
		return get(new quickfix.tt.field.UnderlyingSymbol());
	}

	public boolean isSet(quickfix.tt.field.UnderlyingSymbol field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbol() {
		return isSetField(311);
	}

	public void set(quickfix.tt.field.UnderlyingSecurityID value) {
		setField(value);
	}

	public quickfix.tt.field.UnderlyingSecurityID get(quickfix.tt.field.UnderlyingSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UnderlyingSecurityID getUnderlyingSecurityID() throws FieldNotFound {
		return get(new quickfix.tt.field.UnderlyingSecurityID());
	}

	public boolean isSet(quickfix.tt.field.UnderlyingSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityID() {
		return isSetField(309);
	}

	public void set(quickfix.tt.field.UnderlyingSecurityType value) {
		setField(value);
	}

	public quickfix.tt.field.UnderlyingSecurityType get(quickfix.tt.field.UnderlyingSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UnderlyingSecurityType getUnderlyingSecurityType() throws FieldNotFound {
		return get(new quickfix.tt.field.UnderlyingSecurityType());
	}

	public boolean isSet(quickfix.tt.field.UnderlyingSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityType() {
		return isSetField(310);
	}

	public void set(quickfix.tt.field.UnderlyingMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.tt.field.UnderlyingMaturityMonthYear get(quickfix.tt.field.UnderlyingMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UnderlyingMaturityMonthYear getUnderlyingMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.tt.field.UnderlyingMaturityMonthYear());
	}

	public boolean isSet(quickfix.tt.field.UnderlyingMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityMonthYear() {
		return isSetField(313);
	}

	public void set(quickfix.tt.field.UnderlyingStrikePrice value) {
		setField(value);
	}

	public quickfix.tt.field.UnderlyingStrikePrice get(quickfix.tt.field.UnderlyingStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UnderlyingStrikePrice getUnderlyingStrikePrice() throws FieldNotFound {
		return get(new quickfix.tt.field.UnderlyingStrikePrice());
	}

	public boolean isSet(quickfix.tt.field.UnderlyingStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikePrice() {
		return isSetField(316);
	}

	public void set(quickfix.tt.field.UnderlyingPutOrCall value) {
		setField(value);
	}

	public quickfix.tt.field.UnderlyingPutOrCall get(quickfix.tt.field.UnderlyingPutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UnderlyingPutOrCall getUnderlyingPutOrCall() throws FieldNotFound {
		return get(new quickfix.tt.field.UnderlyingPutOrCall());
	}

	public boolean isSet(quickfix.tt.field.UnderlyingPutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPutOrCall() {
		return isSetField(315);
	}

	public void set(quickfix.tt.field.UnderlyingMaturityDay value) {
		setField(value);
	}

	public quickfix.tt.field.UnderlyingMaturityDay get(quickfix.tt.field.UnderlyingMaturityDay value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UnderlyingMaturityDay getUnderlyingMaturityDay() throws FieldNotFound {
		return get(new quickfix.tt.field.UnderlyingMaturityDay());
	}

	public boolean isSet(quickfix.tt.field.UnderlyingMaturityDay field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityDay() {
		return isSetField(314);
	}

	public void set(quickfix.tt.field.UnderlyingOptAttribute value) {
		setField(value);
	}

	public quickfix.tt.field.UnderlyingOptAttribute get(quickfix.tt.field.UnderlyingOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UnderlyingOptAttribute getUnderlyingOptAttribute() throws FieldNotFound {
		return get(new quickfix.tt.field.UnderlyingOptAttribute());
	}

	public boolean isSet(quickfix.tt.field.UnderlyingOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingOptAttribute() {
		return isSetField(317);
	}

	public void set(quickfix.tt.field.UnderlyingSecurityExchange value) {
		setField(value);
	}

	public quickfix.tt.field.UnderlyingSecurityExchange get(quickfix.tt.field.UnderlyingSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UnderlyingSecurityExchange getUnderlyingSecurityExchange() throws FieldNotFound {
		return get(new quickfix.tt.field.UnderlyingSecurityExchange());
	}

	public boolean isSet(quickfix.tt.field.UnderlyingSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityExchange() {
		return isSetField(308);
	}

	public void set(quickfix.tt.field.UnderlyingSecurityAltID value) {
		setField(value);
	}

	public quickfix.tt.field.UnderlyingSecurityAltID get(quickfix.tt.field.UnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UnderlyingSecurityAltID getUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new quickfix.tt.field.UnderlyingSecurityAltID());
	}

	public boolean isSet(quickfix.tt.field.UnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltID() {
		return isSetField(10456);
	}

	public void set(quickfix.tt.field.UnderlyingDeliveryTerm value) {
		setField(value);
	}

	public quickfix.tt.field.UnderlyingDeliveryTerm get(quickfix.tt.field.UnderlyingDeliveryTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UnderlyingDeliveryTerm getUnderlyingDeliveryTerm() throws FieldNotFound {
		return get(new quickfix.tt.field.UnderlyingDeliveryTerm());
	}

	public boolean isSet(quickfix.tt.field.UnderlyingDeliveryTerm field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingDeliveryTerm() {
		return isSetField(18212);
	}

	public void set(quickfix.tt.field.LegSide value) {
		setField(value);
	}

	public quickfix.tt.field.LegSide get(quickfix.tt.field.LegSide value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.LegSide getLegSide() throws FieldNotFound {
		return get(new quickfix.tt.field.LegSide());
	}

	public boolean isSet(quickfix.tt.field.LegSide field) {
		return isSetField(field);
	}

	public boolean isSetLegSide() {
		return isSetField(16624);
	}

	public void set(quickfix.tt.field.RatioQty value) {
		setField(value);
	}

	public quickfix.tt.field.RatioQty get(quickfix.tt.field.RatioQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.RatioQty getRatioQty() throws FieldNotFound {
		return get(new quickfix.tt.field.RatioQty());
	}

	public boolean isSet(quickfix.tt.field.RatioQty field) {
		return isSetField(field);
	}

	public boolean isSetRatioQty() {
		return isSetField(319);
	}

	public void set(quickfix.tt.field.UnderlyingCurrency value) {
		setField(value);
	}

	public quickfix.tt.field.UnderlyingCurrency get(quickfix.tt.field.UnderlyingCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UnderlyingCurrency getUnderlyingCurrency() throws FieldNotFound {
		return get(new quickfix.tt.field.UnderlyingCurrency());
	}

	public boolean isSet(quickfix.tt.field.UnderlyingCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrency() {
		return isSetField(318);
	}

	public void set(quickfix.tt.field.LegPrice value) {
		setField(value);
	}

	public quickfix.tt.field.LegPrice get(quickfix.tt.field.LegPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.LegPrice getLegPrice() throws FieldNotFound {
		return get(new quickfix.tt.field.LegPrice());
	}

	public boolean isSet(quickfix.tt.field.LegPrice field) {
		return isSetField(field);
	}

	public boolean isSetLegPrice() {
		return isSetField(10566);
	}

	}

	public void set(quickfix.tt.field.TradeCondition value) {
		setField(value);
	}

	public quickfix.tt.field.TradeCondition get(quickfix.tt.field.TradeCondition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TradeCondition getTradeCondition() throws FieldNotFound {
		return get(new quickfix.tt.field.TradeCondition());
	}

	public boolean isSet(quickfix.tt.field.TradeCondition field) {
		return isSetField(field);
	}

	public boolean isSetTradeCondition() {
		return isSetField(277);
	}

	public void set(quickfix.tt.field.UserTag value) {
		setField(value);
	}

	public quickfix.tt.field.UserTag get(quickfix.tt.field.UserTag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UserTag getUserTag() throws FieldNotFound {
		return get(new quickfix.tt.field.UserTag());
	}

	public boolean isSet(quickfix.tt.field.UserTag field) {
		return isSetField(field);
	}

	public boolean isSetUserTag() {
		return isSetField(16104);
	}

	public void set(quickfix.tt.field.OrderTag value) {
		setField(value);
	}

	public quickfix.tt.field.OrderTag get(quickfix.tt.field.OrderTag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrderTag getOrderTag() throws FieldNotFound {
		return get(new quickfix.tt.field.OrderTag());
	}

	public boolean isSet(quickfix.tt.field.OrderTag field) {
		return isSetField(field);
	}

	public boolean isSetOrderTag() {
		return isSetField(16105);
	}

	public void set(quickfix.tt.field.StagedOrderMsg value) {
		setField(value);
	}

	public quickfix.tt.field.StagedOrderMsg get(quickfix.tt.field.StagedOrderMsg value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.StagedOrderMsg getStagedOrderMsg() throws FieldNotFound {
		return get(new quickfix.tt.field.StagedOrderMsg());
	}

	public boolean isSet(quickfix.tt.field.StagedOrderMsg field) {
		return isSetField(field);
	}

	public boolean isSetStagedOrderMsg() {
		return isSetField(16106);
	}

	public void set(quickfix.tt.field.StagedOrderOwner value) {
		setField(value);
	}

	public quickfix.tt.field.StagedOrderOwner get(quickfix.tt.field.StagedOrderOwner value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.StagedOrderOwner getStagedOrderOwner() throws FieldNotFound {
		return get(new quickfix.tt.field.StagedOrderOwner());
	}

	public boolean isSet(quickfix.tt.field.StagedOrderOwner field) {
		return isSetField(field);
	}

	public boolean isSetStagedOrderOwner() {
		return isSetField(16110);
	}

	public void set(quickfix.tt.field.StagedOrderStatus value) {
		setField(value);
	}

	public quickfix.tt.field.StagedOrderStatus get(quickfix.tt.field.StagedOrderStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.StagedOrderStatus getStagedOrderStatus() throws FieldNotFound {
		return get(new quickfix.tt.field.StagedOrderStatus());
	}

	public boolean isSet(quickfix.tt.field.StagedOrderStatus field) {
		return isSetField(field);
	}

	public boolean isSetStagedOrderStatus() {
		return isSetField(16109);
	}

	public void set(quickfix.tt.field.HandlInst value) {
		setField(value);
	}

	public quickfix.tt.field.HandlInst get(quickfix.tt.field.HandlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.HandlInst getHandlInst() throws FieldNotFound {
		return get(new quickfix.tt.field.HandlInst());
	}

	public boolean isSet(quickfix.tt.field.HandlInst field) {
		return isSetField(field);
	}

	public boolean isSetHandlInst() {
		return isSetField(21);
	}

	public void set(quickfix.tt.field.StagedRoutingLevel value) {
		setField(value);
	}

	public quickfix.tt.field.StagedRoutingLevel get(quickfix.tt.field.StagedRoutingLevel value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.StagedRoutingLevel getStagedRoutingLevel() throws FieldNotFound {
		return get(new quickfix.tt.field.StagedRoutingLevel());
	}

	public boolean isSet(quickfix.tt.field.StagedRoutingLevel field) {
		return isSetField(field);
	}

	public boolean isSetStagedRoutingLevel() {
		return isSetField(16111);
	}

	public void set(quickfix.tt.field.ExchCred value) {
		setField(value);
	}

	public quickfix.tt.field.ExchCred get(quickfix.tt.field.ExchCred value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExchCred getExchCred() throws FieldNotFound {
		return get(new quickfix.tt.field.ExchCred());
	}

	public boolean isSet(quickfix.tt.field.ExchCred field) {
		return isSetField(field);
	}

	public boolean isSetExchCred() {
		return isSetField(18216);
	}

	public void set(quickfix.tt.field.TTStrategyEngine value) {
		setField(value);
	}

	public quickfix.tt.field.TTStrategyEngine get(quickfix.tt.field.TTStrategyEngine value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TTStrategyEngine getTTStrategyEngine() throws FieldNotFound {
		return get(new quickfix.tt.field.TTStrategyEngine());
	}

	public boolean isSet(quickfix.tt.field.TTStrategyEngine field) {
		return isSetField(field);
	}

	public boolean isSetTTStrategyEngine() {
		return isSetField(18208);
	}

	public void set(quickfix.tt.field.ExchangeOrderID value) {
		setField(value);
	}

	public quickfix.tt.field.ExchangeOrderID get(quickfix.tt.field.ExchangeOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExchangeOrderID getExchangeOrderID() throws FieldNotFound {
		return get(new quickfix.tt.field.ExchangeOrderID());
	}

	public boolean isSet(quickfix.tt.field.ExchangeOrderID field) {
		return isSetField(field);
	}

	public boolean isSetExchangeOrderID() {
		return isSetField(16143);
	}

	public void set(quickfix.tt.field.NoLinks value) {
		setField(value);
	}

	public quickfix.tt.field.NoLinks get(quickfix.tt.field.NoLinks value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.NoLinks getNoLinks() throws FieldNotFound {
		return get(new quickfix.tt.field.NoLinks());
	}

	public boolean isSet(quickfix.tt.field.NoLinks field) {
		return isSetField(field);
	}

	public boolean isSetNoLinks() {
		return isSetField(16112);
	}

	public static class NoLinks extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {16113, 16114, 0};

		public NoLinks() {
			super(16112, 16113, ORDER);
		}
		
	public void set(quickfix.tt.field.LinkID value) {
		setField(value);
	}

	public quickfix.tt.field.LinkID get(quickfix.tt.field.LinkID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.LinkID getLinkID() throws FieldNotFound {
		return get(new quickfix.tt.field.LinkID());
	}

	public boolean isSet(quickfix.tt.field.LinkID field) {
		return isSetField(field);
	}

	public boolean isSetLinkID() {
		return isSetField(16113);
	}

	public void set(quickfix.tt.field.LinkType value) {
		setField(value);
	}

	public quickfix.tt.field.LinkType get(quickfix.tt.field.LinkType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.LinkType getLinkType() throws FieldNotFound {
		return get(new quickfix.tt.field.LinkType());
	}

	public boolean isSet(quickfix.tt.field.LinkType field) {
		return isSetField(field);
	}

	public boolean isSetLinkType() {
		return isSetField(16114);
	}

	}

}
