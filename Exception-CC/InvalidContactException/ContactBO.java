package com.exception.cc2;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ContactBO {
	public ContactBO()
	{
		
	}
	private Pattern regexPattern;
	private Matcher regMatcher;
	public boolean validateContactDetails(Contact co) throws InvalidContactException 
	{
		
		String patternString=".*@.*";
		regexPattern=Pattern.compile(patternString);
		regMatcher =regexPattern.matcher(co.getEmail());
		if(regMatcher.matches()){
			
			return true;
		}
		
		return false;
	}
}