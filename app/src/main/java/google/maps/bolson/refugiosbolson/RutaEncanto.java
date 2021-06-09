package google.maps.bolson.refugiosbolson;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
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

public class RutaEncanto extends FragmentActivity implements OnMapReadyCallback {

    private static final int MY_PERMISSION_REQUEST_ACCES_FINE_LOCATION = 1;
    private static final int MY_PERMISSION_REQUEST_ACCES_COARSE_LOCATION = 1;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta_encanto);
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

        LatLng refugioDedoGordo = new LatLng(-41.833618, -71.598633);
        mMap.addMarker(new MarkerOptions().position(refugioDedoGordo).title("Ref. DEDO GORDO").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));
        LatLng refugioEncantoBlanco = new LatLng (-41.807130,-71.614097);
        mMap.addMarker(new MarkerOptions().position(refugioEncantoBlanco).title("Ref. ENCANTO BLANCO").icon(BitmapDescriptorFactory.fromResource(R.drawable.refugio)));


        LatLng wharton = new LatLng(-41.855878, -71.548806);
        mMap.addMarker(new MarkerOptions().position(wharton).title("WHARTON").snippet("ACCESO DEDO GORDO").icon(BitmapDescriptorFactory.fromResource(R.drawable.interesss)));
        LatLng fliaTille = new LatLng(-41.829315,-71.545378);
        mMap.addMarker(new MarkerOptions().position(fliaTille).title("Flia. TILLERIA").snippet("ACCESO A ENCANTO BLANCO").icon(BitmapDescriptorFactory.fromResource(R.drawable.interes)));
        LatLng elBolson = new LatLng(-41.9667, -71.5333);
        mMap.addMarker(new MarkerOptions().position(elBolson).title("EL BOLSÓN").icon(BitmapDescriptorFactory.fromResource(R.drawable.interess)));

        LatLng senderoDedoGordo[] = new LatLng[186];
        LatLng senderoEncanto[] = new LatLng[97];
        {
            senderoDedoGordo[0]= new LatLng (-41.855878, -71.548806);
            senderoDedoGordo[1]= new LatLng (-41.856106,-71.549830);
            senderoDedoGordo[2]= new LatLng (-41.856054,-71.551166);
            senderoDedoGordo[3]= new LatLng (-41.854374,-71.552679);
            senderoDedoGordo[4]= new LatLng (-41.854320,-71.553145);
            senderoDedoGordo[5]= new LatLng (-41.855594,-71.554011);
            senderoDedoGordo[6]= new LatLng (-41.856620,-71.554491);
            senderoDedoGordo[7]= new LatLng (-41.858026,-71.554761);
            senderoDedoGordo[8]= new LatLng (-41.858487,-71.555679);
            senderoDedoGordo[9]= new LatLng (-41.859413,-71.556267);
            senderoDedoGordo[10]= new LatLng (-41.859757,-71.556973);
            senderoDedoGordo[11]= new LatLng (-41.859771,-71.557587);
            senderoDedoGordo[12]= new LatLng (-41.860050,-71.557878);
            senderoDedoGordo[13]= new LatLng (-41.860051,-71.558370);
            senderoDedoGordo[14]= new LatLng (-41.860344,-71.558682);
            senderoDedoGordo[15]= new LatLng (-41.860389,-71.559305);
            senderoDedoGordo[16]= new LatLng (-41.860175,-71.559104);
            senderoDedoGordo[17]= new LatLng (-41.860448,-71.559359);
            senderoDedoGordo[18]= new LatLng (-41.859701,-71.558604);
            senderoDedoGordo[19]= new LatLng (-41.859597,-71.558173);
            senderoDedoGordo[20]= new LatLng (-41.859390,-71.558093);
            senderoDedoGordo[21]= new LatLng (-41.858785,-71.558367);
            senderoDedoGordo[22]= new LatLng (-41.856709,-71.558159);
            senderoDedoGordo[23]= new LatLng (-41.856298,-71.557932);
            senderoDedoGordo[24]= new LatLng (-41.856079,-71.558336);
            senderoDedoGordo[25]= new LatLng (-41.855591,-71.558137);
            senderoDedoGordo[26]= new LatLng (-41.855395,-71.558482);
            senderoDedoGordo[27]= new LatLng (-41.855576,-71.559876);
            senderoDedoGordo[28]= new LatLng (-41.855305,-71.560308);
            senderoDedoGordo[29]= new LatLng (-41.855331,-71.560511);
            senderoDedoGordo[30]= new LatLng (-41.854944,-71.561018);
            senderoDedoGordo[31]= new LatLng (-41.855202,-71.561132);
            senderoDedoGordo[32]= new LatLng (-41.855503,-71.560990);
            senderoDedoGordo[33]= new LatLng (-41.855554,-71.561157);
            senderoDedoGordo[34]= new LatLng (-41.855132,-71.561624);
            senderoDedoGordo[35]= new LatLng (-41.855041,-71.562096);
            senderoDedoGordo[36]= new LatLng (-41.854721,-71.562520);
            senderoDedoGordo[37]= new LatLng (-41.854489,-71.562535);
            senderoDedoGordo[38]= new LatLng (-41.854254,-71.562758);
            senderoDedoGordo[39]= new LatLng (-41.854130,-71.563401);
            senderoDedoGordo[40]= new LatLng (-41.853250,-71.564299);
            senderoDedoGordo[41]= new LatLng (-41.852995,-71.564475);
            senderoDedoGordo[42]= new LatLng (-41.852607,-71.564486);
            senderoDedoGordo[43]= new LatLng (-41.851734,-71.564082);
            senderoDedoGordo[44]= new LatLng (-41.851538,-71.564139);
            senderoDedoGordo[45]= new LatLng (-41.850801,-71.563251);
            senderoDedoGordo[46]= new LatLng (-41.850426,-71.563251);
            senderoDedoGordo[47]= new LatLng (-41.850134,-71.563574);
            senderoDedoGordo[48]= new LatLng (-41.849277,-71.563458);
            senderoDedoGordo[49]= new LatLng (-41.849122,-71.563820);
            senderoDedoGordo[50]= new LatLng (-41.849174,-71.564405);
            senderoDedoGordo[51]= new LatLng (-41.849881,-71.564868);
            senderoDedoGordo[52]= new LatLng (-41.850173,-71.565340);
            senderoDedoGordo[53]= new LatLng (-41.850413,-71.565324);
            senderoDedoGordo[54]= new LatLng (-41.850988,-71.565728);
            senderoDedoGordo[55]= new LatLng (-41.851232,-71.565743);
            senderoDedoGordo[56]= new LatLng (-41.851370,-71.565309);
            senderoDedoGordo[57]= new LatLng (-41.851205,-71.565706);
            senderoDedoGordo[58]= new LatLng (-41.850927,-71.565667);
            senderoDedoGordo[59]= new LatLng (-41.850760,-71.566521);
            senderoDedoGordo[60]= new LatLng (-41.850042,-71.566904);
            senderoDedoGordo[61]= new LatLng (-41.849449,-71.567895);
            senderoDedoGordo[62]= new LatLng (-41.848909,-71.568190);
            senderoDedoGordo[63]= new LatLng (-41.848273,-71.569119);
            senderoDedoGordo[64]= new LatLng (-41.849788,-71.571483);
            senderoDedoGordo[65]= new LatLng (-41.849767,-71.571997);
            senderoDedoGordo[66]= new LatLng (-41.850176,-71.572742);
            senderoDedoGordo[67]= new LatLng (-41.850114,-71.572926);
            senderoDedoGordo[68]= new LatLng (-41.849465,-71.573011);
            senderoDedoGordo[69]= new LatLng (-41.848811,-71.572633);
            senderoDedoGordo[70]= new LatLng (-41.847742,-71.571524);
            senderoDedoGordo[71]= new LatLng (-41.845803,-71.571039);
            senderoDedoGordo[72]= new LatLng (-41.845489,-71.570613);
            senderoDedoGordo[73]= new LatLng (-41.845121,-71.570479);
            senderoDedoGordo[74]= new LatLng (-41.844360,-71.570547);
            senderoDedoGordo[75]= new LatLng (-41.843748,-71.570779);
            senderoDedoGordo[76]= new LatLng (-41.842669,-71.571689);
            senderoDedoGordo[77]= new LatLng (-41.842591,-71.572454);
            senderoDedoGordo[78]= new LatLng (-41.842384,-71.572813);
            senderoDedoGordo[79]= new LatLng (-41.842546,-71.573527);
            senderoDedoGordo[80]= new LatLng (-41.843121,-71.574355);
            senderoDedoGordo[81]= new LatLng (-41.843262,-71.575368);
            senderoDedoGordo[82]= new LatLng (-41.842772,-71.575796);
            senderoDedoGordo[83]= new LatLng (-41.842723,-71.576102);
            senderoDedoGordo[84]= new LatLng (-41.842258,-71.576338);
            senderoDedoGordo[85]= new LatLng (-41.841962,-71.576691);
            senderoDedoGordo[86]= new LatLng (-41.842025,-71.577655);
            senderoDedoGordo[87]= new LatLng (-41.841750,-71.577573);
            senderoDedoGordo[88]= new LatLng (-41.841554,-71.578010);
            senderoDedoGordo[89]= new LatLng (-41.841613,-71.578685);
            senderoDedoGordo[90]= new LatLng (-41.841706,-71.578654);
            senderoDedoGordo[91]= new LatLng (-41.841752,-71.578894);
            senderoDedoGordo[92]= new LatLng (-41.841685,-71.578684);
            senderoDedoGordo[93]= new LatLng (-41.841640,-71.579253);
            senderoDedoGordo[94]= new LatLng (-41.840724,-71.579746);
            senderoDedoGordo[95]= new LatLng (-41.840354,-71.580855);
            senderoDedoGordo[96]= new LatLng (-41.840631,-71.581047);
            senderoDedoGordo[97]= new LatLng (-41.841047,-71.582056);
            senderoDedoGordo[98]= new LatLng (-41.841349,-71.582161);
            senderoDedoGordo[99]= new LatLng (-41.841429,-71.582629);
            senderoDedoGordo[100]= new LatLng (-41.842181,-71.583305);
            senderoDedoGordo[101]= new LatLng (-41.842447,-71.583978);
            senderoDedoGordo[102]= new LatLng (-41.842630,-71.584106);
            senderoDedoGordo[103]= new LatLng (-41.842644,-71.584306);
            senderoDedoGordo[104]= new LatLng (-41.842297,-71.584892);
            senderoDedoGordo[105]= new LatLng (-41.842162,-71.584754);
            senderoDedoGordo[106]= new LatLng (-41.842269,-71.584869);
            senderoDedoGordo[107]= new LatLng (-41.842241,-71.584751);
            senderoDedoGordo[108]= new LatLng (-41.842243,-71.585404);
            senderoDedoGordo[109]= new LatLng (-41.842345,-71.585420);
            senderoDedoGordo[110]= new LatLng (-41.842046,-71.585749);
            senderoDedoGordo[111]= new LatLng (-41.841969,-71.586242);
            senderoDedoGordo[112]= new LatLng (-41.841607,-71.586402);
            senderoDedoGordo[113]= new LatLng (-41.840954,-71.587464);
            senderoDedoGordo[114]= new LatLng (-41.840708,-71.587482);
            senderoDedoGordo[115]= new LatLng (-41.840297,-71.587947);
            senderoDedoGordo[116]= new LatLng (-41.840155,-71.587995);
            senderoDedoGordo[117]= new LatLng (-41.840188,-71.587865);
            senderoDedoGordo[118]= new LatLng (-41.840111,-71.588036);
            senderoDedoGordo[119]= new LatLng (-41.839857,-71.587990);
            senderoDedoGordo[120]= new LatLng (-41.839552,-71.588385);
            senderoDedoGordo[121]= new LatLng (-41.839217,-71.588254);
            senderoDedoGordo[122]= new LatLng (-41.839112,-71.588482);
            senderoDedoGordo[123]= new LatLng (-41.839161,-71.588322);
            senderoDedoGordo[124]= new LatLng (-41.839051,-71.588796);
            senderoDedoGordo[125]= new LatLng (-41.838630,-71.589018);
            senderoDedoGordo[126]= new LatLng (-41.838433,-71.589436);
            senderoDedoGordo[127]= new LatLng (-41.838558,-71.589925);
            senderoDedoGordo[128]= new LatLng (-41.838492,-71.590722);
            senderoDedoGordo[129]= new LatLng (-41.837917,-71.591840);
            senderoDedoGordo[130]= new LatLng (-41.836362,-71.593455);
            senderoDedoGordo[131]= new LatLng (-41.836184,-71.593562);
            senderoDedoGordo[132]= new LatLng (-41.835372,-71.593544);
            senderoDedoGordo[133]= new LatLng (-41.835188,-71.593946);
            senderoDedoGordo[134]= new LatLng (-41.835238,-71.594340);
            senderoDedoGordo[135]= new LatLng (-41.834928,-71.595035);
            senderoDedoGordo[136]= new LatLng (-41.834205,-71.594730);
            senderoDedoGordo[137]= new LatLng (-41.834052,-71.595145);
            senderoDedoGordo[138]= new LatLng (-41.833474,-71.595724);

            // SEPARADOR

            senderoEncanto[0]= new LatLng (-41.829315,-71.545378);
            senderoEncanto[1]= new LatLng (-41.829554,-71.546404);
            senderoEncanto[2]= new LatLng (-41.829474,-71.547463);
            senderoEncanto[3]= new LatLng (-41.829663,-71.548070);
            senderoEncanto[4]= new LatLng (-41.829451,-71.548272);
            senderoEncanto[5]= new LatLng (-41.829832,-71.548268);
            senderoEncanto[6]= new LatLng (-41.830591,-71.548880);
            senderoEncanto[7]= new LatLng (-41.831000,-71.549818);
            senderoEncanto[8]= new LatLng (-41.831519,-71.549994);
            senderoEncanto[9]= new LatLng (-41.832057,-71.550441);
            senderoEncanto[10]= new LatLng (-41.832613,-71.550604);
            senderoEncanto[11]= new LatLng (-41.833085,-71.551400);
            senderoEncanto[12]= new LatLng (-41.832682,-71.551511);
            senderoEncanto[13]= new LatLng (-41.832453,-71.552021);
            senderoEncanto[14]= new LatLng (-41.832781,-71.552200);
            senderoEncanto[15]= new LatLng (-41.832830,-71.552630);
            senderoEncanto[16]= new LatLng (-41.833113,-71.553088);
            senderoEncanto[17]= new LatLng (-41.832831,-71.553395);
            senderoEncanto[18]= new LatLng (-41.832399,-71.553581);
            senderoEncanto[19]= new LatLng (-41.831507,-71.553604);
            senderoEncanto[20]= new LatLng (-41.830599,-71.554013);
            senderoEncanto[21]= new LatLng (-41.830012,-71.553833);
            senderoEncanto[22]= new LatLng (-41.829803,-71.553457);
            senderoEncanto[23]= new LatLng (-41.829485,-71.553244);
            senderoEncanto[24]= new LatLng (-41.828427,-71.553335);
            senderoEncanto[25]= new LatLng (-41.827380,-71.553766);
            senderoEncanto[26]= new LatLng (-41.826879,-71.554272);
            senderoEncanto[27]= new LatLng (-41.826345,-71.554443);
            senderoEncanto[28]= new LatLng (-41.825550,-71.555835);
            senderoEncanto[29]= new LatLng (-41.824634,-71.556159);
            senderoEncanto[30]= new LatLng (-41.823695,-71.556239);
            senderoEncanto[31]= new LatLng (-41.822890,-71.556969);
            senderoEncanto[32]= new LatLng (-41.821537,-71.557490);
            senderoEncanto[33]= new LatLng (-41.820837,-71.558451);
            senderoEncanto[34]= new LatLng (-41.819544,-71.559476);
            senderoEncanto[35]= new LatLng (-41.819090,-71.560296);
            senderoEncanto[36]= new LatLng (-41.818455,-71.562222);
            senderoEncanto[37]= new LatLng (-41.818172,-71.562345);
            senderoEncanto[38]= new LatLng (-41.817794,-71.563978);
            senderoEncanto[39]= new LatLng (-41.817472,-71.564625);
            senderoEncanto[40]= new LatLng (-41.817163,-71.566972);
            senderoEncanto[41]= new LatLng (-41.816643,-71.567398);
            senderoEncanto[42]= new LatLng (-41.815379,-71.569602);
            senderoEncanto[43]= new LatLng (-41.815343,-71.570161);
            senderoEncanto[44]= new LatLng (-41.814586,-71.572060);
            senderoEncanto[45]= new LatLng (-41.814487,-71.573039);
            senderoEncanto[46]= new LatLng (-41.813759,-71.573626);
            senderoEncanto[47]= new LatLng (-41.813556,-71.573567);
            senderoEncanto[48]= new LatLng (-41.813266,-71.573762);
            senderoEncanto[49]= new LatLng (-41.813282,-71.574013);
            senderoEncanto[50]= new LatLng (-41.813582,-71.574393);
            senderoEncanto[51]= new LatLng (-41.814394,-71.574590);
            senderoEncanto[52]= new LatLng (-41.814317,-71.574985);
            senderoEncanto[53]= new LatLng (-41.814531,-71.575423);
            senderoEncanto[54]= new LatLng (-41.814493,-71.576216);
            senderoEncanto[55]= new LatLng (-41.814091,-71.576977);
            senderoEncanto[56]= new LatLng (-41.813576,-71.576810);
            senderoEncanto[57]= new LatLng (-41.813368,-71.577011);
            senderoEncanto[58]= new LatLng (-41.813340,-71.577655);
            senderoEncanto[59]= new LatLng (-41.812817,-71.578522);
            senderoEncanto[60]= new LatLng (-41.812993,-71.579153);
            senderoEncanto[61]= new LatLng (-41.812941,-71.581429);
            senderoEncanto[62]= new LatLng (-41.812843,-71.581915);
            senderoEncanto[63]= new LatLng (-41.812439,-71.582602);
            senderoEncanto[64]= new LatLng (-41.812153,-71.584383);
            senderoEncanto[65]= new LatLng (-41.811463,-71.584974);
            senderoEncanto[66]= new LatLng (-41.811376,-71.585399);
            senderoEncanto[67]= new LatLng (-41.810577,-71.586727);
            senderoEncanto[68]= new LatLng (-41.810178,-71.587010);
            senderoEncanto[69]= new LatLng (-41.810053,-71.587356);
            senderoEncanto[70]= new LatLng (-41.809725,-71.587610);
            senderoEncanto[71]= new LatLng (-41.809691,-71.588562);
            senderoEncanto[72]= new LatLng (-41.809448,-71.589575);
            senderoEncanto[73]= new LatLng (-41.808804,-71.590486);
            senderoEncanto[74]= new LatLng (-41.807724,-71.591511);
            senderoEncanto[75]= new LatLng (-41.807861,-71.591987);
            senderoEncanto[76]= new LatLng (-41.807675,-71.592649);
            senderoEncanto[77]= new LatLng (-41.807480,-71.592650);
            senderoEncanto[78]= new LatLng (-41.807170,-71.593047);
            senderoEncanto[79]= new LatLng (-41.806885,-71.593801);
            senderoEncanto[80]= new LatLng (-41.806400,-71.594471);
            senderoEncanto[81]= new LatLng (-41.805999,-71.594861);
            senderoEncanto[82]= new LatLng (-41.805641,-71.594809);
            senderoEncanto[83]= new LatLng (-41.805759,-71.595030);
            senderoEncanto[84]= new LatLng (-41.805769,-71.596555);
            senderoEncanto[85]= new LatLng (-41.805055,-71.598165);
            senderoEncanto[86]= new LatLng (-41.805156,-71.599858);
            senderoEncanto[87]= new LatLng (-41.804971,-71.601257);
            senderoEncanto[88]= new LatLng (-41.805474,-71.603043);
            senderoEncanto[89]= new LatLng (-41.805352,-71.604372);
            senderoEncanto[90]= new LatLng (-41.806346,-71.607345);
            senderoEncanto[91]= new LatLng (-41.806788,-71.611034);
            senderoEncanto[92]= new LatLng (-41.807080,-71.611584);
            senderoEncanto[93]= new LatLng (-41.807044,-71.612000);
            senderoEncanto[94]= new LatLng (-41.807420,-71.612967);
            senderoEncanto[95]= new LatLng (-41.807388,-71.613940);
            senderoEncanto[96]= new LatLng (-41.807130,-71.614097);



        }


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(refugioDedoGordo, 12));

        mMap.getUiSettings().setZoomControlsEnabled(true);


        mMap.addPolyline(
                new PolylineOptions()
                        .add(senderoDedoGordo[0])
                        .add(senderoDedoGordo[1])
                        .add(senderoDedoGordo[2])
                        .add(senderoDedoGordo[3])
                        .add(senderoDedoGordo[4])
                        .add(senderoDedoGordo[5])
                        .add(senderoDedoGordo[6])
                        .add(senderoDedoGordo[7])
                        .add(senderoDedoGordo[8])
                        .add(senderoDedoGordo[9])
                        .add(senderoDedoGordo[10])
                        .add(senderoDedoGordo[11])
                        .add(senderoDedoGordo[12])
                        .add(senderoDedoGordo[13])
                        .add(senderoDedoGordo[14])
                        .add(senderoDedoGordo[15])
                        .add(senderoDedoGordo[16])
                        .add(senderoDedoGordo[17])
                        .add(senderoDedoGordo[18])
                        .add(senderoDedoGordo[19])
                        .add(senderoDedoGordo[20])
                        .add(senderoDedoGordo[21])
                        .add(senderoDedoGordo[22])
                        .add(senderoDedoGordo[23])
                        .add(senderoDedoGordo[24])
                        .add(senderoDedoGordo[25])
                        .add(senderoDedoGordo[26])
                        .add(senderoDedoGordo[27])
                        .add(senderoDedoGordo[28])
                        .add(senderoDedoGordo[29])
                        .add(senderoDedoGordo[30])
                        .add(senderoDedoGordo[31])
                        .add(senderoDedoGordo[32])
                        .add(senderoDedoGordo[33])
                        .add(senderoDedoGordo[34])
                        .add(senderoDedoGordo[35])
                        .add(senderoDedoGordo[36])
                        .add(senderoDedoGordo[37])
                        .add(senderoDedoGordo[38])
                        .add(senderoDedoGordo[39])
                        .add(senderoDedoGordo[40])
                        .add(senderoDedoGordo[41])
                        .add(senderoDedoGordo[42])
                        .add(senderoDedoGordo[43])
                        .add(senderoDedoGordo[44])
                        .add(senderoDedoGordo[45])
                        .add(senderoDedoGordo[46])
                        .add(senderoDedoGordo[47])
                        .add(senderoDedoGordo[48])
                        .add(senderoDedoGordo[49])
                        .add(senderoDedoGordo[50])
                        .add(senderoDedoGordo[51])
                        .add(senderoDedoGordo[52])
                        .add(senderoDedoGordo[53])
                        .add(senderoDedoGordo[54])
                        .add(senderoDedoGordo[55])
                        .add(senderoDedoGordo[56])
                        .add(senderoDedoGordo[57])
                        .add(senderoDedoGordo[58])
                        .add(senderoDedoGordo[59])
                        .add(senderoDedoGordo[60])
                        .add(senderoDedoGordo[61])
                        .add(senderoDedoGordo[62])
                        .add(senderoDedoGordo[63])
                        .add(senderoDedoGordo[64])
                        .add(senderoDedoGordo[65])
                        .add(senderoDedoGordo[66])
                        .add(senderoDedoGordo[67])
                        .add(senderoDedoGordo[68])
                        .add(senderoDedoGordo[69])
                        .add(senderoDedoGordo[70])
                        .add(senderoDedoGordo[71])
                        .add(senderoDedoGordo[72])
                        .add(senderoDedoGordo[73])
                        .add(senderoDedoGordo[74])
                        .add(senderoDedoGordo[75])
                        .add(senderoDedoGordo[76])
                        .add(senderoDedoGordo[77])
                        .add(senderoDedoGordo[78])
                        .add(senderoDedoGordo[79])
                        .add(senderoDedoGordo[80])
                        .add(senderoDedoGordo[81])
                        .add(senderoDedoGordo[82])
                        .add(senderoDedoGordo[83])
                        .add(senderoDedoGordo[84])
                        .add(senderoDedoGordo[85])
                        .add(senderoDedoGordo[86])
                        .add(senderoDedoGordo[87])
                        .add(senderoDedoGordo[88])
                        .add(senderoDedoGordo[89])
                        .add(senderoDedoGordo[90])
                        .add(senderoDedoGordo[91])
                        .add(senderoDedoGordo[92])
                        .add(senderoDedoGordo[93])
                        .add(senderoDedoGordo[94])
                        .add(senderoDedoGordo[95])
                        .add(senderoDedoGordo[96])
                        .add(senderoDedoGordo[97])
                        .add(senderoDedoGordo[98])
                        .add(senderoDedoGordo[99])
                        .add(senderoDedoGordo[100])
                        .add(senderoDedoGordo[101])
                        .add(senderoDedoGordo[102])
                        .add(senderoDedoGordo[103])
                        .add(senderoDedoGordo[104])
                        .add(senderoDedoGordo[105])
                        .add(senderoDedoGordo[106])
                        .add(senderoDedoGordo[107])
                        .add(senderoDedoGordo[108])
                        .add(senderoDedoGordo[109])
                        .add(senderoDedoGordo[110])
                        .add(senderoDedoGordo[111])
                        .add(senderoDedoGordo[112])
                        .add(senderoDedoGordo[113])
                        .add(senderoDedoGordo[114])
                        .add(senderoDedoGordo[115])
                        .add(senderoDedoGordo[116])
                        .add(senderoDedoGordo[117])
                        .add(senderoDedoGordo[118])
                        .add(senderoDedoGordo[119])
                        .add(senderoDedoGordo[120])
                        .add(senderoDedoGordo[121])
                        .add(senderoDedoGordo[122])
                        .add(senderoDedoGordo[123])
                        .add(senderoDedoGordo[124])
                        .add(senderoDedoGordo[125])
                        .add(senderoDedoGordo[126])
                        .add(senderoDedoGordo[127])
                        .add(senderoDedoGordo[128])
                        .add(senderoDedoGordo[129])
                        .add(senderoDedoGordo[130])
                        .add(senderoDedoGordo[131])
                        .add(senderoDedoGordo[132])
                        .add(senderoDedoGordo[133])
                        .add(senderoDedoGordo[134])
                        .add(senderoDedoGordo[135])
                        .add(senderoDedoGordo[136])
                        .add(senderoDedoGordo[137])
                        .add(senderoDedoGordo[138])
                        .add(refugioDedoGordo)

                        .width(4f)
                        .color(Color.YELLOW)
        );

        mMap.addPolyline(
                new PolylineOptions()
                        .add(senderoEncanto[0])
                        .add(senderoEncanto[1])
                        .add(senderoEncanto[2])
                        .add(senderoEncanto[3])
                        .add(senderoEncanto[4])
                        .add(senderoEncanto[5])
                        .add(senderoEncanto[6])
                        .add(senderoEncanto[7])
                        .add(senderoEncanto[8])
                        .add(senderoEncanto[9])
                        .add(senderoEncanto[10])
                        .add(senderoEncanto[11])
                        .add(senderoEncanto[12])
                        .add(senderoEncanto[13])
                        .add(senderoEncanto[14])
                        .add(senderoEncanto[15])
                        .add(senderoEncanto[16])
                        .add(senderoEncanto[17])
                        .add(senderoEncanto[18])
                        .add(senderoEncanto[19])
                        .add(senderoEncanto[20])
                        .add(senderoEncanto[21])
                        .add(senderoEncanto[22])
                        .add(senderoEncanto[23])
                        .add(senderoEncanto[24])
                        .add(senderoEncanto[25])
                        .add(senderoEncanto[26])
                        .add(senderoEncanto[27])
                        .add(senderoEncanto[28])
                        .add(senderoEncanto[29])
                        .add(senderoEncanto[30])
                        .add(senderoEncanto[31])
                        .add(senderoEncanto[32])
                        .add(senderoEncanto[33])
                        .add(senderoEncanto[34])
                        .add(senderoEncanto[35])
                        .add(senderoEncanto[36])
                        .add(senderoEncanto[37])
                        .add(senderoEncanto[38])
                        .add(senderoEncanto[39])
                        .add(senderoEncanto[40])
                        .add(senderoEncanto[41])
                        .add(senderoEncanto[42])
                        .add(senderoEncanto[43])
                        .add(senderoEncanto[44])
                        .add(senderoEncanto[45])
                        .add(senderoEncanto[46])
                        .add(senderoEncanto[47])
                        .add(senderoEncanto[48])
                        .add(senderoEncanto[49])
                        .add(senderoEncanto[50])
                        .add(senderoEncanto[51])
                        .add(senderoEncanto[52])
                        .add(senderoEncanto[53])
                        .add(senderoEncanto[54])
                        .add(senderoEncanto[55])
                        .add(senderoEncanto[56])
                        .add(senderoEncanto[57])
                        .add(senderoEncanto[58])
                        .add(senderoEncanto[59])
                        .add(senderoEncanto[60])
                        .add(senderoEncanto[61])
                        .add(senderoEncanto[62])
                        .add(senderoEncanto[63])
                        .add(senderoEncanto[64])
                        .add(senderoEncanto[65])
                        .add(senderoEncanto[66])
                        .add(senderoEncanto[67])
                        .add(senderoEncanto[68])
                        .add(senderoEncanto[69])
                        .add(senderoEncanto[70])
                        .add(senderoEncanto[71])
                        .add(senderoEncanto[72])
                        .add(senderoEncanto[73])
                        .add(senderoEncanto[74])
                        .add(senderoEncanto[75])
                        .add(senderoEncanto[76])
                        .add(senderoEncanto[77])
                        .add(senderoEncanto[78])
                        .add(senderoEncanto[79])
                        .add(senderoEncanto[80])
                        .add(senderoEncanto[81])
                        .add(senderoEncanto[82])
                        .add(senderoEncanto[83])
                        .add(senderoEncanto[84])
                        .add(senderoEncanto[85])
                        .add(senderoEncanto[86])
                        .add(senderoEncanto[87])
                        .add(senderoEncanto[88])
                        .add(senderoEncanto[89])
                        .add(senderoEncanto[90])
                        .add(senderoEncanto[91])
                        .add(senderoEncanto[92])
                        .add(senderoEncanto[93])
                        .add(senderoEncanto[94])
                        .add(senderoEncanto[95])
                        .add(senderoEncanto[96])

                        .width(4f)
                        .color(Color.MAGENTA)
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
