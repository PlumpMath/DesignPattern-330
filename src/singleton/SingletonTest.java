package singleton;

public class SingletonTest {

	private static SingletonTest singleton = null;
//	private static SingletonTest singleton = new SingletonTest();

	private SingletonTest(){
		System.out.println("インスタンス生成！");
		slowdown();
	}
	public static SingletonTest getInstance(){
		if(singleton == null){
			singleton = new SingletonTest();
		}
		return singleton;
	}
	private void slowdown(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}


class Test2 extends Thread{
	public static void main (String args[]){
//		SingletonTest obj[] = SingletonTest.getInstance();
//		SingletonTest obj2 = SingletonTest.getInstance();
		System.out.println("START");
		new Test2("A").start();
		new Test2("B").start();
		new Test2("C").start();
		System.out.println("END");
	}
	
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		SingletonTest obj = SingletonTest.getInstance();
		System.out.println(getName() + ": obj = " + obj);
	}
	
	public Test2(String name){
		super(name);
	}
	
}