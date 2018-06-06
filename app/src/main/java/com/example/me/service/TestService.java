package com.example.me.service;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class TestService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public TestService() {
        super("Test");
    }
    //defult constructor
//    public TestService() {
//    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        for (int i=0;i<20;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"On Start is called",Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent,int flags, int startId) {
        Toast.makeText(this,"Service Running",Toast.LENGTH_LONG).show();
//        MyThread thread = new MyThread(startId);
//        Thread paththread = new Thread(thread);
//        paththread.start();

        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy is called",Toast.LENGTH_SHORT).show();
    }

//    public class MyThread implements Runnable
//    {
//        int serviceid;
//        public MyThread(int serviceid){
//            this .serviceid = serviceid;
//        }
//
//        @Override
//        public void run() {
//            for (int i=0;i<20;i++){
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            stopSelf(this.serviceid);
//
//
//        }
//    }


}
