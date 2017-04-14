
package quickfix.tt;

import quickfix.FieldNotFound;

import quickfix.Group;

public class NewOrderSingle extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "D";
	

	public NewOrderSingle() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public NewOrderSingle(quickfix.tt.field.ClOrdID clOrdID, quickfix.tt.field.SecurityExchange securityExchange, quickfix.tt.field.Account account, quickfix.tt.field.OrderQty orderQty, quickfix.tt.field.Side side, quickfix.tt.field.OrdType ordType) {
		this();
		setField(clOrdID);
		setField(securityExchange);
		setField(account);
		setField(orderQty);
		setField(side);
		setField(ordType);
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

	public void set(quickfix.tt.field.ExecInst value) {
		setField(value);
	}

	public quickfix.tt.field.ExecInst get(quickfix.tt.field.ExecInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExecInst getExecInst() throws FieldNotFound {
		return get(new quickfix.tt.field.ExecInst());
	}

	public boolean isSet(quickfix.tt.field.ExecInst field) {
		return isSetField(field);
	}

	public boolean isSetExecInst() {
		return isSetField(18);
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
		private static final int[] ORDER = {311, 309, 310, 313, 316, 315, 314, 317, 308, 18212, 10456, 16624, 319, 10566, 0};

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

}
