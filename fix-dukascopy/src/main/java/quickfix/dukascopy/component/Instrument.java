
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class Instrument extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 55, 65, 48, 22, 460, 461, 167, 762, 200, 541, 224, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 947, 206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 691, 667, 875, 876, 873, 874,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 454, 864,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public Instrument() {
		super();
	}
	
	public Instrument(quickfix.dukascopy.field.Symbol symbol) {
		this();
		setField(symbol);
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

}
