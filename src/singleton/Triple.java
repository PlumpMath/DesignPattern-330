package singleton;

public class Triple {

	public int id;
	private Triple triple[] = new Triple[]{
		new Triple(0),
		new Triple(1),
		new Triple(2)
	};
	
	private Triple(int id){
		System.out.println("The instance " + id + " is created.");
	}
	
	public  Triple getInstance(int id){
		return triple[id];
	}
	
	public String toString(){
		return "Triple id=" + id + "]";
	}
	
}

class Test{
	public static void main(String args[]){
//		Triple obj1 = Triple.getInstance(0);
//		Triple obj2 = Triple.getInstance(1);
//		Triple obj3 = Triple.getInstance(2);
//		Triple obj4 = Triple.getInstance(0);
//		Triple obj5 = Triple.getInstance(1);
//		Triple obj6 = Triple.getInstance(2);
//		Triple obj7 = Triple.getInstance(3);
		
		
		
	}
}