
package quickfix.tt;

import quickfix.FieldNotFound;


public class OrderCancelReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "9";
	

	public OrderCancelReject() {
		super();
		getHeader().setField(new quickfix.tt.field.MsgType(MSGTYPE));
	}
	
	public OrderCancelReject(quickfix.tt.field.OrderID orderID, quickfix.tt.field.ClOrdID clOrdID, quickfix.tt.field.OrdStatus ordStatus, quickfix.tt.field.TransactTime transactTime, quickfix.tt.field.CxlRejResponseTo cxlRejResponseTo, quickfix.tt.field.CxlRejReason cxlRejReason) {
		this();
		setField(orderID);
		setField(clOrdID);
		setField(ordStatus);
		setField(transactTime);
		setField(cxlRejResponseTo);
		setField(cxlRejReason);
	}
	
	public void set(quickfix.tt.field.OrderID value) {
		setField(value);
	}

	public quickfix.tt.field.OrderID get(quickfix.tt.field.OrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrderID getOrderID() throws FieldNotFound {
		return get(new quickfix.tt.field.OrderID());
	}

	public boolean isSet(quickfix.tt.field.OrderID field) {
		return isSetField(field);
	}

	public boolean isSetOrderID() {
		return isSetField(37);
	}

	public void set(quickfix.tt.field.ClOrdID value) {
		setField(value);
	}

	public quickfix.tt.field.ClOrdID get(quickfix.tt.field.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new quickfix.tt.field.ClOrdID());
	}

	public boolean isSet(quickfix.tt.field.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

	public void set(quickfix.tt.field.OrigClOrdID value) {
		setField(value);
	}

	public quickfix.tt.field.OrigClOrdID get(quickfix.tt.field.OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		return get(new quickfix.tt.field.OrigClOrdID());
	}

	public boolean isSet(quickfix.tt.field.OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(41);
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

	public void set(quickfix.tt.field.Account value) {
		setField(value);
	}

	public quickfix.tt.field.Account get(quickfix.tt.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Account getAccount() throws FieldNotFound {
		return get(new quickfix.tt.field.Account());
	}

	public boolean isSet(quickfix.tt.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(quickfix.tt.field.OrdStatus value) {
		setField(value);
	}

	public quickfix.tt.field.OrdStatus get(quickfix.tt.field.OrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrdStatus getOrdStatus() throws FieldNotFound {
		return get(new quickfix.tt.field.OrdStatus());
	}

	public boolean isSet(quickfix.tt.field.OrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatus() {
		return isSetField(39);
	}

	public void set(quickfix.tt.field.TransactTime value) {
		setField(value);
	}

	public quickfix.tt.field.TransactTime get(quickfix.tt.field.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TransactTime getTransactTime() throws FieldNotFound {
		return get(new quickfix.tt.field.TransactTime());
	}

	public boolean isSet(quickfix.tt.field.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
	}

	public void set(quickfix.tt.field.CxlRejResponseTo value) {
		setField(value);
	}

	public quickfix.tt.field.CxlRejResponseTo get(quickfix.tt.field.CxlRejResponseTo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.CxlRejResponseTo getCxlRejResponseTo() throws FieldNotFound {
		return get(new quickfix.tt.field.CxlRejResponseTo());
	}

	public boolean isSet(quickfix.tt.field.CxlRejResponseTo field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejResponseTo() {
		return isSetField(434);
	}

	public void set(quickfix.tt.field.CxlRejReason value) {
		setField(value);
	}

	public quickfix.tt.field.CxlRejReason get(quickfix.tt.field.CxlRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.CxlRejReason getCxlRejReason() throws FieldNotFound {
		return get(new quickfix.tt.field.CxlRejReason());
	}

	public boolean isSet(quickfix.tt.field.CxlRejReason field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejReason() {
		return isSetField(102);
	}

	public void set(quickfix.tt.field.Text value) {
		setField(value);
	}

	public quickfix.tt.field.Text get(quickfix.tt.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.Text getText() throws FieldNotFound {
		return get(new quickfix.tt.field.Text());
	}

	public boolean isSet(quickfix.tt.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

	public void set(quickfix.tt.field.TTUsername value) {
		setField(value);
	}

	public quickfix.tt.field.TTUsername get(quickfix.tt.field.TTUsername value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.TTUsername getTTUsername() throws FieldNotFound {
		return get(new quickfix.tt.field.TTUsername());
	}

	public boolean isSet(quickfix.tt.field.TTUsername field) {
		return isSetField(field);
	}

	public boolean isSetTTUsername() {
		return isSetField(10553);
	}

	public void set(quickfix.tt.field.UserTag value) {
		setField(value);
	}

	public quickfix.tt.field.UserTag get(quickfix.tt.field.UserTag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.UserTag getUserTag() throws FieldNotFound {
		return get(new quickfix.tt.field.UserTag());
	}

	public boolean isSet(quickfix.tt.field.UserTag field) {
		return isSetField(field);
	}

	public boolean isSetUserTag() {
		return isSetField(16104);
	}

	public void set(quickfix.tt.field.OrderTag value) {
		setField(value);
	}

	public quickfix.tt.field.OrderTag get(quickfix.tt.field.OrderTag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.OrderTag getOrderTag() throws FieldNotFound {
		return get(new quickfix.tt.field.OrderTag());
	}

	public boolean isSet(quickfix.tt.field.OrderTag field) {
		return isSetField(field);
	}

	public boolean isSetOrderTag() {
		return isSetField(16105);
	}

	public void set(quickfix.tt.field.StagedOrderMsg value) {
		setField(value);
	}

	public quickfix.tt.field.StagedOrderMsg get(quickfix.tt.field.StagedOrderMsg value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.StagedOrderMsg getStagedOrderMsg() throws FieldNotFound {
		return get(new quickfix.tt.field.StagedOrderMsg());
	}

	public boolean isSet(quickfix.tt.field.StagedOrderMsg field) {
		return isSetField(field);
	}

	public boolean isSetStagedOrderMsg() {
		return isSetField(16106);
	}

	public void set(quickfix.tt.field.StagedOrderOwner value) {
		setField(value);
	}

	public quickfix.tt.field.StagedOrderOwner get(quickfix.tt.field.StagedOrderOwner value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.StagedOrderOwner getStagedOrderOwner() throws FieldNotFound {
		return get(new quickfix.tt.field.StagedOrderOwner());
	}

	public boolean isSet(quickfix.tt.field.StagedOrderOwner field) {
		return isSetField(field);
	}

	public boolean isSetStagedOrderOwner() {
		return isSetField(16110);
	}

	public void set(quickfix.tt.field.StagedOrderStatus value) {
		setField(value);
	}

	public quickfix.tt.field.StagedOrderStatus get(quickfix.tt.field.StagedOrderStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.StagedOrderStatus getStagedOrderStatus() throws FieldNotFound {
		return get(new quickfix.tt.field.StagedOrderStatus());
	}

	public boolean isSet(quickfix.tt.field.StagedOrderStatus field) {
		return isSetField(field);
	}

	public boolean isSetStagedOrderStatus() {
		return isSetField(16109);
	}

	public void set(quickfix.tt.field.HandlInst value) {
		setField(value);
	}

	public quickfix.tt.field.HandlInst get(quickfix.tt.field.HandlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.HandlInst getHandlInst() throws FieldNotFound {
		return get(new quickfix.tt.field.HandlInst());
	}

	public boolean isSet(quickfix.tt.field.HandlInst field) {
		return isSetField(field);
	}

	public boolean isSetHandlInst() {
		return isSetField(21);
	}

	public void set(quickfix.tt.field.StagedRoutingLevel value) {
		setField(value);
	}

	public quickfix.tt.field.StagedRoutingLevel get(quickfix.tt.field.StagedRoutingLevel value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.StagedRoutingLevel getStagedRoutingLevel() throws FieldNotFound {
		return get(new quickfix.tt.field.StagedRoutingLevel());
	}

	public boolean isSet(quickfix.tt.field.StagedRoutingLevel field) {
		return isSetField(field);
	}

	public boolean isSetStagedRoutingLevel() {
		return isSetField(16111);
	}

	public void set(quickfix.tt.field.BrokerID value) {
		setField(value);
	}

	public quickfix.tt.field.BrokerID get(quickfix.tt.field.BrokerID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.BrokerID getBrokerID() throws FieldNotFound {
		return get(new quickfix.tt.field.BrokerID());
	}

	public boolean isSet(quickfix.tt.field.BrokerID field) {
		return isSetField(field);
	}

	public boolean isSetBrokerID() {
		return isSetField(18220);
	}

	public void set(quickfix.tt.field.CompanyID value) {
		setField(value);
	}

	public quickfix.tt.field.CompanyID get(quickfix.tt.field.CompanyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.tt.field.CompanyID getCompanyID() throws FieldNotFound {
		return get(new quickfix.tt.field.CompanyID());
	}

	public boolean isSet(quickfix.tt.field.CompanyID field) {
		return isSetField(field);
	}

	public boolean isSetCompanyID() {
		return isSetField(18221);
	}

}
