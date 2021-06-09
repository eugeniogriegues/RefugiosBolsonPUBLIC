package google.maps.bolson.refugiosbolson;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    Button btnTipo, btnRutaHieloAzul, btnRutaCajonAzul, btnRutaMotoco, btnInfo, btnRutaPiltri, btnRutaCerroLindo, btnRutaEncanto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRutaHieloAzul = (Button) findViewById(R.id.btnRutaHieloAzul);
        btnRutaCajonAzul = (Button) findViewById(R.id.btnRutaCajonAzul);
        btnRutaCerroLindo = (Button) findViewById(R.id.btnRutaCerroLindo);
        btnRutaMotoco = (Button) findViewById(R.id.btnRutaMotoco);
        btnTipo = (Button) findViewById(R.id.btnTipos);
        btnRutaPiltri = (Button) findViewById(R.id.btnRutaPiltri);
        btnInfo = (Button) findViewById(R.id.btnInfo);
        btnRutaEncanto = (Button) findViewById(R.id.btnRutaEncanto);
    }

    public void Tipo(View v) {

        Intent intent = new Intent(getApplicationContext(), MapsTipo.class);
        startActivity(intent);
    }

    public void RutaHieloAzul(View v) {

        Intent intent = new Intent(getApplicationContext(), RutaHieloAzul.class);
        startActivity(intent);
    }

    public void RutaCajonAzul(View v) {

        Intent intent = new Intent(getApplicationContext(), RutaCajonAzul.class);
        startActivity(intent);
    }

    public void RutaCerroLindo(View v) {

        Intent intent = new Intent(getApplicationContext(), RutaCerroLindo.class);
        startActivity(intent);
    }

    public void RutaMotoco(View v) {

        Intent intent = new Intent(getApplicationContext(), RutaMotoco.class);
        startActivity(intent);
    }

    public void RutaPiltri(View v) {

        Intent intent = new Intent(getApplicationContext(), RutaPiltri.class);
        startActivity(intent);
    }

    public void RutaEncanto(View v) {

        Intent intent = new Intent(getApplicationContext(), RutaEncanto.class);
        startActivity(intent);
    }

    public void Info(View v) {

        Intent intent = new Intent(getApplicationContext(), Info.class);
        startActivity(intent);
    }
}





