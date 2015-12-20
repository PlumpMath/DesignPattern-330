package singleton;

public class Kaikei{

    private int money = 0;

    

    public  void add(int m){

        int tmp = money;

        System.out.println("現在の価格は" + money + "円です。");

        System.out.println("ただいま" + m + "円の入札がありました。");

        tmp += m;

        System.out.println("最高額は" + tmp + "円となります。 \n");

        money = tmp;

    }

}

class Auction implements Runnable{

    private Kaikei ki;



    public Auction(Kaikei ki){

        this.ki = ki;

    }

    public void run(){

        for(int i = 0; i < 3; i++){

            ki.add(100);

        }

    }

}
class Syn{

    public static void main(String[] args) throws InterruptedException{

        Kaikei ki = new Kaikei();

        

        

        Auction auc1 = new Auction(ki);

        Auction auc2 = new Auction(ki);

        

        Thread th1 = new Thread(auc1);

        Thread th2 = new Thread(auc2);

        th1.start();

        th2.start();
        th1.join();
        th2.join();
        System.out.println("処理の終了です！");

    }

}