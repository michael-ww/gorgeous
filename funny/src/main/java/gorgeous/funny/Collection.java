package gorgeous.funny;

import java.util.HashMap;
import java.util.TreeMap;

import org.openjdk.jol.info.ClassLayout;

public class Collection {

    public static void main(String[] args) {
        // O(1)
        HashMap<String, String> hm = new HashMap<>();
        hm.put("A", "AAA");
        hm.put("B", "BBB");
        hm.put("C", "CCC");
        hm.putIfAbsent("A", "AAAA");
        System.out.println(hm.get("A"));

        System.out.println(ClassLayout.parseInstance(hm).toPrintable());

        // O(logN)
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("H", "HHH");
        System.out.println(ClassLayout.parseInstance(tm).toPrintable());
    }
}
