
package quickfix.tt;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketDataIncrementalRefresh extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "X";
	

	public MarketDataIncrementalRefresh() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public MarketDataIncrementalRefresh(quickfix.tt.field.MDReqID mDReqID) {
		this();
		setField(mDReqID);
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

	public void set(quickfix.tt.field.NoMDEntries value) {
		setField(value);
	}

	public quickfix.tt.field.NoMDEntries get(quickfix.tt.field.NoMDEntries value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.NoMDEntries getNoMDEntries() throws FieldNotFound {
		return get(new quickfix.tt.field.NoMDEntries());
	}

	public boolean isSet(quickfix.tt.field.NoMDEntries field) {
		return isSetField(field);
	}

	public boolean isSetNoMDEntries() {
		return isSetField(268);
	}

	public static class NoMDEntries extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {279, 55, 167, 200, 205, 201, 202, 206, 48, 10455, 207, 63, 269, 270, 271, 288, 289, 290, 387, 198, 16486, 15, 18210, 18211, 16488, 16487, 346, 16489, 0};

		public NoMDEntries() {
			super(268, 279, ORDER);
		}
		
	public void set(quickfix.tt.field.MDUpdateAction value) {
		setField(value);
	}

	public quickfix.tt.field.MDUpdateAction get(quickfix.tt.field.MDUpdateAction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MDUpdateAction getMDUpdateAction() throws FieldNotFound {
		return get(new quickfix.tt.field.MDUpdateAction());
	}

	public boolean isSet(quickfix.tt.field.MDUpdateAction field) {
		return isSetField(field);
	}

	public boolean isSetMDUpdateAction() {
		return isSetField(279);
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

	public void set(quickfix.tt.field.MDEntryPx value) {
		setField(value);
	}

	public quickfix.tt.field.MDEntryPx get(quickfix.tt.field.MDEntryPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MDEntryPx getMDEntryPx() throws FieldNotFound {
		return get(new quickfix.tt.field.MDEntryPx());
	}

	public boolean isSet(quickfix.tt.field.MDEntryPx field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryPx() {
		return isSetField(270);
	}

	public void set(quickfix.tt.field.MDEntrySize value) {
		setField(value);
	}

	public quickfix.tt.field.MDEntrySize get(quickfix.tt.field.MDEntrySize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MDEntrySize getMDEntrySize() throws FieldNotFound {
		return get(new quickfix.tt.field.MDEntrySize());
	}

	public boolean isSet(quickfix.tt.field.MDEntrySize field) {
		return isSetField(field);
	}

	public boolean isSetMDEntrySize() {
		return isSetField(271);
	}

	public void set(quickfix.tt.field.MDEntryBuyer value) {
		setField(value);
	}

	public quickfix.tt.field.MDEntryBuyer get(quickfix.tt.field.MDEntryBuyer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MDEntryBuyer getMDEntryBuyer() throws FieldNotFound {
		return get(new quickfix.tt.field.MDEntryBuyer());
	}

	public boolean isSet(quickfix.tt.field.MDEntryBuyer field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryBuyer() {
		return isSetField(288);
	}

	public void set(quickfix.tt.field.MDEntrySeller value) {
		setField(value);
	}

	public quickfix.tt.field.MDEntrySeller get(quickfix.tt.field.MDEntrySeller value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MDEntrySeller getMDEntrySeller() throws FieldNotFound {
		return get(new quickfix.tt.field.MDEntrySeller());
	}

	public boolean isSet(quickfix.tt.field.MDEntrySeller field) {
		return isSetField(field);
	}

	public boolean isSetMDEntrySeller() {
		return isSetField(289);
	}

	public void set(quickfix.tt.field.MDEntryPositionNo value) {
		setField(value);
	}

	public quickfix.tt.field.MDEntryPositionNo get(quickfix.tt.field.MDEntryPositionNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MDEntryPositionNo getMDEntryPositionNo() throws FieldNotFound {
		return get(new quickfix.tt.field.MDEntryPositionNo());
	}

	public boolean isSet(quickfix.tt.field.MDEntryPositionNo field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryPositionNo() {
		return isSetField(290);
	}

	public void set(quickfix.tt.field.TotalVolumeTraded value) {
		setField(value);
	}

	public quickfix.tt.field.TotalVolumeTraded get(quickfix.tt.field.TotalVolumeTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TotalVolumeTraded getTotalVolumeTraded() throws FieldNotFound {
		return get(new quickfix.tt.field.TotalVolumeTraded());
	}

	public boolean isSet(quickfix.tt.field.TotalVolumeTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalVolumeTraded() {
		return isSetField(387);
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

	public void set(quickfix.tt.field.MDEntryState value) {
		setField(value);
	}

	public quickfix.tt.field.MDEntryState get(quickfix.tt.field.MDEntryState value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MDEntryState getMDEntryState() throws FieldNotFound {
		return get(new quickfix.tt.field.MDEntryState());
	}

	public boolean isSet(quickfix.tt.field.MDEntryState field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryState() {
		return isSetField(16486);
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

	public void set(quickfix.tt.field.PriceFeedStatus value) {
		setField(value);
	}

	public quickfix.tt.field.PriceFeedStatus get(quickfix.tt.field.PriceFeedStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.PriceFeedStatus getPriceFeedStatus() throws FieldNotFound {
		return get(new quickfix.tt.field.PriceFeedStatus());
	}

	public boolean isSet(quickfix.tt.field.PriceFeedStatus field) {
		return isSetField(field);
	}

	public boolean isSetPriceFeedStatus() {
		return isSetField(18210);
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

	public void set(quickfix.tt.field.AggressorSide value) {
		setField(value);
	}

	public quickfix.tt.field.AggressorSide get(quickfix.tt.field.AggressorSide value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.AggressorSide getAggressorSide() throws FieldNotFound {
		return get(new quickfix.tt.field.AggressorSide());
	}

	public boolean isSet(quickfix.tt.field.AggressorSide field) {
		return isSetField(field);
	}

	public boolean isSetAggressorSide() {
		return isSetField(16488);
	}

	public void set(quickfix.tt.field.MDEntrySizeType value) {
		setField(value);
	}

	public quickfix.tt.field.MDEntrySizeType get(quickfix.tt.field.MDEntrySizeType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.MDEntrySizeType getMDEntrySizeType() throws FieldNotFound {
		return get(new quickfix.tt.field.MDEntrySizeType());
	}

	public boolean isSet(quickfix.tt.field.MDEntrySizeType field) {
		return isSetField(field);
	}

	public boolean isSetMDEntrySizeType() {
		return isSetField(16487);
	}

	public void set(quickfix.tt.field.NumberOfOrders value) {
		setField(value);
	}

	public quickfix.tt.field.NumberOfOrders get(quickfix.tt.field.NumberOfOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.NumberOfOrders getNumberOfOrders() throws FieldNotFound {
		return get(new quickfix.tt.field.NumberOfOrders());
	}

	public boolean isSet(quickfix.tt.field.NumberOfOrders field) {
		return isSetField(field);
	}

	public boolean isSetNumberOfOrders() {
		return isSetField(346);
	}

	public void set(quickfix.tt.field.ExactNumOrdersIndicator value) {
		setField(value);
	}

	public quickfix.tt.field.ExactNumOrdersIndicator get(quickfix.tt.field.ExactNumOrdersIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ExactNumOrdersIndicator getExactNumOrdersIndicator() throws FieldNotFound {
		return get(new quickfix.tt.field.ExactNumOrdersIndicator());
	}

	public boolean isSet(quickfix.tt.field.ExactNumOrdersIndicator field) {
		return isSetField(field);
	}

	public boolean isSetExactNumOrdersIndicator() {
		return isSetField(16489);
	}

	}

}
