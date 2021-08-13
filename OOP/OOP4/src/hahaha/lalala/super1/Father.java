package hahaha.lalala.super1;

class Father{
	protected int num = 10;

	public int getNum(){
		getNum1();
		return num;
	}

	public int getNum1(){
		return num;
	}
}
class Son extends Father{
	private int num = 20;
	public int getNum1(){
		return num;
	}
}
class Daughter extends Father{
	private int num = 30;

	public int getNum(){
		return num;
	}
}