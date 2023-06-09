package com.example.maps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.maps.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        // add marker of nakuru town
        LatLng Kericho = new LatLng(  -0.303099, 36.080025);
        mMap.addMarker(new MarkerOptions().position(Kericho).title("Marker in Kericho"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kericho));

        //add marker of Logos
        LatLng melbourne = new LatLng(6.465422, 3.406448);
        mMap.addMarker(new MarkerOptions().position(melbourne).title("Marker in melbourne"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(melbourne));

        //add marker of paris city
        LatLng perth = new LatLng(48.864716, 2.349014);
        mMap.addMarker(new MarkerOptions().position(perth).title("Marker in perth"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(perth));

        //add marker of rabat
        LatLng Kingston = new LatLng(34.020882,  -6.841650);
        mMap.addMarker(new MarkerOptions().position(Kingston).title("Marker in Kingston"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kingston));

        //add marker of South Africa city
        LatLng Bahamas = new LatLng(-33.918861, 18.423300);
        mMap.addMarker(new MarkerOptions().position(Bahamas).title("Marker in Bahamas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bahamas));


    }
}