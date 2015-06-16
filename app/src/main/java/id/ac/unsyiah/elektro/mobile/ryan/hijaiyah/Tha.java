package id.ac.unsyiah.elektro.mobile.ryan.hijaiyah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Tha extends ActionBarActivity implements View.OnClickListener {

    MediaPlayer ourMusic = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tha);

        Button btnback = (Button) findViewById(R.id.menu );
        btnback.setOnClickListener(this);

        Button suara = (Button) findViewById(R.id.suara);
        suara.setOnClickListener(this);

        Button Dha = (Button) findViewById(R.id.lanjut);
        Dha.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.menu) {
            Intent keHuruf = new Intent(Tha.this, PilihHuruf.class);
            startActivity(keHuruf);
            finish();
        }



        if (v.getId() ==  R.id.suara) {
            if (ourMusic == null) {
                ourMusic = MediaPlayer.create(Tha.this, R.raw.o16);
            }
            if(ourMusic.isPlaying()){
                ourMusic.pause();

            }else{
                ourMusic.start();


            }
        }

        if (v.getId() == R.id.lanjut) {
            Intent keHuruf = new Intent(Tha.this,Zha.class);
            startActivity(keHuruf);

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tha, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
