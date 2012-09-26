package logic;

public class Contact {
	private int _id;
	private RegistredUser _ContactHolder;
	private RegistredUser _ContactPerson;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public RegistredUser get_ContactHolder() {
		return _ContactHolder;
	}
	public void set_ContactHolder(RegistredUser _ContactHolder) {
		this._ContactHolder = _ContactHolder;
	}
	public RegistredUser get_ContactPerson() {
		return _ContactPerson;
	}
	public void set_ContactPerson(RegistredUser _ContactPerson) {
		this._ContactPerson = _ContactPerson;
	}
	
}