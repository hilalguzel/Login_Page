package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class RektorlukActivity extends AppCompatActivity implements OnMapReadyCallback{
    private GoogleMap mMap2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rektorluk);
        SupportMapFragment mapFragment3 = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.rektorlukMap);
        mapFragment3.getMapAsync(this);

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap2= googleMap;
        LatLng rektorluk = new LatLng(37.16866860480927, 38.995194657170906);
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(rektorluk, 15));
        mMap2.addMarker(new MarkerOptions().position(rektorluk).title("Rektörlük"));
    }
}