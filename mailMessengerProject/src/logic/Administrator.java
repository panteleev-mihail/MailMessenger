package logic;

public class Administrator extends RegistredUser {
	private int _id;
	private RegistredUser _registeredUserId;
	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public RegistredUser get_registeredUserId() {
		return _registeredUserId;
	}
	public void set_registeredUserId(RegistredUser _registeredUserId) {
		this._registeredUserId = _registeredUserId;
	}
	
}