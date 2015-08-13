package basic;

/**
 * Created by pankaj on 8/13/2015.
 */
public class MyGeneric {

    public <T extends java.lang.String> void HelloWord(T obj) {

        System.out.println(" : " + obj.getClass());
    }

    public <T> void HelloWord(T obj) {

        System.out.println(obj.getClass());
    }
}
