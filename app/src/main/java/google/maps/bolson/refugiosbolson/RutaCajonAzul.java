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

public class RutaCajonAzul extends FragmentActivity implements OnMapReadyCallback {

    private static final int MY_PERMISSION_REQUEST_ACCES_FINE_LOCATION = 1;
    private static final int MY_PERMISSION_REQUEST_ACCES_COARSE_LOCATION = 1;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta_cajon_azul);
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

        LatLng refugioPlayita = new LatLng(-41.856497, -71.601661);
        mMap.addMarker(new MarkerOptions().position(refugioPlayita).title("Ref. LA PLAYITA").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));
        LatLng refugioCajon = new LatLng(-41.851024, -71.621813);
        mMap.addMarker(new MarkerOptions().position(refugioCajon).title("Ref. CAJÓN DEL AZUL").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));
        LatLng refugioTronconada = new LatLng(-41.854868, -71.610980);
        mMap.addMarker(new MarkerOptions().position(refugioTronconada).title("Ref. LA TRONCONADA").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));
        LatLng refugioRetamal = new LatLng(-41.842536, -71.641900);
        mMap.addMarker(new MarkerOptions().position(refugioRetamal).title("Ref. EL RETAMAL").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));
        LatLng wharton = new LatLng(-41.855878, -71.548806);

        LatLng refugioElConde = new LatLng(-41.840775, -71.660869);
        mMap.addMarker(new MarkerOptions().position(refugioElConde).title("Ref. EL CONDE").icon(BitmapDescriptorFactory.fromResource(R.drawable.interesss)));
        LatLng refugioHorqueta = new LatLng(-41.837286, -71.661547);
        mMap.addMarker(new MarkerOptions().position(refugioHorqueta).title("Ref. LA HORQUETA").icon(BitmapDescriptorFactory.fromResource(R.drawable.interesss)));
        LatLng refugioLaguitos = new LatLng(-41.771469, -71.727332);
        mMap.addMarker(new MarkerOptions().position(refugioLaguitos).title("Ref. LOS LAGUITOS").icon(BitmapDescriptorFactory.fromResource(R.drawable.interesss)));
        LatLng refugioCasaCampo = new LatLng(-41.840274, -71.662721);
        mMap.addMarker(new MarkerOptions().position(refugioCasaCampo).title("Ref. CASA DE CAMPO").icon(BitmapDescriptorFactory.fromResource(R.drawable.interesss)));

        mMap.addMarker(new MarkerOptions().position(wharton).title("WHARTON").snippet("ACCESO A SENDEROS").icon(BitmapDescriptorFactory.fromResource(R.drawable.interes)));
        LatLng elBolson = new LatLng(-41.9667, -71.5333);
        mMap.addMarker(new MarkerOptions().position(elBolson).title("EL BOLSÓN").icon(BitmapDescriptorFactory.fromResource(R.drawable.interess)));


        LatLng senderoRetamal[] = new LatLng[185];
        {

            senderoRetamal[0]= new LatLng (-41.842821,-71.640185);
            senderoRetamal[1]= new LatLng (-41.842730,-71.639375);
            senderoRetamal[2]= new LatLng (-41.842461,-71.638656);
            senderoRetamal[3]= new LatLng (-41.842482,-71.638038);
            senderoRetamal[4]= new LatLng (-41.842771,-71.638234);
            senderoRetamal[5]= new LatLng (-41.843108,-71.638256);
            senderoRetamal[6]= new LatLng (-41.843935,-71.637856);
            senderoRetamal[7]= new LatLng (-41.843868,-71.637953);
            senderoRetamal[8]= new LatLng (-41.844577,-71.637971);
            senderoRetamal[9]= new LatLng (-41.844888,-71.637667);
            senderoRetamal[10]= new LatLng (-41.845062,-71.637049);
            senderoRetamal[11]= new LatLng (-41.845996,-71.636857);
            senderoRetamal[12]= new LatLng (-41.846560,-71.635084);
            senderoRetamal[13]= new LatLng (-41.846476,-71.634026);
            senderoRetamal[14]= new LatLng (-41.846735,-71.633808);
            senderoRetamal[15]= new LatLng (-41.846975,-71.633250);
            senderoRetamal[16]= new LatLng (-41.847871,-71.633218);
            senderoRetamal[17]= new LatLng (-41.848187,-71.632636);
            senderoRetamal[18]= new LatLng (-41.848408,-71.631571);
            senderoRetamal[19]= new LatLng (-41.848759,-71.631260);
            senderoRetamal[20]= new LatLng (-41.848849,-71.630792);
            senderoRetamal[21]= new LatLng (-41.849441,-71.630538);
            senderoRetamal[22]= new LatLng (-41.849768,-71.630175);
            senderoRetamal[23]= new LatLng (-41.849899,-71.629162);
            senderoRetamal[24]= new LatLng (-41.850238,-71.628861);
            senderoRetamal[25]= new LatLng (-41.850498,-71.628268);
            senderoRetamal[26]= new LatLng (-41.850296,-71.628109);
            senderoRetamal[27]= new LatLng (-41.849971,-71.627172);
            senderoRetamal[28]= new LatLng (-41.849643,-71.627063);
            senderoRetamal[29]= new LatLng (-41.849351,-71.626605);
            senderoRetamal[30]= new LatLng (-41.849279,-71.626113);
            senderoRetamal[31]= new LatLng (-41.849474,-71.626000);
            senderoRetamal[32]= new LatLng (-41.849867,-71.625289);
            senderoRetamal[33]= new LatLng (-41.850184,-71.625127);
            senderoRetamal[34]= new LatLng (-41.850114,-71.625026);
            senderoRetamal[35]= new LatLng (-41.850701,-71.624791);
            senderoRetamal[36]= new LatLng (-41.850641,-71.623675);
            senderoRetamal[37]= new LatLng (-41.850814,-71.623127);
            senderoRetamal[38]= new LatLng (-41.851354,-71.621779);
            senderoRetamal[39]= new LatLng (-41.852169,-71.621026);
            senderoRetamal[40]= new LatLng (-41.852450,-71.619341);
            senderoRetamal[41]= new LatLng (-41.852143,-71.618809);
            senderoRetamal[42]= new LatLng (-41.852671,-71.618297);
            senderoRetamal[43]= new LatLng (-41.852764,-71.617937);
            senderoRetamal[44]= new LatLng (-41.853107,-71.617980);
            senderoRetamal[45]= new LatLng (-41.853399,-71.618364);
            senderoRetamal[46]= new LatLng (-41.853666,-71.618228);
            senderoRetamal[47]= new LatLng (-41.853557,-71.618026);
            senderoRetamal[48]= new LatLng (-41.853685,-71.618196);
            senderoRetamal[49]= new LatLng (-41.853799,-71.618098);
            senderoRetamal[50]= new LatLng (-41.853697,-71.617753);
            senderoRetamal[51]= new LatLng (-41.853834,-71.617229);
            senderoRetamal[52]= new LatLng (-41.854154,-71.616805);
            senderoRetamal[53]= new LatLng (-41.854214,-71.616127);
            senderoRetamal[54]= new LatLng (-41.853997,-71.615287);
            senderoRetamal[55]= new LatLng (-41.854180,-71.613920);
            senderoRetamal[56]= new LatLng (-41.854063,-71.613716);
            senderoRetamal[57]= new LatLng (-41.854198,-71.613723);
            senderoRetamal[58]= new LatLng (-41.855430,-71.612011);
            senderoRetamal[59]= new LatLng (-41.855407,-71.610137);
            senderoRetamal[60]= new LatLng (-41.855627,-71.608895);
            senderoRetamal[61]= new LatLng (-41.856054,-71.608874);
            senderoRetamal[62]= new LatLng (-41.856316,-71.608695);
            senderoRetamal[63]= new LatLng (-41.856822,-71.607585);
            senderoRetamal[64]= new LatLng (-41.857052,-71.606629);
            senderoRetamal[65]= new LatLng (-41.856925,-71.606127);
            senderoRetamal[66]= new LatLng (-41.856852,-71.602721);
            senderoRetamal[67]= new LatLng (-41.857170,-71.601428);
            senderoRetamal[68]= new LatLng (-41.857145,-71.600900);
            senderoRetamal[69]= new LatLng (-41.856699,-71.599533);
            senderoRetamal[70]= new LatLng (-41.856812,-71.598368);
            senderoRetamal[71]= new LatLng (-41.855796,-71.596281);
            senderoRetamal[72]= new LatLng (-41.856260,-71.595233);
            senderoRetamal[73]= new LatLng (-41.856320,-71.594414);
            senderoRetamal[74]= new LatLng (-41.856152,-71.594003);
            senderoRetamal[75]= new LatLng (-41.856419,-71.593673);
            senderoRetamal[76]= new LatLng (-41.856557,-71.593139);
            senderoRetamal[77]= new LatLng (-41.856558,-71.591990);
            senderoRetamal[78]= new LatLng (-41.856367,-71.591220);
            senderoRetamal[79]= new LatLng (-41.856537,-71.590512);
            senderoRetamal[80]= new LatLng (-41.856418,-71.590282);
            senderoRetamal[81]= new LatLng (-41.856017,-71.590430);
            senderoRetamal[82]= new LatLng (-41.855827,-71.590348);
            senderoRetamal[83]= new LatLng (-41.855741,-71.590062);
            senderoRetamal[84]= new LatLng (-41.855914,-71.589506);
            senderoRetamal[85]= new LatLng (-41.856232,-71.589190);
            senderoRetamal[86]= new LatLng (-41.856588,-71.589478);
            senderoRetamal[87]= new LatLng (-41.856775,-71.588746);
            senderoRetamal[88]= new LatLng (-41.857413,-71.588934);
            senderoRetamal[89]= new LatLng (-41.857621,-71.588595);
            senderoRetamal[90]= new LatLng (-41.857760,-71.587333);
            senderoRetamal[91]= new LatLng (-41.858136,-71.587012);
            senderoRetamal[92]= new LatLng (-41.858156,-71.586566);
            senderoRetamal[93]= new LatLng (-41.858287,-71.586598);
            senderoRetamal[94]= new LatLng (-41.858639,-71.585957);
            senderoRetamal[95]= new LatLng (-41.858908,-71.585812);
            senderoRetamal[96]= new LatLng (-41.859186,-71.585115);
            senderoRetamal[97]= new LatLng (-41.859163,-71.584850);
            senderoRetamal[98]= new LatLng (-41.858778,-71.584658);
            senderoRetamal[99]= new LatLng (-41.858826,-71.584413);
            senderoRetamal[100]= new LatLng (-41.859106,-71.584450);
            senderoRetamal[101]= new LatLng (-41.859282,-71.584142);
            senderoRetamal[102]= new LatLng (-41.859225,-71.583450);
            senderoRetamal[103]= new LatLng (-41.858854,-71.583224);
            senderoRetamal[104]= new LatLng (-41.858585,-71.582614);
            senderoRetamal[105]= new LatLng (-41.858257,-71.580269);
            senderoRetamal[106]= new LatLng (-41.858470,-71.579502);
            senderoRetamal[107]= new LatLng (-41.858567,-71.579838);
            senderoRetamal[108]= new LatLng (-41.858450,-71.579940);
            senderoRetamal[109]= new LatLng (-41.858493,-71.579615);
            senderoRetamal[110]= new LatLng (-41.858274,-71.579362);
            senderoRetamal[111]= new LatLng (-41.858438,-71.577732);
            senderoRetamal[112]= new LatLng (-41.858394,-71.576594);
            senderoRetamal[113]= new LatLng (-41.859070,-71.575841);
            senderoRetamal[114]= new LatLng (-41.858656,-71.575702);
            senderoRetamal[115]= new LatLng (-41.858783,-71.575357);
            senderoRetamal[116]= new LatLng (-41.858411,-71.575197);
            senderoRetamal[117]= new LatLng (-41.858479,-71.575020);
            senderoRetamal[118]= new LatLng (-41.858807,-71.574861);
            senderoRetamal[119]= new LatLng (-41.858892,-71.574538);
            senderoRetamal[120]= new LatLng (-41.858499,-71.574344);
            senderoRetamal[121]= new LatLng (-41.858305,-71.574037);
            senderoRetamal[122]= new LatLng (-41.857510,-71.573444);
            senderoRetamal[123]= new LatLng (-41.857113,-71.572314);
            senderoRetamal[124]= new LatLng (-41.857354,-71.571423);
            senderoRetamal[125]= new LatLng (-41.857323,-71.570707);
            senderoRetamal[126]= new LatLng (-41.858218,-71.568831);
            senderoRetamal[127]= new LatLng (-41.858506,-71.568438);
            senderoRetamal[128]= new LatLng (-41.858904,-71.568342);
            senderoRetamal[129]= new LatLng (-41.859175,-71.568504);
            senderoRetamal[130]= new LatLng (-41.859353,-71.568331);
            senderoRetamal[131]= new LatLng (-41.859166,-71.567667);
            senderoRetamal[132]= new LatLng (-41.858822,-71.567396);
            senderoRetamal[133]= new LatLng (-41.858536,-71.567438);
            senderoRetamal[134]= new LatLng (-41.858396,-71.567104);
            senderoRetamal[135]= new LatLng (-41.858525,-71.566591);
            senderoRetamal[136]= new LatLng (-41.858803,-71.566315);
            senderoRetamal[137]= new LatLng (-41.858502,-71.565979);
            senderoRetamal[138]= new LatLng (-41.858735,-71.564788);
            senderoRetamal[139]= new LatLng (-41.858394,-71.564640);
            senderoRetamal[140]= new LatLng (-41.858296,-71.564396);
            senderoRetamal[141]= new LatLng (-41.857646,-71.564169);
            senderoRetamal[142]= new LatLng (-41.858178,-71.563793);
            senderoRetamal[143]= new LatLng (-41.858653,-71.562511);
            senderoRetamal[144]= new LatLng (-41.858294,-71.562168);
            senderoRetamal[145]= new LatLng (-41.858045,-71.562244);
            senderoRetamal[146]= new LatLng (-41.857817,-71.561927);
            senderoRetamal[147]= new LatLng (-41.857802,-71.560784);
            senderoRetamal[148]= new LatLng (-41.857593,-71.560343);
            senderoRetamal[149]= new LatLng (-41.857592,-71.559867);
            senderoRetamal[150]= new LatLng (-41.856840,-71.559736);
            senderoRetamal[151]= new LatLng (-41.856779,-71.559276);
            senderoRetamal[152]= new LatLng (-41.856110,-71.558334);
            senderoRetamal[153]= new LatLng (-41.856250,-71.558057);
            senderoRetamal[154]= new LatLng (-41.856620,-71.558296);
            senderoRetamal[155]= new LatLng (-41.856628,-71.558062);
            senderoRetamal[156]= new LatLng (-41.856653,-71.558223);
            senderoRetamal[157]= new LatLng (-41.856766,-71.558166);
            senderoRetamal[158]= new LatLng (-41.856678,-71.558213);
            senderoRetamal[159]= new LatLng (-41.856656,-71.557909);
            senderoRetamal[160]= new LatLng (-41.856664,-71.558215);
            senderoRetamal[161]= new LatLng (-41.856987,-71.558385);
            senderoRetamal[162]= new LatLng (-41.857172,-71.558272);
            senderoRetamal[163]= new LatLng (-41.858258,-71.558330);
            senderoRetamal[164]= new LatLng (-41.858738,-71.558519);
            senderoRetamal[165]= new LatLng (-41.859444,-71.558221);
            senderoRetamal[166]= new LatLng (-41.859697,-71.558739);
            senderoRetamal[167]= new LatLng (-41.860442,-71.559332);
            senderoRetamal[168]= new LatLng (-41.860083,-71.557960);
            senderoRetamal[169]= new LatLng (-41.859857,-71.557923);
            senderoRetamal[170]= new LatLng (-41.859696,-71.557134);
            senderoRetamal[171]= new LatLng (-41.859283,-71.556240);
            senderoRetamal[172]= new LatLng (-41.858387,-71.555526);
            senderoRetamal[173]= new LatLng (-41.858049,-71.554704);
            senderoRetamal[174]= new LatLng (-41.857891,-71.554577);
            senderoRetamal[175]= new LatLng (-41.857442,-71.554622);
            senderoRetamal[176]= new LatLng (-41.856351,-71.554339);
            senderoRetamal[177]= new LatLng (-41.854600,-71.553413);
            senderoRetamal[178]= new LatLng (-41.854315,-71.553140);
            senderoRetamal[179]= new LatLng (-41.854332,-71.552781);
            senderoRetamal[180]= new LatLng (-41.856129,-71.550914);
            senderoRetamal[181]= new LatLng (-41.856239,-71.548851);
            senderoRetamal[182]= new LatLng (-41.856126,-71.548575);
            senderoRetamal[183]= new LatLng (-41.855956,-71.548733);
            senderoRetamal[184]= new LatLng (-41.855555,-71.548702);


        }


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(senderoRetamal[90], 12));


        mMap.addPolyline(
                new PolylineOptions()
                        .add(senderoRetamal[0])
                        .add(senderoRetamal[1])
                        .add(senderoRetamal[2])
                        .add(senderoRetamal[3])
                        .add(senderoRetamal[4])
                        .add(senderoRetamal[5])
                        .add(senderoRetamal[6])
                        .add(senderoRetamal[7])
                        .add(senderoRetamal[8])
                        .add(senderoRetamal[9])
                        .add(senderoRetamal[10])
                        .add(senderoRetamal[11])
                        .add(senderoRetamal[12])
                        .add(senderoRetamal[13])
                        .add(senderoRetamal[14])
                        .add(senderoRetamal[15])
                        .add(senderoRetamal[16])
                        .add(senderoRetamal[17])
                        .add(senderoRetamal[18])
                        .add(senderoRetamal[19])
                        .add(senderoRetamal[20])
                        .add(senderoRetamal[21])
                        .add(senderoRetamal[22])
                        .add(senderoRetamal[23])
                        .add(senderoRetamal[24])
                        .add(senderoRetamal[25])
                        .add(senderoRetamal[26])
                        .add(senderoRetamal[27])
                        .add(senderoRetamal[28])
                        .add(senderoRetamal[29])
                        .add(senderoRetamal[30])
                        .add(senderoRetamal[31])
                        .add(senderoRetamal[32])
                        .add(senderoRetamal[33])
                        .add(senderoRetamal[34])
                        .add(senderoRetamal[35])
                        .add(senderoRetamal[36])
                        .add(senderoRetamal[37])
                        .add(senderoRetamal[38])
                        .add(senderoRetamal[39])
                        .add(senderoRetamal[40])
                        .add(senderoRetamal[41])
                        .add(senderoRetamal[42])
                        .add(senderoRetamal[43])
                        .add(senderoRetamal[44])
                        .add(senderoRetamal[45])
                        .add(senderoRetamal[46])
                        .add(senderoRetamal[47])
                        .add(senderoRetamal[48])
                        .add(senderoRetamal[49])
                        .add(senderoRetamal[50])
                        .add(senderoRetamal[51])
                        .add(senderoRetamal[52])
                        .add(senderoRetamal[53])
                        .add(senderoRetamal[54])
                        .add(senderoRetamal[55])
                        .add(senderoRetamal[56])
                        .add(senderoRetamal[57])
                        .add(senderoRetamal[58])
                        .add(senderoRetamal[59])
                        .add(senderoRetamal[60])
                        .add(senderoRetamal[61])
                        .add(senderoRetamal[62])
                        .add(senderoRetamal[63])
                        .add(senderoRetamal[64])
                        .add(senderoRetamal[65])
                        .add(senderoRetamal[66])
                        .add(senderoRetamal[67])
                        .add(senderoRetamal[68])
                        .add(senderoRetamal[69])
                        .add(senderoRetamal[70])
                        .add(senderoRetamal[71])
                        .add(senderoRetamal[72])
                        .add(senderoRetamal[73])
                        .add(senderoRetamal[74])
                        .add(senderoRetamal[75])
                        .add(senderoRetamal[76])
                        .add(senderoRetamal[77])
                        .add(senderoRetamal[78])
                        .add(senderoRetamal[79])
                        .add(senderoRetamal[80])
                        .add(senderoRetamal[81])
                        .add(senderoRetamal[82])
                        .add(senderoRetamal[83])
                        .add(senderoRetamal[84])
                        .add(senderoRetamal[85])
                        .add(senderoRetamal[86])
                        .add(senderoRetamal[87])
                        .add(senderoRetamal[88])
                        .add(senderoRetamal[89])
                        .add(senderoRetamal[90])
                        .add(senderoRetamal[91])
                        .add(senderoRetamal[92])
                        .add(senderoRetamal[93])
                        .add(senderoRetamal[94])
                        .add(senderoRetamal[95])
                        .add(senderoRetamal[96])
                        .add(senderoRetamal[97])
                        .add(senderoRetamal[98])
                        .add(senderoRetamal[99])
                        .add(senderoRetamal[100])
                        .add(senderoRetamal[101])
                        .add(senderoRetamal[102])
                        .add(senderoRetamal[103])
                        .add(senderoRetamal[104])
                        .add(senderoRetamal[105])
                        .add(senderoRetamal[106])
                        .add(senderoRetamal[107])
                        .add(senderoRetamal[108])
                        .add(senderoRetamal[109])
                        .add(senderoRetamal[110])
                        .add(senderoRetamal[111])
                        .add(senderoRetamal[112])
                        .add(senderoRetamal[113])
                        .add(senderoRetamal[114])
                        .add(senderoRetamal[115])
                        .add(senderoRetamal[116])
                        .add(senderoRetamal[117])
                        .add(senderoRetamal[118])
                        .add(senderoRetamal[119])
                        .add(senderoRetamal[120])
                        .add(senderoRetamal[121])
                        .add(senderoRetamal[122])
                        .add(senderoRetamal[123])
                        .add(senderoRetamal[124])
                        .add(senderoRetamal[125])
                        .add(senderoRetamal[126])
                        .add(senderoRetamal[127])
                        .add(senderoRetamal[128])
                        .add(senderoRetamal[129])
                        .add(senderoRetamal[130])
                        .add(senderoRetamal[131])
                        .add(senderoRetamal[132])
                        .add(senderoRetamal[133])
                        .add(senderoRetamal[134])
                        .add(senderoRetamal[135])
                        .add(senderoRetamal[136])
                        .add(senderoRetamal[137])
                        .add(senderoRetamal[138])
                        .add(senderoRetamal[139])
                        .add(senderoRetamal[140])
                        .add(senderoRetamal[141])
                        .add(senderoRetamal[142])
                        .add(senderoRetamal[143])
                        .add(senderoRetamal[144])
                        .add(senderoRetamal[145])
                        .add(senderoRetamal[146])
                        .add(senderoRetamal[147])
                        .add(senderoRetamal[148])
                        .add(senderoRetamal[149])
                        .add(senderoRetamal[150])
                        .add(senderoRetamal[151])
                        .add(senderoRetamal[152])
                        .add(senderoRetamal[153])
                        .add(senderoRetamal[154])
                        .add(senderoRetamal[155])
                        .add(senderoRetamal[156])
                        .add(senderoRetamal[157])
                        .add(senderoRetamal[158])
                        .add(senderoRetamal[159])
                        .add(senderoRetamal[160])
                        .add(senderoRetamal[161])
                        .add(senderoRetamal[162])
                        .add(senderoRetamal[163])
                        .add(senderoRetamal[164])
                        .add(senderoRetamal[165])
                        .add(senderoRetamal[166])
                        .add(senderoRetamal[167])
                        .add(senderoRetamal[168])
                        .add(senderoRetamal[169])
                        .add(senderoRetamal[170])
                        .add(senderoRetamal[171])
                        .add(senderoRetamal[172])
                        .add(senderoRetamal[173])
                        .add(senderoRetamal[174])
                        .add(senderoRetamal[175])
                        .add(senderoRetamal[176])
                        .add(senderoRetamal[177])
                        .add(senderoRetamal[178])
                        .add(senderoRetamal[179])
                        .add(senderoRetamal[180])
                        .add(senderoRetamal[181])
                        .add(senderoRetamal[182])
                        .add(senderoRetamal[183])
                        .add(senderoRetamal[184])

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

