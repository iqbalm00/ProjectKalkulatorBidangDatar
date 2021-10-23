package com.example.projectkalkulatorbidangdatar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lingkaran = (Button) findViewById(R.id.lingkaran);

        lingkaran.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent Lingkaran = new Intent(MainActivity.this, Lingkaran.class);
                startActivity(Lingkaran);
            }
        });
        Button persegipanjang = (Button) findViewById(R.id.persegipanjang);

        persegipanjang.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent PersegiPanjang = new Intent(MainActivity.this, PersegiPanjang.class);
                startActivity(PersegiPanjang);
            }
        });
        Button segitiga = (Button) findViewById(R.id.segitiga);

        segitiga.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent Segitiga = new Intent(MainActivity.this, Segitiga.class);
                startActivity(Segitiga);
            }
        });
        Button persegi = (Button) findViewById(R.id.persegi);

        persegi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent Persegi = new Intent(MainActivity.this, Persegi.class);
                startActivity(Persegi);
            }
        });
        Button trapesium = (Button) findViewById(R.id.trapesium);

        trapesium.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent Trapesium = new Intent(MainActivity.this, Trapesium.class);
                startActivity(Trapesium);
            }
        });
        Button layang2 = (Button) findViewById(R.id.layang2);

        layang2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent Layang2 = new Intent(MainActivity.this, Layang2.class);
                startActivity(Layang2);
            }
        });
        Button belahketupat = (Button) findViewById(R.id.belahketupat);

        belahketupat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent BelahKetupat = new Intent(MainActivity.this, BelahKetupat.class);
                startActivity(BelahKetupat);
            }
        });
        Button jajargenjang = (Button) findViewById(R.id.jajargenjang);

        jajargenjang.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent JajarGenjang = new Intent(MainActivity.this, JajarGenjang.class);
                startActivity(JajarGenjang);
            }
        });
    }
    public void keluar(View view){
        System.exit(0);
    }
}