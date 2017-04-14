
package quickfix.tt;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketDataRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "V";
	

	public MarketDataRequest() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public MarketDataRequest(quickfix.tt.field.MDReqID mDReqID, quickfix.tt.field.SubscriptionRequestType subscriptionRequestType, quickfix.tt.field.MarketDepth marketDepth) {
		this();
		setField(mDReqID);
		setField(subscriptionRequestType);
		setField(marketDepth);
	}
	
	public void set(quickfix.tt.field.MDReqID value) {
		setField(value);
	}

	public quickfix.tt.field.MDReqID get(quickfix.tt.field.MDReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MDReqID getMDReqID() throws FieldNotFound {
		return get(new quickfix.tt.field.MDReqID());
	}

	public boolean isSet(quickfix.tt.field.MDReqID field) {
		return isSetField(field);
	}

	public boolean isSetMDReqID() {
		return isSetField(262);
	}

	public void set(quickfix.tt.field.SubscriptionRequestType value) {
		setField(value);
	}

	public quickfix.tt.field.SubscriptionRequestType get(quickfix.tt.field.SubscriptionRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
		return get(new quickfix.tt.field.SubscriptionRequestType());
	}

	public boolean isSet(quickfix.tt.field.SubscriptionRequestType field) {
		return isSetField(field);
	}

	public boolean isSetSubscriptionRequestType() {
		return isSetField(263);
	}

	public void set(quickfix.tt.field.MarketDepth value) {
		setField(value);
	}

	public quickfix.tt.field.MarketDepth get(quickfix.tt.field.MarketDepth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MarketDepth getMarketDepth() throws FieldNotFound {
		return get(new quickfix.tt.field.MarketDepth());
	}

	public boolean isSet(quickfix.tt.field.MarketDepth field) {
		return isSetField(field);
	}

	public boolean isSetMarketDepth() {
		return isSetField(264);
	}

	public void set(quickfix.tt.field.MDUpdateType value) {
		setField(value);
	}

	public quickfix.tt.field.MDUpdateType get(quickfix.tt.field.MDUpdateType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MDUpdateType getMDUpdateType() throws FieldNotFound {
		return get(new quickfix.tt.field.MDUpdateType());
	}

	public boolean isSet(quickfix.tt.field.MDUpdateType field) {
		return isSetField(field);
	}

	public boolean isSetMDUpdateType() {
		return isSetField(265);
	}

	public void set(quickfix.tt.field.AggregatedBook value) {
		setField(value);
	}

	public quickfix.tt.field.AggregatedBook get(quickfix.tt.field.AggregatedBook value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.AggregatedBook getAggregatedBook() throws FieldNotFound {
		return get(new quickfix.tt.field.AggregatedBook());
	}

	public boolean isSet(quickfix.tt.field.AggregatedBook field) {
		return isSetField(field);
	}

	public boolean isSetAggregatedBook() {
		return isSetField(266);
	}

	public void set(quickfix.tt.field.IncludeNumberOfOrders value) {
		setField(value);
	}

	public quickfix.tt.field.IncludeNumberOfOrders get(quickfix.tt.field.IncludeNumberOfOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.IncludeNumberOfOrders getIncludeNumberOfOrders() throws FieldNotFound {
		return get(new quickfix.tt.field.IncludeNumberOfOrders());
	}

	public boolean isSet(quickfix.tt.field.IncludeNumberOfOrders field) {
		return isSetField(field);
	}

	public boolean isSetIncludeNumberOfOrders() {
		return isSetField(18214);
	}

	public void set(quickfix.tt.field.NoMDEntryTypes value) {
		setField(value);
	}

	public quickfix.tt.field.NoMDEntryTypes get(quickfix.tt.field.NoMDEntryTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.NoMDEntryTypes getNoMDEntryTypes() throws FieldNotFound {
		return get(new quickfix.tt.field.NoMDEntryTypes());
	}

	public boolean isSet(quickfix.tt.field.NoMDEntryTypes field) {
		return isSetField(field);
	}

	public boolean isSetNoMDEntryTypes() {
		return isSetField(267);
	}

	public static class NoMDEntryTypes extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {269, 0};

		public NoMDEntryTypes() {
			super(267, 269, ORDER);
		}
		
	public void set(quickfix.tt.field.MDEntryType value) {
		setField(value);
	}

	public quickfix.tt.field.MDEntryType get(quickfix.tt.field.MDEntryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MDEntryType getMDEntryType() throws FieldNotFound {
		return get(new quickfix.tt.field.MDEntryType());
	}

	public boolean isSet(quickfix.tt.field.MDEntryType field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryType() {
		return isSetField(269);
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
		private static final int[] ORDER = {55, 167, 200, 205, 201, 202, 206, 48, 10455, 207, 63, 18211, 0};

		public NoRelatedSym() {
			super(146, 55, ORDER);
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

	}

}
