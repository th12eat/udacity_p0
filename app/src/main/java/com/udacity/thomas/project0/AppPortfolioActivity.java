package com.udacity.thomas.project0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class AppPortfolioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);

        Button spotifyStreamerButton = (Button) findViewById(R.id.SpotifyStreamerButton);
        Button scoresAppButton = (Button) findViewById(R.id.ScoresAppButton);
        Button libraryAppButton = (Button) findViewById(R.id.LibraryAppButton);
        Button buildItBiggerButton = (Button) findViewById(R.id.BuildItBiggerButton);
        Button xyzReaderButton = (Button) findViewById(R.id.XYZReaderButton);
        Button capstoneMyOwnAppButton = (Button) findViewById(R.id.CapstoneButton);

        spotifyStreamerButton.setOnClickListener(createClickListener(getResources().getString(R.string.project_1_short_app_name)));
        scoresAppButton.setOnClickListener(createClickListener(getResources().getString(R.string.project_2_short_app_name)));
        libraryAppButton.setOnClickListener(createClickListener(getResources().getString(R.string.project_3_short_app_name)));
        buildItBiggerButton.setOnClickListener(createClickListener(getResources().getString(R.string.project_4_short_app_name)));
        xyzReaderButton.setOnClickListener(createClickListener(getResources().getString(R.string.project_5_short_app_name)));
        capstoneMyOwnAppButton.setOnClickListener(createClickListener(getResources().getString(R.string.project_6_short_app_name)));
    }

    public View.OnClickListener createClickListener(final String appName) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                String preText = getResources().getString(R.string.button_toast_pre_wrapper);
                String postText = getResources().getString(R.string.button_toast_post_wrapper);

                Toast toast = Toast.makeText(context, preText + appName + postText, Toast.LENGTH_SHORT);
                toast.show();
            }
        };
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_portfolio, menu);
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
