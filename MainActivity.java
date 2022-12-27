package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ImageButton kutuphane, yemekhane, tip_fakultesi, muhendislik, rektorluk, hesap_makinesi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kutuphane = findViewById(R.id.kutuphane);
        yemekhane = findViewById(R.id.yemekhane);
        tip_fakultesi = findViewById(R.id.tip_fakultesi);
        muhendislik = findViewById(R.id.muhendislik);
        rektorluk = findViewById(R.id.rektorluk);
        hesap_makinesi = findViewById(R.id.hesap_makinesi);


        kutuphane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "kütüphaneye rota oluşturuluyor", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,KutuphaneActivity.class);
                startActivity(intent);
            }
        });



        yemekhane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //    Toast.makeText(MainActivity.this, "yemekhaneye rota oluşturuluyor", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,YemekhaneActivity.class);
                startActivity(intent);
            }
        });



        tip_fakultesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(MainActivity.this, "Tıp fakültesine rota oluşturuluyor", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,TipActivity.class);
                startActivity(intent);
            }
        });



        muhendislik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   Toast.makeText(MainActivity.this, "mühendislik fakültesine rota oluşturuluyor", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,MuhendislikActivity.class);
                startActivity(intent);
            }
        });



        rektorluk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(MainActivity.this, "Rektörlük binasına rota oluşturuluyor", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,RektorlukActivity.class);
                startActivity(intent);
            }
        });



        hesap_makinesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this, "Hesap Makinesi Başlatılıyor", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(MainActivity.this, HesapMakinesiActivity.class);
            }
        });


    }
}
