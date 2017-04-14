
package quickfix.dukascopy;

import quickfix.FieldNotFound;

import quickfix.Group;

public class QuoteStatusReport extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AI";
	

	public QuoteStatusReport() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public QuoteStatusReport(quickfix.dukascopy.field.QuoteID quoteID) {
		this();
		setField(quoteID);
	}
	
	public void set(quickfix.dukascopy.field.QuoteStatusReqID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.QuoteStatusReqID get(quickfix.dukascopy.field.QuoteStatusReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.QuoteStatusReqID getQuoteStatusReqID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.QuoteStatusReqID());
	}

	public boolean isSet(quickfix.dukascopy.field.QuoteStatusReqID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteStatusReqID() {
		return isSetField(649);
	}

	public void set(quickfix.dukascopy.field.QuoteReqID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.QuoteReqID get(quickfix.dukascopy.field.QuoteReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.QuoteReqID getQuoteReqID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.QuoteReqID());
	}

	public boolean isSet(quickfix.dukascopy.field.QuoteReqID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteReqID() {
		return isSetField(131);
	}

	public void set(quickfix.dukascopy.field.QuoteID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.QuoteID get(quickfix.dukascopy.field.QuoteID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.QuoteID getQuoteID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.QuoteID());
	}

	public boolean isSet(quickfix.dukascopy.field.QuoteID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteID() {
		return isSetField(117);
	}

	public void set(quickfix.dukascopy.field.QuoteRespID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.QuoteRespID get(quickfix.dukascopy.field.QuoteRespID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.QuoteRespID getQuoteRespID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.QuoteRespID());
	}

	public boolean isSet(quickfix.dukascopy.field.QuoteRespID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteRespID() {
		return isSetField(693);
	}

	public void set(quickfix.dukascopy.field.QuoteType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.QuoteType get(quickfix.dukascopy.field.QuoteType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.QuoteType getQuoteType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.QuoteType());
	}

	public boolean isSet(quickfix.dukascopy.field.QuoteType field) {
		return isSetField(field);
	}

	public boolean isSetQuoteType() {
		return isSetField(537);
	}

	public void set(quickfix.dukascopy.component.Parties component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.Parties get(quickfix.dukascopy.component.Parties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.Parties getParties() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.Parties());
	}

	public void set(quickfix.dukascopy.field.NoPartyIDs value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoPartyIDs get(quickfix.dukascopy.field.NoPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoPartyIDs());
	}

	public boolean isSet(quickfix.dukascopy.field.NoPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartyIDs() {
		return isSetField(453);
	}

	public static class NoPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {448, 447, 452, 802, 0};

		public NoPartyIDs() {
			super(453, 448, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.PartyID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PartyID get(quickfix.dukascopy.field.PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PartyID getPartyID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PartyID());
	}

	public boolean isSet(quickfix.dukascopy.field.PartyID field) {
		return isSetField(field);
	}

	public boolean isSetPartyID() {
		return isSetField(448);
	}

	public void set(quickfix.dukascopy.field.PartyIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PartyIDSource get(quickfix.dukascopy.field.PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PartyIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetPartyIDSource() {
		return isSetField(447);
	}

	public void set(quickfix.dukascopy.field.PartyRole value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PartyRole get(quickfix.dukascopy.field.PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PartyRole getPartyRole() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PartyRole());
	}

	public boolean isSet(quickfix.dukascopy.field.PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetPartyRole() {
		return isSetField(452);
	}

	public void set(quickfix.dukascopy.field.NoPartySubIDs value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoPartySubIDs get(quickfix.dukascopy.field.NoPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoPartySubIDs());
	}

	public boolean isSet(quickfix.dukascopy.field.NoPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartySubIDs() {
		return isSetField(802);
	}

	public static class NoPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {523, 803, 0};

		public NoPartySubIDs() {
			super(802, 523, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.PartySubID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PartySubID get(quickfix.dukascopy.field.PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PartySubID getPartySubID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PartySubID());
	}

	public boolean isSet(quickfix.dukascopy.field.PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetPartySubID() {
		return isSetField(523);
	}

	public void set(quickfix.dukascopy.field.PartySubIDType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PartySubIDType get(quickfix.dukascopy.field.PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PartySubIDType());
	}

	public boolean isSet(quickfix.dukascopy.field.PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetPartySubIDType() {
		return isSetField(803);
	}

	}

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

	public void set(quickfix.dukascopy.component.FinancingDetails component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.FinancingDetails get(quickfix.dukascopy.component.FinancingDetails component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.FinancingDetails getFinancingDetails() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.FinancingDetails());
	}

	public void set(quickfix.dukascopy.field.AgreementDesc value) {
		setField(value);
	}

	public quickfix.dukascopy.field.AgreementDesc get(quickfix.dukascopy.field.AgreementDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.AgreementDesc getAgreementDesc() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.AgreementDesc());
	}

	public boolean isSet(quickfix.dukascopy.field.AgreementDesc field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDesc() {
		return isSetField(913);
	}

	public void set(quickfix.dukascopy.field.AgreementID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.AgreementID get(quickfix.dukascopy.field.AgreementID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.AgreementID getAgreementID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.AgreementID());
	}

	public boolean isSet(quickfix.dukascopy.field.AgreementID field) {
		return isSetField(field);
	}

	public boolean isSetAgreementID() {
		return isSetField(914);
	}

	public void set(quickfix.dukascopy.field.AgreementDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.AgreementDate get(quickfix.dukascopy.field.AgreementDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.AgreementDate getAgreementDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.AgreementDate());
	}

	public boolean isSet(quickfix.dukascopy.field.AgreementDate field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDate() {
		return isSetField(915);
	}

	public void set(quickfix.dukascopy.field.AgreementCurrency value) {
		setField(value);
	}

	public quickfix.dukascopy.field.AgreementCurrency get(quickfix.dukascopy.field.AgreementCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.AgreementCurrency getAgreementCurrency() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.AgreementCurrency());
	}

	public boolean isSet(quickfix.dukascopy.field.AgreementCurrency field) {
		return isSetField(field);
	}

	public boolean isSetAgreementCurrency() {
		return isSetField(918);
	}

	public void set(quickfix.dukascopy.field.TerminationType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TerminationType get(quickfix.dukascopy.field.TerminationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TerminationType getTerminationType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TerminationType());
	}

	public boolean isSet(quickfix.dukascopy.field.TerminationType field) {
		return isSetField(field);
	}

	public boolean isSetTerminationType() {
		return isSetField(788);
	}

	public void set(quickfix.dukascopy.field.StartDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.StartDate get(quickfix.dukascopy.field.StartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.StartDate getStartDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.StartDate());
	}

	public boolean isSet(quickfix.dukascopy.field.StartDate field) {
		return isSetField(field);
	}

	public boolean isSetStartDate() {
		return isSetField(916);
	}

	public void set(quickfix.dukascopy.field.EndDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EndDate get(quickfix.dukascopy.field.EndDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EndDate getEndDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EndDate());
	}

	public boolean isSet(quickfix.dukascopy.field.EndDate field) {
		return isSetField(field);
	}

	public boolean isSetEndDate() {
		return isSetField(917);
	}

	public void set(quickfix.dukascopy.field.DeliveryType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.DeliveryType get(quickfix.dukascopy.field.DeliveryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.DeliveryType getDeliveryType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.DeliveryType());
	}

	public boolean isSet(quickfix.dukascopy.field.DeliveryType field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryType() {
		return isSetField(919);
	}

	public void set(quickfix.dukascopy.field.MarginRatio value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MarginRatio get(quickfix.dukascopy.field.MarginRatio value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MarginRatio getMarginRatio() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MarginRatio());
	}

	public boolean isSet(quickfix.dukascopy.field.MarginRatio field) {
		return isSetField(field);
	}

	public boolean isSetMarginRatio() {
		return isSetField(898);
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

	public void set(quickfix.dukascopy.field.Side value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Side get(quickfix.dukascopy.field.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Side getSide() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Side());
	}

	public boolean isSet(quickfix.dukascopy.field.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
	}

	public void set(quickfix.dukascopy.component.OrderQtyData component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.OrderQtyData get(quickfix.dukascopy.component.OrderQtyData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.OrderQtyData getOrderQtyData() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.OrderQtyData());
	}

	public void set(quickfix.dukascopy.field.OrderQty value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OrderQty get(quickfix.dukascopy.field.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OrderQty getOrderQty() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OrderQty());
	}

	public boolean isSet(quickfix.dukascopy.field.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
	}

	public void set(quickfix.dukascopy.field.CashOrderQty value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CashOrderQty get(quickfix.dukascopy.field.CashOrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CashOrderQty getCashOrderQty() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CashOrderQty());
	}

	public boolean isSet(quickfix.dukascopy.field.CashOrderQty field) {
		return isSetField(field);
	}

	public boolean isSetCashOrderQty() {
		return isSetField(152);
	}

	public void set(quickfix.dukascopy.field.OrderPercent value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OrderPercent get(quickfix.dukascopy.field.OrderPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OrderPercent getOrderPercent() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OrderPercent());
	}

	public boolean isSet(quickfix.dukascopy.field.OrderPercent field) {
		return isSetField(field);
	}

	public boolean isSetOrderPercent() {
		return isSetField(516);
	}

	public void set(quickfix.dukascopy.field.RoundingDirection value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RoundingDirection get(quickfix.dukascopy.field.RoundingDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RoundingDirection getRoundingDirection() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RoundingDirection());
	}

	public boolean isSet(quickfix.dukascopy.field.RoundingDirection field) {
		return isSetField(field);
	}

	public boolean isSetRoundingDirection() {
		return isSetField(468);
	}

	public void set(quickfix.dukascopy.field.RoundingModulus value) {
		setField(value);
	}

	public quickfix.dukascopy.field.RoundingModulus get(quickfix.dukascopy.field.RoundingModulus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.RoundingModulus getRoundingModulus() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.RoundingModulus());
	}

	public boolean isSet(quickfix.dukascopy.field.RoundingModulus field) {
		return isSetField(field);
	}

	public boolean isSetRoundingModulus() {
		return isSetField(469);
	}

	public void set(quickfix.dukascopy.field.SettlType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SettlType get(quickfix.dukascopy.field.SettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SettlType getSettlType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SettlType());
	}

	public boolean isSet(quickfix.dukascopy.field.SettlType field) {
		return isSetField(field);
	}

	public boolean isSetSettlType() {
		return isSetField(63);
	}

	public void set(quickfix.dukascopy.field.SettlDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SettlDate get(quickfix.dukascopy.field.SettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SettlDate getSettlDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SettlDate());
	}

	public boolean isSet(quickfix.dukascopy.field.SettlDate field) {
		return isSetField(field);
	}

	public boolean isSetSettlDate() {
		return isSetField(64);
	}

	public void set(quickfix.dukascopy.field.SettlDate2 value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SettlDate2 get(quickfix.dukascopy.field.SettlDate2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SettlDate2 getSettlDate2() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SettlDate2());
	}

	public boolean isSet(quickfix.dukascopy.field.SettlDate2 field) {
		return isSetField(field);
	}

	public boolean isSetSettlDate2() {
		return isSetField(193);
	}

	public void set(quickfix.dukascopy.field.OrderQty2 value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OrderQty2 get(quickfix.dukascopy.field.OrderQty2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OrderQty2 getOrderQty2() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OrderQty2());
	}

	public boolean isSet(quickfix.dukascopy.field.OrderQty2 field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty2() {
		return isSetField(192);
	}

	public void set(quickfix.dukascopy.field.Currency value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Currency get(quickfix.dukascopy.field.Currency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Currency getCurrency() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Currency());
	}

	public boolean isSet(quickfix.dukascopy.field.Currency field) {
		return isSetField(field);
	}

	public boolean isSetCurrency() {
		return isSetField(15);
	}

	public void set(quickfix.dukascopy.component.Stipulations component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.Stipulations get(quickfix.dukascopy.component.Stipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.Stipulations getStipulations() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.Stipulations());
	}

	public void set(quickfix.dukascopy.field.NoStipulations value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoStipulations get(quickfix.dukascopy.field.NoStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoStipulations getNoStipulations() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoStipulations());
	}

	public boolean isSet(quickfix.dukascopy.field.NoStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoStipulations() {
		return isSetField(232);
	}

	public static class NoStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {233, 234, 0};

		public NoStipulations() {
			super(232, 233, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.StipulationType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.StipulationType get(quickfix.dukascopy.field.StipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.StipulationType getStipulationType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.StipulationType());
	}

	public boolean isSet(quickfix.dukascopy.field.StipulationType field) {
		return isSetField(field);
	}

	public boolean isSetStipulationType() {
		return isSetField(233);
	}

	public void set(quickfix.dukascopy.field.StipulationValue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.StipulationValue get(quickfix.dukascopy.field.StipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.StipulationValue getStipulationValue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.StipulationValue());
	}

	public boolean isSet(quickfix.dukascopy.field.StipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetStipulationValue() {
		return isSetField(234);
	}

	}

	public void set(quickfix.dukascopy.field.Account value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Account get(quickfix.dukascopy.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Account getAccount() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Account());
	}

	public boolean isSet(quickfix.dukascopy.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(quickfix.dukascopy.field.AcctIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.AcctIDSource get(quickfix.dukascopy.field.AcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.AcctIDSource getAcctIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.AcctIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.AcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAcctIDSource() {
		return isSetField(660);
	}

	public void set(quickfix.dukascopy.field.AccountType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.AccountType get(quickfix.dukascopy.field.AccountType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.AccountType getAccountType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.AccountType());
	}

	public boolean isSet(quickfix.dukascopy.field.AccountType field) {
		return isSetField(field);
	}

	public boolean isSetAccountType() {
		return isSetField(581);
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
		private static final int[] ORDER = {600, 601, 602, 603, 604, 607, 608, 609, 764, 610, 611, 248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740, 739, 955, 956, 687, 690, 587, 588, 683, 539, 0};

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

	public void set(quickfix.dukascopy.field.LegQty value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegQty get(quickfix.dukascopy.field.LegQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegQty getLegQty() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegQty());
	}

	public boolean isSet(quickfix.dukascopy.field.LegQty field) {
		return isSetField(field);
	}

	public boolean isSetLegQty() {
		return isSetField(687);
	}

	public void set(quickfix.dukascopy.field.LegSwapType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSwapType get(quickfix.dukascopy.field.LegSwapType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSwapType getLegSwapType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSwapType());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSwapType field) {
		return isSetField(field);
	}

	public boolean isSetLegSwapType() {
		return isSetField(690);
	}

	public void set(quickfix.dukascopy.field.LegSettlType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSettlType get(quickfix.dukascopy.field.LegSettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSettlType getLegSettlType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSettlType());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSettlType field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlType() {
		return isSetField(587);
	}

	public void set(quickfix.dukascopy.field.LegSettlDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegSettlDate get(quickfix.dukascopy.field.LegSettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegSettlDate getLegSettlDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegSettlDate());
	}

	public boolean isSet(quickfix.dukascopy.field.LegSettlDate field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlDate() {
		return isSetField(588);
	}

	public void set(quickfix.dukascopy.component.LegStipulations component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.LegStipulations get(quickfix.dukascopy.component.LegStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.LegStipulations getLegStipulations() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.LegStipulations());
	}

	public void set(quickfix.dukascopy.field.NoLegStipulations value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoLegStipulations get(quickfix.dukascopy.field.NoLegStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoLegStipulations());
	}

	public boolean isSet(quickfix.dukascopy.field.NoLegStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoLegStipulations() {
		return isSetField(683);
	}

	public static class NoLegStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {688, 689, 0};

		public NoLegStipulations() {
			super(683, 688, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.LegStipulationType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegStipulationType get(quickfix.dukascopy.field.LegStipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegStipulationType getLegStipulationType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegStipulationType());
	}

	public boolean isSet(quickfix.dukascopy.field.LegStipulationType field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationType() {
		return isSetField(688);
	}

	public void set(quickfix.dukascopy.field.LegStipulationValue value) {
		setField(value);
	}

	public quickfix.dukascopy.field.LegStipulationValue get(quickfix.dukascopy.field.LegStipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.LegStipulationValue());
	}

	public boolean isSet(quickfix.dukascopy.field.LegStipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationValue() {
		return isSetField(689);
	}

	}

	public void set(quickfix.dukascopy.component.NestedParties component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.NestedParties get(quickfix.dukascopy.component.NestedParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.NestedParties getNestedParties() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.NestedParties());
	}

	public void set(quickfix.dukascopy.field.NoNestedPartyIDs value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoNestedPartyIDs get(quickfix.dukascopy.field.NoNestedPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoNestedPartyIDs());
	}

	public boolean isSet(quickfix.dukascopy.field.NoNestedPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartyIDs() {
		return isSetField(539);
	}

	public static class NoNestedPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {524, 525, 538, 804, 0};

		public NoNestedPartyIDs() {
			super(539, 524, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.NestedPartyID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NestedPartyID get(quickfix.dukascopy.field.NestedPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NestedPartyID());
	}

	public boolean isSet(quickfix.dukascopy.field.NestedPartyID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyID() {
		return isSetField(524);
	}

	public void set(quickfix.dukascopy.field.NestedPartyIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NestedPartyIDSource get(quickfix.dukascopy.field.NestedPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NestedPartyIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.NestedPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyIDSource() {
		return isSetField(525);
	}

	public void set(quickfix.dukascopy.field.NestedPartyRole value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NestedPartyRole get(quickfix.dukascopy.field.NestedPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NestedPartyRole());
	}

	public boolean isSet(quickfix.dukascopy.field.NestedPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyRole() {
		return isSetField(538);
	}

	public void set(quickfix.dukascopy.field.NoNestedPartySubIDs value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoNestedPartySubIDs get(quickfix.dukascopy.field.NoNestedPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoNestedPartySubIDs());
	}

	public boolean isSet(quickfix.dukascopy.field.NoNestedPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartySubIDs() {
		return isSetField(804);
	}

	public static class NoNestedPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {545, 805, 0};

		public NoNestedPartySubIDs() {
			super(804, 545, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.NestedPartySubID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NestedPartySubID get(quickfix.dukascopy.field.NestedPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NestedPartySubID());
	}

	public boolean isSet(quickfix.dukascopy.field.NestedPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubID() {
		return isSetField(545);
	}

	public void set(quickfix.dukascopy.field.NestedPartySubIDType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NestedPartySubIDType get(quickfix.dukascopy.field.NestedPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NestedPartySubIDType());
	}

	public boolean isSet(quickfix.dukascopy.field.NestedPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubIDType() {
		return isSetField(805);
	}

	}

	}

	}

	public void set(quickfix.dukascopy.field.NoQuoteQualifiers value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoQuoteQualifiers get(quickfix.dukascopy.field.NoQuoteQualifiers value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoQuoteQualifiers getNoQuoteQualifiers() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoQuoteQualifiers());
	}

	public boolean isSet(quickfix.dukascopy.field.NoQuoteQualifiers field) {
		return isSetField(field);
	}

	public boolean isSetNoQuoteQualifiers() {
		return isSetField(735);
	}

	public static class NoQuoteQualifiers extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {695, 0};

		public NoQuoteQualifiers() {
			super(735, 695, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.QuoteQualifier value) {
		setField(value);
	}

	public quickfix.dukascopy.field.QuoteQualifier get(quickfix.dukascopy.field.QuoteQualifier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.QuoteQualifier getQuoteQualifier() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.QuoteQualifier());
	}

	public boolean isSet(quickfix.dukascopy.field.QuoteQualifier field) {
		return isSetField(field);
	}

	public boolean isSetQuoteQualifier() {
		return isSetField(695);
	}

	}

	public void set(quickfix.dukascopy.field.ExpireTime value) {
		setField(value);
	}

	public quickfix.dukascopy.field.ExpireTime get(quickfix.dukascopy.field.ExpireTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.ExpireTime getExpireTime() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.ExpireTime());
	}

	public boolean isSet(quickfix.dukascopy.field.ExpireTime field) {
		return isSetField(field);
	}

	public boolean isSetExpireTime() {
		return isSetField(126);
	}

	public void set(quickfix.dukascopy.field.Price value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Price get(quickfix.dukascopy.field.Price value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Price getPrice() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Price());
	}

	public boolean isSet(quickfix.dukascopy.field.Price field) {
		return isSetField(field);
	}

	public boolean isSetPrice() {
		return isSetField(44);
	}

	public void set(quickfix.dukascopy.field.PriceType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.PriceType get(quickfix.dukascopy.field.PriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.PriceType getPriceType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.PriceType());
	}

	public boolean isSet(quickfix.dukascopy.field.PriceType field) {
		return isSetField(field);
	}

	public boolean isSetPriceType() {
		return isSetField(423);
	}

	public void set(quickfix.dukascopy.component.SpreadOrBenchmarkCurveData component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.SpreadOrBenchmarkCurveData get(quickfix.dukascopy.component.SpreadOrBenchmarkCurveData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.SpreadOrBenchmarkCurveData());
	}

	public void set(quickfix.dukascopy.field.Spread value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Spread get(quickfix.dukascopy.field.Spread value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Spread getSpread() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Spread());
	}

	public boolean isSet(quickfix.dukascopy.field.Spread field) {
		return isSetField(field);
	}

	public boolean isSetSpread() {
		return isSetField(218);
	}

	public void set(quickfix.dukascopy.field.BenchmarkCurveCurrency value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkCurveCurrency get(quickfix.dukascopy.field.BenchmarkCurveCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkCurveCurrency getBenchmarkCurveCurrency() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkCurveCurrency());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkCurveCurrency field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveCurrency() {
		return isSetField(220);
	}

	public void set(quickfix.dukascopy.field.BenchmarkCurveName value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkCurveName get(quickfix.dukascopy.field.BenchmarkCurveName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkCurveName getBenchmarkCurveName() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkCurveName());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkCurveName field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveName() {
		return isSetField(221);
	}

	public void set(quickfix.dukascopy.field.BenchmarkCurvePoint value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkCurvePoint get(quickfix.dukascopy.field.BenchmarkCurvePoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkCurvePoint getBenchmarkCurvePoint() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkCurvePoint());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkCurvePoint field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurvePoint() {
		return isSetField(222);
	}

	public void set(quickfix.dukascopy.field.BenchmarkPrice value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkPrice get(quickfix.dukascopy.field.BenchmarkPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkPrice getBenchmarkPrice() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkPrice());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkPrice field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPrice() {
		return isSetField(662);
	}

	public void set(quickfix.dukascopy.field.BenchmarkPriceType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkPriceType get(quickfix.dukascopy.field.BenchmarkPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkPriceType getBenchmarkPriceType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkPriceType());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkPriceType field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPriceType() {
		return isSetField(663);
	}

	public void set(quickfix.dukascopy.field.BenchmarkSecurityID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkSecurityID get(quickfix.dukascopy.field.BenchmarkSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkSecurityID getBenchmarkSecurityID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkSecurityID());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityID() {
		return isSetField(699);
	}

	public void set(quickfix.dukascopy.field.BenchmarkSecurityIDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BenchmarkSecurityIDSource get(quickfix.dukascopy.field.BenchmarkSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BenchmarkSecurityIDSource getBenchmarkSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BenchmarkSecurityIDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.BenchmarkSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityIDSource() {
		return isSetField(761);
	}

	public void set(quickfix.dukascopy.component.YieldData component) {
		setComponent(component);
	}

	public quickfix.dukascopy.component.YieldData get(quickfix.dukascopy.component.YieldData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.dukascopy.component.YieldData getYieldData() throws FieldNotFound {
		return get(new quickfix.dukascopy.component.YieldData());
	}

	public void set(quickfix.dukascopy.field.YieldType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.YieldType get(quickfix.dukascopy.field.YieldType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.YieldType getYieldType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.YieldType());
	}

	public boolean isSet(quickfix.dukascopy.field.YieldType field) {
		return isSetField(field);
	}

	public boolean isSetYieldType() {
		return isSetField(235);
	}

	public void set(quickfix.dukascopy.field.Yield value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Yield get(quickfix.dukascopy.field.Yield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Yield getYield() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Yield());
	}

	public boolean isSet(quickfix.dukascopy.field.Yield field) {
		return isSetField(field);
	}

	public boolean isSetYield() {
		return isSetField(236);
	}

	public void set(quickfix.dukascopy.field.YieldCalcDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.YieldCalcDate get(quickfix.dukascopy.field.YieldCalcDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.YieldCalcDate getYieldCalcDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.YieldCalcDate());
	}

	public boolean isSet(quickfix.dukascopy.field.YieldCalcDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldCalcDate() {
		return isSetField(701);
	}

	public void set(quickfix.dukascopy.field.YieldRedemptionDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.YieldRedemptionDate get(quickfix.dukascopy.field.YieldRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.YieldRedemptionDate getYieldRedemptionDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.YieldRedemptionDate());
	}

	public boolean isSet(quickfix.dukascopy.field.YieldRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionDate() {
		return isSetField(696);
	}

	public void set(quickfix.dukascopy.field.YieldRedemptionPrice value) {
		setField(value);
	}

	public quickfix.dukascopy.field.YieldRedemptionPrice get(quickfix.dukascopy.field.YieldRedemptionPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.YieldRedemptionPrice getYieldRedemptionPrice() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.YieldRedemptionPrice());
	}

	public boolean isSet(quickfix.dukascopy.field.YieldRedemptionPrice field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPrice() {
		return isSetField(697);
	}

	public void set(quickfix.dukascopy.field.YieldRedemptionPriceType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.YieldRedemptionPriceType get(quickfix.dukascopy.field.YieldRedemptionPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.YieldRedemptionPriceType getYieldRedemptionPriceType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.YieldRedemptionPriceType());
	}

	public boolean isSet(quickfix.dukascopy.field.YieldRedemptionPriceType field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPriceType() {
		return isSetField(698);
	}

	public void set(quickfix.dukascopy.field.BidPx value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BidPx get(quickfix.dukascopy.field.BidPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BidPx getBidPx() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BidPx());
	}

	public boolean isSet(quickfix.dukascopy.field.BidPx field) {
		return isSetField(field);
	}

	public boolean isSetBidPx() {
		return isSetField(132);
	}

	public void set(quickfix.dukascopy.field.OfferPx value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OfferPx get(quickfix.dukascopy.field.OfferPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OfferPx getOfferPx() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OfferPx());
	}

	public boolean isSet(quickfix.dukascopy.field.OfferPx field) {
		return isSetField(field);
	}

	public boolean isSetOfferPx() {
		return isSetField(133);
	}

	public void set(quickfix.dukascopy.field.MktBidPx value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MktBidPx get(quickfix.dukascopy.field.MktBidPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MktBidPx getMktBidPx() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MktBidPx());
	}

	public boolean isSet(quickfix.dukascopy.field.MktBidPx field) {
		return isSetField(field);
	}

	public boolean isSetMktBidPx() {
		return isSetField(645);
	}

	public void set(quickfix.dukascopy.field.MktOfferPx value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MktOfferPx get(quickfix.dukascopy.field.MktOfferPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MktOfferPx getMktOfferPx() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MktOfferPx());
	}

	public boolean isSet(quickfix.dukascopy.field.MktOfferPx field) {
		return isSetField(field);
	}

	public boolean isSetMktOfferPx() {
		return isSetField(646);
	}

	public void set(quickfix.dukascopy.field.MinBidSize value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MinBidSize get(quickfix.dukascopy.field.MinBidSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MinBidSize getMinBidSize() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MinBidSize());
	}

	public boolean isSet(quickfix.dukascopy.field.MinBidSize field) {
		return isSetField(field);
	}

	public boolean isSetMinBidSize() {
		return isSetField(647);
	}

	public void set(quickfix.dukascopy.field.BidSize value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BidSize get(quickfix.dukascopy.field.BidSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BidSize getBidSize() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BidSize());
	}

	public boolean isSet(quickfix.dukascopy.field.BidSize field) {
		return isSetField(field);
	}

	public boolean isSetBidSize() {
		return isSetField(134);
	}

	public void set(quickfix.dukascopy.field.MinOfferSize value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MinOfferSize get(quickfix.dukascopy.field.MinOfferSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MinOfferSize getMinOfferSize() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MinOfferSize());
	}

	public boolean isSet(quickfix.dukascopy.field.MinOfferSize field) {
		return isSetField(field);
	}

	public boolean isSetMinOfferSize() {
		return isSetField(648);
	}

	public void set(quickfix.dukascopy.field.OfferSize value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OfferSize get(quickfix.dukascopy.field.OfferSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OfferSize getOfferSize() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OfferSize());
	}

	public boolean isSet(quickfix.dukascopy.field.OfferSize field) {
		return isSetField(field);
	}

	public boolean isSetOfferSize() {
		return isSetField(135);
	}

	public void set(quickfix.dukascopy.field.ValidUntilTime value) {
		setField(value);
	}

	public quickfix.dukascopy.field.ValidUntilTime get(quickfix.dukascopy.field.ValidUntilTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.ValidUntilTime getValidUntilTime() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.ValidUntilTime());
	}

	public boolean isSet(quickfix.dukascopy.field.ValidUntilTime field) {
		return isSetField(field);
	}

	public boolean isSetValidUntilTime() {
		return isSetField(62);
	}

	public void set(quickfix.dukascopy.field.BidSpotRate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BidSpotRate get(quickfix.dukascopy.field.BidSpotRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BidSpotRate getBidSpotRate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BidSpotRate());
	}

	public boolean isSet(quickfix.dukascopy.field.BidSpotRate field) {
		return isSetField(field);
	}

	public boolean isSetBidSpotRate() {
		return isSetField(188);
	}

	public void set(quickfix.dukascopy.field.OfferSpotRate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OfferSpotRate get(quickfix.dukascopy.field.OfferSpotRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OfferSpotRate getOfferSpotRate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OfferSpotRate());
	}

	public boolean isSet(quickfix.dukascopy.field.OfferSpotRate field) {
		return isSetField(field);
	}

	public boolean isSetOfferSpotRate() {
		return isSetField(190);
	}

	public void set(quickfix.dukascopy.field.BidForwardPoints value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BidForwardPoints get(quickfix.dukascopy.field.BidForwardPoints value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BidForwardPoints getBidForwardPoints() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BidForwardPoints());
	}

	public boolean isSet(quickfix.dukascopy.field.BidForwardPoints field) {
		return isSetField(field);
	}

	public boolean isSetBidForwardPoints() {
		return isSetField(189);
	}

	public void set(quickfix.dukascopy.field.OfferForwardPoints value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OfferForwardPoints get(quickfix.dukascopy.field.OfferForwardPoints value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OfferForwardPoints getOfferForwardPoints() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OfferForwardPoints());
	}

	public boolean isSet(quickfix.dukascopy.field.OfferForwardPoints field) {
		return isSetField(field);
	}

	public boolean isSetOfferForwardPoints() {
		return isSetField(191);
	}

	public void set(quickfix.dukascopy.field.MidPx value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MidPx get(quickfix.dukascopy.field.MidPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MidPx getMidPx() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MidPx());
	}

	public boolean isSet(quickfix.dukascopy.field.MidPx field) {
		return isSetField(field);
	}

	public boolean isSetMidPx() {
		return isSetField(631);
	}

	public void set(quickfix.dukascopy.field.BidYield value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BidYield get(quickfix.dukascopy.field.BidYield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BidYield getBidYield() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BidYield());
	}

	public boolean isSet(quickfix.dukascopy.field.BidYield field) {
		return isSetField(field);
	}

	public boolean isSetBidYield() {
		return isSetField(632);
	}

	public void set(quickfix.dukascopy.field.MidYield value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MidYield get(quickfix.dukascopy.field.MidYield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MidYield getMidYield() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MidYield());
	}

	public boolean isSet(quickfix.dukascopy.field.MidYield field) {
		return isSetField(field);
	}

	public boolean isSetMidYield() {
		return isSetField(633);
	}

	public void set(quickfix.dukascopy.field.OfferYield value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OfferYield get(quickfix.dukascopy.field.OfferYield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OfferYield getOfferYield() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OfferYield());
	}

	public boolean isSet(quickfix.dukascopy.field.OfferYield field) {
		return isSetField(field);
	}

	public boolean isSetOfferYield() {
		return isSetField(634);
	}

	public void set(quickfix.dukascopy.field.TransactTime value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TransactTime get(quickfix.dukascopy.field.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TransactTime getTransactTime() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TransactTime());
	}

	public boolean isSet(quickfix.dukascopy.field.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
	}

	public void set(quickfix.dukascopy.field.OrdType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OrdType get(quickfix.dukascopy.field.OrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OrdType getOrdType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OrdType());
	}

	public boolean isSet(quickfix.dukascopy.field.OrdType field) {
		return isSetField(field);
	}

	public boolean isSetOrdType() {
		return isSetField(40);
	}

	public void set(quickfix.dukascopy.field.BidForwardPoints2 value) {
		setField(value);
	}

	public quickfix.dukascopy.field.BidForwardPoints2 get(quickfix.dukascopy.field.BidForwardPoints2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.BidForwardPoints2 getBidForwardPoints2() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.BidForwardPoints2());
	}

	public boolean isSet(quickfix.dukascopy.field.BidForwardPoints2 field) {
		return isSetField(field);
	}

	public boolean isSetBidForwardPoints2() {
		return isSetField(642);
	}

	public void set(quickfix.dukascopy.field.OfferForwardPoints2 value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OfferForwardPoints2 get(quickfix.dukascopy.field.OfferForwardPoints2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OfferForwardPoints2 getOfferForwardPoints2() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OfferForwardPoints2());
	}

	public boolean isSet(quickfix.dukascopy.field.OfferForwardPoints2 field) {
		return isSetField(field);
	}

	public boolean isSetOfferForwardPoints2() {
		return isSetField(643);
	}

	public void set(quickfix.dukascopy.field.SettlCurrBidFxRate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SettlCurrBidFxRate get(quickfix.dukascopy.field.SettlCurrBidFxRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SettlCurrBidFxRate getSettlCurrBidFxRate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SettlCurrBidFxRate());
	}

	public boolean isSet(quickfix.dukascopy.field.SettlCurrBidFxRate field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrBidFxRate() {
		return isSetField(656);
	}

	public void set(quickfix.dukascopy.field.SettlCurrOfferFxRate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SettlCurrOfferFxRate get(quickfix.dukascopy.field.SettlCurrOfferFxRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SettlCurrOfferFxRate getSettlCurrOfferFxRate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SettlCurrOfferFxRate());
	}

	public boolean isSet(quickfix.dukascopy.field.SettlCurrOfferFxRate field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrOfferFxRate() {
		return isSetField(657);
	}

	public void set(quickfix.dukascopy.field.SettlCurrFxRateCalc value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SettlCurrFxRateCalc get(quickfix.dukascopy.field.SettlCurrFxRateCalc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SettlCurrFxRateCalc getSettlCurrFxRateCalc() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SettlCurrFxRateCalc());
	}

	public boolean isSet(quickfix.dukascopy.field.SettlCurrFxRateCalc field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrFxRateCalc() {
		return isSetField(156);
	}

	public void set(quickfix.dukascopy.field.CommType value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CommType get(quickfix.dukascopy.field.CommType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CommType getCommType() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CommType());
	}

	public boolean isSet(quickfix.dukascopy.field.CommType field) {
		return isSetField(field);
	}

	public boolean isSetCommType() {
		return isSetField(13);
	}

	public void set(quickfix.dukascopy.field.Commission value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Commission get(quickfix.dukascopy.field.Commission value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Commission getCommission() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Commission());
	}

	public boolean isSet(quickfix.dukascopy.field.Commission field) {
		return isSetField(field);
	}

	public boolean isSetCommission() {
		return isSetField(12);
	}

	public void set(quickfix.dukascopy.field.CustOrderCapacity value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CustOrderCapacity get(quickfix.dukascopy.field.CustOrderCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CustOrderCapacity getCustOrderCapacity() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CustOrderCapacity());
	}

	public boolean isSet(quickfix.dukascopy.field.CustOrderCapacity field) {
		return isSetField(field);
	}

	public boolean isSetCustOrderCapacity() {
		return isSetField(582);
	}

	public void set(quickfix.dukascopy.field.ExDestination value) {
		setField(value);
	}

	public quickfix.dukascopy.field.ExDestination get(quickfix.dukascopy.field.ExDestination value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.ExDestination getExDestination() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.ExDestination());
	}

	public boolean isSet(quickfix.dukascopy.field.ExDestination field) {
		return isSetField(field);
	}

	public boolean isSetExDestination() {
		return isSetField(100);
	}

	public void set(quickfix.dukascopy.field.QuoteStatus value) {
		setField(value);
	}

	public quickfix.dukascopy.field.QuoteStatus get(quickfix.dukascopy.field.QuoteStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.QuoteStatus getQuoteStatus() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.QuoteStatus());
	}

	public boolean isSet(quickfix.dukascopy.field.QuoteStatus field) {
		return isSetField(field);
	}

	public boolean isSetQuoteStatus() {
		return isSetField(297);
	}

	public void set(quickfix.dukascopy.field.Text value) {
		setField(value);
	}

	public quickfix.dukascopy.field.Text get(quickfix.dukascopy.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.Text getText() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.Text());
	}

	public boolean isSet(quickfix.dukascopy.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

	public void set(quickfix.dukascopy.field.EncodedTextLen value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedTextLen get(quickfix.dukascopy.field.EncodedTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedTextLen());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedTextLen() {
		return isSetField(354);
	}

	public void set(quickfix.dukascopy.field.EncodedText value) {
		setField(value);
	}

	public quickfix.dukascopy.field.EncodedText get(quickfix.dukascopy.field.EncodedText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.EncodedText getEncodedText() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.EncodedText());
	}

	public boolean isSet(quickfix.dukascopy.field.EncodedText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedText() {
		return isSetField(355);
	}

}
