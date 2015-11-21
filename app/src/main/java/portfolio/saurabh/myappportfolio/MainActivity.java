package portfolio.saurabh.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        findViewById(R.id.spotify).setOnClickListener(this);
        findViewById(R.id.scores).setOnClickListener(this);
        findViewById(R.id.library).setOnClickListener(this);
        findViewById(R.id.bigger).setOnClickListener(this);
        findViewById(R.id.xyz_reader).setOnClickListener(this);
        findViewById(R.id.capstone).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.spotify:
                Toast.makeText(this,R.string.spotify_streamer_toast,Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores:
                Toast.makeText(this,R.string.football_scores_toast,Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                Toast.makeText(this,R.string.library_toast,Toast.LENGTH_SHORT).show();
                break;
            case R.id.bigger:
                Toast.makeText(this,R.string.buid_it_bigger_toast,Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyz_reader:
                Toast.makeText(this,R.string.xyz_reader_toast,Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(this,R.string.capstone_toast,Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
