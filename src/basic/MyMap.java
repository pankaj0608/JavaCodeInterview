package basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pankaj on 8/13/2015.
 */
public class MyMap {

    private class Entry {
        private Object key;
        private Object val;
        private Entry next;

        public Entry(Object key, Object val) {
            this.key = key;
            this.val = val;
        }


    }
    private Entry[] myData = new Entry[1000000];

    public int put(String key, String val) {
        myData[key.hashCode()] = new Entry(key, val);
        return key.hashCode();
    }


}
