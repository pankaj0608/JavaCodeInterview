package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by pankaj on 8/13/2015.
 */
public class Test {

    public static void main(String[] args) {
        Thread myThread = new MyThread(1,5);

        myThread.start();
        System.out.println(((MyThread) myThread).getSumNoWait());

        System.out.println(((MyThread) myThread).getSum());

    }

}
