package extends3_protected.b;

import extends3_protected.a.A;
import extends3_protected.a.B;
// final class는 상송으로 변경 불가능한 class
public class C extends B{

	public C() {
		A a = new A();
		a.a = 100;		// public
		// 외부 패키지에서 직접 전근불가
		// a.b = 200;	// protected
		// a.c = 300;	// default
		// a.methodA();
	}
}
