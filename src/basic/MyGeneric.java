package basic;

/**
 * Created by pankaj on 8/13/2015.
 */
public class MyGeneric {

    public class InnerGeneric <L> {

        InnerGeneric(L abc) {
            System.out.println(" Inner : " + abc.getClass());
        }
    }
    public <T extends java.lang.String> void HelloWord(T obj) {

        System.out.println(" : " + obj.getClass());
    }

    public <T> void HelloWord(T obj) {

        System.out.println(obj.getClass());
    }

    public <T, E> void HelloWord(T obj, E abc) {

        System.out.println(obj.getClass() + " : "  + abc.getClass());

        new InnerGeneric("sdf");

    }
}
