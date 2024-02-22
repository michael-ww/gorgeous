package mnj;

import java.util.ArrayList;

import org.openjdk.jol.info.ClassLayout;;

public class JavaObjectLayout {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        System.out.println();
        synchronized (obj) {
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
            System.out.println();
        }
        long t = 0L;
        System.out.println(ClassLayout.parseInstance(t).toPrintable());
        System.out.println();
        Long x = 0L;
        System.out.println(ClassLayout.parseInstance(x).toPrintable());
        System.out.println();
        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println(ClassLayout.parseInstance(arrayList).toPrintable());
    }
}