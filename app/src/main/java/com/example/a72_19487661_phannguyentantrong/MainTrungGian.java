package com.example.a72_19487661_phannguyentantrong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainTrungGian extends AppCompatActivity {
    Button btnThemCV,btnThongKe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_trung_gian);
        khaibao();
        openCongViec();
        openThongKe();
    }

    private void openThongKe() {
        btnThongKe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainTrungGian.this,MainThongKe.class);
                startActivity(i);
            }
        });
    }

    private void openCongViec() {
        btnThemCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainTrungGian.this,MainBussiness.class);
                startActivity(i);
            }
        });
    }

    private void khaibao() {
        btnThemCV = findViewById(R.id.btnThemCongV);
        btnThongKe = findViewById(R.id.btnThongKe);
    }
}