package basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 * Created by pankaj on 8/14/2015.
 */
public class MyLeakClass {
    private ArrayList<Object> abc = new ArrayList<Object>();

    public void creshMe() throws Exception {


        ArrayList<String> al = new ArrayList<>();

        int counter = 0;
        while(true) {

            al.add((new Date()).toString());
            abc.add(al);

            if(++counter%20000 == 0) {
                counter = 0;
                System.out.println(Runtime.getRuntime().freeMemory());
                Thread.sleep(10000);
            }
        }
    }
}
