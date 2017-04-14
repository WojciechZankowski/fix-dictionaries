
package quickfix.oanda.fix42;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketDataRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "V";
	

	public MarketDataRequest() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public MarketDataRequest(quickfix.oanda.field.MDReqID mDReqID, quickfix.oanda.field.SubscriptionRequestType subscriptionRequestType, quickfix.oanda.field.MarketDepth marketDepth) {
		this();
		setField(mDReqID);
		setField(subscriptionRequestType);
		setField(marketDepth);
	}
	
	public void set(quickfix.oanda.field.MDReqID value) {
		setField(value);
	}

	public quickfix.oanda.field.MDReqID get(quickfix.oanda.field.MDReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MDReqID getMDReqID() throws FieldNotFound {
		return get(new quickfix.oanda.field.MDReqID());
	}

	public boolean isSet(quickfix.oanda.field.MDReqID field) {
		return isSetField(field);
	}

	public boolean isSetMDReqID() {
		return isSetField(262);
	}

	public void set(quickfix.oanda.field.SubscriptionRequestType value) {
		setField(value);
	}

	public quickfix.oanda.field.SubscriptionRequestType get(quickfix.oanda.field.SubscriptionRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
		return get(new quickfix.oanda.field.SubscriptionRequestType());
	}

	public boolean isSet(quickfix.oanda.field.SubscriptionRequestType field) {
		return isSetField(field);
	}

	public boolean isSetSubscriptionRequestType() {
		return isSetField(263);
	}

	public void set(quickfix.oanda.field.MarketDepth value) {
		setField(value);
	}

	public quickfix.oanda.field.MarketDepth get(quickfix.oanda.field.MarketDepth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MarketDepth getMarketDepth() throws FieldNotFound {
		return get(new quickfix.oanda.field.MarketDepth());
	}

	public boolean isSet(quickfix.oanda.field.MarketDepth field) {
		return isSetField(field);
	}

	public boolean isSetMarketDepth() {
		return isSetField(264);
	}

	public void set(quickfix.oanda.field.MDUpdateType value) {
		setField(value);
	}

	public quickfix.oanda.field.MDUpdateType get(quickfix.oanda.field.MDUpdateType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MDUpdateType getMDUpdateType() throws FieldNotFound {
		return get(new quickfix.oanda.field.MDUpdateType());
	}

	public boolean isSet(quickfix.oanda.field.MDUpdateType field) {
		return isSetField(field);
	}

	public boolean isSetMDUpdateType() {
		return isSetField(265);
	}

	public void set(quickfix.oanda.field.NoMDEntryTypes value) {
		setField(value);
	}

	public quickfix.oanda.field.NoMDEntryTypes get(quickfix.oanda.field.NoMDEntryTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.NoMDEntryTypes getNoMDEntryTypes() throws FieldNotFound {
		return get(new quickfix.oanda.field.NoMDEntryTypes());
	}

	public boolean isSet(quickfix.oanda.field.NoMDEntryTypes field) {
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
		
	public void set(quickfix.oanda.field.MDEntryType value) {
		setField(value);
	}

	public quickfix.oanda.field.MDEntryType get(quickfix.oanda.field.MDEntryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MDEntryType getMDEntryType() throws FieldNotFound {
		return get(new quickfix.oanda.field.MDEntryType());
	}

	public boolean isSet(quickfix.oanda.field.MDEntryType field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryType() {
		return isSetField(269);
	}

	}

	public void set(quickfix.oanda.field.NoRelatedSym value) {
		setField(value);
	}

	public quickfix.oanda.field.NoRelatedSym get(quickfix.oanda.field.NoRelatedSym value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.NoRelatedSym getNoRelatedSym() throws FieldNotFound {
		return get(new quickfix.oanda.field.NoRelatedSym());
	}

	public boolean isSet(quickfix.oanda.field.NoRelatedSym field) {
		return isSetField(field);
	}

	public boolean isSetNoRelatedSym() {
		return isSetField(146);
	}

	public static class NoRelatedSym extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {55, 0};

		public NoRelatedSym() {
			super(146, 55, ORDER);
		}
		
	public void set(quickfix.oanda.field.Symbol value) {
		setField(value);
	}

	public quickfix.oanda.field.Symbol get(quickfix.oanda.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.oanda.field.Symbol());
	}

	public boolean isSet(quickfix.oanda.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	}

}
