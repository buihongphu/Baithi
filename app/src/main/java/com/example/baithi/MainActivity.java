package com.example.baithi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etxA;
    EditText etxB;

    Button btnTinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etxA = (EditText) findViewById(R.id.etxA);
        etxB = (EditText) findViewById(R.id.etxB);
        btnTinh = (Button) findViewById(R.id.btnTinh);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent myIntent = new Intent(getApplication(), Ketqua.class);
                    int a = Integer.parseInt(etxA.getText().toString());
                    int b = Integer.parseInt(etxB.getText().toString());
                    Bundle myBundle = new Bundle();
                    myBundle.putInt("soa", a);
                    myBundle.putInt("sob", b);
                    myIntent.putExtra("mysum", myBundle);
                    startActivity(myIntent);
                } catch (Exception ex) {

                }
            }
        });
    }
}