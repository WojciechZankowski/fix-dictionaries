
package quickfix.dukascopy;

import quickfix.FieldNotFound;


public class OrderCancelReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "9";
	

	public OrderCancelReject() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public OrderCancelReject(quickfix.dukascopy.field.OrderID orderID, quickfix.dukascopy.field.ClOrdID clOrdID, quickfix.dukascopy.field.OrigClOrdID origClOrdID, quickfix.dukascopy.field.OrdStatus ordStatus, quickfix.dukascopy.field.CxlRejResponseTo cxlRejResponseTo) {
		this();
		setField(orderID);
		setField(clOrdID);
		setField(origClOrdID);
		setField(ordStatus);
		setField(cxlRejResponseTo);
	}
	
	public void set(quickfix.dukascopy.field.OrderID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OrderID get(quickfix.dukascopy.field.OrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OrderID getOrderID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OrderID());
	}

	public boolean isSet(quickfix.dukascopy.field.OrderID field) {
		return isSetField(field);
	}

	public boolean isSetOrderID() {
		return isSetField(37);
	}

	public void set(quickfix.dukascopy.field.SecondaryOrderID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SecondaryOrderID get(quickfix.dukascopy.field.SecondaryOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SecondaryOrderID());
	}

	public boolean isSet(quickfix.dukascopy.field.SecondaryOrderID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryOrderID() {
		return isSetField(198);
	}

	public void set(quickfix.dukascopy.field.SecondaryClOrdID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.SecondaryClOrdID get(quickfix.dukascopy.field.SecondaryClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.SecondaryClOrdID());
	}

	public boolean isSet(quickfix.dukascopy.field.SecondaryClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryClOrdID() {
		return isSetField(526);
	}

	public void set(quickfix.dukascopy.field.ClOrdID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.ClOrdID get(quickfix.dukascopy.field.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.ClOrdID());
	}

	public boolean isSet(quickfix.dukascopy.field.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

	public void set(quickfix.dukascopy.field.ClOrdLinkID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.ClOrdLinkID get(quickfix.dukascopy.field.ClOrdLinkID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.ClOrdLinkID getClOrdLinkID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.ClOrdLinkID());
	}

	public boolean isSet(quickfix.dukascopy.field.ClOrdLinkID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdLinkID() {
		return isSetField(583);
	}

	public void set(quickfix.dukascopy.field.OrigClOrdID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OrigClOrdID get(quickfix.dukascopy.field.OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OrigClOrdID());
	}

	public boolean isSet(quickfix.dukascopy.field.OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(41);
	}

	public void set(quickfix.dukascopy.field.OrdStatus value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OrdStatus get(quickfix.dukascopy.field.OrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OrdStatus getOrdStatus() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OrdStatus());
	}

	public boolean isSet(quickfix.dukascopy.field.OrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatus() {
		return isSetField(39);
	}

	public void set(quickfix.dukascopy.field.WorkingIndicator value) {
		setField(value);
	}

	public quickfix.dukascopy.field.WorkingIndicator get(quickfix.dukascopy.field.WorkingIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.WorkingIndicator getWorkingIndicator() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.WorkingIndicator());
	}

	public boolean isSet(quickfix.dukascopy.field.WorkingIndicator field) {
		return isSetField(field);
	}

	public boolean isSetWorkingIndicator() {
		return isSetField(636);
	}

	public void set(quickfix.dukascopy.field.OrigOrdModTime value) {
		setField(value);
	}

	public quickfix.dukascopy.field.OrigOrdModTime get(quickfix.dukascopy.field.OrigOrdModTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.OrigOrdModTime getOrigOrdModTime() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.OrigOrdModTime());
	}

	public boolean isSet(quickfix.dukascopy.field.OrigOrdModTime field) {
		return isSetField(field);
	}

	public boolean isSetOrigOrdModTime() {
		return isSetField(586);
	}

	public void set(quickfix.dukascopy.field.ListID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.ListID get(quickfix.dukascopy.field.ListID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.ListID getListID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.ListID());
	}

	public boolean isSet(quickfix.dukascopy.field.ListID field) {
		return isSetField(field);
	}

	public boolean isSetListID() {
		return isSetField(66);
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

	public void set(quickfix.dukascopy.field.TradeOriginationDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradeOriginationDate get(quickfix.dukascopy.field.TradeOriginationDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradeOriginationDate getTradeOriginationDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradeOriginationDate());
	}

	public boolean isSet(quickfix.dukascopy.field.TradeOriginationDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeOriginationDate() {
		return isSetField(229);
	}

	public void set(quickfix.dukascopy.field.TradeDate value) {
		setField(value);
	}

	public quickfix.dukascopy.field.TradeDate get(quickfix.dukascopy.field.TradeDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.TradeDate getTradeDate() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.TradeDate());
	}

	public boolean isSet(quickfix.dukascopy.field.TradeDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeDate() {
		return isSetField(75);
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

	public void set(quickfix.dukascopy.field.CxlRejResponseTo value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CxlRejResponseTo get(quickfix.dukascopy.field.CxlRejResponseTo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CxlRejResponseTo getCxlRejResponseTo() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CxlRejResponseTo());
	}

	public boolean isSet(quickfix.dukascopy.field.CxlRejResponseTo field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejResponseTo() {
		return isSetField(434);
	}

	public void set(quickfix.dukascopy.field.CxlRejReason value) {
		setField(value);
	}

	public quickfix.dukascopy.field.CxlRejReason get(quickfix.dukascopy.field.CxlRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.CxlRejReason getCxlRejReason() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.CxlRejReason());
	}

	public boolean isSet(quickfix.dukascopy.field.CxlRejReason field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejReason() {
		return isSetField(102);
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
