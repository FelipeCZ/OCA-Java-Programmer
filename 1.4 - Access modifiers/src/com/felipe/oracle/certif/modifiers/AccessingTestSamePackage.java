/**
 * 
 */
package com.felipe.oracle.certif.modifiers;

/**
 * @AccessingTestSamePackage AccessingTestSamePackage.java
 * @author FelipeeJey
 * @date 30/05/2015
 * 
 */
public class AccessingTestSamePackage {

	
	/**
	 * While on classes within the same package, we can access all modifiers, except for the <b>private</b>
	 * that is restrict to the <b>same file as it was declared</b>.
	 * */
	public String nothing(){
		AllAccessModifiers modifiers = new AllAccessModifiers();
		return new StringBuffer(modifiers.publicString).append("\n")
				.append(modifiers.defaultString).append("\n")
				.append(modifiers.protectedString).append("\n")
				.toString();
	}
	
}


/**
 * @AccessingTestSamePackageSecondaryClass AccessingTestSamePackage.java
 * @author FelipeeJey
 * @date 30/05/2015
 * 
 */
class AccessingTestSamePackageSecondaryClass extends AllAccessModifiers {

	
	/**
	 * While on classes within the same package, we can access all modifiers, except for the <b>private</b>
	 * that is restrict to the <b>same file as it was declared</b>.
	 * */
	public String nothing(){
		return new StringBuffer(this.publicString).append("\n")
				.append(this.defaultString).append("\n")
				.append(this.protectedString).append("\n")
				.toString();
	}
	
}