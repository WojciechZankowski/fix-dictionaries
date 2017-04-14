
package quickfix.tt;

import quickfix.FieldNotFound;

import quickfix.Group;

public class SecurityDefinition extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "d";
	

	public SecurityDefinition() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public SecurityDefinition(quickfix.tt.field.SecurityReqID securityReqID, quickfix.tt.field.SecurityResponseID securityResponseID, quickfix.tt.field.SecurityResponseType securityResponseType, quickfix.tt.field.TotalNumSecurities totalNumSecurities, quickfix.tt.field.Currency currency, quickfix.tt.field.PriceDisplayType priceDisplayType, quickfix.tt.field.TickSize tickSize, quickfix.tt.field.PointValue pointValue, quickfix.tt.field.ExchTickSize exchTickSize, quickfix.tt.field.ExchPointValue exchPointValue, quickfix.tt.field.Symbol symbol, quickfix.tt.field.SecurityID securityID, quickfix.tt.field.SecurityExchange securityExchange) {
		this();
		setField(securityReqID);
		setField(securityResponseID);
		setField(securityResponseType);
		setField(totalNumSecurities);
		setField(currency);
		setField(priceDisplayType);
		setField(tickSize);
		setField(pointValue);
		setField(exchTickSize);
		setField(exchPointValue);
		setField(symbol);
		setField(securityID);
		setField(securityExchange);
	}
	
	public void set(quickfix.tt.field.SecurityReqID value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityReqID get(quickfix.tt.field.SecurityReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityReqID getSecurityReqID() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityReqID());
	}

	public boolean isSet(quickfix.tt.field.SecurityReqID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityReqID() {
		return isSetField(320);
	}

	public void set(quickfix.tt.field.SecurityResponseID value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityResponseID get(quickfix.tt.field.SecurityResponseID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityResponseID getSecurityResponseID() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityResponseID());
	}

	public boolean isSet(quickfix.tt.field.SecurityResponseID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityResponseID() {
		return isSetField(322);
	}

	public void set(quickfix.tt.field.SecurityResponseType value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityResponseType get(quickfix.tt.field.SecurityResponseType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityResponseType getSecurityResponseType() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityResponseType());
	}

	public boolean isSet(quickfix.tt.field.SecurityResponseType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityResponseType() {
		return isSetField(323);
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
		private static final int[] ORDER = {311, 309, 310, 313, 316, 315, 314, 317, 308, 10456, 18212, 54, 319, 318, 10566, 0};

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

	public void set(quickfix.tt.field.TotalNumSecurities value) {
		setField(value);
	}

	public quickfix.tt.field.TotalNumSecurities get(quickfix.tt.field.TotalNumSecurities value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TotalNumSecurities getTotalNumSecurities() throws FieldNotFound {
		return get(new quickfix.tt.field.TotalNumSecurities());
	}

	public boolean isSet(quickfix.tt.field.TotalNumSecurities field) {
		return isSetField(field);
	}

	public boolean isSetTotalNumSecurities() {
		return isSetField(393);
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

	public void set(quickfix.tt.field.ExpectedFillType value) {
		setField(value);
	}

	public quickfix.tt.field.ExpectedFillType get(quickfix.tt.field.ExpectedFillType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExpectedFillType getExpectedFillType() throws FieldNotFound {
		return get(new quickfix.tt.field.ExpectedFillType());
	}

	public boolean isSet(quickfix.tt.field.ExpectedFillType field) {
		return isSetField(field);
	}

	public boolean isSetExpectedFillType() {
		return isSetField(10442);
	}

	public void set(quickfix.tt.field.PriceDisplayType value) {
		setField(value);
	}

	public quickfix.tt.field.PriceDisplayType get(quickfix.tt.field.PriceDisplayType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.PriceDisplayType getPriceDisplayType() throws FieldNotFound {
		return get(new quickfix.tt.field.PriceDisplayType());
	}

	public boolean isSet(quickfix.tt.field.PriceDisplayType field) {
		return isSetField(field);
	}

	public boolean isSetPriceDisplayType() {
		return isSetField(16451);
	}

	public void set(quickfix.tt.field.TickSize value) {
		setField(value);
	}

	public quickfix.tt.field.TickSize get(quickfix.tt.field.TickSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TickSize getTickSize() throws FieldNotFound {
		return get(new quickfix.tt.field.TickSize());
	}

	public boolean isSet(quickfix.tt.field.TickSize field) {
		return isSetField(field);
	}

	public boolean isSetTickSize() {
		return isSetField(16452);
	}

	public void set(quickfix.tt.field.PointValue value) {
		setField(value);
	}

	public quickfix.tt.field.PointValue get(quickfix.tt.field.PointValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.PointValue getPointValue() throws FieldNotFound {
		return get(new quickfix.tt.field.PointValue());
	}

	public boolean isSet(quickfix.tt.field.PointValue field) {
		return isSetField(field);
	}

	public boolean isSetPointValue() {
		return isSetField(16454);
	}

	public void set(quickfix.tt.field.NumTickTblEntries value) {
		setField(value);
	}

	public quickfix.tt.field.NumTickTblEntries get(quickfix.tt.field.NumTickTblEntries value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.NumTickTblEntries getNumTickTblEntries() throws FieldNotFound {
		return get(new quickfix.tt.field.NumTickTblEntries());
	}

	public boolean isSet(quickfix.tt.field.NumTickTblEntries field) {
		return isSetField(field);
	}

	public boolean isSetNumTickTblEntries() {
		return isSetField(16456);
	}

	public static class NumTickTblEntries extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {16457, 16458, 0};

		public NumTickTblEntries() {
			super(16456, 16457, ORDER);
		}
		
	public void set(quickfix.tt.field.NumTicks value) {
		setField(value);
	}

	public quickfix.tt.field.NumTicks get(quickfix.tt.field.NumTicks value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.NumTicks getNumTicks() throws FieldNotFound {
		return get(new quickfix.tt.field.NumTicks());
	}

	public boolean isSet(quickfix.tt.field.NumTicks field) {
		return isSetField(field);
	}

	public boolean isSetNumTicks() {
		return isSetField(16457);
	}

	public void set(quickfix.tt.field.MaxPrice value) {
		setField(value);
	}

	public quickfix.tt.field.MaxPrice get(quickfix.tt.field.MaxPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MaxPrice getMaxPrice() throws FieldNotFound {
		return get(new quickfix.tt.field.MaxPrice());
	}

	public boolean isSet(quickfix.tt.field.MaxPrice field) {
		return isSetField(field);
	}

	public boolean isSetMaxPrice() {
		return isSetField(16458);
	}

	}

	public void set(quickfix.tt.field.NoEvents value) {
		setField(value);
	}

	public quickfix.tt.field.NoEvents get(quickfix.tt.field.NoEvents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.NoEvents getNoEvents() throws FieldNotFound {
		return get(new quickfix.tt.field.NoEvents());
	}

	public boolean isSet(quickfix.tt.field.NoEvents field) {
		return isSetField(field);
	}

	public boolean isSetNoEvents() {
		return isSetField(864);
	}

	public static class NoEvents extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {865, 866, 0};

		public NoEvents() {
			super(864, 865, ORDER);
		}
		
	public void set(quickfix.tt.field.EventType value) {
		setField(value);
	}

	public quickfix.tt.field.EventType get(quickfix.tt.field.EventType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.EventType getEventType() throws FieldNotFound {
		return get(new quickfix.tt.field.EventType());
	}

	public boolean isSet(quickfix.tt.field.EventType field) {
		return isSetField(field);
	}

	public boolean isSetEventType() {
		return isSetField(865);
	}

	public void set(quickfix.tt.field.EventDate value) {
		setField(value);
	}

	public quickfix.tt.field.EventDate get(quickfix.tt.field.EventDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.EventDate getEventDate() throws FieldNotFound {
		return get(new quickfix.tt.field.EventDate());
	}

	public boolean isSet(quickfix.tt.field.EventDate field) {
		return isSetField(field);
	}

	public boolean isSetEventDate() {
		return isSetField(866);
	}

	}

	public void set(quickfix.tt.field.NoGateways value) {
		setField(value);
	}

	public quickfix.tt.field.NoGateways get(quickfix.tt.field.NoGateways value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.NoGateways getNoGateways() throws FieldNotFound {
		return get(new quickfix.tt.field.NoGateways());
	}

	public boolean isSet(quickfix.tt.field.NoGateways field) {
		return isSetField(field);
	}

	public boolean isSetNoGateways() {
		return isSetField(18206);
	}

	public static class NoGateways extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {18203, 0};

		public NoGateways() {
			super(18206, 18203, ORDER);
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

	}

	public void set(quickfix.tt.field.LotSize value) {
		setField(value);
	}

	public quickfix.tt.field.LotSize get(quickfix.tt.field.LotSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.LotSize getLotSize() throws FieldNotFound {
		return get(new quickfix.tt.field.LotSize());
	}

	public boolean isSet(quickfix.tt.field.LotSize field) {
		return isSetField(field);
	}

	public boolean isSetLotSize() {
		return isSetField(16461);
	}

	public void set(quickfix.tt.field.ExchTickSize value) {
		setField(value);
	}

	public quickfix.tt.field.ExchTickSize get(quickfix.tt.field.ExchTickSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExchTickSize getExchTickSize() throws FieldNotFound {
		return get(new quickfix.tt.field.ExchTickSize());
	}

	public boolean isSet(quickfix.tt.field.ExchTickSize field) {
		return isSetField(field);
	}

	public boolean isSetExchTickSize() {
		return isSetField(16552);
	}

	public void set(quickfix.tt.field.ExchPointValue value) {
		setField(value);
	}

	public quickfix.tt.field.ExchPointValue get(quickfix.tt.field.ExchPointValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExchPointValue getExchPointValue() throws FieldNotFound {
		return get(new quickfix.tt.field.ExchPointValue());
	}

	public boolean isSet(quickfix.tt.field.ExchPointValue field) {
		return isSetField(field);
	}

	public boolean isSetExchPointValue() {
		return isSetField(16554);
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

	public void set(quickfix.tt.field.DeliveryUnit value) {
		setField(value);
	}

	public quickfix.tt.field.DeliveryUnit get(quickfix.tt.field.DeliveryUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.DeliveryUnit getDeliveryUnit() throws FieldNotFound {
		return get(new quickfix.tt.field.DeliveryUnit());
	}

	public boolean isSet(quickfix.tt.field.DeliveryUnit field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryUnit() {
		return isSetField(16460);
	}

	public void set(quickfix.tt.field.Blocks value) {
		setField(value);
	}

	public quickfix.tt.field.Blocks get(quickfix.tt.field.Blocks value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Blocks getBlocks() throws FieldNotFound {
		return get(new quickfix.tt.field.Blocks());
	}

	public boolean isSet(quickfix.tt.field.Blocks field) {
		return isSetField(field);
	}

	public boolean isSetBlocks() {
		return isSetField(16463);
	}

	public void set(quickfix.tt.field.TradesInFlow value) {
		setField(value);
	}

	public quickfix.tt.field.TradesInFlow get(quickfix.tt.field.TradesInFlow value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TradesInFlow getTradesInFlow() throws FieldNotFound {
		return get(new quickfix.tt.field.TradesInFlow());
	}

	public boolean isSet(quickfix.tt.field.TradesInFlow field) {
		return isSetField(field);
	}

	public boolean isSetTradesInFlow() {
		return isSetField(16464);
	}

	public void set(quickfix.tt.field.SecurityDesc value) {
		setField(value);
	}

	public quickfix.tt.field.SecurityDesc get(quickfix.tt.field.SecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SecurityDesc getSecurityDesc() throws FieldNotFound {
		return get(new quickfix.tt.field.SecurityDesc());
	}

	public boolean isSet(quickfix.tt.field.SecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetSecurityDesc() {
		return isSetField(107);
	}

	public void set(quickfix.tt.field.TTSecurityAlias value) {
		setField(value);
	}

	public quickfix.tt.field.TTSecurityAlias get(quickfix.tt.field.TTSecurityAlias value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TTSecurityAlias getTTSecurityAlias() throws FieldNotFound {
		return get(new quickfix.tt.field.TTSecurityAlias());
	}

	public boolean isSet(quickfix.tt.field.TTSecurityAlias field) {
		return isSetField(field);
	}

	public boolean isSetTTSecurityAlias() {
		return isSetField(18207);
	}

	public void set(quickfix.tt.field.ExchContractSymbol value) {
		setField(value);
	}

	public quickfix.tt.field.ExchContractSymbol get(quickfix.tt.field.ExchContractSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExchContractSymbol getExchContractSymbol() throws FieldNotFound {
		return get(new quickfix.tt.field.ExchContractSymbol());
	}

	public boolean isSet(quickfix.tt.field.ExchContractSymbol field) {
		return isSetField(field);
	}

	public boolean isSetExchContractSymbol() {
		return isSetField(16309);
	}

}
