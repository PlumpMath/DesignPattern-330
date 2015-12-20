package singleton;

public class TestTicketMaker {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		TickMaker tm = new TickMaker();
//		System.out.println(tm.getNextTicketNumber());  
//		System.out.println(tm.getNextTicketNumber());  
//		TickMaker tm2 = new TickMaker();
//		System.out.println(tm2.getNextTicketNumber());  
//		System.out.println(tm2.getNextTicketNumber()); 
		TickMaker tm = TickMaker.getInstance();
		tm.getNextTicketNumber();
		tm.getNextTicketNumber();
		
		TickMaker tm2 = TickMaker.getInstance();
		tm2.getNextTicketNumber();
		tm2.getNextTicketNumber();
	}

}
