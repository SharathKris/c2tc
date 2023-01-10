import tns.day4.package1.Base;

public class Derived extends Base {
	Derived()
	{
		System.out.println("Derived Class default");
		super.varPublic=201;
		super.varProtected=401;
		// super.varDefault=101;    //Default members are package specific so unable to access from another class
		
		methodProtected();
	}
}

