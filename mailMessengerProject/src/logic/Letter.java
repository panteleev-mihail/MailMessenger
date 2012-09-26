package logic;

public class Letter {
	private int _id;
	private String _senderEmail;
	private String _content;
	private String _theme;
	private String _receiverEmail;
	public Letter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_senderEmail() {
		return _senderEmail;
	}
	public void set_senderEmail(String _senderEmail) {
		this._senderEmail = _senderEmail;
	}
	public String get_content() {
		return _content;
	}
	public void set_content(String _content) {
		this._content = _content;
	}
	public String get_theme() {
		return _theme;
	}
	public void set_theme(String _theme) {
		this._theme = _theme;
	}
	public String get_receiverEmail() {
		return _receiverEmail;
	}
	public void set_receiverEmail(String _receiverEmail) {
		this._receiverEmail = _receiverEmail;
	}
	
}