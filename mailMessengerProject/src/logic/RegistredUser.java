package logic;

import java.util.Date;

public class RegistredUser {
	private int _id;
	private String _fIO;
	private String _telephone;
	private Date _dateOfBirth;
	private Date _dateOfREgistration;
	private String _secondMailAdress;
	public RegistredUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_fIO() {
		return _fIO;
	}
	public void set_fIO(String _fIO) {
		this._fIO = _fIO;
	}
	public String get_telephone() {
		return _telephone;
	}
	public void set_telephone(String _telephone) {
		this._telephone = _telephone;
	}
	public Date get_dateOfBirth() {
		return _dateOfBirth;
	}
	public void set_dateOfBirth(Date _dateOfBirth) {
		this._dateOfBirth = _dateOfBirth;
	}
	public Date get_dateOfREgistration() {
		return _dateOfREgistration;
	}
	public void set_dateOfREgistration(Date _dateOfREgistration) {
		this._dateOfREgistration = _dateOfREgistration;
	}
	public String get_secondMailAdress() {
		return _secondMailAdress;
	}
	public void set_secondMailAdress(String _secondMailAdress) {
		this._secondMailAdress = _secondMailAdress;
	}
	
}