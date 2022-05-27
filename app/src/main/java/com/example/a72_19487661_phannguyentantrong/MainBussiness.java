package com.example.a72_19487661_phannguyentantrong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainBussiness extends AppCompatActivity {
    DataBussiness dataBussiness;
    Button btnThem;
    EditText edtTenCv,edtMucDo;
    List<Bussiness> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bussiness);
        khaiBao();
        dataBussiness = new DataBussiness(this,"Bussiness.sqlite",null,1);
//        dataBussiness.addBussiness(new Bussiness("1","test1","test1"));
        list = dataBussiness.getAll();
        themCongViec();
    }

    private void themCongViec() {
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ten = edtTenCv.getText().toString();
                String mucDo = edtMucDo.getText().toString();
                DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm");
                String date = df.format(Calendar.getInstance().getTime());
                Toast.makeText(MainBussiness.this,"Thanh Cong",Toast.LENGTH_LONG).show();
                dataBussiness.addBussiness(new Bussiness(ten,mucDo,date));
            }
        });
    }

    private void khaiBao() {
        btnThem  = findViewById(R.id.btnThem);
        edtMucDo  = findViewById(R.id.edtMucDo);
        edtTenCv  = findViewById(R.id.edtTenCongV);
    }
}