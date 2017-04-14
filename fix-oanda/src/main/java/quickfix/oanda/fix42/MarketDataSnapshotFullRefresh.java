
package quickfix.oanda.fix42;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketDataSnapshotFullRefresh extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "W";
	

	public MarketDataSnapshotFullRefresh() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public MarketDataSnapshotFullRefresh(quickfix.oanda.field.Symbol symbol) {
		this();
		setField(symbol);
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

	public void set(quickfix.oanda.field.NoMDEntries value) {
		setField(value);
	}

	public quickfix.oanda.field.NoMDEntries get(quickfix.oanda.field.NoMDEntries value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.NoMDEntries getNoMDEntries() throws FieldNotFound {
		return get(new quickfix.oanda.field.NoMDEntries());
	}

	public boolean isSet(quickfix.oanda.field.NoMDEntries field) {
		return isSetField(field);
	}

	public boolean isSetNoMDEntries() {
		return isSetField(268);
	}

	public static class NoMDEntries extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {269, 270, 271, 272, 273, 276, 64, 58, 0};

		public NoMDEntries() {
			super(268, 269, ORDER);
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

	public void set(quickfix.oanda.field.MDEntryPx value) {
		setField(value);
	}

	public quickfix.oanda.field.MDEntryPx get(quickfix.oanda.field.MDEntryPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MDEntryPx getMDEntryPx() throws FieldNotFound {
		return get(new quickfix.oanda.field.MDEntryPx());
	}

	public boolean isSet(quickfix.oanda.field.MDEntryPx field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryPx() {
		return isSetField(270);
	}

	public void set(quickfix.oanda.field.MDEntrySize value) {
		setField(value);
	}

	public quickfix.oanda.field.MDEntrySize get(quickfix.oanda.field.MDEntrySize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MDEntrySize getMDEntrySize() throws FieldNotFound {
		return get(new quickfix.oanda.field.MDEntrySize());
	}

	public boolean isSet(quickfix.oanda.field.MDEntrySize field) {
		return isSetField(field);
	}

	public boolean isSetMDEntrySize() {
		return isSetField(271);
	}

	public void set(quickfix.oanda.field.MDEntryDate value) {
		setField(value);
	}

	public quickfix.oanda.field.MDEntryDate get(quickfix.oanda.field.MDEntryDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MDEntryDate getMDEntryDate() throws FieldNotFound {
		return get(new quickfix.oanda.field.MDEntryDate());
	}

	public boolean isSet(quickfix.oanda.field.MDEntryDate field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryDate() {
		return isSetField(272);
	}

	public void set(quickfix.oanda.field.MDEntryTime value) {
		setField(value);
	}

	public quickfix.oanda.field.MDEntryTime get(quickfix.oanda.field.MDEntryTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.MDEntryTime getMDEntryTime() throws FieldNotFound {
		return get(new quickfix.oanda.field.MDEntryTime());
	}

	public boolean isSet(quickfix.oanda.field.MDEntryTime field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryTime() {
		return isSetField(273);
	}

	public void set(quickfix.oanda.field.QuoteCondition value) {
		setField(value);
	}

	public quickfix.oanda.field.QuoteCondition get(quickfix.oanda.field.QuoteCondition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.QuoteCondition getQuoteCondition() throws FieldNotFound {
		return get(new quickfix.oanda.field.QuoteCondition());
	}

	public boolean isSet(quickfix.oanda.field.QuoteCondition field) {
		return isSetField(field);
	}

	public boolean isSetQuoteCondition() {
		return isSetField(276);
	}

	public void set(quickfix.oanda.field.FutSettDate value) {
		setField(value);
	}

	public quickfix.oanda.field.FutSettDate get(quickfix.oanda.field.FutSettDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.FutSettDate getFutSettDate() throws FieldNotFound {
		return get(new quickfix.oanda.field.FutSettDate());
	}

	public boolean isSet(quickfix.oanda.field.FutSettDate field) {
		return isSetField(field);
	}

	public boolean isSetFutSettDate() {
		return isSetField(64);
	}

	public void set(quickfix.oanda.field.Text value) {
		setField(value);
	}

	public quickfix.oanda.field.Text get(quickfix.oanda.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.Text getText() throws FieldNotFound {
		return get(new quickfix.oanda.field.Text());
	}

	public boolean isSet(quickfix.oanda.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

	}

}
