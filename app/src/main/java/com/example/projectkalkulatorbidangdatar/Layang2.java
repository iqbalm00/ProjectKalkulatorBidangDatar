package com.example.projectkalkulatorbidangdatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Layang2 extends AppCompatActivity {

    private EditText abtxt;
    private  EditText d1txt;
    private EditText d2txt;
    private EditText bctxt;
    private EditText hasil;
    private Button luas;
    private Button keliling;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layang2);
        abtxt = (EditText) findViewById(R.id.abtxt);
        bctxt = (EditText) findViewById(R.id.bctxt);
        d1txt = (EditText) findViewById(R.id.d1txt);
        d2txt = (EditText) findViewById(R.id.d2txt);
        hasil = (EditText) findViewById(R.id.hasil);
        luas = (Button) findViewById(R.id.luas);
        keliling = (Button) findViewById(R.id.keliling);
    }

    public void luas6(View view) {
        try {

            int d1 = Integer.parseInt(d1txt.getText().toString());
            int d2 = Integer.parseInt(d2txt.getText().toString());
            double luas =  (d1 * d2 )/2;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void keliling6(View view) {
        try {

            int ab = Integer.parseInt(abtxt.getText().toString());
            int bc = Integer.parseInt(bctxt.getText().toString());
            double keliling =  (ab * bc)/2;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void kembali6(View view){
        finish();
    }

}