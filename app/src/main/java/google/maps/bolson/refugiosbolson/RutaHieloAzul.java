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

public class RutaHieloAzul extends FragmentActivity implements OnMapReadyCallback {

    private static final int MY_PERMISSION_REQUEST_ACCES_FINE_LOCATION = 1;
    private static final int MY_PERMISSION_REQUEST_ACCES_COARSE_LOCATION = 1;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta_hielo_azul);
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

        LatLng centroMapa = new LatLng(-41.900141, -71.602635);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centroMapa, 12));

        LatLng refugioHieloAzul = new LatLng(-41.8885791, -71.6395306);
        mMap.addMarker(new MarkerOptions().position(refugioHieloAzul).title("Ref. HIELO AZUL").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));
        LatLng refugioNatacion = new LatLng(-41.879825, -71.624849);
        mMap.addMarker(new MarkerOptions().position(refugioNatacion).title("Ref. NATACIÓN").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));
        LatLng glaciarHieloAzul = new LatLng(-41.887957, -71.654940);
        mMap.addMarker(new MarkerOptions().position(glaciarHieloAzul).title("GLACIAR HIELO AZUL").icon(BitmapDescriptorFactory.fromResource(R.drawable.glaciar)));
        LatLng doniaRosa = new LatLng(-41.942542, -71.559531);
        mMap.addMarker(new MarkerOptions().position(doniaRosa).title("DOÑA ROSA").snippet("ACCESO A SENDEROS").icon(BitmapDescriptorFactory.fromResource(R.drawable.interes)));
        LatLng elBolson = new LatLng(-41.9667, -71.5333);
        mMap.addMarker(new MarkerOptions().position(elBolson).title("EL BOLSÓN").icon(BitmapDescriptorFactory.fromResource(R.drawable.interess)));
        LatLng wharton = new LatLng(-41.855878, -71.548806);
        mMap.addMarker(new MarkerOptions().position(wharton).title("WHARTON").snippet("ACCESO A SENDEROS").icon(BitmapDescriptorFactory.fromResource(R.drawable.interesss)));

        LatLng refugioCajon = new LatLng(-41.851024, -71.621813);
        mMap.addMarker(new MarkerOptions().position(refugioCajon).title("Ref. CAJÓN DEL AZUL").icon(BitmapDescriptorFactory.fromResource(R.drawable.interesss)));

        LatLng senderoHieloAzul[] = new LatLng[191];
        LatLng senderoHieloAzulWharton[] = new LatLng[312];
        LatLng senderoNatacion[] = new LatLng [160];

        {


            senderoHieloAzul[0] = new LatLng(-41.941915, -71.559479);
            senderoHieloAzul[1] = new LatLng(-41.941855, -71.559375);
            senderoHieloAzul[2] = new LatLng(-41.941225, -71.559696);
            senderoHieloAzul[3] = new LatLng(-41.940752, -71.559363);
            senderoHieloAzul[4] = new LatLng(-41.939358, -71.559040);
            senderoHieloAzul[5] = new LatLng(-41.939049, -71.559116);
            senderoHieloAzul[6] = new LatLng(-41.937145, -71.561282);
            senderoHieloAzul[7] = new LatLng(-41.936646, -71.561656);
            senderoHieloAzul[8] = new LatLng(-41.935886, -71.561804);
            senderoHieloAzul[9] = new LatLng(-41.934952, -71.561528);
            senderoHieloAzul[10] = new LatLng(-41.934358, -71.560948);
            senderoHieloAzul[11] = new LatLng(-41.932765, -71.560052);
            senderoHieloAzul[12] = new LatLng(-41.931933, -71.558291);
            senderoHieloAzul[13] = new LatLng(-41.931575, -71.558056);
            senderoHieloAzul[14] = new LatLng(-41.931735, -71.558165);
            senderoHieloAzul[15] = new LatLng(-41.931582, -71.557846);
            senderoHieloAzul[16] = new LatLng(-41.931174, -71.557609);
            senderoHieloAzul[17] = new LatLng(-41.929585, -71.557582);
            senderoHieloAzul[18] = new LatLng(-41.928919, -71.557922);
            senderoHieloAzul[19] = new LatLng(-41.927319, -71.559413);
            senderoHieloAzul[20] = new LatLng(-41.926641, -71.559531);
            senderoHieloAzul[21] = new LatLng(-41.925453, -71.559297);
            senderoHieloAzul[22] = new LatLng(-41.924799, -71.558728);
            senderoHieloAzul[23] = new LatLng(-41.924058, -71.558550);
            senderoHieloAzul[24] = new LatLng(-41.923832, -71.558174);
            senderoHieloAzul[25] = new LatLng(-41.923178, -71.557971);
            senderoHieloAzul[26] = new LatLng(-41.923256, -71.557911);
            senderoHieloAzul[27] = new LatLng(-41.923004, -71.558730);
            senderoHieloAzul[28] = new LatLng(-41.923424, -71.559352);
            senderoHieloAzul[29] = new LatLng(-41.923405, -71.559582);
            senderoHieloAzul[30] = new LatLng(-41.923142, -71.559702);
            senderoHieloAzul[31] = new LatLng(-41.922842, -71.560209);
            senderoHieloAzul[32] = new LatLng(-41.921725, -71.561039);
            senderoHieloAzul[33] = new LatLng(-41.920663, -71.561424);
            senderoHieloAzul[34] = new LatLng(-41.920588, -71.562358);
            senderoHieloAzul[35] = new LatLng(-41.920145, -71.563026);
            senderoHieloAzul[36] = new LatLng(-41.919266, -71.563691);
            senderoHieloAzul[37] = new LatLng(-41.918894, -71.564218);
            senderoHieloAzul[38] = new LatLng(-41.918103, -71.564591);
            senderoHieloAzul[39] = new LatLng(-41.917649, -71.564641);
            senderoHieloAzul[40] = new LatLng(-41.917566, -71.565372);
            senderoHieloAzul[41] = new LatLng(-41.917051, -71.566065);
            senderoHieloAzul[42] = new LatLng(-41.916311, -71.566087);
            senderoHieloAzul[43] = new LatLng(-41.915117, -71.566490);
            senderoHieloAzul[44] = new LatLng(-41.914557, -71.566445);
            senderoHieloAzul[45] = new LatLng(-41.913996, -71.566720);
            senderoHieloAzul[46] = new LatLng(-41.914014, -71.566840);
            senderoHieloAzul[47] = new LatLng(-41.913644, -71.566931);
            senderoHieloAzul[48] = new LatLng(-41.913449, -71.567224);
            senderoHieloAzul[49] = new LatLng(-41.913208, -71.567882);
            senderoHieloAzul[50] = new LatLng(-41.913158, -71.569057);
            senderoHieloAzul[51] = new LatLng(-41.912807, -71.569584);
            senderoHieloAzul[52] = new LatLng(-41.912859, -71.570377);
            senderoHieloAzul[53] = new LatLng(-41.912739, -71.570812);
            senderoHieloAzul[54] = new LatLng(-41.911693, -71.571191);
            senderoHieloAzul[55] = new LatLng(-41.911850, -71.571693);
            senderoHieloAzul[56] = new LatLng(-41.912510, -71.572773);
            senderoHieloAzul[57] = new LatLng(-41.912365, -71.573693);
            senderoHieloAzul[58] = new LatLng(-41.911816, -71.574149);
            senderoHieloAzul[59] = new LatLng(-41.911118, -71.575083);
            senderoHieloAzul[60] = new LatLng(-41.910897, -71.575928);
            senderoHieloAzul[61] = new LatLng(-41.911135, -71.576296);
            senderoHieloAzul[62] = new LatLng(-41.910978, -71.576430);
            senderoHieloAzul[63] = new LatLng(-41.910809, -71.577317);
            senderoHieloAzul[64] = new LatLng(-41.910264, -71.577829);
            senderoHieloAzul[65] = new LatLng(-41.910529, -71.578844);
            senderoHieloAzul[66] = new LatLng(-41.910291, -71.579014);
            senderoHieloAzul[67] = new LatLng(-41.909951, -71.578828);
            senderoHieloAzul[68] = new LatLng(-41.910234, -71.579103);
            senderoHieloAzul[69] = new LatLng(-41.910050, -71.579798);
            senderoHieloAzul[70] = new LatLng(-41.910221, -71.580226);
            senderoHieloAzul[71] = new LatLng(-41.910096, -71.581101);
            senderoHieloAzul[72] = new LatLng(-41.909661, -71.581710);
            senderoHieloAzul[73] = new LatLng(-41.909136, -71.581838);
            senderoHieloAzul[74] = new LatLng(-41.909114, -71.582575);
            senderoHieloAzul[75] = new LatLng(-41.908881, -71.583164);
            senderoHieloAzul[76] = new LatLng(-41.909083, -71.583556);
            senderoHieloAzul[77] = new LatLng(-41.909073, -71.583919);
            senderoHieloAzul[78] = new LatLng(-41.908620, -71.584308);
            senderoHieloAzul[79] = new LatLng(-41.908809, -71.585764);
            senderoHieloAzul[80] = new LatLng(-41.909258, -71.587292);
            senderoHieloAzul[81] = new LatLng(-41.909412, -71.587451);
            senderoHieloAzul[82] = new LatLng(-41.909582, -71.588684);
            senderoHieloAzul[83] = new LatLng(-41.910224, -71.589952);
            senderoHieloAzul[84] = new LatLng(-41.910719, -71.590538);
            senderoHieloAzul[85] = new LatLng(-41.910720, -71.590896);
            senderoHieloAzul[86] = new LatLng(-41.910500, -71.591122);
            senderoHieloAzul[87] = new LatLng(-41.909151, -71.591403);
            senderoHieloAzul[88] = new LatLng(-41.909012, -71.591835);
            senderoHieloAzul[89] = new LatLng(-41.908643, -71.591997);
            senderoHieloAzul[90] = new LatLng(-41.908514, -71.592437);
            senderoHieloAzul[91] = new LatLng(-41.908277, -71.592658);
            senderoHieloAzul[92] = new LatLng(-41.908382, -71.593786);
            senderoHieloAzul[93] = new LatLng(-41.907985, -71.594587);
            senderoHieloAzul[94] = new LatLng(-41.908001, -71.595453);
            senderoHieloAzul[95] = new LatLng(-41.907765, -71.596131);
            senderoHieloAzul[96] = new LatLng(-41.907058, -71.596366);
            senderoHieloAzul[97] = new LatLng(-41.906876, -71.596738);
            senderoHieloAzul[98] = new LatLng(-41.906624, -71.596678);
            senderoHieloAzul[99] = new LatLng(-41.906129, -71.597183);
            senderoHieloAzul[100] = new LatLng(-41.906232, -71.597922);
            senderoHieloAzul[101] = new LatLng(-41.907105, -71.598832);
            senderoHieloAzul[102] = new LatLng(-41.906501, -71.599073);
            senderoHieloAzul[103] = new LatLng(-41.905676, -71.600034);
            senderoHieloAzul[104] = new LatLng(-41.905549, -71.600478);
            senderoHieloAzul[105] = new LatLng(-41.905107, -71.600513);
            senderoHieloAzul[106] = new LatLng(-41.904413, -71.600900);
            senderoHieloAzul[107] = new LatLng(-41.903878, -71.600447);
            senderoHieloAzul[108] = new LatLng(-41.903515, -71.601226);
            senderoHieloAzul[109] = new LatLng(-41.902983, -71.601311);
            senderoHieloAzul[110] = new LatLng(-41.902826, -71.601152);
            senderoHieloAzul[111] = new LatLng(-41.902662, -71.601266);
            senderoHieloAzul[112] = new LatLng(-41.902628, -71.601850);
            senderoHieloAzul[113] = new LatLng(-41.902395, -71.602042);
            senderoHieloAzul[114] = new LatLng(-41.902350, -71.602405);
            senderoHieloAzul[115] = new LatLng(-41.902031, -71.602863);
            senderoHieloAzul[116] = new LatLng(-41.902026, -71.603617);
            senderoHieloAzul[117] = new LatLng(-41.901749, -71.604312);
            senderoHieloAzul[118] = new LatLng(-41.901808, -71.605222);
            senderoHieloAzul[119] = new LatLng(-41.901572, -71.605314);
            senderoHieloAzul[120] = new LatLng(-41.901562, -71.605571);
            senderoHieloAzul[121] = new LatLng(-41.901374, -71.605620);
            senderoHieloAzul[122] = new LatLng(-41.901258, -71.606191);
            senderoHieloAzul[123] = new LatLng(-41.900978, -71.606137);
            senderoHieloAzul[124] = new LatLng(-41.900671, -71.606367);
            senderoHieloAzul[125] = new LatLng(-41.900378, -71.606341);
            senderoHieloAzul[126] = new LatLng(-41.900141, -71.606635);
            senderoHieloAzul[127] = new LatLng(-41.899749, -71.606447);
            senderoHieloAzul[128] = new LatLng(-41.899330, -71.606955);
            senderoHieloAzul[129] = new LatLng(-41.899025, -71.606924);
            senderoHieloAzul[130] = new LatLng(-41.898610, -71.607161);
            senderoHieloAzul[131] = new LatLng(-41.898001, -71.607925);
            senderoHieloAzul[132] = new LatLng(-41.897743, -71.608053);
            senderoHieloAzul[133] = new LatLng(-41.897177, -71.608996);
            senderoHieloAzul[134] = new LatLng(-41.897188, -71.609864);
            senderoHieloAzul[135] = new LatLng(-41.897442, -71.610524);
            senderoHieloAzul[136] = new LatLng(-41.897347, -71.611230);
            senderoHieloAzul[137] = new LatLng(-41.897541, -71.612202);
            senderoHieloAzul[138] = new LatLng(-41.897468, -71.612431);
            senderoHieloAzul[139] = new LatLng(-41.897198, -71.612535);
            senderoHieloAzul[140] = new LatLng(-41.897130, -71.613035);
            senderoHieloAzul[141] = new LatLng(-41.896947, -71.613050);
            senderoHieloAzul[142] = new LatLng(-41.896675, -71.613393);
            senderoHieloAzul[143] = new LatLng(-41.896640, -71.613763);
            senderoHieloAzul[144] = new LatLng(-41.895925, -71.614796);
            senderoHieloAzul[145] = new LatLng(-41.895272, -71.614915);
            senderoHieloAzul[146] = new LatLng(-41.894535, -71.614702);
            senderoHieloAzul[147] = new LatLng(-41.894403, -71.614868);
            senderoHieloAzul[148] = new LatLng(-41.894441, -71.615252);
            senderoHieloAzul[149] = new LatLng(-41.894877, -71.615916);
            senderoHieloAzul[150] = new LatLng(-41.894889, -71.616674);
            senderoHieloAzul[151] = new LatLng(-41.895394, -71.618223);
            senderoHieloAzul[152] = new LatLng(-41.895423, -71.619183);
            senderoHieloAzul[153] = new LatLng(-41.895202, -71.619705);
            senderoHieloAzul[154] = new LatLng(-41.895221, -71.620058);
            senderoHieloAzul[155] = new LatLng(-41.895013, -71.620294);
            senderoHieloAzul[156] = new LatLng(-41.894818, -71.621530);
            senderoHieloAzul[157] = new LatLng(-41.894628, -71.621573);
            senderoHieloAzul[158] = new LatLng(-41.894468, -71.622045);
            senderoHieloAzul[159] = new LatLng(-41.894473, -71.622545);
            senderoHieloAzul[160] = new LatLng(-41.894078, -71.623870);
            senderoHieloAzul[161] = new LatLng(-41.893609, -71.624103);
            senderoHieloAzul[162] = new LatLng(-41.893526, -71.624459);
            senderoHieloAzul[163] = new LatLng(-41.893278, -71.624639);
            senderoHieloAzul[164] = new LatLng(-41.891716, -71.625123);
            senderoHieloAzul[165] = new LatLng(-41.891410, -71.625816);
            senderoHieloAzul[166] = new LatLng(-41.891450, -71.626910);
            senderoHieloAzul[167] = new LatLng(-41.891190, -71.627648);
            senderoHieloAzul[168] = new LatLng(-41.890702, -71.628080);
            senderoHieloAzul[169] = new LatLng(-41.890604, -71.628600);
            senderoHieloAzul[170] = new LatLng(-41.890343, -71.628796);
            senderoHieloAzul[171] = new LatLng(-41.889999, -71.630548);
            senderoHieloAzul[172] = new LatLng(-41.889619, -71.630950);
            senderoHieloAzul[173] = new LatLng(-41.889496, -71.631301);
            senderoHieloAzul[174] = new LatLng(-41.889229, -71.631433);
            senderoHieloAzul[175] = new LatLng(-41.889166, -71.631814);
            senderoHieloAzul[176] = new LatLng(-41.888791, -71.632232);
            senderoHieloAzul[177] = new LatLng(-41.888310, -71.632205);
            senderoHieloAzul[178] = new LatLng(-41.888179, -71.632416);
            senderoHieloAzul[179] = new LatLng(-41.888222, -71.633045);
            senderoHieloAzul[180] = new LatLng(-41.888056, -71.633749);
            senderoHieloAzul[181] = new LatLng(-41.888255, -71.634042);
            senderoHieloAzul[182] = new LatLng(-41.888228, -71.634534);
            senderoHieloAzul[183] = new LatLng(-41.888794, -71.635532);
            senderoHieloAzul[184] = new LatLng(-41.889063, -71.637052);
            senderoHieloAzul[185] = new LatLng(-41.888948, -71.638522);
            senderoHieloAzul[186] = new LatLng(-41.888775, -71.639021);
            senderoHieloAzul[187] = new LatLng(-41.888785, -71.639269);
            senderoHieloAzul[188] = new LatLng(-41.888820, -71.639158);
            senderoHieloAzul[189] = new LatLng(-41.888942, -71.639209);
            senderoHieloAzul[190] = new LatLng(-41.888921, -71.639332);

            // SEPARADOR //

            senderoHieloAzulWharton[0] = new LatLng(-41.887957, -71.654940);
            senderoHieloAzulWharton[1] = new LatLng(-41.887823, -71.654512);
            senderoHieloAzulWharton[2] = new LatLng(-41.887477, -71.654947);
            senderoHieloAzulWharton[3] = new LatLng(-41.887408, -71.654562);
            senderoHieloAzulWharton[4] = new LatLng(-41.887017, -71.654437);
            senderoHieloAzulWharton[5] = new LatLng(-41.886887, -71.654144);
            senderoHieloAzulWharton[6] = new LatLng(-41.886813, -71.654220);
            senderoHieloAzulWharton[7] = new LatLng(-41.886815, -71.653884);
            senderoHieloAzulWharton[8] = new LatLng(-41.886299, -71.653361);
            senderoHieloAzulWharton[9] = new LatLng(-41.886467, -71.652513);
            senderoHieloAzulWharton[10] = new LatLng(-41.886366, -71.652328);
            senderoHieloAzulWharton[11] = new LatLng(-41.886514, -71.651978);
            senderoHieloAzulWharton[12] = new LatLng(-41.886259, -71.651465);
            senderoHieloAzulWharton[13] = new LatLng(-41.886345, -71.651142);
            senderoHieloAzulWharton[14] = new LatLng(-41.886216, -71.651063);
            senderoHieloAzulWharton[15] = new LatLng(-41.886331, -71.650910);
            senderoHieloAzulWharton[16] = new LatLng(-41.886275, -71.650467);
            senderoHieloAzulWharton[17] = new LatLng(-41.886502, -71.650626);
            senderoHieloAzulWharton[18] = new LatLng(-41.886826, -71.650400);
            senderoHieloAzulWharton[19] = new LatLng(-41.887409, -71.650440);
            senderoHieloAzulWharton[20] = new LatLng(-41.887961, -71.648313);
            senderoHieloAzulWharton[21] = new LatLng(-41.888190, -71.648009);
            senderoHieloAzulWharton[22] = new LatLng(-41.888232, -71.647576);
            senderoHieloAzulWharton[23] = new LatLng(-41.888430, -71.647537);
            senderoHieloAzulWharton[24] = new LatLng(-41.888613, -71.647127);
            senderoHieloAzulWharton[25] = new LatLng(-41.888707, -71.646372);
            senderoHieloAzulWharton[26] = new LatLng(-41.888450, -71.644974);
            senderoHieloAzulWharton[27] = new LatLng(-41.887616, -71.644769);
            senderoHieloAzulWharton[28] = new LatLng(-41.887516, -71.644471);
            senderoHieloAzulWharton[29] = new LatLng(-41.887019, -71.644102);
            senderoHieloAzulWharton[30] = new LatLng(-41.886813, -71.643617);
            senderoHieloAzulWharton[31] = new LatLng(-41.887100, -71.642501);
            senderoHieloAzulWharton[32] = new LatLng(-41.886980, -71.641270);
            senderoHieloAzulWharton[33] = new LatLng(-41.887211, -71.640285);
            senderoHieloAzulWharton[34] = new LatLng(-41.887952, -71.638943);
            senderoHieloAzulWharton[35] = new LatLng(-41.888327, -71.638825);
            senderoHieloAzulWharton[36] = new LatLng(-41.888768, -71.639102);
            senderoHieloAzulWharton[37] = new LatLng(-41.888995, -71.638935);
            senderoHieloAzulWharton[38] = new LatLng(-41.888785, -71.638357);
            senderoHieloAzulWharton[39] = new LatLng(-41.888934, -71.637512);
            senderoHieloAzulWharton[40] = new LatLng(-41.889138, -71.637416);
            senderoHieloAzulWharton[41] = new LatLng(-41.888871, -71.636546);
            senderoHieloAzulWharton[42] = new LatLng(-41.888821, -71.635683);
            senderoHieloAzulWharton[43] = new LatLng(-41.888228, -71.634487);
            senderoHieloAzulWharton[44] = new LatLng(-41.888218, -71.632409);
            senderoHieloAzulWharton[45] = new LatLng(-41.888525, -71.631837);
            senderoHieloAzulWharton[46] = new LatLng(-41.888455, -71.631645);
            senderoHieloAzulWharton[47] = new LatLng(-41.888316, -71.631687);
            senderoHieloAzulWharton[48] = new LatLng(-41.888173, -71.630556);
            senderoHieloAzulWharton[49] = new LatLng(-41.887818, -71.630131);
            senderoHieloAzulWharton[50] = new LatLng(-41.887790, -71.629546);
            senderoHieloAzulWharton[51] = new LatLng(-41.888096, -71.627879);
            senderoHieloAzulWharton[52] = new LatLng(-41.887877, -71.627421);
            senderoHieloAzulWharton[53] = new LatLng(-41.887958, -71.627119);
            senderoHieloAzulWharton[54] = new LatLng(-41.887767, -71.626968);
            senderoHieloAzulWharton[55] = new LatLng(-41.887726, -71.626248);
            senderoHieloAzulWharton[56] = new LatLng(-41.887333, -71.624651);
            senderoHieloAzulWharton[57] = new LatLng(-41.887086, -71.624298);
            senderoHieloAzulWharton[58] = new LatLng(-41.886692, -71.624103);
            senderoHieloAzulWharton[59] = new LatLng(-41.886459, -71.624151);
            senderoHieloAzulWharton[60] = new LatLng(-41.886105, -71.623628);
            senderoHieloAzulWharton[61] = new LatLng(-41.885505, -71.623739);
            senderoHieloAzulWharton[62] = new LatLng(-41.884583, -71.624615);
            senderoHieloAzulWharton[63] = new LatLng(-41.883748, -71.624946);
            senderoHieloAzulWharton[64] = new LatLng(-41.882867, -71.625529);
            senderoHieloAzulWharton[65] = new LatLng(-41.882754, -71.625760);
            senderoHieloAzulWharton[66] = new LatLng(-41.882017, -71.625500);
            senderoHieloAzulWharton[67] = new LatLng(-41.881786, -71.625610);
            senderoHieloAzulWharton[68] = new LatLng(-41.881394, -71.624997);
            senderoHieloAzulWharton[69] = new LatLng(-41.880402, -71.624716);
            senderoHieloAzulWharton[70] = new LatLng(-41.880119, -71.625014);
            senderoHieloAzulWharton[71] = new LatLng(-41.879869, -71.624798);
            senderoHieloAzulWharton[72] = new LatLng(-41.879644, -71.624861);
            senderoHieloAzulWharton[73] = new LatLng(-41.879732, -71.624890);
            senderoHieloAzulWharton[74] = new LatLng(-41.879645, -71.624728);
            senderoHieloAzulWharton[75] = new LatLng(-41.879798, -71.623931);
            senderoHieloAzulWharton[76] = new LatLng(-41.879622, -71.623525);
            senderoHieloAzulWharton[77] = new LatLng(-41.878991, -71.623039);
            senderoHieloAzulWharton[78] = new LatLng(-41.878769, -71.622338);
            senderoHieloAzulWharton[79] = new LatLng(-41.878093, -71.622106);
            senderoHieloAzulWharton[80] = new LatLng(-41.877689, -71.621691);
            senderoHieloAzulWharton[81] = new LatLng(-41.877372, -71.621680);
            senderoHieloAzulWharton[82] = new LatLng(-41.876369, -71.621206);
            senderoHieloAzulWharton[83] = new LatLng(-41.875730, -71.620624);
            senderoHieloAzulWharton[84] = new LatLng(-41.875374, -71.619917);
            senderoHieloAzulWharton[85] = new LatLng(-41.874980, -71.619864);
            senderoHieloAzulWharton[86] = new LatLng(-41.874820, -71.619599);
            senderoHieloAzulWharton[87] = new LatLng(-41.874332, -71.619317);
            senderoHieloAzulWharton[88] = new LatLng(-41.873839, -71.619282);
            senderoHieloAzulWharton[89] = new LatLng(-41.873433, -71.619017);
            senderoHieloAzulWharton[90] = new LatLng(-41.872811, -71.619119);
            senderoHieloAzulWharton[91] = new LatLng(-41.872661, -71.618695);
            senderoHieloAzulWharton[92] = new LatLng(-41.872651, -71.617905);
            senderoHieloAzulWharton[93] = new LatLng(-41.872443, -71.617442);
            senderoHieloAzulWharton[94] = new LatLng(-41.871722, -71.616988);
            senderoHieloAzulWharton[95] = new LatLng(-41.871373, -71.616231);
            senderoHieloAzulWharton[96] = new LatLng(-41.871340, -71.616501);
            senderoHieloAzulWharton[97] = new LatLng(-41.871970, -71.615135);
            senderoHieloAzulWharton[98] = new LatLng(-41.871770, -71.613551);
            senderoHieloAzulWharton[99] = new LatLng(-41.871822, -71.612398);
            senderoHieloAzulWharton[100] = new LatLng(-41.871637, -71.611542);
            senderoHieloAzulWharton[101] = new LatLng(-41.871894, -71.609872);
            senderoHieloAzulWharton[102] = new LatLng(-41.871684, -71.610050);
            senderoHieloAzulWharton[103] = new LatLng(-41.871491, -71.609744);
            senderoHieloAzulWharton[104] = new LatLng(-41.870801, -71.607466);
            senderoHieloAzulWharton[105] = new LatLng(-41.870101, -71.607290);
            senderoHieloAzulWharton[106] = new LatLng(-41.869971, -71.606700);
            senderoHieloAzulWharton[107] = new LatLng(-41.869817, -71.606552);
            senderoHieloAzulWharton[108] = new LatLng(-41.869498, -71.606564);
            senderoHieloAzulWharton[109] = new LatLng(-41.869309, -71.607082);
            senderoHieloAzulWharton[110] = new LatLng(-41.868689, -71.607360);
            senderoHieloAzulWharton[111] = new LatLng(-41.868219, -71.606842);
            senderoHieloAzulWharton[112] = new LatLng(-41.868039, -71.606861);
            senderoHieloAzulWharton[113] = new LatLng(-41.867761, -71.606313);
            senderoHieloAzulWharton[114] = new LatLng(-41.867535, -71.606291);
            senderoHieloAzulWharton[115] = new LatLng(-41.866980, -71.606689);
            senderoHieloAzulWharton[116] = new LatLng(-41.866670, -71.606703);
            senderoHieloAzulWharton[117] = new LatLng(-41.866650, -71.606892);
            senderoHieloAzulWharton[118] = new LatLng(-41.866121, -71.606735);
            senderoHieloAzulWharton[119] = new LatLng(-41.866138, -71.606553);
            senderoHieloAzulWharton[120] = new LatLng(-41.865607, -71.606546);
            senderoHieloAzulWharton[121] = new LatLng(-41.865505, -71.606130);
            senderoHieloAzulWharton[122] = new LatLng(-41.865494, -71.606226);
            senderoHieloAzulWharton[123] = new LatLng(-41.865130, -71.606018);
            senderoHieloAzulWharton[124] = new LatLng(-41.864928, -71.606160);
            senderoHieloAzulWharton[125] = new LatLng(-41.864604, -71.606137);
            senderoHieloAzulWharton[126] = new LatLng(-41.864505, -71.606442);
            senderoHieloAzulWharton[127] = new LatLng(-41.864057, -71.606743);
            senderoHieloAzulWharton[128] = new LatLng(-41.863620, -71.607761);
            senderoHieloAzulWharton[129] = new LatLng(-41.863350, -71.607951);
            senderoHieloAzulWharton[130] = new LatLng(-41.862943, -71.607490);
            senderoHieloAzulWharton[131] = new LatLng(-41.862671, -71.608125);
            senderoHieloAzulWharton[132] = new LatLng(-41.861913, -71.607600);
            senderoHieloAzulWharton[133] = new LatLng(-41.861781, -71.607999);
            senderoHieloAzulWharton[134] = new LatLng(-41.861514, -71.608038);
            senderoHieloAzulWharton[135] = new LatLng(-41.861485, -71.608365);
            senderoHieloAzulWharton[136] = new LatLng(-41.860844, -71.609130);
            senderoHieloAzulWharton[137] = new LatLng(-41.860845, -71.609753);
            senderoHieloAzulWharton[138] = new LatLng(-41.860612, -71.610161);
            senderoHieloAzulWharton[139] = new LatLng(-41.860321, -71.610220);
            senderoHieloAzulWharton[140] = new LatLng(-41.860081, -71.610068);
            senderoHieloAzulWharton[141] = new LatLng(-41.859909, -71.610157);
            senderoHieloAzulWharton[142] = new LatLng(-41.859523, -71.609856);
            senderoHieloAzulWharton[143] = new LatLng(-41.859410, -71.610068);
            senderoHieloAzulWharton[144] = new LatLng(-41.859132, -71.609929);
            senderoHieloAzulWharton[145] = new LatLng(-41.859197, -71.610158);
            senderoHieloAzulWharton[146] = new LatLng(-41.858928, -71.610626);
            senderoHieloAzulWharton[147] = new LatLng(-41.858477, -71.610751);
            senderoHieloAzulWharton[148] = new LatLng(-41.858197, -71.611394);
            senderoHieloAzulWharton[149] = new LatLng(-41.858019, -71.611418);
            senderoHieloAzulWharton[150] = new LatLng(-41.857860, -71.611663);
            senderoHieloAzulWharton[151] = new LatLng(-41.857674, -71.611617);
            senderoHieloAzulWharton[152] = new LatLng(-41.857328, -71.612253);
            senderoHieloAzulWharton[153] = new LatLng(-41.857324, -71.612889);
            senderoHieloAzulWharton[154] = new LatLng(-41.857094, -71.612999);
            senderoHieloAzulWharton[155] = new LatLng(-41.856812, -71.612670);
            senderoHieloAzulWharton[156] = new LatLng(-41.856427, -71.613289);
            senderoHieloAzulWharton[157] = new LatLng(-41.856246, -71.613114);
            senderoHieloAzulWharton[158] = new LatLng(-41.856043, -71.613321);
            senderoHieloAzulWharton[159] = new LatLng(-41.855783, -71.613349);
            senderoHieloAzulWharton[160] = new LatLng(-41.855603, -71.613941);
            senderoHieloAzulWharton[161] = new LatLng(-41.855746, -71.614160);
            senderoHieloAzulWharton[162] = new LatLng(-41.855571, -71.614351);
            senderoHieloAzulWharton[163] = new LatLng(-41.855246, -71.614427);
            senderoHieloAzulWharton[164] = new LatLng(-41.854946, -71.614254);
            senderoHieloAzulWharton[165] = new LatLng(-41.854905, -71.614407);
            senderoHieloAzulWharton[166] = new LatLng(-41.854526, -71.614571);
            senderoHieloAzulWharton[167] = new LatLng(-41.854188, -71.614553);
            senderoHieloAzulWharton[168] = new LatLng(-41.854104, -71.614422);
            senderoHieloAzulWharton[169] = new LatLng(-41.853995, -71.614946);
            senderoHieloAzulWharton[170] = new LatLng(-41.854180, -71.615932);
            senderoHieloAzulWharton[171] = new LatLng(-41.854164, -71.616711);
            senderoHieloAzulWharton[172] = new LatLng(-41.853726, -71.617702);
            senderoHieloAzulWharton[173] = new LatLng(-41.853830, -71.617976);
            senderoHieloAzulWharton[174] = new LatLng(-41.853698, -71.618239);
            senderoHieloAzulWharton[175] = new LatLng(-41.853832, -71.618218);
            senderoHieloAzulWharton[176] = new LatLng(-41.853978, -71.618574);
            senderoHieloAzulWharton[177] = new LatLng(-41.853904, -71.619202);
            senderoHieloAzulWharton[178] = new LatLng(-41.853526, -71.619443);
            senderoHieloAzulWharton[179] = new LatLng(-41.853539, -71.619797);
            senderoHieloAzulWharton[180] = new LatLng(-41.853376, -71.619837);
            senderoHieloAzulWharton[181] = new LatLng(-41.853510, -71.619774);
            senderoHieloAzulWharton[182] = new LatLng(-41.853445, -71.619631);
            senderoHieloAzulWharton[183] = new LatLng(-41.853485, -71.619853);
            senderoHieloAzulWharton[184] = new LatLng(-41.853459, -71.619661);
            senderoHieloAzulWharton[185] = new LatLng(-41.853588, -71.619755);
            senderoHieloAzulWharton[186] = new LatLng(-41.853462, -71.619712);
            senderoHieloAzulWharton[187] = new LatLng(-41.853581, -71.619318);
            senderoHieloAzulWharton[188] = new LatLng(-41.853721, -71.619360);
            senderoHieloAzulWharton[189] = new LatLng(-41.853573, -71.619371);
            senderoHieloAzulWharton[190] = new LatLng(-41.853535, -71.619531);
            senderoHieloAzulWharton[191] = new LatLng(-41.854027, -71.619330);
            senderoHieloAzulWharton[192] = new LatLng(-41.853832, -71.618994);
            senderoHieloAzulWharton[193] = new LatLng(-41.854003, -71.618602);
            senderoHieloAzulWharton[194] = new LatLng(-41.853888, -71.618237);
            senderoHieloAzulWharton[195] = new LatLng(-41.853751, -71.618199);
            senderoHieloAzulWharton[196] = new LatLng(-41.853418, -71.618475);
            senderoHieloAzulWharton[197] = new LatLng(-41.853758, -71.618163);
            senderoHieloAzulWharton[198] = new LatLng(-41.853799, -71.617520);
            senderoHieloAzulWharton[199] = new LatLng(-41.854219, -71.616705);
            senderoHieloAzulWharton[200] = new LatLng(-41.854077, -71.615165);
            senderoHieloAzulWharton[201] = new LatLng(-41.854192, -71.613641);
            senderoHieloAzulWharton[202] = new LatLng(-41.854728, -71.613264);
            senderoHieloAzulWharton[203] = new LatLng(-41.855075, -71.612258);
            senderoHieloAzulWharton[204] = new LatLng(-41.855446, -71.611905);
            senderoHieloAzulWharton[205] = new LatLng(-41.855401, -71.609890);
            senderoHieloAzulWharton[206] = new LatLng(-41.855557, -71.608857);
            senderoHieloAzulWharton[207] = new LatLng(-41.855629, -71.608747);
            senderoHieloAzulWharton[208] = new LatLng(-41.856349, -71.608722);
            senderoHieloAzulWharton[209] = new LatLng(-41.856399, -71.608311);
            senderoHieloAzulWharton[210] = new LatLng(-41.856847, -71.607506);
            senderoHieloAzulWharton[211] = new LatLng(-41.857011, -71.606527);
            senderoHieloAzulWharton[212] = new LatLng(-41.856902, -71.606128);
            senderoHieloAzulWharton[213] = new LatLng(-41.856992, -71.605341);
            senderoHieloAzulWharton[214] = new LatLng(-41.856889, -71.603706);
            senderoHieloAzulWharton[215] = new LatLng(-41.857026, -71.602641);
            senderoHieloAzulWharton[216] = new LatLng(-41.856830, -71.602904);
            senderoHieloAzulWharton[217] = new LatLng(-41.856932, -71.602645);
            senderoHieloAzulWharton[218] = new LatLng(-41.856812, -71.602835);
            senderoHieloAzulWharton[219] = new LatLng(-41.856780, -71.602700);
            senderoHieloAzulWharton[220] = new LatLng(-41.856824, -71.602828);
            senderoHieloAzulWharton[221] = new LatLng(-41.857147, -71.601004);
            senderoHieloAzulWharton[222] = new LatLng(-41.856651, -71.599417);
            senderoHieloAzulWharton[223] = new LatLng(-41.856738, -71.598257);
            senderoHieloAzulWharton[224] = new LatLng(-41.855703, -71.596324);
            senderoHieloAzulWharton[225] = new LatLng(-41.856311, -71.595194);
            senderoHieloAzulWharton[226] = new LatLng(-41.856384, -71.594405);
            senderoHieloAzulWharton[227] = new LatLng(-41.856263, -71.594032);
            senderoHieloAzulWharton[228] = new LatLng(-41.856578, -71.593554);
            senderoHieloAzulWharton[229] = new LatLng(-41.856751, -71.592125);
            senderoHieloAzulWharton[230] = new LatLng(-41.856445, -71.591118);
            senderoHieloAzulWharton[231] = new LatLng(-41.856515, -71.590322);
            senderoHieloAzulWharton[232] = new LatLng(-41.855900, -71.590264);
            senderoHieloAzulWharton[233] = new LatLng(-41.855788, -71.589951);
            senderoHieloAzulWharton[234] = new LatLng(-41.856172, -71.589116);
            senderoHieloAzulWharton[235] = new LatLng(-41.856474, -71.589471);
            senderoHieloAzulWharton[236] = new LatLng(-41.856713, -71.589256);
            senderoHieloAzulWharton[237] = new LatLng(-41.856801, -71.588810);
            senderoHieloAzulWharton[238] = new LatLng(-41.857134, -71.589071);
            senderoHieloAzulWharton[239] = new LatLng(-41.857546, -71.588681);
            senderoHieloAzulWharton[240] = new LatLng(-41.857857, -71.587282);
            senderoHieloAzulWharton[241] = new LatLng(-41.858130, -71.587113);
            senderoHieloAzulWharton[242] = new LatLng(-41.858720, -71.585915);
            senderoHieloAzulWharton[243] = new LatLng(-41.859278, -71.585136);
            senderoHieloAzulWharton[244] = new LatLng(-41.859274, -71.584866);
            senderoHieloAzulWharton[245] = new LatLng(-41.858863, -71.584642);
            senderoHieloAzulWharton[246] = new LatLng(-41.858815, -71.584399);
            senderoHieloAzulWharton[247] = new LatLng(-41.858890, -71.584244);
            senderoHieloAzulWharton[248] = new LatLng(-41.859402, -71.584096);
            senderoHieloAzulWharton[249] = new LatLng(-41.859157, -71.583705);
            senderoHieloAzulWharton[250] = new LatLng(-41.859127, -71.583318);
            senderoHieloAzulWharton[251] = new LatLng(-41.858538, -71.582771);
            senderoHieloAzulWharton[252] = new LatLng(-41.858267, -71.580269);
            senderoHieloAzulWharton[253] = new LatLng(-41.858405, -71.577897);
            senderoHieloAzulWharton[254] = new LatLng(-41.858313, -71.576581);
            senderoHieloAzulWharton[255] = new LatLng(-41.858597, -71.576127);
            senderoHieloAzulWharton[256] = new LatLng(-41.859051, -71.575847);
            senderoHieloAzulWharton[257] = new LatLng(-41.858632, -71.575528);
            senderoHieloAzulWharton[258] = new LatLng(-41.858751, -71.575291);
            senderoHieloAzulWharton[259] = new LatLng(-41.858420, -71.575017);
            senderoHieloAzulWharton[260] = new LatLng(-41.858861, -71.574576);
            senderoHieloAzulWharton[261] = new LatLng(-41.858036, -71.573473);
            senderoHieloAzulWharton[262] = new LatLng(-41.857599, -71.573120);
            senderoHieloAzulWharton[263] = new LatLng(-41.857090, -71.572277);
            senderoHieloAzulWharton[264] = new LatLng(-41.857308, -71.571040);
            senderoHieloAzulWharton[265] = new LatLng(-41.857219, -71.570475);
            senderoHieloAzulWharton[266] = new LatLng(-41.857788, -71.569594);
            senderoHieloAzulWharton[267] = new LatLng(-41.858130, -71.568699);
            senderoHieloAzulWharton[268] = new LatLng(-41.858791, -71.568232);
            senderoHieloAzulWharton[269] = new LatLng(-41.859134, -71.568365);
            senderoHieloAzulWharton[270] = new LatLng(-41.859393, -71.568123);
            senderoHieloAzulWharton[271] = new LatLng(-41.859176, -71.567412);
            senderoHieloAzulWharton[272] = new LatLng(-41.858379, -71.566939);
            senderoHieloAzulWharton[273] = new LatLng(-41.858485, -71.566562);
            senderoHieloAzulWharton[274] = new LatLng(-41.858854, -71.566190);
            senderoHieloAzulWharton[275] = new LatLng(-41.858514, -71.565479);
            senderoHieloAzulWharton[276] = new LatLng(-41.858743, -71.564899);
            senderoHieloAzulWharton[277] = new LatLng(-41.858681, -71.564699);
            senderoHieloAzulWharton[278] = new LatLng(-41.858354, -71.564567);
            senderoHieloAzulWharton[279] = new LatLng(-41.858150, -71.564223);
            senderoHieloAzulWharton[280] = new LatLng(-41.857621, -71.564155);
            senderoHieloAzulWharton[281] = new LatLng(-41.858106, -71.563960);
            senderoHieloAzulWharton[282] = new LatLng(-41.858395, -71.562893);
            senderoHieloAzulWharton[283] = new LatLng(-41.858701, -71.562411);
            senderoHieloAzulWharton[284] = new LatLng(-41.857802, -71.561889);
            senderoHieloAzulWharton[285] = new LatLng(-41.857724, -71.561625);
            senderoHieloAzulWharton[286] = new LatLng(-41.857857, -71.560835);
            senderoHieloAzulWharton[287] = new LatLng(-41.857651, -71.559690);
            senderoHieloAzulWharton[288] = new LatLng(-41.857025, -71.559068);
            senderoHieloAzulWharton[289] = new LatLng(-41.856951, -71.559150);
            senderoHieloAzulWharton[290] = new LatLng(-41.857241, -71.559538);
            senderoHieloAzulWharton[291] = new LatLng(-41.856741, -71.559528);
            senderoHieloAzulWharton[292] = new LatLng(-41.856073, -71.558337);
            senderoHieloAzulWharton[293] = new LatLng(-41.856511, -71.557731);
            senderoHieloAzulWharton[294] = new LatLng(-41.857231, -71.558205);
            senderoHieloAzulWharton[295] = new LatLng(-41.858759, -71.558311);
            senderoHieloAzulWharton[296] = new LatLng(-41.859386, -71.558141);
            senderoHieloAzulWharton[297] = new LatLng(-41.859659, -71.558249);
            senderoHieloAzulWharton[298] = new LatLng(-41.860360, -71.559302);
            senderoHieloAzulWharton[299] = new LatLng(-41.860384, -71.559170);
            senderoHieloAzulWharton[300] = new LatLng(-41.859968, -71.557797);
            senderoHieloAzulWharton[301] = new LatLng(-41.859734, -71.557599);
            senderoHieloAzulWharton[302] = new LatLng(-41.859612, -71.556746);
            senderoHieloAzulWharton[303] = new LatLng(-41.859248, -71.556096);
            senderoHieloAzulWharton[304] = new LatLng(-41.858406, -71.555559);
            senderoHieloAzulWharton[305] = new LatLng(-41.858079, -71.554757);
            senderoHieloAzulWharton[306] = new LatLng(-41.856022, -71.554185);
            senderoHieloAzulWharton[307] = new LatLng(-41.854327, -71.553131);
            senderoHieloAzulWharton[308] = new LatLng(-41.854358, -71.552685);
            senderoHieloAzulWharton[309] = new LatLng(-41.855353, -71.551645);
            senderoHieloAzulWharton[310] = new LatLng(-41.856088, -71.551105);
            senderoHieloAzulWharton[311] = new LatLng(-41.856261, -71.548635);

            // SEPARADOR //



            senderoNatacion[0]= new LatLng (-41.858482,-71.555386);
            senderoNatacion[1]= new LatLng (-41.858405,-71.555527);
            senderoNatacion[2]= new LatLng (-41.858523,-71.555663);
            senderoNatacion[3]= new LatLng (-41.85944,-71.556169);
            senderoNatacion[4]= new LatLng (-41.859433,-71.556499);
            senderoNatacion[5]= new LatLng (-41.859733,-71.556951);
            senderoNatacion[6]= new LatLng (-41.859759,-71.557755);
            senderoNatacion[7]= new LatLng (-41.860078,-71.557893);
            senderoNatacion[8]= new LatLng (-41.860074,-71.558374);
            senderoNatacion[9]= new LatLng (-41.860429,-71.559301);
            senderoNatacion[10]= new LatLng (-41.860228,-71.559262);
            senderoNatacion[11]= new LatLng (-41.859551,-71.558254);
            senderoNatacion[12]= new LatLng (-41.85924,-71.558083);
            senderoNatacion[13]= new LatLng (-41.858737,-71.558399);
            senderoNatacion[14]= new LatLng (-41.858296,-71.558273);
            senderoNatacion[15]= new LatLng (-41.857972,-71.558356);
            senderoNatacion[16]= new LatLng (-41.858036,-71.558439);
            senderoNatacion[17]= new LatLng (-41.857832,-71.558203);
            senderoNatacion[18]= new LatLng (-41.85673,-71.558152);
            senderoNatacion[19]= new LatLng (-41.856286,-71.557922);
            senderoNatacion[20]= new LatLng (-41.856101,-71.558228);
            senderoNatacion[21]= new LatLng (-41.856046,-71.558333);
            senderoNatacion[22]= new LatLng (-41.856346,-71.558765);
            senderoNatacion[23]= new LatLng (-41.856848,-71.55857);
            senderoNatacion[24]= new LatLng (-41.856397,-71.558781);
            senderoNatacion[25]= new LatLng (-41.856371,-71.55891);
            senderoNatacion[26]= new LatLng (-41.856714,-71.559212);
            senderoNatacion[27]= new LatLng (-41.856787,-71.559605);
            senderoNatacion[28]= new LatLng (-41.857315,-71.559428);
            senderoNatacion[29]= new LatLng (-41.8576,-71.559658);
            senderoNatacion[30]= new LatLng (-41.857634,-71.560323);
            senderoNatacion[31]= new LatLng (-41.857834,-71.560781);
            senderoNatacion[32]= new LatLng (-41.857766,-71.561587);
            senderoNatacion[33]= new LatLng (-41.85792,-71.562028);
            senderoNatacion[34]= new LatLng (-41.858701,-71.562459);
            senderoNatacion[35]= new LatLng (-41.858469,-71.562589);
            senderoNatacion[36]= new LatLng (-41.85853,-71.56281);
            senderoNatacion[37]= new LatLng (-41.858015,-71.564019);
            senderoNatacion[38]= new LatLng (-41.857688,-71.564164);
            senderoNatacion[39]= new LatLng (-41.857686,-71.564281);
            senderoNatacion[40]= new LatLng (-41.8583,-71.564382);
            senderoNatacion[41]= new LatLng (-41.858356,-71.564619);
            senderoNatacion[42]= new LatLng (-41.858759,-71.56484);
            senderoNatacion[43]= new LatLng (-41.860453,-71.564471);
            senderoNatacion[44]= new LatLng (-41.861472,-71.564441);
            senderoNatacion[45]= new LatLng (-41.861792,-71.564529);
            senderoNatacion[46]= new LatLng (-41.862086,-71.56492);
            senderoNatacion[47]= new LatLng (-41.862471,-71.564735);
            senderoNatacion[48]= new LatLng (-41.863008,-71.565088);
            senderoNatacion[49]= new LatLng (-41.863283,-71.565003);
            senderoNatacion[50]= new LatLng (-41.863584,-71.565172);
            senderoNatacion[51]= new LatLng (-41.863611,-71.565077);
            senderoNatacion[52]= new LatLng (-41.863985,-71.565535);
            senderoNatacion[53]= new LatLng (-41.865287,-71.56539);
            senderoNatacion[54]= new LatLng (-41.866025,-71.564831);
            senderoNatacion[55]= new LatLng (-41.866361,-71.564966);
            senderoNatacion[56]= new LatLng (-41.867436,-71.566389);
            senderoNatacion[57]= new LatLng (-41.869324,-71.568494);
            senderoNatacion[58]= new LatLng (-41.869375,-71.568781);
            senderoNatacion[59]= new LatLng (-41.869755,-71.569166);
            senderoNatacion[60]= new LatLng (-41.869947,-71.570247);
            senderoNatacion[61]= new LatLng (-41.870295,-71.570765);
            senderoNatacion[62]= new LatLng (-41.870717,-71.571064);
            senderoNatacion[63]= new LatLng (-41.871241,-71.571169);
            senderoNatacion[64]= new LatLng (-41.871567,-71.570691);
            senderoNatacion[65]= new LatLng (-41.872403,-71.570231);
            senderoNatacion[66]= new LatLng (-41.872975,-71.570484);
            senderoNatacion[67]= new LatLng (-41.872974,-71.570602);
            senderoNatacion[68]= new LatLng (-41.872969,-71.570477);
            senderoNatacion[69]= new LatLng (-41.873196,-71.570967);
            senderoNatacion[70]= new LatLng (-41.873087,-71.571901);
            senderoNatacion[71]= new LatLng (-41.873284,-71.572322);
            senderoNatacion[72]= new LatLng (-41.873112,-71.572858);
            senderoNatacion[73]= new LatLng (-41.873646,-71.573394);
            senderoNatacion[74]= new LatLng (-41.873855,-71.573954);
            senderoNatacion[75]= new LatLng (-41.874329,-71.574609);
            senderoNatacion[76]= new LatLng (-41.875345,-71.575125);
            senderoNatacion[77]= new LatLng (-41.875868,-71.575617);
            senderoNatacion[78]= new LatLng (-41.876136,-71.576217);
            senderoNatacion[79]= new LatLng (-41.877054,-71.577507);
            senderoNatacion[80]= new LatLng (-41.8778,-71.577725);
            senderoNatacion[81]= new LatLng (-41.878357,-71.578176);
            senderoNatacion[82]= new LatLng (-41.878588,-71.57809);
            senderoNatacion[83]= new LatLng (-41.878945,-71.578243);
            senderoNatacion[84]= new LatLng (-41.878887,-71.579008);
            senderoNatacion[85]= new LatLng (-41.878153,-71.579932);
            senderoNatacion[86]= new LatLng (-41.877887,-71.580633);
            senderoNatacion[87]= new LatLng (-41.877835,-71.582365);
            senderoNatacion[88]= new LatLng (-41.87795,-71.582884);
            senderoNatacion[89]= new LatLng (-41.878949,-71.58301);
            senderoNatacion[90]= new LatLng (-41.880189,-71.582835);
            senderoNatacion[91]= new LatLng (-41.88055,-71.583125);
            senderoNatacion[92]= new LatLng (-41.880479,-71.583994);
            senderoNatacion[93]= new LatLng (-41.880654,-71.586052);
            senderoNatacion[94]= new LatLng (-41.880711,-71.586357);
            senderoNatacion[95]= new LatLng (-41.881316,-71.587095);
            senderoNatacion[96]= new LatLng (-41.881651,-71.588029);
            senderoNatacion[97]= new LatLng (-41.881443,-71.589366);
            senderoNatacion[98]= new LatLng (-41.881677,-71.589526);
            senderoNatacion[99]= new LatLng (-41.881858,-71.589963);
            senderoNatacion[100]= new LatLng (-41.881841,-71.590668);
            senderoNatacion[101]= new LatLng (-41.881661,-71.591074);
            senderoNatacion[102]= new LatLng (-41.881378,-71.59284);
            senderoNatacion[103]= new LatLng (-41.880682,-71.594122);
            senderoNatacion[104]= new LatLng (-41.880439,-71.595113);
            senderoNatacion[105]= new LatLng (-41.879799,-71.596346);
            senderoNatacion[106]= new LatLng (-41.879866,-71.596858);
            senderoNatacion[107]= new LatLng (-41.879435,-71.597633);
            senderoNatacion[108]= new LatLng (-41.879384,-71.598151);
            senderoNatacion[109]= new LatLng (-41.879855,-71.599155);
            senderoNatacion[110]= new LatLng (-41.880623,-71.599427);
            senderoNatacion[111]= new LatLng (-41.880917,-71.599242);
            senderoNatacion[112]= new LatLng (-41.88145,-71.599436);
            senderoNatacion[113]= new LatLng (-41.881625,-71.599643);
            senderoNatacion[114]= new LatLng (-41.881872,-71.600407);
            senderoNatacion[115]= new LatLng (-41.881847,-71.601221);
            senderoNatacion[116]= new LatLng (-41.882067,-71.601828);
            senderoNatacion[117]= new LatLng (-41.882598,-71.60262);
            senderoNatacion[118]= new LatLng (-41.88311,-71.603011);
            senderoNatacion[119]= new LatLng (-41.883412,-71.604002);
            senderoNatacion[120]= new LatLng (-41.88343,-71.604448);
            senderoNatacion[121]= new LatLng (-41.882961,-71.60485);
            senderoNatacion[122]= new LatLng (-41.88287,-71.605182);
            senderoNatacion[123]= new LatLng (-41.882921,-71.605061);
            senderoNatacion[124]= new LatLng (-41.882836,-71.605166);
            senderoNatacion[125]= new LatLng (-41.882938,-71.605107);
            senderoNatacion[126]= new LatLng (-41.882809,-71.605025);
            senderoNatacion[127]= new LatLng (-41.88285,-71.605263);
            senderoNatacion[128]= new LatLng (-41.882549,-71.605896);
            senderoNatacion[129]= new LatLng (-41.882483,-71.607251);
            senderoNatacion[130]= new LatLng (-41.882772,-71.607941);
            senderoNatacion[131]= new LatLng (-41.882991,-71.609452);
            senderoNatacion[132]= new LatLng (-41.882932,-71.610283);
            senderoNatacion[133]= new LatLng (-41.882277,-71.61283);
            senderoNatacion[134]= new LatLng (-41.882329,-71.613923);
            senderoNatacion[135]= new LatLng (-41.882205,-71.61462);
            senderoNatacion[136]= new LatLng (-41.882891,-71.617511);
            senderoNatacion[137]= new LatLng (-41.883166,-71.617975);
            senderoNatacion[138]= new LatLng (-41.88307,-71.618359);
            senderoNatacion[139]= new LatLng (-41.883295,-71.619268);
            senderoNatacion[140]= new LatLng (-41.88327,-71.619932);
            senderoNatacion[141]= new LatLng (-41.883587,-71.620216);
            senderoNatacion[142]= new LatLng (-41.883854,-71.621129);
            senderoNatacion[143]= new LatLng (-41.883945,-71.622135);
            senderoNatacion[144]= new LatLng (-41.883717,-71.622407);
            senderoNatacion[145]= new LatLng (-41.883581,-71.623154);
            senderoNatacion[146]= new LatLng (-41.883715,-71.62368);
            senderoNatacion[147]= new LatLng (-41.884178,-71.624095);
            senderoNatacion[148]= new LatLng (-41.883978,-71.62479);
            senderoNatacion[149]= new LatLng (-41.882676,-71.625659);
            senderoNatacion[150]= new LatLng (-41.882345,-71.625709);
            senderoNatacion[151]= new LatLng (-41.882146,-71.625545);
            senderoNatacion[152]= new LatLng (-41.881791,-71.625546);
            senderoNatacion[153]= new LatLng (-41.881553,-71.625376);
            senderoNatacion[154]= new LatLng (-41.881414,-71.624998);
            senderoNatacion[155]= new LatLng (-41.880465,-71.624743);


        }



        mMap.addPolyline(
                new PolylineOptions()
                        .add(senderoHieloAzul[0])
                        .add(senderoHieloAzul[1])
                        .add(senderoHieloAzul[2])
                        .add(senderoHieloAzul[3])
                        .add(senderoHieloAzul[4])
                        .add(senderoHieloAzul[5])
                        .add(senderoHieloAzul[6])
                        .add(senderoHieloAzul[7])
                        .add(senderoHieloAzul[8])
                        .add(senderoHieloAzul[9])
                        .add(senderoHieloAzul[10])
                        .add(senderoHieloAzul[11])
                        .add(senderoHieloAzul[12])
                        .add(senderoHieloAzul[13])
                        .add(senderoHieloAzul[14])
                        .add(senderoHieloAzul[15])
                        .add(senderoHieloAzul[16])
                        .add(senderoHieloAzul[17])
                        .add(senderoHieloAzul[18])
                        .add(senderoHieloAzul[19])
                        .add(senderoHieloAzul[20])
                        .add(senderoHieloAzul[21])
                        .add(senderoHieloAzul[22])
                        .add(senderoHieloAzul[23])
                        .add(senderoHieloAzul[24])
                        .add(senderoHieloAzul[25])
                        .add(senderoHieloAzul[26])
                        .add(senderoHieloAzul[27])
                        .add(senderoHieloAzul[28])
                        .add(senderoHieloAzul[29])
                        .add(senderoHieloAzul[30])
                        .add(senderoHieloAzul[31])
                        .add(senderoHieloAzul[32])
                        .add(senderoHieloAzul[33])
                        .add(senderoHieloAzul[34])
                        .add(senderoHieloAzul[35])
                        .add(senderoHieloAzul[36])
                        .add(senderoHieloAzul[37])
                        .add(senderoHieloAzul[38])
                        .add(senderoHieloAzul[39])
                        .add(senderoHieloAzul[40])
                        .add(senderoHieloAzul[41])
                        .add(senderoHieloAzul[42])
                        .add(senderoHieloAzul[43])
                        .add(senderoHieloAzul[44])
                        .add(senderoHieloAzul[45])
                        .add(senderoHieloAzul[46])
                        .add(senderoHieloAzul[47])
                        .add(senderoHieloAzul[48])
                        .add(senderoHieloAzul[49])
                        .add(senderoHieloAzul[50])
                        .add(senderoHieloAzul[51])
                        .add(senderoHieloAzul[52])
                        .add(senderoHieloAzul[53])
                        .add(senderoHieloAzul[54])
                        .add(senderoHieloAzul[55])
                        .add(senderoHieloAzul[56])
                        .add(senderoHieloAzul[57])
                        .add(senderoHieloAzul[58])
                        .add(senderoHieloAzul[59])
                        .add(senderoHieloAzul[60])
                        .add(senderoHieloAzul[61])
                        .add(senderoHieloAzul[62])
                        .add(senderoHieloAzul[63])
                        .add(senderoHieloAzul[64])
                        .add(senderoHieloAzul[65])
                        .add(senderoHieloAzul[66])
                        .add(senderoHieloAzul[67])
                        .add(senderoHieloAzul[68])
                        .add(senderoHieloAzul[69])
                        .add(senderoHieloAzul[70])
                        .add(senderoHieloAzul[71])
                        .add(senderoHieloAzul[72])
                        .add(senderoHieloAzul[73])
                        .add(senderoHieloAzul[74])
                        .add(senderoHieloAzul[75])
                        .add(senderoHieloAzul[76])
                        .add(senderoHieloAzul[77])
                        .add(senderoHieloAzul[78])
                        .add(senderoHieloAzul[79])
                        .add(senderoHieloAzul[80])
                        .add(senderoHieloAzul[81])
                        .add(senderoHieloAzul[82])
                        .add(senderoHieloAzul[83])
                        .add(senderoHieloAzul[84])
                        .add(senderoHieloAzul[85])
                        .add(senderoHieloAzul[86])
                        .add(senderoHieloAzul[87])
                        .add(senderoHieloAzul[88])
                        .add(senderoHieloAzul[89])
                        .add(senderoHieloAzul[90])
                        .add(senderoHieloAzul[91])
                        .add(senderoHieloAzul[92])
                        .add(senderoHieloAzul[93])
                        .add(senderoHieloAzul[94])
                        .add(senderoHieloAzul[95])
                        .add(senderoHieloAzul[96])
                        .add(senderoHieloAzul[97])
                        .add(senderoHieloAzul[98])
                        .add(senderoHieloAzul[99])
                        .add(senderoHieloAzul[100])
                        .add(senderoHieloAzul[101])
                        .add(senderoHieloAzul[102])
                        .add(senderoHieloAzul[103])
                        .add(senderoHieloAzul[104])
                        .add(senderoHieloAzul[105])
                        .add(senderoHieloAzul[106])
                        .add(senderoHieloAzul[107])
                        .add(senderoHieloAzul[108])
                        .add(senderoHieloAzul[109])
                        .add(senderoHieloAzul[110])
                        .add(senderoHieloAzul[111])
                        .add(senderoHieloAzul[112])
                        .add(senderoHieloAzul[113])
                        .add(senderoHieloAzul[114])
                        .add(senderoHieloAzul[115])
                        .add(senderoHieloAzul[116])
                        .add(senderoHieloAzul[117])
                        .add(senderoHieloAzul[118])
                        .add(senderoHieloAzul[119])
                        .add(senderoHieloAzul[120])
                        .add(senderoHieloAzul[121])
                        .add(senderoHieloAzul[122])
                        .add(senderoHieloAzul[123])
                        .add(senderoHieloAzul[124])
                        .add(senderoHieloAzul[125])
                        .add(senderoHieloAzul[126])
                        .add(senderoHieloAzul[127])
                        .add(senderoHieloAzul[128])
                        .add(senderoHieloAzul[129])
                        .add(senderoHieloAzul[130])
                        .add(senderoHieloAzul[131])
                        .add(senderoHieloAzul[132])
                        .add(senderoHieloAzul[133])
                        .add(senderoHieloAzul[134])
                        .add(senderoHieloAzul[135])
                        .add(senderoHieloAzul[136])
                        .add(senderoHieloAzul[137])
                        .add(senderoHieloAzul[138])
                        .add(senderoHieloAzul[139])
                        .add(senderoHieloAzul[140])
                        .add(senderoHieloAzul[141])
                        .add(senderoHieloAzul[142])
                        .add(senderoHieloAzul[143])
                        .add(senderoHieloAzul[144])
                        .add(senderoHieloAzul[145])
                        .add(senderoHieloAzul[146])
                        .add(senderoHieloAzul[147])
                        .add(senderoHieloAzul[148])
                        .add(senderoHieloAzul[149])
                        .add(senderoHieloAzul[150])
                        .add(senderoHieloAzul[151])
                        .add(senderoHieloAzul[152])
                        .add(senderoHieloAzul[153])
                        .add(senderoHieloAzul[154])
                        .add(senderoHieloAzul[155])
                        .add(senderoHieloAzul[156])
                        .add(senderoHieloAzul[157])
                        .add(senderoHieloAzul[158])
                        .add(senderoHieloAzul[159])
                        .add(senderoHieloAzul[160])
                        .add(senderoHieloAzul[161])
                        .add(senderoHieloAzul[162])
                        .add(senderoHieloAzul[163])
                        .add(senderoHieloAzul[164])
                        .add(senderoHieloAzul[165])
                        .add(senderoHieloAzul[166])
                        .add(senderoHieloAzul[167])
                        .add(senderoHieloAzul[168])
                        .add(senderoHieloAzul[169])
                        .add(senderoHieloAzul[170])
                        .add(senderoHieloAzul[171])
                        .add(senderoHieloAzul[172])
                        .add(senderoHieloAzul[173])
                        .add(senderoHieloAzul[174])
                        .add(senderoHieloAzul[175])
                        .add(senderoHieloAzul[176])
                        .add(senderoHieloAzul[177])
                        .add(senderoHieloAzul[178])
                        .add(senderoHieloAzul[179])
                        .add(senderoHieloAzul[180])
                        .add(senderoHieloAzul[181])
                        .add(senderoHieloAzul[182])
                        .add(senderoHieloAzul[183])
                        .add(senderoHieloAzul[184])
                        .add(senderoHieloAzul[185])
                        .add(senderoHieloAzul[186])
                        .add(senderoHieloAzul[187])
                        .add(senderoHieloAzul[188])
                        .add(senderoHieloAzul[189])
                        .add(senderoHieloAzul[190])
                        .add(refugioHieloAzul)
                        .width(4f)
                        .color(Color.MAGENTA)
        );

        mMap.addPolyline(
                new PolylineOptions()
                        .add(	senderoNatacion[	0	])
                        .add(	senderoNatacion[	1	])
                        .add(	senderoNatacion[	2	])
                        .add(	senderoNatacion[	3	])
                        .add(	senderoNatacion[	4	])
                        .add(	senderoNatacion[	5	])
                        .add(	senderoNatacion[	6	])
                        .add(	senderoNatacion[	7	])
                        .add(	senderoNatacion[	8	])
                        .add(	senderoNatacion[	9	])
                        .add(	senderoNatacion[	10	])
                        .add(	senderoNatacion[	11	])
                        .add(	senderoNatacion[	12	])
                        .add(	senderoNatacion[	13	])
                        .add(	senderoNatacion[	14	])
                        .add(	senderoNatacion[	15	])
                        .add(	senderoNatacion[	16	])
                        .add(	senderoNatacion[	17	])
                        .add(	senderoNatacion[	18	])
                        .add(	senderoNatacion[	19	])
                        .add(	senderoNatacion[	20	])
                        .add(	senderoNatacion[	21	])
                        .add(	senderoNatacion[	22	])
                        .add(	senderoNatacion[	23	])
                        .add(	senderoNatacion[	24	])
                        .add(	senderoNatacion[	25	])
                        .add(	senderoNatacion[	26	])
                        .add(	senderoNatacion[	27	])
                        .add(	senderoNatacion[	28	])
                        .add(	senderoNatacion[	29	])
                        .add(	senderoNatacion[	30	])
                        .add(	senderoNatacion[	31	])
                        .add(	senderoNatacion[	32	])
                        .add(	senderoNatacion[	33	])
                        .add(	senderoNatacion[	34	])
                        .add(	senderoNatacion[	35	])
                        .add(	senderoNatacion[	36	])
                        .add(	senderoNatacion[	37	])
                        .add(	senderoNatacion[	38	])
                        .add(	senderoNatacion[	39	])
                        .add(	senderoNatacion[	40	])
                        .add(	senderoNatacion[	41	])
                        .add(	senderoNatacion[	42	])
                        .add(	senderoNatacion[	43	])
                        .add(	senderoNatacion[	44	])
                        .add(	senderoNatacion[	45	])
                        .add(	senderoNatacion[	46	])
                        .add(	senderoNatacion[	47	])
                        .add(	senderoNatacion[	48	])
                        .add(	senderoNatacion[	49	])
                        .add(	senderoNatacion[	50	])
                        .add(	senderoNatacion[	51	])
                        .add(	senderoNatacion[	52	])
                        .add(	senderoNatacion[	53	])
                        .add(	senderoNatacion[	54	])
                        .add(	senderoNatacion[	55	])
                        .add(	senderoNatacion[	56	])
                        .add(	senderoNatacion[	57	])
                        .add(	senderoNatacion[	58	])
                        .add(	senderoNatacion[	59	])
                        .add(	senderoNatacion[	60	])
                        .add(	senderoNatacion[	61	])
                        .add(	senderoNatacion[	62	])
                        .add(	senderoNatacion[	63	])
                        .add(	senderoNatacion[	64	])
                        .add(	senderoNatacion[	65	])
                        .add(	senderoNatacion[	66	])
                        .add(	senderoNatacion[	67	])
                        .add(	senderoNatacion[	68	])
                        .add(	senderoNatacion[	69	])
                        .add(	senderoNatacion[	70	])
                        .add(	senderoNatacion[	71	])
                        .add(	senderoNatacion[	72	])
                        .add(	senderoNatacion[	73	])
                        .add(	senderoNatacion[	74	])
                        .add(	senderoNatacion[	75	])
                        .add(	senderoNatacion[	76	])
                        .add(	senderoNatacion[	77	])
                        .add(	senderoNatacion[	78	])
                        .add(	senderoNatacion[	79	])
                        .add(	senderoNatacion[	80	])
                        .add(	senderoNatacion[	81	])
                        .add(	senderoNatacion[	82	])
                        .add(	senderoNatacion[	83	])
                        .add(	senderoNatacion[	84	])
                        .add(	senderoNatacion[	85	])
                        .add(	senderoNatacion[	86	])
                        .add(	senderoNatacion[	87	])
                        .add(	senderoNatacion[	88	])
                        .add(	senderoNatacion[	89	])
                        .add(	senderoNatacion[	90	])
                        .add(	senderoNatacion[	91	])
                        .add(	senderoNatacion[	92	])
                        .add(	senderoNatacion[	93	])
                        .add(	senderoNatacion[	94	])
                        .add(	senderoNatacion[	95	])
                        .add(	senderoNatacion[	96	])
                        .add(	senderoNatacion[	97	])
                        .add(	senderoNatacion[	98	])
                        .add(	senderoNatacion[	99	])
                        .add(	senderoNatacion[	100	])
                        .add(	senderoNatacion[	101	])
                        .add(	senderoNatacion[	102	])
                        .add(	senderoNatacion[	103	])
                        .add(	senderoNatacion[	104	])
                        .add(	senderoNatacion[	105	])
                        .add(	senderoNatacion[	106	])
                        .add(	senderoNatacion[	107	])
                        .add(	senderoNatacion[	108	])
                        .add(	senderoNatacion[	109	])
                        .add(	senderoNatacion[	110	])
                        .add(	senderoNatacion[	111	])
                        .add(	senderoNatacion[	112	])
                        .add(	senderoNatacion[	113	])
                        .add(	senderoNatacion[	114	])
                        .add(	senderoNatacion[	115	])
                        .add(	senderoNatacion[	116	])
                        .add(	senderoNatacion[	117	])
                        .add(	senderoNatacion[	118	])
                        .add(	senderoNatacion[	119	])
                        .add(	senderoNatacion[	120	])
                        .add(	senderoNatacion[	121	])
                        .add(	senderoNatacion[	122	])
                        .add(	senderoNatacion[	123	])
                        .add(	senderoNatacion[	124	])
                        .add(	senderoNatacion[	125	])
                        .add(	senderoNatacion[	126	])
                        .add(	senderoNatacion[	127	])
                        .add(	senderoNatacion[	128	])
                        .add(	senderoNatacion[	129	])
                        .add(	senderoNatacion[	130	])
                        .add(	senderoNatacion[	131	])
                        .add(	senderoNatacion[	132	])
                        .add(	senderoNatacion[	133	])
                        .add(	senderoNatacion[	134	])
                        .add(	senderoNatacion[	135	])
                        .add(	senderoNatacion[	136	])
                        .add(	senderoNatacion[	137	])
                        .add(	senderoNatacion[	138	])
                        .add(	senderoNatacion[	139	])
                        .add(	senderoNatacion[	140	])
                        .add(	senderoNatacion[	141	])
                        .add(	senderoNatacion[	142	])
                        .add(	senderoNatacion[	143	])
                        .add(	senderoNatacion[	144	])
                        .add(	senderoNatacion[	145	])
                        .add(	senderoNatacion[	146	])
                        .add(	senderoNatacion[	147	])
                        .add(	senderoNatacion[	148	])
                        .add(	senderoNatacion[	149	])
                        .add(	senderoNatacion[	150	])
                        .add(	senderoNatacion[	151	])
                        .add(	senderoNatacion[	152	])
                        .add(	senderoNatacion[	153	])
                        .add(	senderoNatacion[	154	])
                        .add(	senderoNatacion[	155	])
                        .add(refugioNatacion)
                        .width(4f)
                        .color(Color.RED)
        );



        mMap.addPolyline(
                new PolylineOptions()
                        .add(refugioHieloAzul)
                        .add(senderoHieloAzulWharton[36])
                        .add(senderoHieloAzulWharton[37])
                        .add(senderoHieloAzulWharton[38])
                        .add(senderoHieloAzulWharton[39])
                        .add(senderoHieloAzulWharton[40])
                        .add(senderoHieloAzulWharton[41])
                        .add(senderoHieloAzulWharton[42])
                        .add(senderoHieloAzulWharton[43])
                        .add(senderoHieloAzulWharton[44])
                        .add(senderoHieloAzulWharton[45])
                        .add(senderoHieloAzulWharton[46])
                        .add(senderoHieloAzulWharton[47])
                        .add(senderoHieloAzulWharton[48])
                        .add(senderoHieloAzulWharton[49])
                        .add(senderoHieloAzulWharton[50])
                        .add(senderoHieloAzulWharton[51])
                        .add(senderoHieloAzulWharton[52])
                        .add(senderoHieloAzulWharton[53])
                        .add(senderoHieloAzulWharton[54])
                        .add(senderoHieloAzulWharton[55])
                        .add(senderoHieloAzulWharton[56])
                        .add(senderoHieloAzulWharton[57])
                        .add(senderoHieloAzulWharton[58])
                        .add(senderoHieloAzulWharton[59])
                        .add(senderoHieloAzulWharton[60])
                        .add(senderoHieloAzulWharton[61])
                        .add(senderoHieloAzulWharton[62])
                        .add(senderoHieloAzulWharton[63])
                        .add(senderoHieloAzulWharton[64])
                        .add(senderoHieloAzulWharton[65])
                        .add(senderoHieloAzulWharton[66])
                        .add(senderoHieloAzulWharton[67])
                        .add(senderoHieloAzulWharton[68])
                        .add(senderoHieloAzulWharton[69])
                        .add(senderoHieloAzulWharton[70])
                        .add(senderoHieloAzulWharton[71])
                        .add(senderoHieloAzulWharton[72])
                        .add(senderoHieloAzulWharton[73])
                        .add(senderoHieloAzulWharton[74])
                        .add(senderoHieloAzulWharton[75])
                        .add(senderoHieloAzulWharton[76])
                        .add(senderoHieloAzulWharton[77])
                        .add(senderoHieloAzulWharton[78])
                        .add(senderoHieloAzulWharton[79])
                        .add(senderoHieloAzulWharton[80])
                        .add(senderoHieloAzulWharton[81])
                        .add(senderoHieloAzulWharton[82])
                        .add(senderoHieloAzulWharton[83])
                        .add(senderoHieloAzulWharton[84])
                        .add(senderoHieloAzulWharton[85])
                        .add(senderoHieloAzulWharton[86])
                        .add(senderoHieloAzulWharton[87])
                        .add(senderoHieloAzulWharton[88])
                        .add(senderoHieloAzulWharton[89])
                        .add(senderoHieloAzulWharton[90])
                        .add(senderoHieloAzulWharton[91])
                        .add(senderoHieloAzulWharton[92])
                        .add(senderoHieloAzulWharton[93])
                        .add(senderoHieloAzulWharton[94])
                        .add(senderoHieloAzulWharton[95])
                        .add(senderoHieloAzulWharton[96])
                        .add(senderoHieloAzulWharton[97])
                        .add(senderoHieloAzulWharton[98])
                        .add(senderoHieloAzulWharton[99])
                        .add(senderoHieloAzulWharton[100])
                        .add(senderoHieloAzulWharton[101])
                        .add(senderoHieloAzulWharton[102])
                        .add(senderoHieloAzulWharton[103])
                        .add(senderoHieloAzulWharton[104])
                        .add(senderoHieloAzulWharton[105])
                        .add(senderoHieloAzulWharton[106])
                        .add(senderoHieloAzulWharton[107])
                        .add(senderoHieloAzulWharton[108])
                        .add(senderoHieloAzulWharton[109])
                        .add(senderoHieloAzulWharton[110])
                        .add(senderoHieloAzulWharton[111])
                        .add(senderoHieloAzulWharton[112])
                        .add(senderoHieloAzulWharton[113])
                        .add(senderoHieloAzulWharton[114])
                        .add(senderoHieloAzulWharton[115])
                        .add(senderoHieloAzulWharton[116])
                        .add(senderoHieloAzulWharton[117])
                        .add(senderoHieloAzulWharton[118])
                        .add(senderoHieloAzulWharton[119])
                        .add(senderoHieloAzulWharton[120])
                        .add(senderoHieloAzulWharton[121])
                        .add(senderoHieloAzulWharton[122])
                        .add(senderoHieloAzulWharton[123])
                        .add(senderoHieloAzulWharton[124])
                        .add(senderoHieloAzulWharton[125])
                        .add(senderoHieloAzulWharton[126])
                        .add(senderoHieloAzulWharton[127])
                        .add(senderoHieloAzulWharton[128])
                        .add(senderoHieloAzulWharton[129])
                        .add(senderoHieloAzulWharton[130])
                        .add(senderoHieloAzulWharton[131])
                        .add(senderoHieloAzulWharton[132])
                        .add(senderoHieloAzulWharton[133])
                        .add(senderoHieloAzulWharton[134])
                        .add(senderoHieloAzulWharton[135])
                        .add(senderoHieloAzulWharton[136])
                        .add(senderoHieloAzulWharton[137])
                        .add(senderoHieloAzulWharton[138])
                        .add(senderoHieloAzulWharton[139])
                        .add(senderoHieloAzulWharton[140])
                        .add(senderoHieloAzulWharton[141])
                        .add(senderoHieloAzulWharton[142])
                        .add(senderoHieloAzulWharton[143])
                        .add(senderoHieloAzulWharton[144])
                        .add(senderoHieloAzulWharton[145])
                        .add(senderoHieloAzulWharton[146])
                        .add(senderoHieloAzulWharton[147])
                        .add(senderoHieloAzulWharton[148])
                        .add(senderoHieloAzulWharton[149])
                        .add(senderoHieloAzulWharton[150])
                        .add(senderoHieloAzulWharton[151])
                        .add(senderoHieloAzulWharton[152])
                        .add(senderoHieloAzulWharton[153])
                        .add(senderoHieloAzulWharton[154])
                        .add(senderoHieloAzulWharton[155])
                        .add(senderoHieloAzulWharton[156])
                        .add(senderoHieloAzulWharton[157])
                        .add(senderoHieloAzulWharton[158])
                        .add(senderoHieloAzulWharton[159])
                        .add(senderoHieloAzulWharton[160])
                        .add(senderoHieloAzulWharton[161])
                        .add(senderoHieloAzulWharton[162])
                        .add(senderoHieloAzulWharton[163])
                        .add(senderoHieloAzulWharton[164])
                        .add(senderoHieloAzulWharton[165])
                        .add(senderoHieloAzulWharton[166])
                        .add(senderoHieloAzulWharton[167])
                        .add(senderoHieloAzulWharton[168])
                        .add(senderoHieloAzulWharton[169])
                        .add(senderoHieloAzulWharton[170])
                        .add(senderoHieloAzulWharton[171])
                        .add(senderoHieloAzulWharton[172])
                        .add(senderoHieloAzulWharton[173])
                        .add(senderoHieloAzulWharton[174])
                        .add(senderoHieloAzulWharton[175])
                        .add(senderoHieloAzulWharton[176])
                        .add(senderoHieloAzulWharton[177])
                        .add(senderoHieloAzulWharton[178])
                        .add(senderoHieloAzulWharton[179])
                        .add(senderoHieloAzulWharton[180])
                        .add(senderoHieloAzulWharton[181])
                        .add(senderoHieloAzulWharton[182])
                        .add(senderoHieloAzulWharton[183])
                        .add(senderoHieloAzulWharton[184])
                        .add(senderoHieloAzulWharton[185])
                        .add(senderoHieloAzulWharton[186])
                        .add(senderoHieloAzulWharton[187])
                        .add(senderoHieloAzulWharton[188])
                        .add(senderoHieloAzulWharton[189])
                        .add(senderoHieloAzulWharton[190])
                        .add(senderoHieloAzulWharton[191])
                        .add(senderoHieloAzulWharton[192])
                        .add(senderoHieloAzulWharton[193])
                        .add(senderoHieloAzulWharton[194])
                        .add(senderoHieloAzulWharton[195])
                        .add(senderoHieloAzulWharton[196])
                        .add(senderoHieloAzulWharton[197])
                        .add(senderoHieloAzulWharton[198])
                        .add(senderoHieloAzulWharton[199])
                        .add(senderoHieloAzulWharton[200])
                        .add(senderoHieloAzulWharton[201])
                        .add(senderoHieloAzulWharton[202])
                        .add(senderoHieloAzulWharton[203])
                        .add(senderoHieloAzulWharton[204])
                        .add(senderoHieloAzulWharton[205])
                        .add(senderoHieloAzulWharton[206])
                        .add(senderoHieloAzulWharton[207])
                        .add(senderoHieloAzulWharton[208])
                        .add(senderoHieloAzulWharton[209])
                        .add(senderoHieloAzulWharton[210])
                        .add(senderoHieloAzulWharton[211])
                        .add(senderoHieloAzulWharton[212])
                        .add(senderoHieloAzulWharton[213])
                        .add(senderoHieloAzulWharton[214])
                        .add(senderoHieloAzulWharton[215])
                        .add(senderoHieloAzulWharton[216])
                        .add(senderoHieloAzulWharton[217])
                        .add(senderoHieloAzulWharton[218])
                        .add(senderoHieloAzulWharton[219])
                        .add(senderoHieloAzulWharton[220])
                        .add(senderoHieloAzulWharton[221])
                        .add(senderoHieloAzulWharton[222])
                        .add(senderoHieloAzulWharton[223])
                        .add(senderoHieloAzulWharton[224])
                        .add(senderoHieloAzulWharton[225])
                        .add(senderoHieloAzulWharton[226])
                        .add(senderoHieloAzulWharton[227])
                        .add(senderoHieloAzulWharton[228])
                        .add(senderoHieloAzulWharton[229])
                        .add(senderoHieloAzulWharton[230])
                        .add(senderoHieloAzulWharton[231])
                        .add(senderoHieloAzulWharton[232])
                        .add(senderoHieloAzulWharton[233])
                        .add(senderoHieloAzulWharton[234])
                        .add(senderoHieloAzulWharton[235])
                        .add(senderoHieloAzulWharton[236])
                        .add(senderoHieloAzulWharton[237])
                        .add(senderoHieloAzulWharton[238])
                        .add(senderoHieloAzulWharton[239])
                        .add(senderoHieloAzulWharton[240])
                        .add(senderoHieloAzulWharton[241])
                        .add(senderoHieloAzulWharton[242])
                        .add(senderoHieloAzulWharton[243])
                        .add(senderoHieloAzulWharton[244])
                        .add(senderoHieloAzulWharton[245])
                        .add(senderoHieloAzulWharton[246])
                        .add(senderoHieloAzulWharton[247])
                        .add(senderoHieloAzulWharton[248])
                        .add(senderoHieloAzulWharton[249])
                        .add(senderoHieloAzulWharton[250])
                        .add(senderoHieloAzulWharton[251])
                        .add(senderoHieloAzulWharton[252])
                        .add(senderoHieloAzulWharton[253])
                        .add(senderoHieloAzulWharton[254])
                        .add(senderoHieloAzulWharton[255])
                        .add(senderoHieloAzulWharton[256])
                        .add(senderoHieloAzulWharton[257])
                        .add(senderoHieloAzulWharton[258])
                        .add(senderoHieloAzulWharton[259])
                        .add(senderoHieloAzulWharton[260])
                        .add(senderoHieloAzulWharton[261])
                        .add(senderoHieloAzulWharton[262])
                        .add(senderoHieloAzulWharton[263])
                        .add(senderoHieloAzulWharton[264])
                        .add(senderoHieloAzulWharton[265])
                        .add(senderoHieloAzulWharton[266])
                        .add(senderoHieloAzulWharton[267])
                        .add(senderoHieloAzulWharton[268])
                        .add(senderoHieloAzulWharton[269])
                        .add(senderoHieloAzulWharton[270])
                        .add(senderoHieloAzulWharton[271])
                        .add(senderoHieloAzulWharton[272])
                        .add(senderoHieloAzulWharton[273])
                        .add(senderoHieloAzulWharton[274])
                        .add(senderoHieloAzulWharton[275])
                        .add(senderoHieloAzulWharton[276])
                        .add(senderoHieloAzulWharton[277])
                        .add(senderoHieloAzulWharton[278])
                        .add(senderoHieloAzulWharton[279])
                        .add(senderoHieloAzulWharton[280])
                        .add(senderoHieloAzulWharton[281])
                        .add(senderoHieloAzulWharton[282])
                        .add(senderoHieloAzulWharton[283])
                        .add(senderoHieloAzulWharton[284])
                        .add(senderoHieloAzulWharton[285])
                        .add(senderoHieloAzulWharton[286])
                        .add(senderoHieloAzulWharton[287])
                        .add(senderoHieloAzulWharton[288])
                        .add(senderoHieloAzulWharton[289])
                        .add(senderoHieloAzulWharton[290])
                        .add(senderoHieloAzulWharton[291])
                        .add(senderoHieloAzulWharton[292])
                        .add(senderoHieloAzulWharton[293])
                        .add(senderoHieloAzulWharton[294])
                        .add(senderoHieloAzulWharton[295])
                        .add(senderoHieloAzulWharton[296])
                        .add(senderoHieloAzulWharton[297])
                        .add(senderoHieloAzulWharton[298])
                        .add(senderoHieloAzulWharton[299])
                        .add(senderoHieloAzulWharton[300])
                        .add(senderoHieloAzulWharton[301])
                        .add(senderoHieloAzulWharton[302])
                        .add(senderoHieloAzulWharton[303])
                        .add(senderoHieloAzulWharton[304])
                        .add(senderoHieloAzulWharton[305])
                        .add(senderoHieloAzulWharton[306])
                        .add(senderoHieloAzulWharton[307])
                        .add(senderoHieloAzulWharton[308])
                        .add(senderoHieloAzulWharton[309])
                        .add(senderoHieloAzulWharton[310])
                        .add(senderoHieloAzulWharton[311])
                        .width(4f)
                        .color(Color.YELLOW)
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

