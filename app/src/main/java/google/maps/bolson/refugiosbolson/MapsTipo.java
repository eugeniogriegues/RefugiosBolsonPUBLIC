package google.maps.bolson.refugiosbolson;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsTipo extends FragmentActivity implements OnMapReadyCallback {

    private static final int MY_PERMISSION_REQUEST_ACCES_FINE_LOCATION = 1;
    private static final int MY_PERMISSION_REQUEST_ACCES_COARSE_LOCATION = 1;
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_tipo);
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

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        LatLng elBolson = new LatLng(-41.9667, -71.5333);
        mMap.addMarker(new MarkerOptions().position(elBolson).title("EL BOLSÓN").icon(BitmapDescriptorFactory.fromResource(R.drawable.interess)));

        LatLng refugioElMotoco = new LatLng(-41.9755863, -71.7074301);
        mMap.addMarker(new MarkerOptions().position(refugioElMotoco).title("Ref. MOTOCO").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioElConde = new LatLng(-41.840775, -71.660869);
        mMap.addMarker(new MarkerOptions().position(refugioElConde).title("Ref. EL CONDE").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioDedoGordo = new LatLng(-41.833618, -71.598633);
        mMap.addMarker(new MarkerOptions().position(refugioDedoGordo).title("Ref. DEDO GORDO").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioHorqueta = new LatLng(-41.837286, -71.661547);
        mMap.addMarker(new MarkerOptions().position(refugioHorqueta).title("Ref. LA HORQUETA").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioEncantoBlanco = new LatLng (-41.807130,-71.614097);
        mMap.addMarker(new MarkerOptions().position(refugioEncantoBlanco).title("Ref. ENCANTO BLANCO").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioPeritoMoreno = new LatLng(-41.791133, -71.564312);
        mMap.addMarker(new MarkerOptions().position(refugioPeritoMoreno).title("Ref. PERITO MORENO").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioLaguitos = new LatLng(-41.771469, -71.727332);
        mMap.addMarker(new MarkerOptions().position(refugioLaguitos).title("Ref. LOS LAGUITOS").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioCasaCampo = new LatLng(-41.840274, -71.662721);
        mMap.addMarker(new MarkerOptions().position(refugioCasaCampo).title("Ref. CASA DE CAMPO").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioCerroLindo = new LatLng(-41.967192, -71.641025);
        mMap.addMarker(new MarkerOptions().position(refugioCerroLindo).title("Ref. CERRO LINDO").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioCajon = new LatLng(-41.851024, -71.621813);
        mMap.addMarker(new MarkerOptions().position(refugioCajon).title("Ref. CAJÓN DEL AZUL").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioTronconada = new LatLng(-41.854868, -71.610980);
        mMap.addMarker(new MarkerOptions().position(refugioTronconada).title("Ref. LA TRONCONADA").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioPlayita = new LatLng(-41.856497, -71.601661);
        mMap.addMarker(new MarkerOptions().position(refugioPlayita).title("Ref. LA PLAYITA").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioNatacion = new LatLng(-41.879825, -71.624849);
        mMap.addMarker(new MarkerOptions().position(refugioNatacion).title("Ref. NATACIÓN").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioRetamal = new LatLng(-41.842536, -71.641900);
        mMap.addMarker(new MarkerOptions().position(refugioRetamal).title("Ref. EL RETAMAL").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioHieloAzul = new LatLng(-41.8885791, -71.6395306);
        mMap.addMarker(new MarkerOptions().position(refugioHieloAzul).title("Ref. HIELO AZUL").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));


        LatLng refugioPiltri = new LatLng(-41.968973, -71.470229);
        mMap.addMarker(new MarkerOptions().position(refugioPiltri).title("Ref. PILTRIQUITRÓN").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));


        LatLng doniaRosa = new LatLng(-41.942542, -71.559531);
        mMap.addMarker(new MarkerOptions().position(doniaRosa).title("DOÑA ROSA").snippet("ACCESO A SENDEROS").icon(BitmapDescriptorFactory.fromResource(R.drawable.interes)));

        LatLng wharton = new LatLng(-41.855878, -71.548806);
        mMap.addMarker(new MarkerOptions().position(wharton).title("WHARTON").snippet("ACCESO A SENDEROS").icon(BitmapDescriptorFactory.fromResource(R.drawable.interes)));

        LatLng pasarelaPuelo = new LatLng(-42.040626, -71.605541);
        mMap.addMarker(new MarkerOptions().position(pasarelaPuelo).title("PASARELA DEL RIO AZUL - LAGO PUELO").snippet("INICIO DE RUTA AL REFUGIO EL MOTOCO").icon(BitmapDescriptorFactory.fromResource(R.drawable.interes)));

        LatLng centroMapa = new LatLng(-41.92, -71.64);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centroMapa, 10));

        UiSettings uisettings = mMap.getUiSettings();

        uisettings.setZoomControlsEnabled(true);

        uisettings.setMyLocationButtonEnabled(true);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {


            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)) {

                Toast.makeText(this, "PARA VER TU POSICION ACTUAL EN EL MAPA, DEBES OTORGAR LOS PERMISOS DE UBICACION", Toast.LENGTH_SHORT).show();

            } else {

                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSION_REQUEST_ACCES_FINE_LOCATION);

            }
            return;
        }

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {


            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_COARSE_LOCATION)) {

                Toast.makeText(this, "PARA VER TU POSICION ACTUAL EN EL MAPA, DEBES OTORGAR LOS PERMISOS DE UBICACION", Toast.LENGTH_SHORT).show();

            } else {

                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, MY_PERMISSION_REQUEST_ACCES_COARSE_LOCATION);

            }
            return;
        }


        mMap.setMyLocationEnabled(true);


    }


}


