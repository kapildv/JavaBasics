package commoninterfaces.poolpattern.pooldemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Orange<T> {
    BlockingQueue queue = null;
    List<T> fruit = new ArrayList<>();

    boolean isStopped = false;

}
