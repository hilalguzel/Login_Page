package com.example.loginapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



public class MuhendislikActivity extends AppCompatActivity implements OnMapReadyCallback  {
    private GoogleMap mMap1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muhendislik);


        SupportMapFragment mapFragment2 = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.muhendislikMap);
        mapFragment2.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap1= googleMap;
        LatLng muhendislik = new LatLng(37.1724, 39.0034);
        mMap1.moveCamera(CameraUpdateFactory.newLatLngZoom(muhendislik, 15));
        mMap1.addMarker(new MarkerOptions().position(muhendislik).title("Mühendislik Fakültesi"));

    }
}