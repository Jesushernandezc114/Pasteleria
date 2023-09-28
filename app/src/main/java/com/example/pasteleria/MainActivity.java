package com.example.pasteleria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  Siguiente(View view){
        Intent siguiente = new Intent(this,inicio.class);
        startActivity(siguiente);


    }
    public void  Registrarse(View view){
        Intent registrar = new Intent(this,Registrarse.class);
        startActivity(registrar);


    }
    public void facebook(View view){
        String url = "https://www.facebook.com";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }
    public void instagram(View view){
        String url = "https://www.instagram.com";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }
    public void oulook(View view){
        String url = "https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=16&ct=1695858604&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fcobrandid%3dab0455a0-8d03-46b9-b18b-df2f57b9e44c%26nlp%3d1%26deeplink%3dowa%252f%26RpsCsrfState%3dc0a0aa29-a802-4674-fcba-1ae6fdde43c0&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=ab0455a0-8d03-46b9-b18b-df2f57b9e44c";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }
}