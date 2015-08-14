package basic;

/**
 * Created by pankaj on 8/14/2015.
 */
public class MyBank extends Thread {

    int start = 5000;


    public void add(int i) {

    }



    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        synchronized (this) {
            notifyAll();
        }
    }
}
