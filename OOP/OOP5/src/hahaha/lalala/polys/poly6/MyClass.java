package hahaha.lalala.polys.poly6;

class MyClass{
	public void method(Father f) {
		System.out.println("father");
	}
	public void method(Son s) {
		System.out.println("son");
	}
}
class MySub extends MyClass{
	public void method(Father d) {
		System.out.println("sub--");
	}
	//子类自己新增的方法
    public void method(Daughter d) {
		System.out.println("daughter");
	}
}
class Father{
}
class Son extends Father{
}
class Daughter extends Father{
}