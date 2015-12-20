package adapter.keishou;

public class Main{
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
		super().clone();
	}
	public static void main(String[] args) {
		
		Print p = new PrintBanner("hello");
		p.printWeak();
		p.printStrong();
		Object obj = new Object();
		while (true) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
		
	}
}