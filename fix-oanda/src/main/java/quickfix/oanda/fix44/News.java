
package quickfix.oanda.fix44;

import quickfix.FieldNotFound;

import quickfix.Group;

public class News extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "B";
	

	public News() {
		super();
		getHeader().setField(new quickfix.oanda.field.MsgType(MSGTYPE));
	}
	
	public News(quickfix.oanda.field.Headline headline) {
		this();
		setField(headline);
	}
	
	public void set(quickfix.oanda.field.Headline value) {
		setField(value);
	}

	public quickfix.oanda.field.Headline get(quickfix.oanda.field.Headline value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.Headline getHeadline() throws FieldNotFound {
		return get(new quickfix.oanda.field.Headline());
	}

	public boolean isSet(quickfix.oanda.field.Headline field) {
		return isSetField(field);
	}

	public boolean isSetHeadline() {
		return isSetField(148);
	}

	public void set(quickfix.oanda.field.LinesOfText value) {
		setField(value);
	}

	public quickfix.oanda.field.LinesOfText get(quickfix.oanda.field.LinesOfText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.oanda.field.LinesOfText getLinesOfText() throws FieldNotFound {
		return get(new quickfix.oanda.field.LinesOfText());
	}

	public boolean isSet(quickfix.oanda.field.LinesOfText field) {
		return isSetField(field);
	}

	public boolean isSetLinesOfText() {
		return isSetField(33);
	}

	public static class LinesOfText extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {58, 0};

		public LinesOfText() {
			super(33, 58, ORDER);
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
