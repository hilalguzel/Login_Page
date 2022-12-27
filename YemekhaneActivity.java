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

public class YemekhaneActivity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemekhane);

        SupportMapFragment mapFragment5 = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.yemekhaneMap);
        mapFragment5.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap4= googleMap;
        LatLng yemekhane = new LatLng(37.16967949247254, 39.000313322436874);
        mMap4.moveCamera(CameraUpdateFactory.newLatLngZoom(yemekhane, 15));
        mMap4.addMarker(new MarkerOptions().position(yemekhane).title("Yemekhane"));
    }
}