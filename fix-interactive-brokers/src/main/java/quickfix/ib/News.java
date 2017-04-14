
package quickfix.ib;

import quickfix.FieldNotFound;


public class News extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "B";
	

	public News() {
		super();
		getHeader().setField(new quickfix.ib.field.MsgType(MSGTYPE));
	}
	
	public News(quickfix.ib.field.Headline headline, quickfix.ib.field.DailyNewID dailyNewID, quickfix.ib.field.Urgency urgency) {
		this();
		setField(headline);
		setField(dailyNewID);
		setField(urgency);
	}
	
	public void set(quickfix.ib.field.Headline value) {
		setField(value);
	}

	public quickfix.ib.field.Headline get(quickfix.ib.field.Headline value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.Headline getHeadline() throws FieldNotFound {
		return get(new quickfix.ib.field.Headline());
	}

	public boolean isSet(quickfix.ib.field.Headline field) {
		return isSetField(field);
	}

	public boolean isSetHeadline() {
		return isSetField(148);
	}

	public void set(quickfix.ib.field.DailyNewID value) {
		setField(value);
	}

	public quickfix.ib.field.DailyNewID get(quickfix.ib.field.DailyNewID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.DailyNewID getDailyNewID() throws FieldNotFound {
		return get(new quickfix.ib.field.DailyNewID());
	}

	public boolean isSet(quickfix.ib.field.DailyNewID field) {
		return isSetField(field);
	}

	public boolean isSetDailyNewID() {
		return isSetField(6143);
	}

	public void set(quickfix.ib.field.Urgency value) {
		setField(value);
	}

	public quickfix.ib.field.Urgency get(quickfix.ib.field.Urgency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.Urgency getUrgency() throws FieldNotFound {
		return get(new quickfix.ib.field.Urgency());
	}

	public boolean isSet(quickfix.ib.field.Urgency field) {
		return isSetField(field);
	}

	public boolean isSetUrgency() {
		return isSetField(61);
	}

	public void set(quickfix.ib.field.SecurityExchange value) {
		setField(value);
	}

	public quickfix.ib.field.SecurityExchange get(quickfix.ib.field.SecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.ib.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
		return get(new quickfix.ib.field.SecurityExchange());
	}

	public boolean isSet(quickfix.ib.field.SecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetSecurityExchange() {
		return isSetField(207);
	}

}
