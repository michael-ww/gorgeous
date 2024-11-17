package gorgeous.test.service;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
