package gorgeous.spring;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.openjdk.jol.info.ClassLayout;

import gorgeous.spring.service.MyRunnable;

public class SpringApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!");

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
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(ClassLayout.parseInstance(arrayList).toPrintable());

        MyRunnable myrunnable = new MyRunnable();
        Thread thread = new Thread(myrunnable);
        thread.start();

        ExecutorService executorService = Executors.newCachedThreadPool();

    }
}
