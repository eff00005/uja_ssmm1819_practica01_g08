package es.ujaen.labtelema.practica1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements FragmentAuth.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ARRANCANDO","La aplicacion movil se esta iniciando");
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
