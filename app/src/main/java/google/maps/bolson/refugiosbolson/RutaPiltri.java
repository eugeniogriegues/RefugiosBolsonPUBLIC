package google.maps.bolson.refugiosbolson;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
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
import com.google.android.gms.maps.model.PolylineOptions;

public class RutaPiltri extends FragmentActivity implements OnMapReadyCallback {

    private static final int MY_PERMISSION_REQUEST_ACCES_FINE_LOCATION = 1;
    private static final int MY_PERMISSION_REQUEST_ACCES_COARSE_LOCATION = 1;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta_piltri);
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

        UiSettings uisettings = mMap.getUiSettings();




        uisettings.setZoomControlsEnabled(true);
        uisettings.setMyLocationButtonEnabled(true);

        LatLng refugioPiltri = new LatLng(-41.968973, -71.470229);
        mMap.addMarker(new MarkerOptions().position(refugioPiltri).title("Ref. PILTRIQUITRÓN").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng cumbrePiltri = new LatLng(-41.984254, -71.459061);
        mMap.addMarker(new MarkerOptions().position(cumbrePiltri).title("CUMBRE CERRO PILTRIQUITRÓN").icon(BitmapDescriptorFactory.fromResource(R.drawable.cima)));


        LatLng elBolson = new LatLng(-41.9667, -71.5333);
        mMap.addMarker(new MarkerOptions().position(elBolson).title("EL BOLSÓN").icon(BitmapDescriptorFactory.fromResource(R.drawable.interess)));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(refugioPiltri, 12));

        LatLng senderoPiltri[] = new LatLng[171];
        {

            senderoPiltri[0] = new LatLng(-41.966266, -71.53106);
            senderoPiltri[1] = new LatLng(-41.966373, -71.531069);
            senderoPiltri[2] = new LatLng(-41.966322, -71.53119);
            senderoPiltri[3] = new LatLng(-41.966355, -71.530976);
            senderoPiltri[4] = new LatLng(-41.966386, -71.53122);
            senderoPiltri[5] = new LatLng(-41.966668, -71.531132);
            senderoPiltri[6] = new LatLng(-41.967159, -71.531327);
            senderoPiltri[7] = new LatLng(-41.967583, -71.53126);
            senderoPiltri[8] = new LatLng(-41.968044, -71.528943);
            senderoPiltri[9] = new LatLng(-41.969061, -71.529074);
            senderoPiltri[10] = new LatLng(-41.970723, -71.529545);
            senderoPiltri[11] = new LatLng(-41.97127, -71.529521);
            senderoPiltri[12] = new LatLng(-41.973594, -71.525953);
            senderoPiltri[13] = new LatLng(-41.974444, -71.525144);
            senderoPiltri[14] = new LatLng(-41.975628, -71.524541);
            senderoPiltri[15] = new LatLng(-41.977111, -71.523972);
            senderoPiltri[16] = new LatLng(-41.978056, -71.52382);
            senderoPiltri[17] = new LatLng(-41.978836, -71.523894);
            senderoPiltri[18] = new LatLng(-41.981031, -71.524516);
            senderoPiltri[19] = new LatLng(-41.982634, -71.524638);
            senderoPiltri[20] = new LatLng(-41.983402, -71.524423);
            senderoPiltri[21] = new LatLng(-41.985338, -71.523472);
            senderoPiltri[22] = new LatLng(-41.986056, -71.522797);
            senderoPiltri[23] = new LatLng(-41.986766, -71.522402);
            senderoPiltri[24] = new LatLng(-41.986902, -71.521701);
            senderoPiltri[25] = new LatLng(-41.98681, -71.521472);
            senderoPiltri[26] = new LatLng(-41.987478, -71.519425);
            senderoPiltri[27] = new LatLng(-41.987771, -71.517826);
            senderoPiltri[28] = new LatLng(-41.987801, -71.516251);
            senderoPiltri[29] = new LatLng(-41.987273, -71.514978);
            senderoPiltri[30] = new LatLng(-41.987289, -71.514672);
            senderoPiltri[31] = new LatLng(-41.987767, -71.512929);
            senderoPiltri[32] = new LatLng(-41.98765, -71.512545);
            senderoPiltri[33] = new LatLng(-41.987754, -71.512068);
            senderoPiltri[34] = new LatLng(-41.988543, -71.509739);
            senderoPiltri[35] = new LatLng(-41.988324, -71.509146);
            senderoPiltri[36] = new LatLng(-41.988021, -71.506036);
            senderoPiltri[37] = new LatLng(-41.988055, -71.505184);
            senderoPiltri[38] = new LatLng(-41.988168, -71.504741);
            senderoPiltri[39] = new LatLng(-41.988878, -71.503947);
            senderoPiltri[40] = new LatLng(-41.988778, -71.502597);
            senderoPiltri[41] = new LatLng(-41.988971, -71.502339);
            senderoPiltri[42] = new LatLng(-41.988529, -71.501452);
            senderoPiltri[43] = new LatLng(-41.988466, -71.499938);
            senderoPiltri[44] = new LatLng(-41.988235, -71.499061);
            senderoPiltri[45] = new LatLng(-41.988411, -71.498344);
            senderoPiltri[46] = new LatLng(-41.988647, -71.498084);
            senderoPiltri[47] = new LatLng(-41.988611, -71.497892);
            senderoPiltri[48] = new LatLng(-41.988906, -71.497648);
            senderoPiltri[49] = new LatLng(-41.988974, -71.496886);
            senderoPiltri[50] = new LatLng(-41.988646, -71.496753);
            senderoPiltri[51] = new LatLng(-41.988576, -71.495946);
            senderoPiltri[52] = new LatLng(-41.988252, -71.495386);
            senderoPiltri[53] = new LatLng(-41.98837, -71.494701);
            senderoPiltri[54] = new LatLng(-41.988203, -71.494354);
            senderoPiltri[55] = new LatLng(-41.988276, -71.493984);
            senderoPiltri[56] = new LatLng(-41.98813, -71.493906);
            senderoPiltri[57] = new LatLng(-41.987943, -71.493172);
            senderoPiltri[58] = new LatLng(-41.987789, -71.492919);
            senderoPiltri[59] = new LatLng(-41.986946, -71.492489);
            senderoPiltri[60] = new LatLng(-41.986775, -71.492267);
            senderoPiltri[61] = new LatLng(-41.987398, -71.491398);
            senderoPiltri[62] = new LatLng(-41.987242, -71.490787);
            senderoPiltri[63] = new LatLng(-41.98694, -71.49055);
            senderoPiltri[64] = new LatLng(-41.986914, -71.489712);
            senderoPiltri[65] = new LatLng(-41.986714, -71.489477);
            senderoPiltri[66] = new LatLng(-41.986687, -71.48891);
            senderoPiltri[67] = new LatLng(-41.98651, -71.488608);
            senderoPiltri[68] = new LatLng(-41.986668, -71.48888);
            senderoPiltri[69] = new LatLng(-41.986714, -71.48764);
            senderoPiltri[70] = new LatLng(-41.986436, -71.486643);
            senderoPiltri[71] = new LatLng(-41.986717, -71.486029);
            senderoPiltri[72] = new LatLng(-41.986442, -71.484738);
            senderoPiltri[73] = new LatLng(-41.985851, -71.484112);
            senderoPiltri[74] = new LatLng(-41.985673, -71.483536);
            senderoPiltri[75] = new LatLng(-41.985338, -71.483113);
            senderoPiltri[76] = new LatLng(-41.984355, -71.48325);
            senderoPiltri[77] = new LatLng(-41.983846, -71.48299);
            senderoPiltri[78] = new LatLng(-41.983093, -71.482814);
            senderoPiltri[79] = new LatLng(-41.982706, -71.482911);
            senderoPiltri[80] = new LatLng(-41.982182, -71.482734);
            senderoPiltri[81] = new LatLng(-41.981103, -71.483027);
            senderoPiltri[82] = new LatLng(-41.9809, -71.482963);
            senderoPiltri[83] = new LatLng(-41.98056, -71.482407);
            senderoPiltri[84] = new LatLng(-41.978967, -71.482626);
            senderoPiltri[85] = new LatLng(-41.978225, -71.482258);
            senderoPiltri[86] = new LatLng(-41.977484, -71.482218);
            senderoPiltri[87] = new LatLng(-41.976915, -71.481991);
            senderoPiltri[88] = new LatLng(-41.976647, -71.48214);
            senderoPiltri[89] = new LatLng(-41.976317, -71.482816);
            senderoPiltri[90] = new LatLng(-41.975383, -71.483682);
            senderoPiltri[91] = new LatLng(-41.974665, -71.484099);
            senderoPiltri[92] = new LatLng(-41.974205, -71.484127);
            senderoPiltri[93] = new LatLng(-41.973437, -71.483344);
            senderoPiltri[94] = new LatLng(-41.973484, -71.483208);
            senderoPiltri[95] = new LatLng(-41.973826, -71.483177);
            senderoPiltri[96] = new LatLng(-41.973612, -71.481483);
            senderoPiltri[97] = new LatLng(-41.974002, -71.480685);
            senderoPiltri[98] = new LatLng(-41.973738, -71.480661);
            senderoPiltri[99] = new LatLng(-41.973762, -71.480472);
            senderoPiltri[100] = new LatLng(-41.973147, -71.47973);
            senderoPiltri[101] = new LatLng(-41.972689, -71.478568);
            senderoPiltri[102] = new LatLng(-41.972315, -71.478405);
            senderoPiltri[103] = new LatLng(-41.971735, -71.478651);
            senderoPiltri[104] = new LatLng(-41.970934, -71.478379);
            senderoPiltri[105] = new LatLng(-41.970037, -71.477441);
            senderoPiltri[106] = new LatLng(-41.969599, -71.477254);
            senderoPiltri[107] = new LatLng(-41.969262, -71.476334);
            senderoPiltri[108] = new LatLng(-41.968684, -71.475472);
            senderoPiltri[109] = new LatLng(-41.967279, -71.474019);
            senderoPiltri[110] = new LatLng(-41.96816, -71.473677);
            senderoPiltri[111] = new LatLng(-41.96878, -71.472718);
            senderoPiltri[112] = new LatLng(-41.968592, -71.472392);
            senderoPiltri[113] = new LatLng(-41.968285, -71.472204);
            senderoPiltri[114] = new LatLng(-41.967523, -71.472237);
            senderoPiltri[115] = new LatLng(-41.966971, -71.471453);
            senderoPiltri[116] = new LatLng(-41.966777, -71.471403);
            senderoPiltri[117] = new LatLng(-41.966981, -71.471443);
            senderoPiltri[118] = new LatLng(-41.966711, -71.470837);
            senderoPiltri[119] = new LatLng(-41.966538, -71.470799);
            senderoPiltri[120] = new LatLng(-41.966738, -71.470369);
            senderoPiltri[121] = new LatLng(-41.966555, -71.470312);
            senderoPiltri[122] = new LatLng(-41.966586, -71.470155);
            senderoPiltri[123] = new LatLng(-41.966929, -71.469906);
            senderoPiltri[124] = new LatLng(-41.967568, -71.469999);
            senderoPiltri[125] = new LatLng(-41.968017, -71.470255);
            senderoPiltri[126] = new LatLng(-41.968147, -71.470559);
            senderoPiltri[127] = new LatLng(-41.968222, -71.470468);
            senderoPiltri[128] = new LatLng(-41.968158, -71.470585);
            senderoPiltri[129] = new LatLng(-41.96828, -71.470316);
            senderoPiltri[130] = new LatLng(-41.96898, -71.470188);

        }



        mMap.addPolyline(
                new PolylineOptions()
                        .add(senderoPiltri[0])
                        .add(senderoPiltri[1])
                        .add(senderoPiltri[2])
                        .add(senderoPiltri[3])
                        .add(senderoPiltri[4])
                        .add(senderoPiltri[5])
                        .add(senderoPiltri[6])
                        .add(senderoPiltri[7])
                        .add(senderoPiltri[8])
                        .add(senderoPiltri[9])
                        .add(senderoPiltri[10])
                        .add(senderoPiltri[11])
                        .add(senderoPiltri[12])
                        .add(senderoPiltri[13])
                        .add(senderoPiltri[14])
                        .add(senderoPiltri[15])
                        .add(senderoPiltri[16])
                        .add(senderoPiltri[17])
                        .add(senderoPiltri[18])
                        .add(senderoPiltri[19])
                        .add(senderoPiltri[20])
                        .add(senderoPiltri[21])
                        .add(senderoPiltri[22])
                        .add(senderoPiltri[23])
                        .add(senderoPiltri[24])
                        .add(senderoPiltri[25])
                        .add(senderoPiltri[26])
                        .add(senderoPiltri[27])
                        .add(senderoPiltri[28])
                        .add(senderoPiltri[29])
                        .add(senderoPiltri[30])
                        .add(senderoPiltri[31])
                        .add(senderoPiltri[32])
                        .add(senderoPiltri[33])
                        .add(senderoPiltri[34])
                        .add(senderoPiltri[35])
                        .add(senderoPiltri[36])
                        .add(senderoPiltri[37])
                        .add(senderoPiltri[38])
                        .add(senderoPiltri[39])
                        .add(senderoPiltri[40])
                        .add(senderoPiltri[41])
                        .add(senderoPiltri[42])
                        .add(senderoPiltri[43])
                        .add(senderoPiltri[44])
                        .add(senderoPiltri[45])
                        .add(senderoPiltri[46])
                        .add(senderoPiltri[47])
                        .add(senderoPiltri[48])
                        .add(senderoPiltri[49])
                        .add(senderoPiltri[50])
                        .add(senderoPiltri[51])
                        .add(senderoPiltri[52])
                        .add(senderoPiltri[53])
                        .add(senderoPiltri[54])
                        .add(senderoPiltri[55])
                        .add(senderoPiltri[56])
                        .add(senderoPiltri[57])
                        .add(senderoPiltri[58])
                        .add(senderoPiltri[59])
                        .add(senderoPiltri[60])
                        .add(senderoPiltri[61])
                        .add(senderoPiltri[62])
                        .add(senderoPiltri[63])
                        .add(senderoPiltri[64])
                        .add(senderoPiltri[65])
                        .add(senderoPiltri[66])
                        .add(senderoPiltri[67])
                        .add(senderoPiltri[68])
                        .add(senderoPiltri[69])
                        .add(senderoPiltri[70])
                        .add(senderoPiltri[71])
                        .add(senderoPiltri[72])
                        .add(senderoPiltri[73])
                        .add(senderoPiltri[74])
                        .add(senderoPiltri[75])
                        .add(senderoPiltri[76])
                        .add(senderoPiltri[77])
                        .add(senderoPiltri[78])
                        .add(senderoPiltri[79])
                        .add(senderoPiltri[80])
                        .add(senderoPiltri[81])
                        .add(senderoPiltri[82])
                        .add(senderoPiltri[83])
                        .add(senderoPiltri[84])
                        .add(senderoPiltri[85])
                        .add(senderoPiltri[86])
                        .add(senderoPiltri[87])
                        .add(senderoPiltri[88])
                        .add(senderoPiltri[89])
                        .add(senderoPiltri[90])
                        .add(senderoPiltri[91])
                        .add(senderoPiltri[92])
                        .add(senderoPiltri[93])
                        .add(senderoPiltri[94])
                        .add(senderoPiltri[95])
                        .add(senderoPiltri[96])
                        .add(senderoPiltri[97])
                        .add(senderoPiltri[98])
                        .add(senderoPiltri[99])
                        .add(senderoPiltri[100])
                        .add(senderoPiltri[101])
                        .add(senderoPiltri[102])
                        .add(senderoPiltri[103])
                        .add(senderoPiltri[104])
                        .add(senderoPiltri[105])
                        .add(senderoPiltri[106])
                        .add(senderoPiltri[107])
                        .add(senderoPiltri[108])
                        .add(senderoPiltri[109])
                        .add(senderoPiltri[110])
                        .add(senderoPiltri[111])
                        .add(senderoPiltri[112])
                        .add(senderoPiltri[113])
                        .add(senderoPiltri[114])
                        .add(senderoPiltri[115])
                        .add(senderoPiltri[116])
                        .add(senderoPiltri[117])
                        .add(senderoPiltri[118])
                        .add(senderoPiltri[119])
                        .add(senderoPiltri[120])
                        .add(senderoPiltri[121])
                        .add(senderoPiltri[122])
                        .add(senderoPiltri[123])
                        .add(senderoPiltri[124])
                        .add(senderoPiltri[125])
                        .add(senderoPiltri[126])
                        .add(senderoPiltri[127])
                        .add(senderoPiltri[128])
                        .add(senderoPiltri[129])
                        .add(senderoPiltri[130])
                        .width(4f)
                        .color(Color.RED)
        );


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


