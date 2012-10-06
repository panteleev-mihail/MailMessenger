package com.if30v.MailMessanger.validators;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
public class Validator {
	public static boolean validEmail (String email) throws ValidatorException 
	{
		boolean result = true;
		   try {
		      InternetAddress emailAddr = new InternetAddress(email);
		      emailAddr.validate();
		   } catch (AddressException ex) {
		      result = false;
		      throw new ValidatorException();
		   }
		   return result;
	}
	public static boolean validLogin(String login) throws ValidatorException
	{
		if(login == null || login=="")
			throw new ValidatorException();
		boolean result;
		Pattern p = Pattern.compile("[0-9A-Za-z]+");
		Matcher m = p.matcher(login);
		result = m.matches(); 
		if(!result)
			throw new ValidatorException();
		return result;
	}
	public static boolean validTelephone(String telephone) throws ValidatorException
	{
		boolean result;
		Pattern p = Pattern.compile("+[0-9]{11}");
		Matcher m = p.matcher(telephone);
		result = m.matches();
		if(!result)
			throw new ValidatorException();
		return result;
	}
	public static boolean validPassword(String password) throws ValidatorException
	{
		boolean result;
		if(password == null || password=="")
			throw new ValidatorException();
		Pattern p = Pattern.compile("[0-9A-Za-z]{5,}");
		Matcher m = p.matcher(password);
		result = m.matches(); 
		if(!result)
			throw new ValidatorException();
		return result;
	}
	
	
}
