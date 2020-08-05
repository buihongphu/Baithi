package com.example.baithi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ketqua extends AppCompatActivity {
    EditText edtKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketqua);
        edtKetqua = (EditText) findViewById(R.id.edtKetqua);
        Intent myIntent = getIntent();
        Bundle	myBunble=	myIntent.getBundleExtra("mysum");
        int a	=	myBunble.getInt("soa");
        int b 	=	myBunble.getInt("sob");
        int c	=	a	+	b;
        edtKetqua.setText("Tổng 2 số là: "+c);
    }
}