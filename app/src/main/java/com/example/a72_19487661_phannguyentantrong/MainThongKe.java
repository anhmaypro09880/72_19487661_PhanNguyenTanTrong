package com.example.a72_19487661_phannguyentantrong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainThongKe extends AppCompatActivity {
    ListView lvThongKe;
    List<Bussiness> list = new ArrayList<>();
    ThongKeAdapter adt;
    DataBussiness dataBussiness;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_thong_ke);
        khaiBao();

        adt = new ThongKeAdapter(this,R.layout.listview_thongke,list);
        lvThongKe.setAdapter(adt);
        list = dataBussiness.getAll();
    }

    private void khaiBao() {
        lvThongKe = findViewById(R.id.lvThongKe);
    }


}