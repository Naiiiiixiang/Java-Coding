package hahaha.lalala.polys.poly6;

public class TestOverloadOverride {
	public static void main(String[] args) {
		//多态 向上转型
		MyClass my = new MySub();

		Father f = new Father();
		Son s = new Son();
		Daughter d = new Daughter();

		my.method(f);// sub--    sub--   	sub--

		my.method(s);// son      son    	 son

		my.method(d);// father   daughter    sub--
	}
}