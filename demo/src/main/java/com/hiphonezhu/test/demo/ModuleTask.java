package com.hiphonezhu.test.demo;

import com.android.baseline.framework.rxtask.Task;
import com.android.baseline.framework.logic.InfoResult;

/**
 * @author hiphonezhu@gmail.com
 * @version [Android-BaseLine, 2016/03/09 17:03]
 */
public class ModuleTask extends Task {
    public ModuleTask(int taskId, Object subscriber) {
        super(taskId, subscriber);
    }

    @Override
    public Object doInBackground() {
        try {
            Thread.sleep(6 *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new InfoResult(true, "0", "task over");
    }
}
