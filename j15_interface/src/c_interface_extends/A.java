package c_interface_extends;

public interface A {

	void methodA();

	static void methodC() {
		System.out.println("A class의 methodC");
	}
}

interface B{
	void methodA();
	void methodB();
}

interface C extends A,B{
	void methodC();

	@Override
	default void methodB() {
		System.out.println("C interface의 methodB");
		
	}
}