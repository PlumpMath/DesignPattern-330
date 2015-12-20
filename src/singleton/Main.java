package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2){
			System.out.println("obj1 == obj2");
		}
		
		NonSingleton nObj1 = new NonSingleton();
		NonSingleton nObj2 = new NonSingleton();
		
		if(nObj1 == nObj2) {
			System.out.println("nObj1 == nObj2");
		}
		
	}

}
