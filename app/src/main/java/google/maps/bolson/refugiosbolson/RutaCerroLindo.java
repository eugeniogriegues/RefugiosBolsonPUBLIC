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

public class RutaCerroLindo extends FragmentActivity implements OnMapReadyCallback {
    private static final int MY_PERMISSION_REQUEST_ACCES_FINE_LOCATION = 1;
    private static final int MY_PERMISSION_REQUEST_ACCES_COARSE_LOCATION = 1;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta_cerro_lindo);
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

        LatLng refugioLaguitos = new LatLng(-41.771469, -71.727332);
        mMap.addMarker(new MarkerOptions().position(refugioLaguitos).title("Ref. LOS LAGUITOS").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));
        LatLng refugioCasaCampo = new LatLng(-41.840274, -71.662721);
        mMap.addMarker(new MarkerOptions().position(refugioCasaCampo).title("Ref. CASA DE CAMPO").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));
        LatLng refugioHorqueta = new LatLng(-41.837286, -71.661547);
        mMap.addMarker(new MarkerOptions().position(refugioHorqueta).title("Ref. LA HORQUETA").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));
        LatLng refugioElConde = new LatLng(-41.840775, -71.660869);
        mMap.addMarker(new MarkerOptions().position(refugioElConde).title("Ref. EL CONDE").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));

        LatLng refugioCajon = new LatLng(-41.851024, -71.621813);
        mMap.addMarker(new MarkerOptions().position(refugioCajon).title("Ref. CAJÓN DEL AZUL").icon(BitmapDescriptorFactory.fromResource(R.drawable.interesss)));

        LatLng wharton = new LatLng(-41.855878, -71.548806);
        mMap.addMarker(new MarkerOptions().position(wharton).title("WHARTON").snippet("ACCESO A SENDEROS").icon(BitmapDescriptorFactory.fromResource(R.drawable.interes)));


        LatLng elBolson = new LatLng(-41.9667, -71.5333);
        mMap.addMarker(new MarkerOptions().position(elBolson).title("EL BOLSÓN").icon(BitmapDescriptorFactory.fromResource(R.drawable.interess)));


        LatLng senderoLaguitos[] = new LatLng[159];

        {

            senderoLaguitos[0]= new LatLng (-41.856257,-71.548580);
            senderoLaguitos[1]= new LatLng (-41.856121,-71.551080);
            senderoLaguitos[2]= new LatLng (-41.854387,-71.552764);
            senderoLaguitos[3]= new LatLng (-41.854339,-71.553075);
            senderoLaguitos[4]= new LatLng (-41.856513,-71.554384);
            senderoLaguitos[5]= new LatLng (-41.857959,-71.554695);
            senderoLaguitos[6]= new LatLng (-41.858415,-71.555564);
            senderoLaguitos[7]= new LatLng (-41.858654,-71.555704);
            senderoLaguitos[8]= new LatLng (-41.858846,-71.555929);
            senderoLaguitos[9]= new LatLng (-41.859397,-71.556272);
            senderoLaguitos[10]= new LatLng (-41.859246,-71.556627);
            senderoLaguitos[11]= new LatLng (-41.859621,-71.557474);
            senderoLaguitos[12]= new LatLng (-41.859925,-71.557871);
            senderoLaguitos[13]= new LatLng (-41.859821,-71.558472);
            senderoLaguitos[14]= new LatLng (-41.859725,-71.558483);
            senderoLaguitos[15]= new LatLng (-41.859533,-71.558139);
            senderoLaguitos[16]= new LatLng (-41.858902,-71.558289);
            senderoLaguitos[17]= new LatLng (-41.858375,-71.558268);
            senderoLaguitos[18]= new LatLng (-41.858071,-71.558011);
            senderoLaguitos[19]= new LatLng (-41.857631,-71.558214);
            senderoLaguitos[20]= new LatLng (-41.857056,-71.558161);
            senderoLaguitos[21]= new LatLng (-41.856744,-71.557812);
            senderoLaguitos[22]= new LatLng (-41.856417,-71.557823);
            senderoLaguitos[23]= new LatLng (-41.856125,-71.558338);
            senderoLaguitos[24]= new LatLng (-41.856385,-71.558756);
            senderoLaguitos[25]= new LatLng (-41.856561,-71.558837);
            senderoLaguitos[26]= new LatLng (-41.856733,-71.559014);
            senderoLaguitos[27]= new LatLng (-41.856768,-71.559647);
            senderoLaguitos[28]= new LatLng (-41.857308,-71.559437);
            senderoLaguitos[29]= new LatLng (-41.857476,-71.559636);
            senderoLaguitos[30]= new LatLng (-41.857655,-71.559759);
            senderoLaguitos[31]= new LatLng (-41.857580,-71.560210);
            senderoLaguitos[32]= new LatLng (-41.857823,-71.560457);
            senderoLaguitos[33]= new LatLng (-41.857799,-71.561058);
            senderoLaguitos[34]= new LatLng (-41.858007,-71.561862);
            senderoLaguitos[35]= new LatLng (-41.857999,-71.562538);
            senderoLaguitos[36]= new LatLng (-41.857943,-71.563107);
            senderoLaguitos[37]= new LatLng (-41.857855,-71.563654);
            senderoLaguitos[38]= new LatLng (-41.857895,-71.564019);
            senderoLaguitos[39]= new LatLng (-41.857647,-71.564126);
            senderoLaguitos[40]= new LatLng (-41.857759,-71.564308);
            senderoLaguitos[41]= new LatLng (-41.858063,-71.564298);
            senderoLaguitos[42]= new LatLng (-41.858391,-71.564566);
            senderoLaguitos[43]= new LatLng (-41.858806,-71.564888);
            senderoLaguitos[44]= new LatLng (-41.858566,-71.565381);
            senderoLaguitos[45]= new LatLng (-41.858608,-71.566033);
            senderoLaguitos[46]= new LatLng (-41.858363,-71.566832);
            senderoLaguitos[47]= new LatLng (-41.858467,-71.567125);
            senderoLaguitos[48]= new LatLng (-41.859334,-71.567516);
            senderoLaguitos[49]= new LatLng (-41.859381,-71.568117);
            senderoLaguitos[50]= new LatLng (-41.858886,-71.568332);
            senderoLaguitos[51]= new LatLng (-41.858215,-71.568911);
            senderoLaguitos[52]= new LatLng (-41.857623,-71.569490);
            senderoLaguitos[53]= new LatLng (-41.857272,-71.571422);
            senderoLaguitos[54]= new LatLng (-41.857192,-71.572344);
            senderoLaguitos[55]= new LatLng (-41.857528,-71.573133);
            senderoLaguitos[56]= new LatLng (-41.858071,-71.573771);
            senderoLaguitos[57]= new LatLng (-41.858550,-71.575123);
            senderoLaguitos[58]= new LatLng (-41.858391,-71.576496);
            senderoLaguitos[59]= new LatLng (-41.858255,-71.577322);
            senderoLaguitos[60]= new LatLng (-41.857639,-71.578299);
            senderoLaguitos[61]= new LatLng (-41.858287,-71.579254);
            senderoLaguitos[62]= new LatLng (-41.858399,-71.580445);
            senderoLaguitos[63]= new LatLng (-41.857847,-71.582944);
            senderoLaguitos[64]= new LatLng (-41.857983,-71.585358);
            senderoLaguitos[65]= new LatLng (-41.858359,-71.587354);
            senderoLaguitos[66]= new LatLng (-41.858327,-71.590369);
            senderoLaguitos[67]= new LatLng (-41.857743,-71.596506);
            senderoLaguitos[68]= new LatLng (-41.857072,-71.600497);
            senderoLaguitos[69]= new LatLng (-41.857264,-71.602535);
            senderoLaguitos[70]= new LatLng (-41.857272,-71.607363);
            senderoLaguitos[71]= new LatLng (-41.856617,-71.609552);
            senderoLaguitos[72]= new LatLng (-41.855738,-71.610271);
            senderoLaguitos[73]= new LatLng (-41.855378,-71.611762);
            senderoLaguitos[74]= new LatLng (-41.854859,-71.613468);
            senderoLaguitos[75]= new LatLng (-41.853764,-71.615217);
            senderoLaguitos[76]= new LatLng (-41.853828,-71.617266);
            senderoLaguitos[77]= new LatLng (-41.854147,-71.617373);
            senderoLaguitos[78]= new LatLng (-41.853796,-71.618339);
            senderoLaguitos[79]= new LatLng (-41.852965,-71.619004);
            senderoLaguitos[80]= new LatLng (-41.852261,-71.620538);
            senderoLaguitos[81]= new LatLng (-41.851270,-71.622094);
            senderoLaguitos[82]= new LatLng (-41.851063,-71.622630);
            senderoLaguitos[83]= new LatLng (-41.850675,-71.623709);
            senderoLaguitos[84]= new LatLng (-41.850204,-71.625329);
            senderoLaguitos[85]= new LatLng (-41.850815,-71.627421);
            senderoLaguitos[86]= new LatLng (-41.850815,-71.628789);
            senderoLaguitos[87]= new LatLng (-41.849520,-71.629583);
            senderoLaguitos[88]= new LatLng (-41.848597,-71.630264);
            senderoLaguitos[89]= new LatLng (-41.848158,-71.631693);
            senderoLaguitos[90]= new LatLng (-41.847378,-71.633692);
            senderoLaguitos[91]= new LatLng (-41.846755,-71.634883);
            senderoLaguitos[92]= new LatLng (-41.848633,-71.638563);
            senderoLaguitos[93]= new LatLng (-41.847330,-71.642039);
            senderoLaguitos[94]= new LatLng (-41.844813,-71.646545);
            senderoLaguitos[95]= new LatLng (-41.844197,-71.648401);
            senderoLaguitos[96]= new LatLng (-41.844014,-71.651148);
            senderoLaguitos[97]= new LatLng (-41.841776,-71.649935);
            senderoLaguitos[98]= new LatLng (-41.840848,-71.650997);
            senderoLaguitos[99]= new LatLng (-41.839522,-71.651062);
            senderoLaguitos[100]= new LatLng (-41.838347,-71.651931);
            senderoLaguitos[101]= new LatLng (-41.837531,-71.655235);
            senderoLaguitos[102]= new LatLng (-41.835996,-71.656523);
            senderoLaguitos[103]= new LatLng (-41.836892,-71.658668);
            senderoLaguitos[104]= new LatLng (-41.836436,-71.658626);
            senderoLaguitos[105]= new LatLng (-41.836180,-71.659591);
            senderoLaguitos[106]= new LatLng (-41.835996,-71.660610);
            senderoLaguitos[107]= new LatLng (-41.836052,-71.661340);
            senderoLaguitos[108]= new LatLng (-41.836540,-71.662059);
            senderoLaguitos[109]= new LatLng (-41.836884,-71.662981);
            senderoLaguitos[110]= new LatLng (-41.836676,-71.663400);
            senderoLaguitos[111]= new LatLng (-41.836252,-71.663990);
            senderoLaguitos[112]= new LatLng (-41.835661,-71.665964);
            senderoLaguitos[113]= new LatLng (-41.835805,-71.667938);
            senderoLaguitos[114]= new LatLng (-41.833630,-71.669397);
            senderoLaguitos[115]= new LatLng (-41.830561,-71.672230);
            senderoLaguitos[116]= new LatLng (-41.829186,-71.673689);
            senderoLaguitos[117]= new LatLng (-41.829218,-71.675534);
            senderoLaguitos[118]= new LatLng (-41.827747,-71.675105);
            senderoLaguitos[119]= new LatLng (-41.826467,-71.675792);
            senderoLaguitos[120]= new LatLng (-41.826116,-71.677251);
            senderoLaguitos[121]= new LatLng (-41.825316,-71.677680);
            senderoLaguitos[122]= new LatLng (-41.823493,-71.678281);
            senderoLaguitos[123]= new LatLng (-41.821766,-71.679697);
            senderoLaguitos[124]= new LatLng (-41.820775,-71.681971);
            senderoLaguitos[125]= new LatLng (-41.819624,-71.682272);
            senderoLaguitos[126]= new LatLng (-41.817641,-71.682057);
            senderoLaguitos[127]= new LatLng (-41.816393,-71.682014);
            senderoLaguitos[128]= new LatLng (-41.814442,-71.681800);
            senderoLaguitos[129]= new LatLng (-41.813483,-71.683731);
            senderoLaguitos[130]= new LatLng (-41.812715,-71.685276);
            senderoLaguitos[131]= new LatLng (-41.811627,-71.686735);
            senderoLaguitos[132]= new LatLng (-41.811371,-71.687722);
            senderoLaguitos[133]= new LatLng (-41.810504,-71.687843);
            senderoLaguitos[134]= new LatLng (-41.810294,-71.688189);
            senderoLaguitos[135]= new LatLng (-41.809850,-71.688465);
            senderoLaguitos[136]= new LatLng (-41.809046,-71.688731);
            senderoLaguitos[137]= new LatLng (-41.808577,-71.688589);
            senderoLaguitos[138]= new LatLng (-41.806861,-71.688559);
            senderoLaguitos[139]= new LatLng (-41.806061,-71.691155);
            senderoLaguitos[140]= new LatLng (-41.803758,-71.691284);
            senderoLaguitos[141]= new LatLng (-41.802063,-71.692228);
            senderoLaguitos[142]= new LatLng (-41.801871,-71.693215);
            senderoLaguitos[143]= new LatLng (-41.799215,-71.696005);
            senderoLaguitos[144]= new LatLng (-41.797744,-71.698151);
            senderoLaguitos[145]= new LatLng (-41.797616,-71.702785);
            senderoLaguitos[146]= new LatLng (-41.795824,-71.706219);
            senderoLaguitos[147]= new LatLng (-41.794352,-71.710939);
            senderoLaguitos[148]= new LatLng (-41.791409,-71.717033);
            senderoLaguitos[149]= new LatLng (-41.788145,-71.723213);
            senderoLaguitos[150]= new LatLng (-41.784945,-71.722612);
            senderoLaguitos[151]= new LatLng (-41.779697,-71.723986);
            senderoLaguitos[152]= new LatLng (-41.776753,-71.725273);
            senderoLaguitos[153]= new LatLng (-41.775864,-71.725702);
            senderoLaguitos[154]= new LatLng (-41.775040,-71.726485);
            senderoLaguitos[155]= new LatLng (-41.773448,-71.727033);
            senderoLaguitos[156]= new LatLng (-41.772960,-71.727408);
            senderoLaguitos[157]= new LatLng (-41.772048,-71.726582);
            senderoLaguitos[158]= new LatLng (-41.771600,-71.727279);


        }

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(senderoLaguitos[90], 11));

        mMap.addPolyline(
                new PolylineOptions()
                        .add(senderoLaguitos[0])
                        .add(senderoLaguitos[1])
                        .add(senderoLaguitos[2])
                        .add(senderoLaguitos[3])
                        .add(senderoLaguitos[4])
                        .add(senderoLaguitos[5])
                        .add(senderoLaguitos[6])
                        .add(senderoLaguitos[7])
                        .add(senderoLaguitos[8])
                        .add(senderoLaguitos[9])
                        .add(senderoLaguitos[10])
                        .add(senderoLaguitos[11])
                        .add(senderoLaguitos[12])
                        .add(senderoLaguitos[13])
                        .add(senderoLaguitos[14])
                        .add(senderoLaguitos[15])
                        .add(senderoLaguitos[16])
                        .add(senderoLaguitos[17])
                        .add(senderoLaguitos[18])
                        .add(senderoLaguitos[19])
                        .add(senderoLaguitos[20])
                        .add(senderoLaguitos[21])
                        .add(senderoLaguitos[22])
                        .add(senderoLaguitos[23])
                        .add(senderoLaguitos[24])
                        .add(senderoLaguitos[25])
                        .add(senderoLaguitos[26])
                        .add(senderoLaguitos[27])
                        .add(senderoLaguitos[28])
                        .add(senderoLaguitos[29])
                        .add(senderoLaguitos[30])
                        .add(senderoLaguitos[31])
                        .add(senderoLaguitos[32])
                        .add(senderoLaguitos[33])
                        .add(senderoLaguitos[34])
                        .add(senderoLaguitos[35])
                        .add(senderoLaguitos[36])
                        .add(senderoLaguitos[37])
                        .add(senderoLaguitos[38])
                        .add(senderoLaguitos[39])
                        .add(senderoLaguitos[40])
                        .add(senderoLaguitos[41])
                        .add(senderoLaguitos[42])
                        .add(senderoLaguitos[43])
                        .add(senderoLaguitos[44])
                        .add(senderoLaguitos[45])
                        .add(senderoLaguitos[46])
                        .add(senderoLaguitos[47])
                        .add(senderoLaguitos[48])
                        .add(senderoLaguitos[49])
                        .add(senderoLaguitos[50])
                        .add(senderoLaguitos[51])
                        .add(senderoLaguitos[52])
                        .add(senderoLaguitos[53])
                        .add(senderoLaguitos[54])
                        .add(senderoLaguitos[55])
                        .add(senderoLaguitos[56])
                        .add(senderoLaguitos[57])
                        .add(senderoLaguitos[58])
                        .add(senderoLaguitos[59])
                        .add(senderoLaguitos[60])
                        .add(senderoLaguitos[61])
                        .add(senderoLaguitos[62])
                        .add(senderoLaguitos[63])
                        .add(senderoLaguitos[64])
                        .add(senderoLaguitos[65])
                        .add(senderoLaguitos[66])
                        .add(senderoLaguitos[67])
                        .add(senderoLaguitos[68])
                        .add(senderoLaguitos[69])
                        .add(senderoLaguitos[70])
                        .add(senderoLaguitos[71])
                        .add(senderoLaguitos[72])
                        .add(senderoLaguitos[73])
                        .add(senderoLaguitos[74])
                        .add(senderoLaguitos[75])
                        .add(senderoLaguitos[76])
                        .add(senderoLaguitos[77])
                        .add(senderoLaguitos[78])
                        .add(senderoLaguitos[79])
                        .add(senderoLaguitos[80])
                        .add(senderoLaguitos[81])
                        .add(senderoLaguitos[82])
                        .add(senderoLaguitos[83])
                        .add(senderoLaguitos[84])
                        .add(senderoLaguitos[85])
                        .add(senderoLaguitos[86])
                        .add(senderoLaguitos[87])
                        .add(senderoLaguitos[88])
                        .add(senderoLaguitos[89])
                        .add(senderoLaguitos[90])
                        .add(senderoLaguitos[91])
                        .add(senderoLaguitos[92])
                        .add(senderoLaguitos[93])
                        .add(senderoLaguitos[94])
                        .add(senderoLaguitos[95])
                        .add(senderoLaguitos[96])
                        .add(senderoLaguitos[97])
                        .add(senderoLaguitos[98])
                        .add(senderoLaguitos[99])
                        .add(senderoLaguitos[100])
                        .add(senderoLaguitos[101])
                        .add(senderoLaguitos[102])
                        .add(senderoLaguitos[103])
                        .add(senderoLaguitos[104])
                        .add(senderoLaguitos[105])
                        .add(senderoLaguitos[106])
                        .add(senderoLaguitos[107])
                        .add(senderoLaguitos[108])
                        .add(senderoLaguitos[109])
                        .add(senderoLaguitos[110])
                        .add(senderoLaguitos[111])
                        .add(senderoLaguitos[112])
                        .add(senderoLaguitos[113])
                        .add(senderoLaguitos[114])
                        .add(senderoLaguitos[115])
                        .add(senderoLaguitos[116])
                        .add(senderoLaguitos[117])
                        .add(senderoLaguitos[118])
                        .add(senderoLaguitos[119])
                        .add(senderoLaguitos[120])
                        .add(senderoLaguitos[121])
                        .add(senderoLaguitos[122])
                        .add(senderoLaguitos[123])
                        .add(senderoLaguitos[124])
                        .add(senderoLaguitos[125])
                        .add(senderoLaguitos[126])
                        .add(senderoLaguitos[127])
                        .add(senderoLaguitos[128])
                        .add(senderoLaguitos[129])
                        .add(senderoLaguitos[130])
                        .add(senderoLaguitos[131])
                        .add(senderoLaguitos[132])
                        .add(senderoLaguitos[133])
                        .add(senderoLaguitos[134])
                        .add(senderoLaguitos[135])
                        .add(senderoLaguitos[136])
                        .add(senderoLaguitos[137])
                        .add(senderoLaguitos[138])
                        .add(senderoLaguitos[139])
                        .add(senderoLaguitos[140])
                        .add(senderoLaguitos[141])
                        .add(senderoLaguitos[142])
                        .add(senderoLaguitos[143])
                        .add(senderoLaguitos[144])
                        .add(senderoLaguitos[145])
                        .add(senderoLaguitos[146])
                        .add(senderoLaguitos[147])
                        .add(senderoLaguitos[148])
                        .add(senderoLaguitos[149])
                        .add(senderoLaguitos[150])
                        .add(senderoLaguitos[151])
                        .add(senderoLaguitos[152])
                        .add(senderoLaguitos[153])
                        .add(senderoLaguitos[154])
                        .add(senderoLaguitos[155])
                        .add(senderoLaguitos[156])
                        .add(senderoLaguitos[157])
                        .add(senderoLaguitos[158])

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
