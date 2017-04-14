
package quickfix.dukascopy.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class UnderlyingInstrument extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 311, 312, 309, 305, 462, 463, 310, 763, 313, 542, 241, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 435, 308, 306, 362, 363, 307, 364, 365, 877, 878, 318, 879, 810, 882, 883, 884, 885, 886, 887,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 457,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public UnderlyingInstrument() {
		super();
	}
	
	public UnderlyingInstrument(quickfix.dukascopy.field.UnderlyingSymbol underlyingSymbol) {
		this();
		setField(underlyingSymbol);
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
