package inheritance;

public class jdkDemo {
	public static void main(String[] args) {
		JDK8 obj = new JDK8();
		obj.f1();
	}
}

class JDK6{
	public JDK6() {
		System.out.println("installing JDK6");
	}
	void f1() {
		System.out.println("method of jdk6");
	}
}

class JDK7 extends JDK6{
	public JDK7() {
		System.out.println("installing JDK7");
	}
	void f2() {
		System.out.println("method of jdk7");
	}
}

class JDK8 extends JDK7{
	public JDK8() {
		System.out.println("installing JDK8");
	}
	void f3() {
		System.out.println("method of jdk8");
	}
}