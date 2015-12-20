package singleton;

public class TickMaker {

	private static TickMaker tickmaker = new TickMaker();
	private TickMaker(){
		
	}
	
	public static TickMaker getInstance(){
		return tickmaker;
	}
	private int ticket = 1000;
	public void getNextTicketNumber(){
		System.out.println(ticket++);
	}
	
}
