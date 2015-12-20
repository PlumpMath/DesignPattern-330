package adapter.keishou;
class Bank {
    private int deposit;
    private int debt;
  
    public Bank(int deposit, int debt) {
        this.deposit = deposit;
        this.debt = debt;
    }
    public int getDeposit() {
        return this.deposit;
    }
    public int getDebt() {
        return this.debt;
    }
}
abstract class Prints {
    //貯金を表示
    public abstract void printDeposit();
    //借金を表示
    public abstract void printDebt();
}
class PrintBank extends Prints {

	private Bank bank;
	public PrintBank(int dep, int unnko) {
		// TODO 自動生成されたコンストラクター・スタブ
		bank = new Bank(100,200);
	}
	@Override
	public void printDeposit() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(bank.getDeposit());
	}

	@Override
	public void printDebt() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(bank.getDebt());
	}

	

	
   
}
public class AdapterDemo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Prints prints = new PrintBank(100, 200);
		prints.printDeposit();
		prints.printDebt();
	}

}
