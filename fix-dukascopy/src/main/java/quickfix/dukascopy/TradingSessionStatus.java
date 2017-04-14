
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class TradingSessionStatus extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "h";
	

	public TradingSessionStatus() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public TradingSessionStatus(quickfix.dukascopy.field.TradingSessionID tradingSessionID, quickfix.dukascopy.field.TradSesStatus tradSesStatus) {
		this();
		setField(tradingSessionID);
		setField(tradSesStatus);
	}
	
	public void set(quickfix.dukascopy.field.TradSesReqID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradSesReqID get(quickfix.dukascopy.field.TradSesReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradSesReqID getTradSesReqID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradSesReqID());
	}

	public boolean isSet(quickfix.dukascopy.field.TradSesReqID field) {
		return isSetField(field);
	}

	public boolean isSetTradSesReqID() {
		return isSetField(335);
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

	public void set(quickfix.dukascopy.field.TradSesMethod value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradSesMethod get(quickfix.dukascopy.field.TradSesMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradSesMethod getTradSesMethod() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradSesMethod());
	}

	public boolean isSet(quickfix.dukascopy.field.TradSesMethod field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMethod() {
		return isSetField(338);
	}

	public void set(quickfix.dukascopy.field.TradSesMode value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradSesMode get(quickfix.dukascopy.field.TradSesMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradSesMode getTradSesMode() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradSesMode());
	}

	public boolean isSet(quickfix.dukascopy.field.TradSesMode field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMode() {
		return isSetField(339);
	}

	public void set(quickfix.dukascopy.field.UnsolicitedIndicator value) {
		setField(value);
	}

	public quickfix.dukascopy.field.UnsolicitedIndicator get(quickfix.dukascopy.field.UnsolicitedIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.UnsolicitedIndicator getUnsolicitedIndicator() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.UnsolicitedIndicator());
	}

	public boolean isSet(quickfix.dukascopy.field.UnsolicitedIndicator field) {
		return isSetField(field);
	}

	public boolean isSetUnsolicitedIndicator() {
		return isSetField(325);
	}

	public void set(quickfix.dukascopy.field.TradSesStatus value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradSesStatus get(quickfix.dukascopy.field.TradSesStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradSesStatus getTradSesStatus() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradSesStatus());
	}

	public boolean isSet(quickfix.dukascopy.field.TradSesStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStatus() {
		return isSetField(340);
	}

	public void set(quickfix.dukascopy.field.TradSesStatusRejReason value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradSesStatusRejReason get(quickfix.dukascopy.field.TradSesStatusRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradSesStatusRejReason getTradSesStatusRejReason() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradSesStatusRejReason());
	}

	public boolean isSet(quickfix.dukascopy.field.TradSesStatusRejReason field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStatusRejReason() {
		return isSetField(567);
	}

	public void set(quickfix.dukascopy.field.TradSesStartTime value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradSesStartTime get(quickfix.dukascopy.field.TradSesStartTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradSesStartTime getTradSesStartTime() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradSesStartTime());
	}

	public boolean isSet(quickfix.dukascopy.field.TradSesStartTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStartTime() {
		return isSetField(341);
	}

	public void set(quickfix.dukascopy.field.TradSesOpenTime value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradSesOpenTime get(quickfix.dukascopy.field.TradSesOpenTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradSesOpenTime getTradSesOpenTime() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradSesOpenTime());
	}

	public boolean isSet(quickfix.dukascopy.field.TradSesOpenTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesOpenTime() {
		return isSetField(342);
	}

	public void set(quickfix.dukascopy.field.TradSesPreCloseTime value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradSesPreCloseTime get(quickfix.dukascopy.field.TradSesPreCloseTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradSesPreCloseTime getTradSesPreCloseTime() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradSesPreCloseTime());
	}

	public boolean isSet(quickfix.dukascopy.field.TradSesPreCloseTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesPreCloseTime() {
		return isSetField(343);
	}

	public void set(quickfix.dukascopy.field.TradSesCloseTime value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradSesCloseTime get(quickfix.dukascopy.field.TradSesCloseTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradSesCloseTime getTradSesCloseTime() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradSesCloseTime());
	}

	public boolean isSet(quickfix.dukascopy.field.TradSesCloseTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesCloseTime() {
		return isSetField(344);
	}

	public void set(quickfix.dukascopy.field.TradSesEndTime value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradSesEndTime get(quickfix.dukascopy.field.TradSesEndTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradSesEndTime getTradSesEndTime() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradSesEndTime());
	}

	public boolean isSet(quickfix.dukascopy.field.TradSesEndTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesEndTime() {
		return isSetField(345);
	}

	public void set(quickfix.dukascopy.field.TotalVolumeTraded value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TotalVolumeTraded get(quickfix.dukascopy.field.TotalVolumeTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TotalVolumeTraded getTotalVolumeTraded() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TotalVolumeTraded());
	}

	public boolean isSet(quickfix.dukascopy.field.TotalVolumeTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalVolumeTraded() {
		return isSetField(387);
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

}
