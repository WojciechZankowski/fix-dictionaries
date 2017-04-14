
package quickfix.dukascopy;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketDataRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "V";
	

	public MarketDataRequest() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public MarketDataRequest(quickfix.dukascopy.field.MDReqID mDReqID, quickfix.dukascopy.field.SubscriptionRequestType subscriptionRequestType, quickfix.dukascopy.field.MarketDepth marketDepth) {
		this();
		setField(mDReqID);
		setField(subscriptionRequestType);
		setField(marketDepth);
	}
	
	public void set(quickfix.dukascopy.field.MDReqID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MDReqID get(quickfix.dukascopy.field.MDReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MDReqID getMDReqID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MDReqID());
	}

	public boolean isSet(quickfix.dukascopy.field.MDReqID field) {
		return isSetField(field);
	}

	public boolean isSetMDReqID() {
		return isSetField(262);
	}

	public void set(quickfix.dukascopy.field.SubscriptionRequestType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SubscriptionRequestType get(quickfix.dukascopy.field.SubscriptionRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SubscriptionRequestType());
	}

	public boolean isSet(quickfix.dukascopy.field.SubscriptionRequestType field) {
		return isSetField(field);
	}

	public boolean isSetSubscriptionRequestType() {
		return isSetField(263);
	}

	public void set(quickfix.dukascopy.field.MarketDepth value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MarketDepth get(quickfix.dukascopy.field.MarketDepth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MarketDepth getMarketDepth() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MarketDepth());
	}

	public boolean isSet(quickfix.dukascopy.field.MarketDepth field) {
		return isSetField(field);
	}

	public boolean isSetMarketDepth() {
		return isSetField(264);
	}

	public void set(quickfix.dukascopy.field.MDUpdateType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MDUpdateType get(quickfix.dukascopy.field.MDUpdateType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MDUpdateType getMDUpdateType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MDUpdateType());
	}

	public boolean isSet(quickfix.dukascopy.field.MDUpdateType field) {
		return isSetField(field);
	}

	public boolean isSetMDUpdateType() {
		return isSetField(265);
	}

	public void set(quickfix.dukascopy.field.AggregatedBook value) {
		setField(value);
	}

	public quickfix.dukascopy.field.AggregatedBook get(quickfix.dukascopy.field.AggregatedBook value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.AggregatedBook getAggregatedBook() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.AggregatedBook());
	}

	public boolean isSet(quickfix.dukascopy.field.AggregatedBook field) {
		return isSetField(field);
	}

	public boolean isSetAggregatedBook() {
		return isSetField(266);
	}

	public void set(quickfix.dukascopy.field.OpenCloseSettlFlag value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OpenCloseSettlFlag get(quickfix.dukascopy.field.OpenCloseSettlFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OpenCloseSettlFlag getOpenCloseSettlFlag() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OpenCloseSettlFlag());
	}

	public boolean isSet(quickfix.dukascopy.field.OpenCloseSettlFlag field) {
		return isSetField(field);
	}

	public boolean isSetOpenCloseSettlFlag() {
		return isSetField(286);
	}

	public void set(quickfix.dukascopy.field.Scope value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Scope get(quickfix.dukascopy.field.Scope value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Scope getScope() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Scope());
	}

	public boolean isSet(quickfix.dukascopy.field.Scope field) {
		return isSetField(field);
	}

	public boolean isSetScope() {
		return isSetField(546);
	}

	public void set(quickfix.dukascopy.field.MDImplicitDelete value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MDImplicitDelete get(quickfix.dukascopy.field.MDImplicitDelete value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MDImplicitDelete getMDImplicitDelete() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MDImplicitDelete());
	}

	public boolean isSet(quickfix.dukascopy.field.MDImplicitDelete field) {
		return isSetField(field);
	}

	public boolean isSetMDImplicitDelete() {
		return isSetField(547);
	}

	public void set(quickfix.dukascopy.field.NoMDEntryTypes value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoMDEntryTypes get(quickfix.dukascopy.field.NoMDEntryTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoMDEntryTypes getNoMDEntryTypes() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoMDEntryTypes());
	}

	public boolean isSet(quickfix.dukascopy.field.NoMDEntryTypes field) {
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
		
	public void set(quickfix.dukascopy.field.MDEntryType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MDEntryType get(quickfix.dukascopy.field.MDEntryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MDEntryType getMDEntryType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MDEntryType());
	}

	public boolean isSet(quickfix.dukascopy.field.MDEntryType field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryType() {
		return isSetField(269);
	}

	}

	public void set(quickfix.dukascopy.field.NoRelatedSym value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoRelatedSym get(quickfix.dukascopy.field.NoRelatedSym value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoRelatedSym getNoRelatedSym() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoRelatedSym());
	}

	public boolean isSet(quickfix.dukascopy.field.NoRelatedSym field) {
		return isSetField(field);
	}

	public boolean isSetNoRelatedSym() {
		return isSetField(146);
	}

	public static class NoRelatedSym extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {55, 65, 48, 22, 454, 460, 461, 167, 762, 200, 541, 224, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 947, 206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 691, 667, 875, 876, 864, 873, 874, 711, 555, 0};

		public NoRelatedSym() {
			super(146, 55, ORDER);
		}
		
	public void set(quickfix.dukascopy.component.Instrument component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.Instrument get(quickfix.dukascopy.component.Instrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.Instrument getInstrument() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.Instrument());
	}

	public void set(quickfix.dukascopy.field.Symbol value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Symbol get(quickfix.dukascopy.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Symbol());
	}

	public boolean isSet(quickfix.dukascopy.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(quickfix.dukascopy.field.SymbolSfx value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SymbolSfx get(quickfix.dukascopy.field.SymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SymbolSfx getSymbolSfx() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SymbolSfx());
	}

	public boolean isSet(quickfix.dukascopy.field.SymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetSymbolSfx() {
		return isSetField(65);
	}

	public void set(quickfix.dukascopy.field.SecurityID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SecurityID get(quickfix.dukascopy.field.SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SecurityID getSecurityID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SecurityID());
	}

	public boolean isSet(quickfix.dukascopy.field.SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(48);
	}

	public void set(quickfix.dukascopy.field.SecurityIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SecurityIDSource get(quickfix.dukascopy.field.SecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SecurityIDSource getSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SecurityIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.SecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityIDSource() {
		return isSetField(22);
	}

	public void set(quickfix.dukascopy.field.NoSecurityAltID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoSecurityAltID get(quickfix.dukascopy.field.NoSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoSecurityAltID getNoSecurityAltID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoSecurityAltID());
	}

	public boolean isSet(quickfix.dukascopy.field.NoSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoSecurityAltID() {
		return isSetField(454);
	}

	public static class NoSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {455, 456, 0};

		public NoSecurityAltID() {
			super(454, 455, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.SecurityAltID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SecurityAltID get(quickfix.dukascopy.field.SecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SecurityAltID getSecurityAltID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SecurityAltID());
	}

	public boolean isSet(quickfix.dukascopy.field.SecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltID() {
		return isSetField(455);
	}

	public void set(quickfix.dukascopy.field.SecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SecurityAltIDSource get(quickfix.dukascopy.field.SecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SecurityAltIDSource getSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SecurityAltIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.SecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltIDSource() {
		return isSetField(456);
	}

	}

	public void set(quickfix.dukascopy.field.Product value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Product get(quickfix.dukascopy.field.Product value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Product getProduct() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Product());
	}

	public boolean isSet(quickfix.dukascopy.field.Product field) {
		return isSetField(field);
	}

	public boolean isSetProduct() {
		return isSetField(460);
	}

	public void set(quickfix.dukascopy.field.CFICode value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CFICode get(quickfix.dukascopy.field.CFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CFICode getCFICode() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CFICode());
	}

	public boolean isSet(quickfix.dukascopy.field.CFICode field) {
		return isSetField(field);
	}

	public boolean isSetCFICode() {
		return isSetField(461);
	}

	public void set(quickfix.dukascopy.field.SecurityType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SecurityType get(quickfix.dukascopy.field.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SecurityType getSecurityType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SecurityType());
	}

	public boolean isSet(quickfix.dukascopy.field.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(quickfix.dukascopy.field.SecuritySubType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SecuritySubType get(quickfix.dukascopy.field.SecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SecuritySubType getSecuritySubType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SecuritySubType());
	}

	public boolean isSet(quickfix.dukascopy.field.SecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySubType() {
		return isSetField(762);
	}

	public void set(quickfix.dukascopy.field.MaturityMonthYear value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MaturityMonthYear get(quickfix.dukascopy.field.MaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MaturityMonthYear());
	}

	public boolean isSet(quickfix.dukascopy.field.MaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYear() {
		return isSetField(200);
	}

	public void set(quickfix.dukascopy.field.MaturityDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MaturityDate get(quickfix.dukascopy.field.MaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MaturityDate getMaturityDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MaturityDate());
	}

	public boolean isSet(quickfix.dukascopy.field.MaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDate() {
		return isSetField(541);
	}

	public void set(quickfix.dukascopy.field.CouponPaymentDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CouponPaymentDate get(quickfix.dukascopy.field.CouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CouponPaymentDate getCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CouponPaymentDate());
	}

	public boolean isSet(quickfix.dukascopy.field.CouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetCouponPaymentDate() {
		return isSetField(224);
	}

	public void set(quickfix.dukascopy.field.IssueDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.IssueDate get(quickfix.dukascopy.field.IssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.IssueDate getIssueDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.IssueDate());
	}

	public boolean isSet(quickfix.dukascopy.field.IssueDate field) {
		return isSetField(field);
	}

	public boolean isSetIssueDate() {
		return isSetField(225);
	}

	public void set(quickfix.dukascopy.field.RepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RepoCollateralSecurityType get(quickfix.dukascopy.field.RepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RepoCollateralSecurityType getRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.dukascopy.field.RepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetRepoCollateralSecurityType() {
		return isSetField(239);
	}

	public void set(quickfix.dukascopy.field.RepurchaseTerm value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RepurchaseTerm get(quickfix.dukascopy.field.RepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RepurchaseTerm getRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RepurchaseTerm());
	}

	public boolean isSet(quickfix.dukascopy.field.RepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseTerm() {
		return isSetField(226);
	}

	public void set(quickfix.dukascopy.field.RepurchaseRate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RepurchaseRate get(quickfix.dukascopy.field.RepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RepurchaseRate getRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RepurchaseRate());
	}

	public boolean isSet(quickfix.dukascopy.field.RepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseRate() {
		return isSetField(227);
	}

	public void set(quickfix.dukascopy.field.Factor value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Factor get(quickfix.dukascopy.field.Factor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Factor getFactor() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Factor());
	}

	public boolean isSet(quickfix.dukascopy.field.Factor field) {
		return isSetField(field);
	}

	public boolean isSetFactor() {
		return isSetField(228);
	}

	public void set(quickfix.dukascopy.field.CreditRating value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CreditRating get(quickfix.dukascopy.field.CreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CreditRating getCreditRating() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CreditRating());
	}

	public boolean isSet(quickfix.dukascopy.field.CreditRating field) {
		return isSetField(field);
	}

	public boolean isSetCreditRating() {
		return isSetField(255);
	}

	public void set(quickfix.dukascopy.field.InstrRegistry value) {
		setField(value);
	}

	public quickfix.dukascopy.field.InstrRegistry get(quickfix.dukascopy.field.InstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.InstrRegistry getInstrRegistry() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.InstrRegistry());
	}

	public boolean isSet(quickfix.dukascopy.field.InstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetInstrRegistry() {
		return isSetField(543);
	}

	public void set(quickfix.dukascopy.field.CountryOfIssue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CountryOfIssue get(quickfix.dukascopy.field.CountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CountryOfIssue getCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CountryOfIssue());
	}

	public boolean isSet(quickfix.dukascopy.field.CountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetCountryOfIssue() {
		return isSetField(470);
	}

	public void set(quickfix.dukascopy.field.StateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.StateOrProvinceOfIssue get(quickfix.dukascopy.field.StateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.StateOrProvinceOfIssue getStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.StateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.dukascopy.field.StateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetStateOrProvinceOfIssue() {
		return isSetField(471);
	}

	public void set(quickfix.dukascopy.field.LocaleOfIssue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LocaleOfIssue get(quickfix.dukascopy.field.LocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LocaleOfIssue getLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LocaleOfIssue());
	}

	public boolean isSet(quickfix.dukascopy.field.LocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLocaleOfIssue() {
		return isSetField(472);
	}

	public void set(quickfix.dukascopy.field.RedemptionDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RedemptionDate get(quickfix.dukascopy.field.RedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RedemptionDate getRedemptionDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RedemptionDate());
	}

	public boolean isSet(quickfix.dukascopy.field.RedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetRedemptionDate() {
		return isSetField(240);
	}

	public void set(quickfix.dukascopy.field.StrikePrice value) {
		setField(value);
	}

	public quickfix.dukascopy.field.StrikePrice get(quickfix.dukascopy.field.StrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.StrikePrice getStrikePrice() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.StrikePrice());
	}

	public boolean isSet(quickfix.dukascopy.field.StrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetStrikePrice() {
		return isSetField(202);
	}

	public void set(quickfix.dukascopy.field.StrikeCurrency value) {
		setField(value);
	}

	public quickfix.dukascopy.field.StrikeCurrency get(quickfix.dukascopy.field.StrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.StrikeCurrency getStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.StrikeCurrency());
	}

	public boolean isSet(quickfix.dukascopy.field.StrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetStrikeCurrency() {
		return isSetField(947);
	}

	public void set(quickfix.dukascopy.field.OptAttribute value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OptAttribute get(quickfix.dukascopy.field.OptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OptAttribute getOptAttribute() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OptAttribute());
	}

	public boolean isSet(quickfix.dukascopy.field.OptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetOptAttribute() {
		return isSetField(206);
	}

	public void set(quickfix.dukascopy.field.ContractMultiplier value) {
		setField(value);
	}

	public quickfix.dukascopy.field.ContractMultiplier get(quickfix.dukascopy.field.ContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.ContractMultiplier getContractMultiplier() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.ContractMultiplier());
	}

	public boolean isSet(quickfix.dukascopy.field.ContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetContractMultiplier() {
		return isSetField(231);
	}

	public void set(quickfix.dukascopy.field.CouponRate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CouponRate get(quickfix.dukascopy.field.CouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CouponRate getCouponRate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CouponRate());
	}

	public boolean isSet(quickfix.dukascopy.field.CouponRate field) {
		return isSetField(field);
	}

	public boolean isSetCouponRate() {
		return isSetField(223);
	}

	public void set(quickfix.dukascopy.field.SecurityExchange value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SecurityExchange get(quickfix.dukascopy.field.SecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SecurityExchange());
	}

	public boolean isSet(quickfix.dukascopy.field.SecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetSecurityExchange() {
		return isSetField(207);
	}

	public void set(quickfix.dukascopy.field.Issuer value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Issuer get(quickfix.dukascopy.field.Issuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Issuer getIssuer() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Issuer());
	}

	public boolean isSet(quickfix.dukascopy.field.Issuer field) {
		return isSetField(field);
	}

	public boolean isSetIssuer() {
		return isSetField(106);
	}

	public void set(quickfix.dukascopy.field.EncodedIssuerLen value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedIssuerLen get(quickfix.dukascopy.field.EncodedIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedIssuerLen getEncodedIssuerLen() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedIssuerLen());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuerLen() {
		return isSetField(348);
	}

	public void set(quickfix.dukascopy.field.EncodedIssuer value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedIssuer get(quickfix.dukascopy.field.EncodedIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedIssuer getEncodedIssuer() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedIssuer());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuer() {
		return isSetField(349);
	}

	public void set(quickfix.dukascopy.field.SecurityDesc value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SecurityDesc get(quickfix.dukascopy.field.SecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SecurityDesc getSecurityDesc() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SecurityDesc());
	}

	public boolean isSet(quickfix.dukascopy.field.SecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetSecurityDesc() {
		return isSetField(107);
	}

	public void set(quickfix.dukascopy.field.EncodedSecurityDescLen value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedSecurityDescLen get(quickfix.dukascopy.field.EncodedSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedSecurityDescLen getEncodedSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedSecurityDescLen());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDescLen() {
		return isSetField(350);
	}

	public void set(quickfix.dukascopy.field.EncodedSecurityDesc value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedSecurityDesc get(quickfix.dukascopy.field.EncodedSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedSecurityDesc getEncodedSecurityDesc() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedSecurityDesc());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDesc() {
		return isSetField(351);
	}

	public void set(quickfix.dukascopy.field.Pool value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Pool get(quickfix.dukascopy.field.Pool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Pool getPool() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Pool());
	}

	public boolean isSet(quickfix.dukascopy.field.Pool field) {
		return isSetField(field);
	}

	public boolean isSetPool() {
		return isSetField(691);
	}

	public void set(quickfix.dukascopy.field.ContractSettlMonth value) {
		setField(value);
	}

	public quickfix.dukascopy.field.ContractSettlMonth get(quickfix.dukascopy.field.ContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.ContractSettlMonth getContractSettlMonth() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.ContractSettlMonth());
	}

	public boolean isSet(quickfix.dukascopy.field.ContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetContractSettlMonth() {
		return isSetField(667);
	}

	public void set(quickfix.dukascopy.field.CPProgram value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CPProgram get(quickfix.dukascopy.field.CPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CPProgram getCPProgram() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CPProgram());
	}

	public boolean isSet(quickfix.dukascopy.field.CPProgram field) {
		return isSetField(field);
	}

	public boolean isSetCPProgram() {
		return isSetField(875);
	}

	public void set(quickfix.dukascopy.field.CPRegType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CPRegType get(quickfix.dukascopy.field.CPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CPRegType getCPRegType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CPRegType());
	}

	public boolean isSet(quickfix.dukascopy.field.CPRegType field) {
		return isSetField(field);
	}

	public boolean isSetCPRegType() {
		return isSetField(876);
	}

	public void set(quickfix.dukascopy.field.NoEvents value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoEvents get(quickfix.dukascopy.field.NoEvents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoEvents getNoEvents() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoEvents());
	}

	public boolean isSet(quickfix.dukascopy.field.NoEvents field) {
		return isSetField(field);
	}

	public boolean isSetNoEvents() {
		return isSetField(864);
	}

	public static class NoEvents extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {865, 866, 867, 868, 0};

		public NoEvents() {
			super(864, 865, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.EventType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EventType get(quickfix.dukascopy.field.EventType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EventType getEventType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EventType());
	}

	public boolean isSet(quickfix.dukascopy.field.EventType field) {
		return isSetField(field);
	}

	public boolean isSetEventType() {
		return isSetField(865);
	}

	public void set(quickfix.dukascopy.field.EventDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EventDate get(quickfix.dukascopy.field.EventDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EventDate getEventDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EventDate());
	}

	public boolean isSet(quickfix.dukascopy.field.EventDate field) {
		return isSetField(field);
	}

	public boolean isSetEventDate() {
		return isSetField(866);
	}

	public void set(quickfix.dukascopy.field.EventPx value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EventPx get(quickfix.dukascopy.field.EventPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EventPx getEventPx() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EventPx());
	}

	public boolean isSet(quickfix.dukascopy.field.EventPx field) {
		return isSetField(field);
	}

	public boolean isSetEventPx() {
		return isSetField(867);
	}

	public void set(quickfix.dukascopy.field.EventText value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EventText get(quickfix.dukascopy.field.EventText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EventText getEventText() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EventText());
	}

	public boolean isSet(quickfix.dukascopy.field.EventText field) {
		return isSetField(field);
	}

	public boolean isSetEventText() {
		return isSetField(868);
	}

	}

	public void set(quickfix.dukascopy.field.DatedDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DatedDate get(quickfix.dukascopy.field.DatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DatedDate getDatedDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DatedDate());
	}

	public boolean isSet(quickfix.dukascopy.field.DatedDate field) {
		return isSetField(field);
	}

	public boolean isSetDatedDate() {
		return isSetField(873);
	}

	public void set(quickfix.dukascopy.field.InterestAccrualDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.InterestAccrualDate get(quickfix.dukascopy.field.InterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.InterestAccrualDate getInterestAccrualDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.InterestAccrualDate());
	}

	public boolean isSet(quickfix.dukascopy.field.InterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetInterestAccrualDate() {
		return isSetField(874);
	}

	public void set(quickfix.dukascopy.field.NoUnderlyings value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoUnderlyings get(quickfix.dukascopy.field.NoUnderlyings value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoUnderlyings getNoUnderlyings() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoUnderlyings());
	}

	public boolean isSet(quickfix.dukascopy.field.NoUnderlyings field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyings() {
		return isSetField(711);
	}

	public static class NoUnderlyings extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {311, 312, 309, 305, 457, 462, 463, 310, 763, 313, 542, 241, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 435, 308, 306, 362, 363, 307, 364, 365, 877, 878, 318, 879, 810, 882, 883, 884, 885, 886, 887, 0};

		public NoUnderlyings() {
			super(711, 311, ORDER);
		}
		
	public void set(quickfix.dukascopy.component.UnderlyingInstrument component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.UnderlyingInstrument get(quickfix.dukascopy.component.UnderlyingInstrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.UnderlyingInstrument getUnderlyingInstrument() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.UnderlyingInstrument());
	}

	public void set(quickfix.dukascopy.field.UnderlyingSymbol value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingSymbol get(quickfix.dukascopy.field.UnderlyingSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingSymbol getUnderlyingSymbol() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingSymbol());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingSymbol field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbol() {
		return isSetField(311);
	}

	public void set(quickfix.dukascopy.field.UnderlyingSymbolSfx value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingSymbolSfx get(quickfix.dukascopy.field.UnderlyingSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingSymbolSfx getUnderlyingSymbolSfx() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingSymbolSfx());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbolSfx() {
		return isSetField(312);
	}

	public void set(quickfix.dukascopy.field.UnderlyingSecurityID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingSecurityID get(quickfix.dukascopy.field.UnderlyingSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingSecurityID getUnderlyingSecurityID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingSecurityID());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityID() {
		return isSetField(309);
	}

	public void set(quickfix.dukascopy.field.UnderlyingSecurityIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingSecurityIDSource get(quickfix.dukascopy.field.UnderlyingSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingSecurityIDSource getUnderlyingSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingSecurityIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityIDSource() {
		return isSetField(305);
	}

	public void set(quickfix.dukascopy.field.NoUnderlyingSecurityAltID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoUnderlyingSecurityAltID get(quickfix.dukascopy.field.NoUnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoUnderlyingSecurityAltID getNoUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoUnderlyingSecurityAltID());
	}

	public boolean isSet(quickfix.dukascopy.field.NoUnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingSecurityAltID() {
		return isSetField(457);
	}

	public static class NoUnderlyingSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {458, 459, 0};

		public NoUnderlyingSecurityAltID() {
			super(457, 458, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.UnderlyingSecurityAltID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingSecurityAltID get(quickfix.dukascopy.field.UnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingSecurityAltID getUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingSecurityAltID());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltID() {
		return isSetField(458);
	}

	public void set(quickfix.dukascopy.field.UnderlyingSecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingSecurityAltIDSource get(quickfix.dukascopy.field.UnderlyingSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingSecurityAltIDSource getUnderlyingSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingSecurityAltIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltIDSource() {
		return isSetField(459);
	}

	}

	public void set(quickfix.dukascopy.field.UnderlyingProduct value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingProduct get(quickfix.dukascopy.field.UnderlyingProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingProduct getUnderlyingProduct() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingProduct());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingProduct field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingProduct() {
		return isSetField(462);
	}

	public void set(quickfix.dukascopy.field.UnderlyingCFICode value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingCFICode get(quickfix.dukascopy.field.UnderlyingCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingCFICode getUnderlyingCFICode() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingCFICode());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingCFICode field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCFICode() {
		return isSetField(463);
	}

	public void set(quickfix.dukascopy.field.UnderlyingSecurityType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingSecurityType get(quickfix.dukascopy.field.UnderlyingSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingSecurityType getUnderlyingSecurityType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingSecurityType());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityType() {
		return isSetField(310);
	}

	public void set(quickfix.dukascopy.field.UnderlyingSecuritySubType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingSecuritySubType get(quickfix.dukascopy.field.UnderlyingSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingSecuritySubType getUnderlyingSecuritySubType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingSecuritySubType());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecuritySubType() {
		return isSetField(763);
	}

	public void set(quickfix.dukascopy.field.UnderlyingMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingMaturityMonthYear get(quickfix.dukascopy.field.UnderlyingMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingMaturityMonthYear getUnderlyingMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingMaturityMonthYear());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityMonthYear() {
		return isSetField(313);
	}

	public void set(quickfix.dukascopy.field.UnderlyingMaturityDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingMaturityDate get(quickfix.dukascopy.field.UnderlyingMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingMaturityDate getUnderlyingMaturityDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingMaturityDate());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityDate() {
		return isSetField(542);
	}

	public void set(quickfix.dukascopy.field.UnderlyingCouponPaymentDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingCouponPaymentDate get(quickfix.dukascopy.field.UnderlyingCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingCouponPaymentDate getUnderlyingCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingCouponPaymentDate());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponPaymentDate() {
		return isSetField(241);
	}

	public void set(quickfix.dukascopy.field.UnderlyingIssueDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingIssueDate get(quickfix.dukascopy.field.UnderlyingIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingIssueDate getUnderlyingIssueDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingIssueDate());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssueDate() {
		return isSetField(242);
	}

	public void set(quickfix.dukascopy.field.UnderlyingRepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingRepoCollateralSecurityType get(quickfix.dukascopy.field.UnderlyingRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingRepoCollateralSecurityType getUnderlyingRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingRepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepoCollateralSecurityType() {
		return isSetField(243);
	}

	public void set(quickfix.dukascopy.field.UnderlyingRepurchaseTerm value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingRepurchaseTerm get(quickfix.dukascopy.field.UnderlyingRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingRepurchaseTerm getUnderlyingRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingRepurchaseTerm());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseTerm() {
		return isSetField(244);
	}

	public void set(quickfix.dukascopy.field.UnderlyingRepurchaseRate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingRepurchaseRate get(quickfix.dukascopy.field.UnderlyingRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingRepurchaseRate getUnderlyingRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingRepurchaseRate());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseRate() {
		return isSetField(245);
	}

	public void set(quickfix.dukascopy.field.UnderlyingFactor value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingFactor get(quickfix.dukascopy.field.UnderlyingFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingFactor getUnderlyingFactor() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingFactor());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingFactor field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFactor() {
		return isSetField(246);
	}

	public void set(quickfix.dukascopy.field.UnderlyingCreditRating value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingCreditRating get(quickfix.dukascopy.field.UnderlyingCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingCreditRating getUnderlyingCreditRating() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingCreditRating());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCreditRating() {
		return isSetField(256);
	}

	public void set(quickfix.dukascopy.field.UnderlyingInstrRegistry value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingInstrRegistry get(quickfix.dukascopy.field.UnderlyingInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingInstrRegistry getUnderlyingInstrRegistry() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingInstrRegistry());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrRegistry() {
		return isSetField(595);
	}

	public void set(quickfix.dukascopy.field.UnderlyingCountryOfIssue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingCountryOfIssue get(quickfix.dukascopy.field.UnderlyingCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingCountryOfIssue getUnderlyingCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingCountryOfIssue());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCountryOfIssue() {
		return isSetField(592);
	}

	public void set(quickfix.dukascopy.field.UnderlyingStateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingStateOrProvinceOfIssue get(quickfix.dukascopy.field.UnderlyingStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingStateOrProvinceOfIssue getUnderlyingStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingStateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStateOrProvinceOfIssue() {
		return isSetField(593);
	}

	public void set(quickfix.dukascopy.field.UnderlyingLocaleOfIssue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingLocaleOfIssue get(quickfix.dukascopy.field.UnderlyingLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingLocaleOfIssue getUnderlyingLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingLocaleOfIssue());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLocaleOfIssue() {
		return isSetField(594);
	}

	public void set(quickfix.dukascopy.field.UnderlyingRedemptionDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingRedemptionDate get(quickfix.dukascopy.field.UnderlyingRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingRedemptionDate getUnderlyingRedemptionDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingRedemptionDate());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRedemptionDate() {
		return isSetField(247);
	}

	public void set(quickfix.dukascopy.field.UnderlyingStrikePrice value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingStrikePrice get(quickfix.dukascopy.field.UnderlyingStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingStrikePrice getUnderlyingStrikePrice() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingStrikePrice());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikePrice() {
		return isSetField(316);
	}

	public void set(quickfix.dukascopy.field.UnderlyingStrikeCurrency value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingStrikeCurrency get(quickfix.dukascopy.field.UnderlyingStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingStrikeCurrency getUnderlyingStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingStrikeCurrency());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikeCurrency() {
		return isSetField(941);
	}

	public void set(quickfix.dukascopy.field.UnderlyingOptAttribute value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingOptAttribute get(quickfix.dukascopy.field.UnderlyingOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingOptAttribute getUnderlyingOptAttribute() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingOptAttribute());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingOptAttribute() {
		return isSetField(317);
	}

	public void set(quickfix.dukascopy.field.UnderlyingContractMultiplier value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingContractMultiplier get(quickfix.dukascopy.field.UnderlyingContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingContractMultiplier getUnderlyingContractMultiplier() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingContractMultiplier());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingContractMultiplier() {
		return isSetField(436);
	}

	public void set(quickfix.dukascopy.field.UnderlyingCouponRate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingCouponRate get(quickfix.dukascopy.field.UnderlyingCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingCouponRate getUnderlyingCouponRate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingCouponRate());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponRate() {
		return isSetField(435);
	}

	public void set(quickfix.dukascopy.field.UnderlyingSecurityExchange value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingSecurityExchange get(quickfix.dukascopy.field.UnderlyingSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingSecurityExchange getUnderlyingSecurityExchange() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingSecurityExchange());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityExchange() {
		return isSetField(308);
	}

	public void set(quickfix.dukascopy.field.UnderlyingIssuer value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingIssuer get(quickfix.dukascopy.field.UnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingIssuer getUnderlyingIssuer() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingIssuer());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssuer() {
		return isSetField(306);
	}

	public void set(quickfix.dukascopy.field.EncodedUnderlyingIssuerLen value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedUnderlyingIssuerLen get(quickfix.dukascopy.field.EncodedUnderlyingIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedUnderlyingIssuerLen getEncodedUnderlyingIssuerLen() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedUnderlyingIssuerLen());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedUnderlyingIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuerLen() {
		return isSetField(362);
	}

	public void set(quickfix.dukascopy.field.EncodedUnderlyingIssuer value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedUnderlyingIssuer get(quickfix.dukascopy.field.EncodedUnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedUnderlyingIssuer getEncodedUnderlyingIssuer() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedUnderlyingIssuer());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedUnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuer() {
		return isSetField(363);
	}

	public void set(quickfix.dukascopy.field.UnderlyingSecurityDesc value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingSecurityDesc get(quickfix.dukascopy.field.UnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingSecurityDesc getUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingSecurityDesc());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityDesc() {
		return isSetField(307);
	}

	public void set(quickfix.dukascopy.field.EncodedUnderlyingSecurityDescLen value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedUnderlyingSecurityDescLen get(quickfix.dukascopy.field.EncodedUnderlyingSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedUnderlyingSecurityDescLen getEncodedUnderlyingSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedUnderlyingSecurityDescLen());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedUnderlyingSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDescLen() {
		return isSetField(364);
	}

	public void set(quickfix.dukascopy.field.EncodedUnderlyingSecurityDesc value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedUnderlyingSecurityDesc get(quickfix.dukascopy.field.EncodedUnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedUnderlyingSecurityDesc getEncodedUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedUnderlyingSecurityDesc());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedUnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDesc() {
		return isSetField(365);
	}

	public void set(quickfix.dukascopy.field.UnderlyingCPProgram value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingCPProgram get(quickfix.dukascopy.field.UnderlyingCPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingCPProgram getUnderlyingCPProgram() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingCPProgram());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingCPProgram field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPProgram() {
		return isSetField(877);
	}

	public void set(quickfix.dukascopy.field.UnderlyingCPRegType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingCPRegType get(quickfix.dukascopy.field.UnderlyingCPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingCPRegType getUnderlyingCPRegType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingCPRegType());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingCPRegType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPRegType() {
		return isSetField(878);
	}

	public void set(quickfix.dukascopy.field.UnderlyingCurrency value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingCurrency get(quickfix.dukascopy.field.UnderlyingCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingCurrency getUnderlyingCurrency() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingCurrency());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrency() {
		return isSetField(318);
	}

	public void set(quickfix.dukascopy.field.UnderlyingQty value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingQty get(quickfix.dukascopy.field.UnderlyingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingQty getUnderlyingQty() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingQty());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingQty field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingQty() {
		return isSetField(879);
	}

	public void set(quickfix.dukascopy.field.UnderlyingPx value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingPx get(quickfix.dukascopy.field.UnderlyingPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingPx getUnderlyingPx() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingPx());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingPx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPx() {
		return isSetField(810);
	}

	public void set(quickfix.dukascopy.field.UnderlyingDirtyPrice value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingDirtyPrice get(quickfix.dukascopy.field.UnderlyingDirtyPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingDirtyPrice getUnderlyingDirtyPrice() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingDirtyPrice());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingDirtyPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingDirtyPrice() {
		return isSetField(882);
	}

	public void set(quickfix.dukascopy.field.UnderlyingEndPrice value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingEndPrice get(quickfix.dukascopy.field.UnderlyingEndPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingEndPrice getUnderlyingEndPrice() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingEndPrice());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingEndPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndPrice() {
		return isSetField(883);
	}

	public void set(quickfix.dukascopy.field.UnderlyingStartValue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingStartValue get(quickfix.dukascopy.field.UnderlyingStartValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingStartValue getUnderlyingStartValue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingStartValue());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingStartValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStartValue() {
		return isSetField(884);
	}

	public void set(quickfix.dukascopy.field.UnderlyingCurrentValue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingCurrentValue get(quickfix.dukascopy.field.UnderlyingCurrentValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingCurrentValue getUnderlyingCurrentValue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingCurrentValue());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingCurrentValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrentValue() {
		return isSetField(885);
	}

	public void set(quickfix.dukascopy.field.UnderlyingEndValue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingEndValue get(quickfix.dukascopy.field.UnderlyingEndValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingEndValue getUnderlyingEndValue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingEndValue());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingEndValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndValue() {
		return isSetField(886);
	}

	public void set(quickfix.dukascopy.component.UnderlyingStipulations component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.UnderlyingStipulations get(quickfix.dukascopy.component.UnderlyingStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.UnderlyingStipulations getUnderlyingStipulations() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.UnderlyingStipulations());
	}

	public void set(quickfix.dukascopy.field.NoUnderlyingStips value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoUnderlyingStips get(quickfix.dukascopy.field.NoUnderlyingStips value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoUnderlyingStips getNoUnderlyingStips() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoUnderlyingStips());
	}

	public boolean isSet(quickfix.dukascopy.field.NoUnderlyingStips field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingStips() {
		return isSetField(887);
	}

	public static class NoUnderlyingStips extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {888, 889, 0};

		public NoUnderlyingStips() {
			super(887, 888, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.UnderlyingStipType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingStipType get(quickfix.dukascopy.field.UnderlyingStipType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingStipType getUnderlyingStipType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingStipType());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingStipType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipType() {
		return isSetField(888);
	}

	public void set(quickfix.dukascopy.field.UnderlyingStipValue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnderlyingStipValue get(quickfix.dukascopy.field.UnderlyingStipValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnderlyingStipValue getUnderlyingStipValue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnderlyingStipValue());
	}

	public boolean isSet(quickfix.dukascopy.field.UnderlyingStipValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipValue() {
		return isSetField(889);
	}

	}

	}

	public void set(quickfix.dukascopy.field.NoLegs value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoLegs get(quickfix.dukascopy.field.NoLegs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoLegs getNoLegs() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoLegs());
	}

	public boolean isSet(quickfix.dukascopy.field.NoLegs field) {
		return isSetField(field);
	}

	public boolean isSetNoLegs() {
		return isSetField(555);
	}

	public static class NoLegs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {600, 601, 602, 603, 604, 607, 608, 609, 764, 610, 611, 248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740, 739, 955, 956, 0};

		public NoLegs() {
			super(555, 600, ORDER);
		}
		
	public void set(quickfix.dukascopy.component.InstrumentLeg component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.InstrumentLeg get(quickfix.dukascopy.component.InstrumentLeg component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.InstrumentLeg getInstrumentLeg() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.InstrumentLeg());
	}

	public void set(quickfix.dukascopy.field.LegSymbol value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSymbol get(quickfix.dukascopy.field.LegSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSymbol getLegSymbol() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSymbol());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSymbol field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbol() {
		return isSetField(600);
	}

	public void set(quickfix.dukascopy.field.LegSymbolSfx value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSymbolSfx get(quickfix.dukascopy.field.LegSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSymbolSfx getLegSymbolSfx() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSymbolSfx());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbolSfx() {
		return isSetField(601);
	}

	public void set(quickfix.dukascopy.field.LegSecurityID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSecurityID get(quickfix.dukascopy.field.LegSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSecurityID getLegSecurityID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSecurityID());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityID() {
		return isSetField(602);
	}

	public void set(quickfix.dukascopy.field.LegSecurityIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSecurityIDSource get(quickfix.dukascopy.field.LegSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSecurityIDSource getLegSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSecurityIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityIDSource() {
		return isSetField(603);
	}

	public void set(quickfix.dukascopy.field.NoLegSecurityAltID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoLegSecurityAltID get(quickfix.dukascopy.field.NoLegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoLegSecurityAltID getNoLegSecurityAltID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoLegSecurityAltID());
	}

	public boolean isSet(quickfix.dukascopy.field.NoLegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoLegSecurityAltID() {
		return isSetField(604);
	}

	public static class NoLegSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {605, 606, 0};

		public NoLegSecurityAltID() {
			super(604, 605, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.LegSecurityAltID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSecurityAltID get(quickfix.dukascopy.field.LegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSecurityAltID getLegSecurityAltID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSecurityAltID());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltID() {
		return isSetField(605);
	}

	public void set(quickfix.dukascopy.field.LegSecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSecurityAltIDSource get(quickfix.dukascopy.field.LegSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSecurityAltIDSource getLegSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSecurityAltIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltIDSource() {
		return isSetField(606);
	}

	}

	public void set(quickfix.dukascopy.field.LegProduct value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegProduct get(quickfix.dukascopy.field.LegProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegProduct getLegProduct() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegProduct());
	}

	public boolean isSet(quickfix.dukascopy.field.LegProduct field) {
		return isSetField(field);
	}

	public boolean isSetLegProduct() {
		return isSetField(607);
	}

	public void set(quickfix.dukascopy.field.LegCFICode value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegCFICode get(quickfix.dukascopy.field.LegCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegCFICode getLegCFICode() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegCFICode());
	}

	public boolean isSet(quickfix.dukascopy.field.LegCFICode field) {
		return isSetField(field);
	}

	public boolean isSetLegCFICode() {
		return isSetField(608);
	}

	public void set(quickfix.dukascopy.field.LegSecurityType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSecurityType get(quickfix.dukascopy.field.LegSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSecurityType getLegSecurityType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSecurityType());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityType() {
		return isSetField(609);
	}

	public void set(quickfix.dukascopy.field.LegSecuritySubType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSecuritySubType get(quickfix.dukascopy.field.LegSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSecuritySubType getLegSecuritySubType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSecuritySubType());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecuritySubType() {
		return isSetField(764);
	}

	public void set(quickfix.dukascopy.field.LegMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegMaturityMonthYear get(quickfix.dukascopy.field.LegMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegMaturityMonthYear getLegMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegMaturityMonthYear());
	}

	public boolean isSet(quickfix.dukascopy.field.LegMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityMonthYear() {
		return isSetField(610);
	}

	public void set(quickfix.dukascopy.field.LegMaturityDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegMaturityDate get(quickfix.dukascopy.field.LegMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegMaturityDate getLegMaturityDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegMaturityDate());
	}

	public boolean isSet(quickfix.dukascopy.field.LegMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityDate() {
		return isSetField(611);
	}

	public void set(quickfix.dukascopy.field.LegCouponPaymentDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegCouponPaymentDate get(quickfix.dukascopy.field.LegCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegCouponPaymentDate getLegCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegCouponPaymentDate());
	}

	public boolean isSet(quickfix.dukascopy.field.LegCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponPaymentDate() {
		return isSetField(248);
	}

	public void set(quickfix.dukascopy.field.LegIssueDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegIssueDate get(quickfix.dukascopy.field.LegIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegIssueDate getLegIssueDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegIssueDate());
	}

	public boolean isSet(quickfix.dukascopy.field.LegIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetLegIssueDate() {
		return isSetField(249);
	}

	public void set(quickfix.dukascopy.field.LegRepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegRepoCollateralSecurityType get(quickfix.dukascopy.field.LegRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegRepoCollateralSecurityType getLegRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegRepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.dukascopy.field.LegRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegRepoCollateralSecurityType() {
		return isSetField(250);
	}

	public void set(quickfix.dukascopy.field.LegRepurchaseTerm value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegRepurchaseTerm get(quickfix.dukascopy.field.LegRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegRepurchaseTerm getLegRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegRepurchaseTerm());
	}

	public boolean isSet(quickfix.dukascopy.field.LegRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseTerm() {
		return isSetField(251);
	}

	public void set(quickfix.dukascopy.field.LegRepurchaseRate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegRepurchaseRate get(quickfix.dukascopy.field.LegRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegRepurchaseRate getLegRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegRepurchaseRate());
	}

	public boolean isSet(quickfix.dukascopy.field.LegRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseRate() {
		return isSetField(252);
	}

	public void set(quickfix.dukascopy.field.LegFactor value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegFactor get(quickfix.dukascopy.field.LegFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegFactor getLegFactor() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegFactor());
	}

	public boolean isSet(quickfix.dukascopy.field.LegFactor field) {
		return isSetField(field);
	}

	public boolean isSetLegFactor() {
		return isSetField(253);
	}

	public void set(quickfix.dukascopy.field.LegCreditRating value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegCreditRating get(quickfix.dukascopy.field.LegCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegCreditRating getLegCreditRating() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegCreditRating());
	}

	public boolean isSet(quickfix.dukascopy.field.LegCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetLegCreditRating() {
		return isSetField(257);
	}

	public void set(quickfix.dukascopy.field.LegInstrRegistry value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegInstrRegistry get(quickfix.dukascopy.field.LegInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegInstrRegistry getLegInstrRegistry() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegInstrRegistry());
	}

	public boolean isSet(quickfix.dukascopy.field.LegInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetLegInstrRegistry() {
		return isSetField(599);
	}

	public void set(quickfix.dukascopy.field.LegCountryOfIssue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegCountryOfIssue get(quickfix.dukascopy.field.LegCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegCountryOfIssue getLegCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegCountryOfIssue());
	}

	public boolean isSet(quickfix.dukascopy.field.LegCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegCountryOfIssue() {
		return isSetField(596);
	}

	public void set(quickfix.dukascopy.field.LegStateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegStateOrProvinceOfIssue get(quickfix.dukascopy.field.LegStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegStateOrProvinceOfIssue getLegStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegStateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.dukascopy.field.LegStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegStateOrProvinceOfIssue() {
		return isSetField(597);
	}

	public void set(quickfix.dukascopy.field.LegLocaleOfIssue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegLocaleOfIssue get(quickfix.dukascopy.field.LegLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegLocaleOfIssue getLegLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegLocaleOfIssue());
	}

	public boolean isSet(quickfix.dukascopy.field.LegLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegLocaleOfIssue() {
		return isSetField(598);
	}

	public void set(quickfix.dukascopy.field.LegRedemptionDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegRedemptionDate get(quickfix.dukascopy.field.LegRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegRedemptionDate getLegRedemptionDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegRedemptionDate());
	}

	public boolean isSet(quickfix.dukascopy.field.LegRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetLegRedemptionDate() {
		return isSetField(254);
	}

	public void set(quickfix.dukascopy.field.LegStrikePrice value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegStrikePrice get(quickfix.dukascopy.field.LegStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegStrikePrice getLegStrikePrice() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegStrikePrice());
	}

	public boolean isSet(quickfix.dukascopy.field.LegStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikePrice() {
		return isSetField(612);
	}

	public void set(quickfix.dukascopy.field.LegStrikeCurrency value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegStrikeCurrency get(quickfix.dukascopy.field.LegStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegStrikeCurrency getLegStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegStrikeCurrency());
	}

	public boolean isSet(quickfix.dukascopy.field.LegStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikeCurrency() {
		return isSetField(942);
	}

	public void set(quickfix.dukascopy.field.LegOptAttribute value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegOptAttribute get(quickfix.dukascopy.field.LegOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegOptAttribute getLegOptAttribute() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegOptAttribute());
	}

	public boolean isSet(quickfix.dukascopy.field.LegOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetLegOptAttribute() {
		return isSetField(613);
	}

	public void set(quickfix.dukascopy.field.LegContractMultiplier value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegContractMultiplier get(quickfix.dukascopy.field.LegContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegContractMultiplier getLegContractMultiplier() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegContractMultiplier());
	}

	public boolean isSet(quickfix.dukascopy.field.LegContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetLegContractMultiplier() {
		return isSetField(614);
	}

	public void set(quickfix.dukascopy.field.LegCouponRate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegCouponRate get(quickfix.dukascopy.field.LegCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegCouponRate getLegCouponRate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegCouponRate());
	}

	public boolean isSet(quickfix.dukascopy.field.LegCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponRate() {
		return isSetField(615);
	}

	public void set(quickfix.dukascopy.field.LegSecurityExchange value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSecurityExchange get(quickfix.dukascopy.field.LegSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSecurityExchange getLegSecurityExchange() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSecurityExchange());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityExchange() {
		return isSetField(616);
	}

	public void set(quickfix.dukascopy.field.LegIssuer value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegIssuer get(quickfix.dukascopy.field.LegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegIssuer getLegIssuer() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegIssuer());
	}

	public boolean isSet(quickfix.dukascopy.field.LegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetLegIssuer() {
		return isSetField(617);
	}

	public void set(quickfix.dukascopy.field.EncodedLegIssuerLen value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedLegIssuerLen get(quickfix.dukascopy.field.EncodedLegIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedLegIssuerLen getEncodedLegIssuerLen() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedLegIssuerLen());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedLegIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuerLen() {
		return isSetField(618);
	}

	public void set(quickfix.dukascopy.field.EncodedLegIssuer value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedLegIssuer get(quickfix.dukascopy.field.EncodedLegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedLegIssuer getEncodedLegIssuer() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedLegIssuer());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedLegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuer() {
		return isSetField(619);
	}

	public void set(quickfix.dukascopy.field.LegSecurityDesc value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSecurityDesc get(quickfix.dukascopy.field.LegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSecurityDesc getLegSecurityDesc() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSecurityDesc());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityDesc() {
		return isSetField(620);
	}

	public void set(quickfix.dukascopy.field.EncodedLegSecurityDescLen value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedLegSecurityDescLen get(quickfix.dukascopy.field.EncodedLegSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedLegSecurityDescLen getEncodedLegSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedLegSecurityDescLen());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedLegSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDescLen() {
		return isSetField(621);
	}

	public void set(quickfix.dukascopy.field.EncodedLegSecurityDesc value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedLegSecurityDesc get(quickfix.dukascopy.field.EncodedLegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedLegSecurityDesc getEncodedLegSecurityDesc() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedLegSecurityDesc());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedLegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDesc() {
		return isSetField(622);
	}

	public void set(quickfix.dukascopy.field.LegRatioQty value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegRatioQty get(quickfix.dukascopy.field.LegRatioQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegRatioQty getLegRatioQty() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegRatioQty());
	}

	public boolean isSet(quickfix.dukascopy.field.LegRatioQty field) {
		return isSetField(field);
	}

	public boolean isSetLegRatioQty() {
		return isSetField(623);
	}

	public void set(quickfix.dukascopy.field.LegSide value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSide get(quickfix.dukascopy.field.LegSide value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSide getLegSide() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSide());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSide field) {
		return isSetField(field);
	}

	public boolean isSetLegSide() {
		return isSetField(624);
	}

	public void set(quickfix.dukascopy.field.LegCurrency value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegCurrency get(quickfix.dukascopy.field.LegCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegCurrency getLegCurrency() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegCurrency());
	}

	public boolean isSet(quickfix.dukascopy.field.LegCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegCurrency() {
		return isSetField(556);
	}

	public void set(quickfix.dukascopy.field.LegPool value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegPool get(quickfix.dukascopy.field.LegPool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegPool getLegPool() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegPool());
	}

	public boolean isSet(quickfix.dukascopy.field.LegPool field) {
		return isSetField(field);
	}

	public boolean isSetLegPool() {
		return isSetField(740);
	}

	public void set(quickfix.dukascopy.field.LegDatedDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegDatedDate get(quickfix.dukascopy.field.LegDatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegDatedDate getLegDatedDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegDatedDate());
	}

	public boolean isSet(quickfix.dukascopy.field.LegDatedDate field) {
		return isSetField(field);
	}

	public boolean isSetLegDatedDate() {
		return isSetField(739);
	}

	public void set(quickfix.dukascopy.field.LegContractSettlMonth value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegContractSettlMonth get(quickfix.dukascopy.field.LegContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegContractSettlMonth getLegContractSettlMonth() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegContractSettlMonth());
	}

	public boolean isSet(quickfix.dukascopy.field.LegContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetLegContractSettlMonth() {
		return isSetField(955);
	}

	public void set(quickfix.dukascopy.field.LegInterestAccrualDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegInterestAccrualDate get(quickfix.dukascopy.field.LegInterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegInterestAccrualDate getLegInterestAccrualDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegInterestAccrualDate());
	}

	public boolean isSet(quickfix.dukascopy.field.LegInterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetLegInterestAccrualDate() {
		return isSetField(956);
	}

	}

	}

	public void set(quickfix.dukascopy.field.NoTradingSessions value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoTradingSessions get(quickfix.dukascopy.field.NoTradingSessions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoTradingSessions getNoTradingSessions() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoTradingSessions());
	}

	public boolean isSet(quickfix.dukascopy.field.NoTradingSessions field) {
		return isSetField(field);
	}

	public boolean isSetNoTradingSessions() {
		return isSetField(386);
	}

	public static class NoTradingSessions extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {336, 625, 0};

		public NoTradingSessions() {
			super(386, 336, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.TradingSessionID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradingSessionID get(quickfix.dukascopy.field.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradingSessionID());
	}

	public boolean isSet(quickfix.dukascopy.field.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(quickfix.dukascopy.field.TradingSessionSubID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradingSessionSubID get(quickfix.dukascopy.field.TradingSessionSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradingSessionSubID());
	}

	public boolean isSet(quickfix.dukascopy.field.TradingSessionSubID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionSubID() {
		return isSetField(625);
	}

	}

	public void set(quickfix.dukascopy.field.ApplQueueAction value) {
		setField(value);
	}

	public quickfix.dukascopy.field.ApplQueueAction get(quickfix.dukascopy.field.ApplQueueAction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.ApplQueueAction getApplQueueAction() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.ApplQueueAction());
	}

	public boolean isSet(quickfix.dukascopy.field.ApplQueueAction field) {
		return isSetField(field);
	}

	public boolean isSetApplQueueAction() {
		return isSetField(815);
	}

	public void set(quickfix.dukascopy.field.ApplQueueMax value) {
		setField(value);
	}

	public quickfix.dukascopy.field.ApplQueueMax get(quickfix.dukascopy.field.ApplQueueMax value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.ApplQueueMax getApplQueueMax() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.ApplQueueMax());
	}

	public boolean isSet(quickfix.dukascopy.field.ApplQueueMax field) {
		return isSetField(field);
	}

	public boolean isSetApplQueueMax() {
		return isSetField(812);
	}

	public void set(quickfix.dukascopy.field.TimeInForce value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TimeInForce get(quickfix.dukascopy.field.TimeInForce value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TimeInForce getTimeInForce() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TimeInForce());
	}

	public boolean isSet(quickfix.dukascopy.field.TimeInForce field) {
		return isSetField(field);
	}

	public boolean isSetTimeInForce() {
		return isSetField(59);
	}

}
