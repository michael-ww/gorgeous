package gorgeous.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;

import org.openjdk.jol.info.ClassLayout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.StringUtils;

@SpringBootApplication
@ComponentScan(value = { "gorgeous.spring" })
public class ApplicationEntry {

    public static void main(String[] args) {
        // SpringApplication.run(ApplicationEntry.class);

        String s1 = new String("abc");
        String s2 = new String("abc");
        if (s1 == s2) {
            System.err.println("s1==s2");
        } else {
            System.err.println("s1!=s2");
        }
        if (s1.equals(s2)) {
            System.err.println("s1.equals(s2)");
        } else {
            System.err.println("s1.notEquals(s2)");
        }
        System.err.println("s2.intern():" + s2.intern());

        String s3 = "abc";
        String s4 = "abc";
        if (s3 == s4) {
            System.err.println("s3==s4");
        } else {
            System.err.println("s3!=s4");
        }
        if (s3.equals(s4)) {
            System.err.println("s3.equals(s4)");
        } else {
            System.err.println("s3.notEquals(s4)");
        }

        if (s1 == s4) {
            System.err.println("s1==s4");
        } else {
            System.err.println("s1!=s4");
        }
        if (s1.equals(s4)) {
            System.err.println("s1.equals(s4)");
        } else {
            System.err.println("s1.notEquals(s4)");
        }
        // synchronized (obj) {
        // System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        // System.out.println();
        // }
        // long t = 0L;
        // System.out.println(ClassLayout.parseInstance(t).toPrintable());
        // System.out.println();
        // Long x = 0L;
        // System.out.println(ClassLayout.parseInstance(x).toPrintable());
        // System.out.println();
        // ArrayList<String> arrayList = new ArrayList<>();
        // System.out.println(ClassLayout.parseInstance(arrayList).toPrintable());

        // MyRunnable myrunnable = new MyRunnable();
        // Thread thread = new Thread(myrunnable);
        // thread.start();

        ExecutorService executorService = Executors.newCachedThreadPool();

    }
}
