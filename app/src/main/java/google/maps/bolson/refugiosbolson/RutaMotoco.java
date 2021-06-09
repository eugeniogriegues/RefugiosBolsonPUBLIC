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

public class RutaMotoco extends FragmentActivity implements OnMapReadyCallback {

    private static final int MY_PERMISSION_REQUEST_ACCES_FINE_LOCATION = 1;
    private static final int MY_PERMISSION_REQUEST_ACCES_COARSE_LOCATION = 1;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta_motoco);
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

        LatLng refugioElMotoco = new LatLng(-41.9755863, -71.7074301);
        mMap.addMarker(new MarkerOptions().position(refugioElMotoco).title("Ref. MOTOCO").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));
        LatLng rocaDelTiempo = new LatLng(-41.989515, -71.736000);
        mMap.addMarker(new MarkerOptions().position(rocaDelTiempo).title("CUMBRE ROCA DEL TIEMPO").icon(BitmapDescriptorFactory.fromResource(R.drawable.cima)));
        LatLng lagoMotoco = new LatLng(-41.973973, -71.773606);
        mMap.addMarker(new MarkerOptions().position(lagoMotoco).title("LAGO").icon(BitmapDescriptorFactory.fromResource(R.drawable.lago)));
        LatLng pasarelaPuelo = new LatLng(-42.040626, -71.605541);
        mMap.addMarker(new MarkerOptions().position(pasarelaPuelo).title("PASARELA DEL RIO AZUL - LAGO PUELO").snippet("INICIO DE RUTA AL REFUGIO MOTOCO").icon(BitmapDescriptorFactory.fromResource(R.drawable.interes)));
        LatLng elBolson = new LatLng(-41.9667, -71.5333);
        mMap.addMarker(new MarkerOptions().position(elBolson).title("EL BOLSÓN").icon(BitmapDescriptorFactory.fromResource(R.drawable.interess)));

        LatLng senderoMotoco[] = new LatLng[256];
        {
            senderoMotoco[0] = new LatLng(-42.040591, -71.605927);
            senderoMotoco[1] = new LatLng(-42.04069, -71.605604);
            senderoMotoco[2] = new LatLng(-42.040548, -71.607686);
            senderoMotoco[3] = new LatLng(-42.040059, -71.608302);
            senderoMotoco[4] = new LatLng(-42.039167, -71.608722);
            senderoMotoco[5] = new LatLng(-42.039117, -71.609749);
            senderoMotoco[6] = new LatLng(-42.039503, -71.610575);
            senderoMotoco[7] = new LatLng(-42.039317, -71.610769);
            senderoMotoco[8] = new LatLng(-42.039276, -71.611372);
            senderoMotoco[9] = new LatLng(-42.03897, -71.612048);
            senderoMotoco[10] = new LatLng(-42.039187, -71.612302);
            senderoMotoco[11] = new LatLng(-42.039141, -71.612691);
            senderoMotoco[12] = new LatLng(-42.040081, -71.612993);
            senderoMotoco[13] = new LatLng(-42.040323, -71.613667);
            senderoMotoco[14] = new LatLng(-42.04053, -71.613856);
            senderoMotoco[15] = new LatLng(-42.040366, -71.614035);
            senderoMotoco[16] = new LatLng(-42.040512, -71.614124);
            senderoMotoco[17] = new LatLng(-42.040576, -71.614455);
            senderoMotoco[18] = new LatLng(-42.041438, -71.613745);
            senderoMotoco[19] = new LatLng(-42.041705, -71.613889);
            senderoMotoco[20] = new LatLng(-42.041461, -71.613774);
            senderoMotoco[21] = new LatLng(-42.040654, -71.61439);
            senderoMotoco[22] = new LatLng(-42.040401, -71.613856);
            senderoMotoco[23] = new LatLng(-42.040372, -71.614051);
            senderoMotoco[24] = new LatLng(-42.040632, -71.614331);
            senderoMotoco[25] = new LatLng(-42.040316, -71.614853);
            senderoMotoco[26] = new LatLng(-42.040163, -71.6155);
            senderoMotoco[27] = new LatLng(-42.039956, -71.615525);
            senderoMotoco[28] = new LatLng(-42.039877, -71.615745);
            senderoMotoco[29] = new LatLng(-42.039672, -71.615782);
            senderoMotoco[30] = new LatLng(-42.039406, -71.616124);
            senderoMotoco[31] = new LatLng(-42.039227, -71.616105);
            senderoMotoco[32] = new LatLng(-42.038567, -71.616556);
            senderoMotoco[33] = new LatLng(-42.038463, -71.616789);
            senderoMotoco[34] = new LatLng(-42.038121, -71.616804);
            senderoMotoco[35] = new LatLng(-42.037934, -71.616963);
            senderoMotoco[36] = new LatLng(-42.036859, -71.619041);
            senderoMotoco[37] = new LatLng(-42.036414, -71.618903);
            senderoMotoco[38] = new LatLng(-42.036382, -71.618782);
            senderoMotoco[39] = new LatLng(-42.034023, -71.619843);
            senderoMotoco[40] = new LatLng(-42.033307, -71.619551);
            senderoMotoco[41] = new LatLng(-42.03285, -71.62007);
            senderoMotoco[42] = new LatLng(-42.031733, -71.620681);
            senderoMotoco[43] = new LatLng(-42.031775, -71.620944);
            senderoMotoco[44] = new LatLng(-42.031182, -71.621416);
            senderoMotoco[45] = new LatLng(-42.030978, -71.621113);
            senderoMotoco[46] = new LatLng(-42.030849, -71.621474);
            senderoMotoco[47] = new LatLng(-42.030691, -71.621474);
            senderoMotoco[48] = new LatLng(-42.030517, -71.62104);
            senderoMotoco[49] = new LatLng(-42.03023, -71.621321);
            senderoMotoco[50] = new LatLng(-42.030065, -71.622687);
            senderoMotoco[51] = new LatLng(-42.029468, -71.622871);
            senderoMotoco[52] = new LatLng(-42.029149, -71.623441);
            senderoMotoco[53] = new LatLng(-42.028798, -71.623748);
            senderoMotoco[54] = new LatLng(-42.028053, -71.623954);
            senderoMotoco[55] = new LatLng(-42.02755, -71.624696);
            senderoMotoco[56] = new LatLng(-42.02721, -71.624695);
            senderoMotoco[57] = new LatLng(-42.027043, -71.624926);
            senderoMotoco[58] = new LatLng(-42.026234, -71.625281);
            senderoMotoco[59] = new LatLng(-42.025709, -71.625858);
            senderoMotoco[60] = new LatLng(-42.02557, -71.625854);
            senderoMotoco[61] = new LatLng(-42.025046, -71.626632);
            senderoMotoco[62] = new LatLng(-42.024372, -71.627111);
            senderoMotoco[63] = new LatLng(-42.024325, -71.627387);
            senderoMotoco[64] = new LatLng(-42.023592, -71.627965);
            senderoMotoco[65] = new LatLng(-42.023355, -71.628406);
            senderoMotoco[66] = new LatLng(-42.022829, -71.628591);
            senderoMotoco[67] = new LatLng(-42.022669, -71.629007);
            senderoMotoco[68] = new LatLng(-42.02373, -71.629324);
            senderoMotoco[69] = new LatLng(-42.02336, -71.629791);
            senderoMotoco[70] = new LatLng(-42.023175, -71.629725);
            senderoMotoco[71] = new LatLng(-42.02327, -71.629888);
            senderoMotoco[72] = new LatLng(-42.02307, -71.630083);
            senderoMotoco[73] = new LatLng(-42.023018, -71.631004);
            senderoMotoco[74] = new LatLng(-42.022702, -71.631322);
            senderoMotoco[75] = new LatLng(-42.022297, -71.632484);
            senderoMotoco[76] = new LatLng(-42.022308, -71.634339);
            senderoMotoco[77] = new LatLng(-42.022176, -71.634616);
            senderoMotoco[78] = new LatLng(-42.022396, -71.635656);
            senderoMotoco[79] = new LatLng(-42.022129, -71.635647);
            senderoMotoco[80] = new LatLng(-42.022233, -71.636743);
            senderoMotoco[81] = new LatLng(-42.022049, -71.636983);
            senderoMotoco[82] = new LatLng(-42.022122, -71.637388);
            senderoMotoco[83] = new LatLng(-42.021954, -71.637563);
            senderoMotoco[84] = new LatLng(-42.022121, -71.637784);
            senderoMotoco[85] = new LatLng(-42.022031, -71.638645);
            senderoMotoco[86] = new LatLng(-42.022146, -71.639035);
            senderoMotoco[87] = new LatLng(-42.022033, -71.639279);
            senderoMotoco[88] = new LatLng(-42.021889, -71.639273);
            senderoMotoco[89] = new LatLng(-42.021987, -71.639511);
            senderoMotoco[90] = new LatLng(-42.021746, -71.639809);
            senderoMotoco[91] = new LatLng(-42.021758, -71.640321);
            senderoMotoco[92] = new LatLng(-42.021473, -71.640706);
            senderoMotoco[93] = new LatLng(-42.021673, -71.641004);
            senderoMotoco[94] = new LatLng(-42.021671, -71.641306);
            senderoMotoco[95] = new LatLng(-42.020982, -71.641942);
            senderoMotoco[96] = new LatLng(-42.020428, -71.642009);
            senderoMotoco[97] = new LatLng(-42.02051, -71.642578);
            senderoMotoco[98] = new LatLng(-42.020273, -71.642966);
            senderoMotoco[99] = new LatLng(-42.020418, -71.643017);
            senderoMotoco[100] = new LatLng(-42.019694, -71.643748);
            senderoMotoco[101] = new LatLng(-42.019776, -71.644169);
            senderoMotoco[102] = new LatLng(-42.019601, -71.644421);
            senderoMotoco[103] = new LatLng(-42.01911, -71.644511);
            senderoMotoco[104] = new LatLng(-42.019036, -71.644858);
            senderoMotoco[105] = new LatLng(-42.019225, -71.645289);
            senderoMotoco[106] = new LatLng(-42.018893, -71.646187);
            senderoMotoco[107] = new LatLng(-42.018932, -71.646514);
            senderoMotoco[108] = new LatLng(-42.018677, -71.646795);
            senderoMotoco[109] = new LatLng(-42.018798, -71.64709);
            senderoMotoco[110] = new LatLng(-42.018512, -71.647235);
            senderoMotoco[111] = new LatLng(-42.018239, -71.647841);
            senderoMotoco[112] = new LatLng(-42.017993, -71.647989);
            senderoMotoco[113] = new LatLng(-42.017932, -71.648366);
            senderoMotoco[114] = new LatLng(-42.017549, -71.648541);
            senderoMotoco[115] = new LatLng(-42.017424, -71.649157);
            senderoMotoco[116] = new LatLng(-42.01684, -71.649694);
            senderoMotoco[117] = new LatLng(-42.016727, -71.649618);
            senderoMotoco[118] = new LatLng(-42.016744, -71.649781);
            senderoMotoco[119] = new LatLng(-42.016239, -71.649579);
            senderoMotoco[120] = new LatLng(-42.016398, -71.649253);
            senderoMotoco[121] = new LatLng(-42.016201, -71.649087);
            senderoMotoco[122] = new LatLng(-42.015961, -71.649111);
            senderoMotoco[123] = new LatLng(-42.015619, -71.64946);
            senderoMotoco[124] = new LatLng(-42.015134, -71.649246);
            senderoMotoco[125] = new LatLng(-42.014778, -71.64949);
            senderoMotoco[126] = new LatLng(-42.014573, -71.650067);
            senderoMotoco[127] = new LatLng(-42.014153, -71.650381);
            senderoMotoco[128] = new LatLng(-42.013651, -71.650459);
            senderoMotoco[129] = new LatLng(-42.013061, -71.650773);
            senderoMotoco[130] = new LatLng(-42.012827, -71.651069);
            senderoMotoco[131] = new LatLng(-42.012666, -71.650955);
            senderoMotoco[132] = new LatLng(-42.01203, -71.651633);
            senderoMotoco[133] = new LatLng(-42.011785, -71.651432);
            senderoMotoco[134] = new LatLng(-42.011339, -71.651856);
            senderoMotoco[135] = new LatLng(-42.010336, -71.652356);
            senderoMotoco[136] = new LatLng(-42.010285, -71.652558);
            senderoMotoco[137] = new LatLng(-42.010077, -71.652616);
            senderoMotoco[138] = new LatLng(-42.009113, -71.653821);
            senderoMotoco[139] = new LatLng(-42.008105, -71.655888);
            senderoMotoco[140] = new LatLng(-42.007729, -71.656334);
            senderoMotoco[141] = new LatLng(-42.007391, -71.656405);
            senderoMotoco[142] = new LatLng(-42.005492, -71.661382);
            senderoMotoco[143] = new LatLng(-42.005027, -71.661938);
            senderoMotoco[144] = new LatLng(-42.004288, -71.662363);
            senderoMotoco[145] = new LatLng(-42.003538, -71.662162);
            senderoMotoco[146] = new LatLng(-42.00278, -71.662367);
            senderoMotoco[147] = new LatLng(-42.002317, -71.662847);
            senderoMotoco[148] = new LatLng(-42.002121, -71.66285);
            senderoMotoco[149] = new LatLng(-42.002155, -71.663193);
            senderoMotoco[150] = new LatLng(-42.002116, -71.662968);
            senderoMotoco[151] = new LatLng(-42.002127, -71.663197);
            senderoMotoco[152] = new LatLng(-42.001837, -71.6631);
            senderoMotoco[153] = new LatLng(-42.001802, -71.66325);
            senderoMotoco[154] = new LatLng(-42.001724, -71.663141);
            senderoMotoco[155] = new LatLng(-42.001308, -71.663621);
            senderoMotoco[156] = new LatLng(-42.000365, -71.663818);
            senderoMotoco[157] = new LatLng(-41.99997, -71.664163);
            senderoMotoco[158] = new LatLng(-41.999621, -71.664235);
            senderoMotoco[159] = new LatLng(-41.999528, -71.664411);
            senderoMotoco[160] = new LatLng(-41.998569, -71.664591);
            senderoMotoco[161] = new LatLng(-41.998232, -71.664871);
            senderoMotoco[162] = new LatLng(-41.998122, -71.665207);
            senderoMotoco[163] = new LatLng(-41.997954, -71.665249);
            senderoMotoco[164] = new LatLng(-41.997909, -71.665633);
            senderoMotoco[165] = new LatLng(-41.997836, -71.665543);
            senderoMotoco[166] = new LatLng(-41.997535, -71.666066);
            senderoMotoco[167] = new LatLng(-41.997305, -71.666122);
            senderoMotoco[168] = new LatLng(-41.997155, -71.666958);
            senderoMotoco[169] = new LatLng(-41.996764, -71.667048);
            senderoMotoco[170] = new LatLng(-41.996281, -71.667543);
            senderoMotoco[171] = new LatLng(-41.99609, -71.668112);
            senderoMotoco[172] = new LatLng(-41.9958, -71.66828);
            senderoMotoco[173] = new LatLng(-41.995539, -71.668702);
            senderoMotoco[174] = new LatLng(-41.995039, -71.668977);
            senderoMotoco[175] = new LatLng(-41.994877, -71.669366);
            senderoMotoco[176] = new LatLng(-41.994555, -71.669499);
            senderoMotoco[177] = new LatLng(-41.994428, -71.670131);
            senderoMotoco[178] = new LatLng(-41.994004, -71.670885);
            senderoMotoco[179] = new LatLng(-41.993984, -71.670765);
            senderoMotoco[180] = new LatLng(-41.993881, -71.671301);
            senderoMotoco[181] = new LatLng(-41.993534, -71.671587);
            senderoMotoco[182] = new LatLng(-41.993234, -71.672296);
            senderoMotoco[183] = new LatLng(-41.993229, -71.674162);
            senderoMotoco[184] = new LatLng(-41.993089, -71.675018);
            senderoMotoco[185] = new LatLng(-41.992155, -71.676041);
            senderoMotoco[186] = new LatLng(-41.992221, -71.676238);
            senderoMotoco[187] = new LatLng(-41.991796, -71.676528);
            senderoMotoco[188] = new LatLng(-41.991554, -71.677119);
            senderoMotoco[189] = new LatLng(-41.991074, -71.677677);
            senderoMotoco[190] = new LatLng(-41.990894, -71.678381);
            senderoMotoco[191] = new LatLng(-41.991001, -71.679568);
            senderoMotoco[192] = new LatLng(-41.990891, -71.680331);
            senderoMotoco[193] = new LatLng(-41.990756, -71.680313);
            senderoMotoco[194] = new LatLng(-41.990404, -71.680912);
            senderoMotoco[195] = new LatLng(-41.990416, -71.681128);
            senderoMotoco[196] = new LatLng(-41.990198, -71.68123);
            senderoMotoco[197] = new LatLng(-41.990134, -71.681452);
            senderoMotoco[198] = new LatLng(-41.989696, -71.681569);
            senderoMotoco[199] = new LatLng(-41.989668, -71.681905);
            senderoMotoco[200] = new LatLng(-41.989356, -71.682215);
            senderoMotoco[201] = new LatLng(-41.989164, -71.682924);
            senderoMotoco[202] = new LatLng(-41.989298, -71.683302);
            senderoMotoco[203] = new LatLng(-41.989236, -71.68384);
            senderoMotoco[204] = new LatLng(-41.98903, -71.684026);
            senderoMotoco[205] = new LatLng(-41.988857, -71.684954);
            senderoMotoco[206] = new LatLng(-41.988663, -71.685245);
            senderoMotoco[207] = new LatLng(-41.987844, -71.685664);
            senderoMotoco[208] = new LatLng(-41.987502, -71.686346);
            senderoMotoco[209] = new LatLng(-41.987098, -71.68652);
            senderoMotoco[210] = new LatLng(-41.986972, -71.686718);
            senderoMotoco[211] = new LatLng(-41.98715, -71.687259);
            senderoMotoco[212] = new LatLng(-41.987025, -71.687574);
            senderoMotoco[213] = new LatLng(-41.986572, -71.687821);
            senderoMotoco[214] = new LatLng(-41.986673, -71.68787);
            senderoMotoco[215] = new LatLng(-41.986529, -71.688249);
            senderoMotoco[216] = new LatLng(-41.986152, -71.688805);
            senderoMotoco[217] = new LatLng(-41.985894, -71.688838);
            senderoMotoco[218] = new LatLng(-41.985655, -71.689241);
            senderoMotoco[219] = new LatLng(-41.985416, -71.689367);
            senderoMotoco[220] = new LatLng(-41.985295, -71.690337);
            senderoMotoco[221] = new LatLng(-41.984999, -71.690666);
            senderoMotoco[222] = new LatLng(-41.984924, -71.691042);
            senderoMotoco[223] = new LatLng(-41.985052, -71.692113);
            senderoMotoco[224] = new LatLng(-41.984466, -71.693299);
            senderoMotoco[225] = new LatLng(-41.983463, -71.694122);
            senderoMotoco[226] = new LatLng(-41.982976, -71.694276);
            senderoMotoco[227] = new LatLng(-41.98226, -71.69478);
            senderoMotoco[228] = new LatLng(-41.982099, -71.694742);
            senderoMotoco[229] = new LatLng(-41.981723, -71.695487);
            senderoMotoco[230] = new LatLng(-41.981134, -71.696019);
            senderoMotoco[231] = new LatLng(-41.980818, -71.697304);
            senderoMotoco[232] = new LatLng(-41.980418, -71.697863);
            senderoMotoco[233] = new LatLng(-41.980208, -71.698758);
            senderoMotoco[234] = new LatLng(-41.979799, -71.699243);
            senderoMotoco[235] = new LatLng(-41.979891, -71.699474);
            senderoMotoco[236] = new LatLng(-41.979789, -71.699256);
            senderoMotoco[237] = new LatLng(-41.979651, -71.69938);
            senderoMotoco[238] = new LatLng(-41.979625, -71.700039);
            senderoMotoco[239] = new LatLng(-41.979491, -71.700104);
            senderoMotoco[240] = new LatLng(-41.979469, -71.700364);
            senderoMotoco[241] = new LatLng(-41.979133, -71.700544);
            senderoMotoco[242] = new LatLng(-41.978953, -71.701212);
            senderoMotoco[243] = new LatLng(-41.978703, -71.70147);
            senderoMotoco[244] = new LatLng(-41.978491, -71.70147);
            senderoMotoco[245] = new LatLng(-41.978211, -71.702112);
            senderoMotoco[246] = new LatLng(-41.977764, -71.702295);
            senderoMotoco[247] = new LatLng(-41.977636, -71.702213);
            senderoMotoco[248] = new LatLng(-41.977507, -71.702361);
            senderoMotoco[249] = new LatLng(-41.977297, -71.703125);
            senderoMotoco[250] = new LatLng(-41.976599, -71.704028);
            senderoMotoco[251] = new LatLng(-41.976636, -71.704358);
            senderoMotoco[252] = new LatLng(-41.975981, -71.705256);
            senderoMotoco[253] = new LatLng(-41.975828, -71.705294);
            senderoMotoco[254] = new LatLng(-41.975648, -71.706161);
            senderoMotoco[255] = new LatLng(-41.975752, -71.706701);


        }


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(refugioElMotoco, 11));

        mMap.getUiSettings().setZoomControlsEnabled(true);


        mMap.addPolyline(
                new PolylineOptions()
                        .add(senderoMotoco[0])
                        .add(senderoMotoco[1])
                        .add(senderoMotoco[2])
                        .add(senderoMotoco[3])
                        .add(senderoMotoco[4])
                        .add(senderoMotoco[5])
                        .add(senderoMotoco[6])
                        .add(senderoMotoco[7])
                        .add(senderoMotoco[8])
                        .add(senderoMotoco[9])
                        .add(senderoMotoco[10])
                        .add(senderoMotoco[11])
                        .add(senderoMotoco[12])
                        .add(senderoMotoco[13])
                        .add(senderoMotoco[14])
                        .add(senderoMotoco[15])
                        .add(senderoMotoco[16])
                        .add(senderoMotoco[17])
                        .add(senderoMotoco[18])
                        .add(senderoMotoco[19])
                        .add(senderoMotoco[20])
                        .add(senderoMotoco[21])
                        .add(senderoMotoco[22])
                        .add(senderoMotoco[23])
                        .add(senderoMotoco[24])
                        .add(senderoMotoco[25])
                        .add(senderoMotoco[26])
                        .add(senderoMotoco[27])
                        .add(senderoMotoco[28])
                        .add(senderoMotoco[29])
                        .add(senderoMotoco[30])
                        .add(senderoMotoco[31])
                        .add(senderoMotoco[32])
                        .add(senderoMotoco[33])
                        .add(senderoMotoco[34])
                        .add(senderoMotoco[35])
                        .add(senderoMotoco[36])
                        .add(senderoMotoco[37])
                        .add(senderoMotoco[38])
                        .add(senderoMotoco[39])
                        .add(senderoMotoco[40])
                        .add(senderoMotoco[41])
                        .add(senderoMotoco[42])
                        .add(senderoMotoco[43])
                        .add(senderoMotoco[44])
                        .add(senderoMotoco[45])
                        .add(senderoMotoco[46])
                        .add(senderoMotoco[47])
                        .add(senderoMotoco[48])
                        .add(senderoMotoco[49])
                        .add(senderoMotoco[50])
                        .add(senderoMotoco[51])
                        .add(senderoMotoco[52])
                        .add(senderoMotoco[53])
                        .add(senderoMotoco[54])
                        .add(senderoMotoco[55])
                        .add(senderoMotoco[56])
                        .add(senderoMotoco[57])
                        .add(senderoMotoco[58])
                        .add(senderoMotoco[59])
                        .add(senderoMotoco[60])
                        .add(senderoMotoco[61])
                        .add(senderoMotoco[62])
                        .add(senderoMotoco[63])
                        .add(senderoMotoco[64])
                        .add(senderoMotoco[65])
                        .add(senderoMotoco[66])
                        .add(senderoMotoco[67])
                        .add(senderoMotoco[68])
                        .add(senderoMotoco[69])
                        .add(senderoMotoco[70])
                        .add(senderoMotoco[71])
                        .add(senderoMotoco[72])
                        .add(senderoMotoco[73])
                        .add(senderoMotoco[74])
                        .add(senderoMotoco[75])
                        .add(senderoMotoco[76])
                        .add(senderoMotoco[77])
                        .add(senderoMotoco[78])
                        .add(senderoMotoco[79])
                        .add(senderoMotoco[80])
                        .add(senderoMotoco[81])
                        .add(senderoMotoco[82])
                        .add(senderoMotoco[83])
                        .add(senderoMotoco[84])
                        .add(senderoMotoco[85])
                        .add(senderoMotoco[86])
                        .add(senderoMotoco[87])
                        .add(senderoMotoco[88])
                        .add(senderoMotoco[89])
                        .add(senderoMotoco[90])
                        .add(senderoMotoco[91])
                        .add(senderoMotoco[92])
                        .add(senderoMotoco[93])
                        .add(senderoMotoco[94])
                        .add(senderoMotoco[95])
                        .add(senderoMotoco[96])
                        .add(senderoMotoco[97])
                        .add(senderoMotoco[98])
                        .add(senderoMotoco[99])
                        .add(senderoMotoco[100])
                        .add(senderoMotoco[101])
                        .add(senderoMotoco[102])
                        .add(senderoMotoco[103])
                        .add(senderoMotoco[104])
                        .add(senderoMotoco[105])
                        .add(senderoMotoco[106])
                        .add(senderoMotoco[107])
                        .add(senderoMotoco[108])
                        .add(senderoMotoco[109])
                        .add(senderoMotoco[110])
                        .add(senderoMotoco[111])
                        .add(senderoMotoco[112])
                        .add(senderoMotoco[113])
                        .add(senderoMotoco[114])
                        .add(senderoMotoco[115])
                        .add(senderoMotoco[116])
                        .add(senderoMotoco[117])
                        .add(senderoMotoco[118])
                        .add(senderoMotoco[119])
                        .add(senderoMotoco[120])
                        .add(senderoMotoco[121])
                        .add(senderoMotoco[122])
                        .add(senderoMotoco[123])
                        .add(senderoMotoco[124])
                        .add(senderoMotoco[125])
                        .add(senderoMotoco[126])
                        .add(senderoMotoco[127])
                        .add(senderoMotoco[128])
                        .add(senderoMotoco[129])
                        .add(senderoMotoco[130])
                        .add(senderoMotoco[131])
                        .add(senderoMotoco[132])
                        .add(senderoMotoco[133])
                        .add(senderoMotoco[134])
                        .add(senderoMotoco[135])
                        .add(senderoMotoco[136])
                        .add(senderoMotoco[137])
                        .add(senderoMotoco[138])
                        .add(senderoMotoco[139])
                        .add(senderoMotoco[140])
                        .add(senderoMotoco[141])
                        .add(senderoMotoco[142])
                        .add(senderoMotoco[143])
                        .add(senderoMotoco[144])
                        .add(senderoMotoco[145])
                        .add(senderoMotoco[146])
                        .add(senderoMotoco[147])
                        .add(senderoMotoco[148])
                        .add(senderoMotoco[149])
                        .add(senderoMotoco[150])
                        .add(senderoMotoco[151])
                        .add(senderoMotoco[152])
                        .add(senderoMotoco[153])
                        .add(senderoMotoco[154])
                        .add(senderoMotoco[155])
                        .add(senderoMotoco[156])
                        .add(senderoMotoco[157])
                        .add(senderoMotoco[158])
                        .add(senderoMotoco[159])
                        .add(senderoMotoco[160])
                        .add(senderoMotoco[161])
                        .add(senderoMotoco[162])
                        .add(senderoMotoco[163])
                        .add(senderoMotoco[164])
                        .add(senderoMotoco[165])
                        .add(senderoMotoco[166])
                        .add(senderoMotoco[167])
                        .add(senderoMotoco[168])
                        .add(senderoMotoco[169])
                        .add(senderoMotoco[170])
                        .add(senderoMotoco[171])
                        .add(senderoMotoco[172])
                        .add(senderoMotoco[173])
                        .add(senderoMotoco[174])
                        .add(senderoMotoco[175])
                        .add(senderoMotoco[176])
                        .add(senderoMotoco[177])
                        .add(senderoMotoco[178])
                        .add(senderoMotoco[179])
                        .add(senderoMotoco[180])
                        .add(senderoMotoco[181])
                        .add(senderoMotoco[182])
                        .add(senderoMotoco[183])
                        .add(senderoMotoco[184])
                        .add(senderoMotoco[185])
                        .add(senderoMotoco[186])
                        .add(senderoMotoco[187])
                        .add(senderoMotoco[188])
                        .add(senderoMotoco[189])
                        .add(senderoMotoco[190])
                        .add(senderoMotoco[191])
                        .add(senderoMotoco[192])
                        .add(senderoMotoco[193])
                        .add(senderoMotoco[194])
                        .add(senderoMotoco[195])
                        .add(senderoMotoco[196])
                        .add(senderoMotoco[197])
                        .add(senderoMotoco[198])
                        .add(senderoMotoco[199])
                        .add(senderoMotoco[200])
                        .add(senderoMotoco[201])
                        .add(senderoMotoco[202])
                        .add(senderoMotoco[203])
                        .add(senderoMotoco[204])
                        .add(senderoMotoco[205])
                        .add(senderoMotoco[206])
                        .add(senderoMotoco[207])
                        .add(senderoMotoco[208])
                        .add(senderoMotoco[209])
                        .add(senderoMotoco[210])
                        .add(senderoMotoco[211])
                        .add(senderoMotoco[212])
                        .add(senderoMotoco[213])
                        .add(senderoMotoco[214])
                        .add(senderoMotoco[215])
                        .add(senderoMotoco[216])
                        .add(senderoMotoco[217])
                        .add(senderoMotoco[218])
                        .add(senderoMotoco[219])
                        .add(senderoMotoco[220])
                        .add(senderoMotoco[221])
                        .add(senderoMotoco[222])
                        .add(senderoMotoco[223])
                        .add(senderoMotoco[224])
                        .add(senderoMotoco[225])
                        .add(senderoMotoco[226])
                        .add(senderoMotoco[227])
                        .add(senderoMotoco[228])
                        .add(senderoMotoco[229])
                        .add(senderoMotoco[230])
                        .add(senderoMotoco[231])
                        .add(senderoMotoco[232])
                        .add(senderoMotoco[233])
                        .add(senderoMotoco[234])
                        .add(senderoMotoco[235])
                        .add(senderoMotoco[236])
                        .add(senderoMotoco[237])
                        .add(senderoMotoco[238])
                        .add(senderoMotoco[239])
                        .add(senderoMotoco[240])
                        .add(senderoMotoco[241])
                        .add(senderoMotoco[242])
                        .add(senderoMotoco[243])
                        .add(senderoMotoco[244])
                        .add(senderoMotoco[245])
                        .add(senderoMotoco[246])
                        .add(senderoMotoco[247])
                        .add(senderoMotoco[248])
                        .add(senderoMotoco[249])
                        .add(senderoMotoco[250])
                        .add(senderoMotoco[251])
                        .add(senderoMotoco[252])
                        .add(senderoMotoco[253])
                        .add(senderoMotoco[254])
                        .add(senderoMotoco[255])
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
