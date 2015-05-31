package br.com.java.learning.felipe.interfaces;

public interface StaticVariables {
	public static final String name = "FELIPE"; 
	public String getName();
	public StaticVariables getImpl();
	public static final StaticVariables instance = new InterfaceImpl();
}

interface OtherInterface extends StaticVariables {
	public static final String lastName = "ZANICHELLI";
	public String getLastName();
	public String getFirstName();
}

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