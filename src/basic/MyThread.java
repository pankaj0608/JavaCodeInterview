package basic;

/**
 * Created by pankaj on 8/14/2015.
 */
public class MyThread extends Thread {

    int i, j, sum;

    MyThread(int i, int j) {
        this.i = i;
        this.j = j;
    }


    public int getSum() {
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }

        return this.sum;
    }

    public int getSumNoWait() {
       return this.sum;
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

        sum = i + j;

        synchronized (this) {
            notifyAll();
        }
    }
}
