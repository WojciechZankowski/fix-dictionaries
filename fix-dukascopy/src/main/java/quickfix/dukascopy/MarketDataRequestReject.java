
package quickfix.dukascopy;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketDataRequestReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "Y";
	

	public MarketDataRequestReject() {
		super();
		getHeader().setField(new quickfix.dukascopy.field.MsgType(MSGTYPE));
	}
	
	public MarketDataRequestReject(quickfix.dukascopy.field.MDReqID mDReqID) {
		this();
		setField(mDReqID);
	}
	
	public void set(quickfix.dukascopy.field.MDReqID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MDReqID get(quickfix.dukascopy.field.MDReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MDReqID getMDReqID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MDReqID());
	}

	public boolean isSet(quickfix.dukascopy.field.MDReqID field) {
		return isSetField(field);
	}

	public boolean isSetMDReqID() {
		return isSetField(262);
	}

	public void set(quickfix.dukascopy.field.MDReqRejReason value) {
		setField(value);
	}

	public quickfix.dukascopy.field.MDReqRejReason get(quickfix.dukascopy.field.MDReqRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.MDReqRejReason getMDReqRejReason() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.MDReqRejReason());
	}

	public boolean isSet(quickfix.dukascopy.field.MDReqRejReason field) {
		return isSetField(field);
	}

	public boolean isSetMDReqRejReason() {
		return isSetField(281);
	}

	public void set(quickfix.dukascopy.field.NoAltMDSource value) {
		setField(value);
	}

	public quickfix.dukascopy.field.NoAltMDSource get(quickfix.dukascopy.field.NoAltMDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.NoAltMDSource getNoAltMDSource() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.NoAltMDSource());
	}

	public boolean isSet(quickfix.dukascopy.field.NoAltMDSource field) {
		return isSetField(field);
	}

	public boolean isSetNoAltMDSource() {
		return isSetField(816);
	}

	public static class NoAltMDSource extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {817, 0};

		public NoAltMDSource() {
			super(816, 817, ORDER);
		}
		
	public void set(quickfix.dukascopy.field.AltMDSourceID value) {
		setField(value);
	}

	public quickfix.dukascopy.field.AltMDSourceID get(quickfix.dukascopy.field.AltMDSourceID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.dukascopy.field.AltMDSourceID getAltMDSourceID() throws FieldNotFound {
		return get(new quickfix.dukascopy.field.AltMDSourceID());
	}

	public boolean isSet(quickfix.dukascopy.field.AltMDSourceID field) {
		return isSetField(field);
	}

	public boolean isSetAltMDSourceID() {
		return isSetField(817);
	}

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
