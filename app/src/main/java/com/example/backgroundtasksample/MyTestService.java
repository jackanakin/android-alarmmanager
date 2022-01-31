package com.example.backgroundtasksample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.util.Date;

public class MyTestService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Task(intent);

        return Service.START_STICKY;
    }

    private void Task(Intent intent){
        System.out.println("XQKHNC=RUNNING BACKGROUND JOB()=" + new Date());
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


}
