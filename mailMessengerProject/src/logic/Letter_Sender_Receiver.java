package logic;

public class Letter_Sender_Receiver {
	private int _id;
	private RegistredUser _Sender;
	private RegistredUser _Receiver;
	private Letter _Letter;
	private boolean _isRead;
	private boolean _isSenderTrash;
	private boolean _isRecTrash;
	public Letter_Sender_Receiver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public RegistredUser get_Sender() {
		return _Sender;
	}
	public void set_Sender(RegistredUser _Sender) {
		this._Sender = _Sender;
	}
	public RegistredUser get_Receiver() {
		return _Receiver;
	}
	public void set_Receiver(RegistredUser _Receiver) {
		this._Receiver = _Receiver;
	}
	public Letter get_Letter() {
		return _Letter;
	}
	public void set_Letter(Letter _Letter) {
		this._Letter = _Letter;
	}
	public boolean is_isRead() {
		return _isRead;
	}
	public void set_isRead(boolean _isRead) {
		this._isRead = _isRead;
	}
	public boolean is_isSenderTrash() {
		return _isSenderTrash;
	}
	public void set_isSenderTrash(boolean _isSenderTrash) {
		this._isSenderTrash = _isSenderTrash;
	}
	public boolean is_isRecTrash() {
		return _isRecTrash;
	}
	public void set_isRecTrash(boolean _isRecTrash) {
		this._isRecTrash = _isRecTrash;
	}
	
}