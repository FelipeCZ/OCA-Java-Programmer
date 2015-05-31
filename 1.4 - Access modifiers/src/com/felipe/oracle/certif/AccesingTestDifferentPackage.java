/**
 * 
 */
package com.felipe.oracle.certif;

import com.felipe.oracle.certif.modifiers.AllAccessModifiers;

/**
 * @AccesingTestDifferentPackage AccesingTestDifferentPackage.java
 * @author FelipeeJey
 * @date 30/05/2015
 * 
 */
public class AccesingTestDifferentPackage {
	/**
	 * While on different packages, one class can access only the <b>public</b> attributes from another class
	 * */
	public String nothing(){
		AllAccessModifiers modifiers = new AllAccessModifiers();
		return new StringBuffer(modifiers.publicString).append("\n")
				.toString();
	}
}


/**
 * @AccesingTestDifferentPackageExtending AccesingTestDifferentPackage.java
 * @author FelipeeJey
 * @date 30/05/2015
 * 
 */
class AccesingTestDifferentPackageExtending extends AllAccessModifiers {
	/**
	 * In an child class, in different packages, we can access the public and the protected modifiers
	 * */
	public String nothing(){
		return new StringBuffer(this.publicString).append("\n")
				.append(this.protectedString).append("\n")
				.toString();
	}
}