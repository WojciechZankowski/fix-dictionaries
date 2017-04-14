
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class InstrumentLeg extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 600, 601, 602, 603, 607, 608, 609, 764, 610, 611, 248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740, 739, 955, 956,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 604,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public InstrumentLeg() {
		super();
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
