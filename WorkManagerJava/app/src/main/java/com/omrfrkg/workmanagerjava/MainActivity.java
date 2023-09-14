package com.omrfrkg.workmanagerjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import android.os.Bundle;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Data data = new Data.Builder().putInt("int",1).build();

        Constraints constraints = new Constraints.Builder()
                //.setRequiredNetworkType(NetworkType.CONNECTED)
                .setRequiresCharging(false).build();

        /* Tek Sefer Çalışan
        WorkRequest workRequest = new OneTimeWorkRequest.Builder(RefreshDatabase.class)
                .setConstraints(constraints)
                .setInputData(data)
                //.setInitialDelay(5, TimeUnit.MILLISECONDS)
                //.addTag("myTag")
                .build();

        WorkManager.getInstance(this).enqueue(workRequest);
        */

        WorkRequest workRequest = new PeriodicWorkRequest.Builder(RefreshDatabase.class,15,TimeUnit.MINUTES)
                .setConstraints(constraints)
                .setInputData(data)
                .build();

        WorkManager.getInstance(this).enqueue(workRequest);

        WorkManager.getInstance(this).getWorkInfoByIdLiveData(workRequest.getId()).observe(this, new Observer<WorkInfo>() {
            @Override
            public void onChanged(WorkInfo workInfo) {
                if (workInfo.getState() == WorkInfo.State.RUNNING){
                    System.out.println("running");
                }
                else if (workInfo.getState() == WorkInfo.State.SUCCEEDED){
                    System.out.println("succeded");
                }
                else if (workInfo.getState() == WorkInfo.State.FAILED){
                    System.out.println("failed");
                }
            }
        });

        //Bütün işlemleri iptal etmek için
        //WorkManager.getInstance(this).cancelAllWork();

        //Chaining - Zincir
        /*OneTimeWorkRequest oneTimeWorkRequest = new OneTimeWorkRequest.Builder(RefreshDatabase.class)
                .setInputData(data)
                .setConstraints(constraints)
                .build();

        WorkManager.getInstance(this).beginWith(oneTimeWorkRequest)
                .then(oneTimeWorkRequest)
                .then(oneTimeWorkRequest)
                .enqueue();*/


    }
}