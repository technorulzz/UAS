package com.example.mypersonalapps;
/*Nama : Muhammad Syahrul Ramadan
NIM  : 10117250
KELAS : AKB-IF8
Tanggal Pengerjaan :12 Agustus 2020*/
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home = new Intent(MainActivity.this, ActivityPager.class);
                startActivity(home);
                finish();

            }
        }, waktu_loading);
    }
}