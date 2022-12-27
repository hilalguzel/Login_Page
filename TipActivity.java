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


public class TipActivity extends AppCompatActivity implements OnMapReadyCallback{
    private GoogleMap mMap3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);

        SupportMapFragment mapFragment4 = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.tipMap);
        mapFragment4.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap3= googleMap;
        LatLng Tip = new LatLng(37.168916149204215, 38.994724266884);
        mMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(Tip, 15));
        mMap3.addMarker(new MarkerOptions().position(Tip).title("Tıp Fakültesi"));

    }
}