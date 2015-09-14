package br.com.java.learning.felipe.interfaces;

/**
 * interfaces may have static variables
 * @author FelipeeJey
 *
 */
public interface StaticVariables {
	public static final String name = "FELIPE"; 
	public String getName();
	public StaticVariables getImpl();
	public static final StaticVariables instance = new InterfaceImpl();
}

/**
 * interfaces may also have static methods implementation!!!
 * @author FelipeeJey
 *
 */
interface OtherInterface extends StaticVariables {
	public static final String lastName = "ZANICHELLI";
	public String getLastName();
	public String getFirstName();
	public static void log(String message){
		System.err.println(message);
	}
	
}

/**
 * if the method is already implemented in the interface, then we don't need to implement it in the class
 * @author FelipeeJey
 *
 */
class InterfaceImpl implements OtherInterface {

	@Override
	public String getName() {
		return getFirstName()+" "+getLastName();
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public String getFirstName() {
		return name;
	}

	@Override
	public StaticVariables getImpl() {
		return new InterfaceImpl();
	}
	
}