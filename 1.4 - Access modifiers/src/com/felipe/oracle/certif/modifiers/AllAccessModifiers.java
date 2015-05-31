/**
 * 
 */
package com.felipe.oracle.certif.modifiers;

/**
 * @AllAccessModifiers AllAccessModifiers.java
 * @author FelipeeJey
 * @date 30/05/2015
 * 
 */
public class AllAccessModifiers {

	/**
	 * Public modifiers can be accessed from anywere
	 * */
	public String publicString = "This is a public string";
	/**
	 * protected modifiers can be accessed from child classes, or classes within the same package 
	 * */
	protected String protectedString = "This is a protected string";
	/**
	 * Private modifiers can be accessed only within the same file
	 * */
	private String privateString = "This is a private string";
	/**
	 * Default modifiers can be accessed only on classes in the same package
	 * */
	String defaultString = "This is a default string";
	
	public String nothing(){
		//we can use any variable in this class, because all the variables are visible in this FILE.
		return new StringBuffer(publicString).append("\n")
				.append(protectedString).append("\n")
				.append(privateString).append("\n")
				.append(defaultString)
				.toString();
	}
	
}
