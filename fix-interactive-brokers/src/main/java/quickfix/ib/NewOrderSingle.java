
package quickfix.ib;

import quickfix.FieldNotFound;


public class NewOrderSingle extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "D";
	

	public NewOrderSingle() {
		super();
		getHeader().setField(new quickfix.ib.field.MsgType(MSGTYPE));
	}
	
	public NewOrderSingle(quickfix.ib.field.ClOrdID clOrdID, quickfix.ib.field.Symbol symbol, quickfix.ib.field.HandlInst handlInst, quickfix.ib.field.Side side, quickfix.ib.field.OrderQty orderQty, quickfix.ib.field.OrdType ordType, quickfix.ib.field.ExDestination exDestination) {
		this();
		setField(clOrdID);
		setField(symbol);
		setField(handlInst);
		setField(side);
		setField(orderQty);
		setField(ordType);
		setField(exDestination);
	}
	
	public void set(quickfix.ib.field.Account value) {
		setField(value);
	}

	public quickfix.ib.field.Account get(quickfix.ib.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.Account getAccount() throws FieldNotFound {
		return get(new quickfix.ib.field.Account());
	}

	public boolean isSet(quickfix.ib.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(quickfix.ib.field.MaxFloor value) {
		setField(value);
	}

	public quickfix.ib.field.MaxFloor get(quickfix.ib.field.MaxFloor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.MaxFloor getMaxFloor() throws FieldNotFound {
		return get(new quickfix.ib.field.MaxFloor());
	}

	public boolean isSet(quickfix.ib.field.MaxFloor field) {
		return isSetField(field);
	}

	public boolean isSetMaxFloor() {
		return isSetField(111);
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

	public void set(quickfix.ib.field.Currency value) {
		setField(value);
	}

	public quickfix.ib.field.Currency get(quickfix.ib.field.Currency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.Currency getCurrency() throws FieldNotFound {
		return get(new quickfix.ib.field.Currency());
	}

	public boolean isSet(quickfix.ib.field.Currency field) {
		return isSetField(field);
	}

	public boolean isSetCurrency() {
		return isSetField(15);
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

	public void set(quickfix.ib.field.ExecInst value) {
		setField(value);
	}

	public quickfix.ib.field.ExecInst get(quickfix.ib.field.ExecInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ExecInst getExecInst() throws FieldNotFound {
		return get(new quickfix.ib.field.ExecInst());
	}

	public boolean isSet(quickfix.ib.field.ExecInst field) {
		return isSetField(field);
	}

	public boolean isSetExecInst() {
		return isSetField(18);
	}

	public void set(quickfix.ib.field.PegDifference value) {
		setField(value);
	}

	public quickfix.ib.field.PegDifference get(quickfix.ib.field.PegDifference value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.PegDifference getPegDifference() throws FieldNotFound {
		return get(new quickfix.ib.field.PegDifference());
	}

	public boolean isSet(quickfix.ib.field.PegDifference field) {
		return isSetField(field);
	}

	public boolean isSetPegDifference() {
		return isSetField(211);
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

	public void set(quickfix.ib.field.OpenClose value) {
		setField(value);
	}

	public quickfix.ib.field.OpenClose get(quickfix.ib.field.OpenClose value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.OpenClose getOpenClose() throws FieldNotFound {
		return get(new quickfix.ib.field.OpenClose());
	}

	public boolean isSet(quickfix.ib.field.OpenClose field) {
		return isSetField(field);
	}

	public boolean isSetOpenClose() {
		return isSetField(77);
	}

	public void set(quickfix.ib.field.LocateReqd value) {
		setField(value);
	}

	public quickfix.ib.field.LocateReqd get(quickfix.ib.field.LocateReqd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.LocateReqd getLocateReqd() throws FieldNotFound {
		return get(new quickfix.ib.field.LocateReqd());
	}

	public boolean isSet(quickfix.ib.field.LocateReqd field) {
		return isSetField(field);
	}

	public boolean isSetLocateReqd() {
		return isSetField(114);
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

	public void set(quickfix.ib.field.ContractMultiplier value) {
		setField(value);
	}

	public quickfix.ib.field.ContractMultiplier get(quickfix.ib.field.ContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ContractMultiplier getContractMultiplier() throws FieldNotFound {
		return get(new quickfix.ib.field.ContractMultiplier());
	}

	public boolean isSet(quickfix.ib.field.ContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetContractMultiplier() {
		return isSetField(231);
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

	public void set(quickfix.ib.field.DiscretionInst value) {
		setField(value);
	}

	public quickfix.ib.field.DiscretionInst get(quickfix.ib.field.DiscretionInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.DiscretionInst getDiscretionInst() throws FieldNotFound {
		return get(new quickfix.ib.field.DiscretionInst());
	}

	public boolean isSet(quickfix.ib.field.DiscretionInst field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionInst() {
		return isSetField(388);
	}

	public void set(quickfix.ib.field.DiscretionOffset value) {
		setField(value);
	}

	public quickfix.ib.field.DiscretionOffset get(quickfix.ib.field.DiscretionOffset value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.DiscretionOffset getDiscretionOffset() throws FieldNotFound {
		return get(new quickfix.ib.field.DiscretionOffset());
	}

	public boolean isSet(quickfix.ib.field.DiscretionOffset field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionOffset() {
		return isSetField(389);
	}

	public void set(quickfix.ib.field.EffectiveTime value) {
		setField(value);
	}

	public quickfix.ib.field.EffectiveTime get(quickfix.ib.field.EffectiveTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.EffectiveTime getEffectiveTime() throws FieldNotFound {
		return get(new quickfix.ib.field.EffectiveTime());
	}

	public boolean isSet(quickfix.ib.field.EffectiveTime field) {
		return isSetField(field);
	}

	public boolean isSetEffectiveTime() {
		return isSetField(168);
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

	public void set(quickfix.ib.field.LocateBroker value) {
		setField(value);
	}

	public quickfix.ib.field.LocateBroker get(quickfix.ib.field.LocateBroker value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.LocateBroker getLocateBroker() throws FieldNotFound {
		return get(new quickfix.ib.field.LocateBroker());
	}

	public boolean isSet(quickfix.ib.field.LocateBroker field) {
		return isSetField(field);
	}

	public boolean isSetLocateBroker() {
		return isSetField(5700);
	}

	public void set(quickfix.ib.field.IBLocalSymbol value) {
		setField(value);
	}

	public quickfix.ib.field.IBLocalSymbol get(quickfix.ib.field.IBLocalSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.IBLocalSymbol getIBLocalSymbol() throws FieldNotFound {
		return get(new quickfix.ib.field.IBLocalSymbol());
	}

	public boolean isSet(quickfix.ib.field.IBLocalSymbol field) {
		return isSetField(field);
	}

	public boolean isSetIBLocalSymbol() {
		return isSetField(6035);
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

	public void set(quickfix.ib.field.TradingClass value) {
		setField(value);
	}

	public quickfix.ib.field.TradingClass get(quickfix.ib.field.TradingClass value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.TradingClass getTradingClass() throws FieldNotFound {
		return get(new quickfix.ib.field.TradingClass());
	}

	public boolean isSet(quickfix.ib.field.TradingClass field) {
		return isSetField(field);
	}

	public boolean isSetTradingClass() {
		return isSetField(6058);
	}

	public void set(quickfix.ib.field.ShortSaleRule value) {
		setField(value);
	}

	public quickfix.ib.field.ShortSaleRule get(quickfix.ib.field.ShortSaleRule value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.ShortSaleRule getShortSaleRule() throws FieldNotFound {
		return get(new quickfix.ib.field.ShortSaleRule());
	}

	public boolean isSet(quickfix.ib.field.ShortSaleRule field) {
		return isSetField(field);
	}

	public boolean isSetShortSaleRule() {
		return isSetField(6086);
	}

}
