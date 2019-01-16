package com.example.demouser.demogituse;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ProgressBar pB;
    CheckBox physical, spiritual, mental, emotional;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        emotional = (CheckBox)findViewById(R.id.EmotionalCheckBox);
        spiritual = (CheckBox)findViewById(R.id.SpiritualCheckBox);
        mental = (CheckBox)findViewById(R.id.MentalCheckBox);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {

        int id = item.getItemId();

        if (id == R.id.nav_home) {
            displayFragment(new WelcomeFragment());
        }
        else if (id == R.id.nav_info)
        {
            displayFragment(new InfoFragment());
        }
        else if (id == R.id.nav_checklist) {
            displayFragment(new ChecklistFragment());
        } else if (id == R.id.nav_journal) {
            displayFragment(new JournalFragment());
        } else if (id == R.id.nav_gratitudeAndAffirmations) {

        } else if (id == R.id.nav_resources) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    public void physicalCheckBx()
    {
        pB = (ProgressBar)findViewById(R.id.progressBar);
        physical = (CheckBox)findViewById(R.id.PhysicalCheckBox);

        physical.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                pB.setProgress(10);
            }
        });
    }

    public void emotionalCheckBx()
    {
        pB = (ProgressBar) findViewById(R.id.progressBar);
        emotional = (CheckBox)findViewById(R.id.EmotionalCheckBox);

        emotional.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                pB.setProgress(10);
            }
        });
    }

    public void spiritualCheckBx()
    {
        pB = (ProgressBar) findViewById(R.id.progressBar);
        spiritual = (CheckBox)findViewById(R.id.SpiritualCheckBox);

        emotional.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                pB.setProgress(10);
            }
        });

    }

    public void mentalCheckBx()
    {
        pB = (ProgressBar) findViewById(R.id.progressBar);
        mental = (CheckBox)findViewById(R.id.MentalCheckBox);

        mental.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.N)
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                pB.setProgress(10, true);
            }
        });
    }
}
