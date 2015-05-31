/**
 * 
 */
package com.felipe.oracle.certif.modifiers.innerpackage;

import com.felipe.oracle.certif.modifiers.AllAccessModifiers;

/**
 * @AccessingTestInnerPackage AccessingTestInnerPackage.java
 * @author FelipeeJey
 * @date 30/05/2015
 * 
 */
public class AccessingTestInnerPackage {
	/**
	 * While on different packages, we can only access the public modifiers from another java class/interface
	 * */
	public String nothing(){
		AllAccessModifiers mod = new AllAccessModifiers();
		return new StringBuffer(mod.publicString).append("\n")
				.toString();
	}
}

/**
 * @AccessingTestInnerPackageExtends AccessingTestInnerPackage.java
 * @author FelipeeJey
 * @date 30/05/2015
 * 
 */
class AccessingTestInnerPackageExtends extends AllAccessModifiers{
	/**
	 * Again, on different packages, but child classes, we can access only the public and protected modifiers
	 * */
	public String nothing(){
		return new StringBuffer(this.publicString).append("\n")
				.append(this.protectedString).append("\n")
				.toString();
	}
}