package easyway.com.movieguide.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import easyway.com.movieguide.R;
import easyway.com.movieguide.fragment.Attendence;
import easyway.com.movieguide.fragment.BusRoutes;
import easyway.com.movieguide.fragment.Gallery;
import easyway.com.movieguide.fragment.StudentDirectory;

public class MainActivity extends AppCompatActivity
         {

             Toolbar  toolbar;
             DrawerLayout drawerLayout;
             android.support.v4.app.FragmentTransaction fragmentTransaction;
             ActionBarDrawerToggle actionBarDrawerToggle;
             NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar) ;
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_container,new BusRoutes());
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("BusRoute Details ");

        navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.english:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new BusRoutes());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Bus Route");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.attendence:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new Attendence());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Attendence");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.student_dir:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new StudentDirectory());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Student Directory");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.gallery:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new Gallery());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Gallery");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;
                }

                return true;
            }
        });

    }

             @Override
             public void onPostCreate(@Nullable Bundle savedInstanceState) {
                 super.onPostCreate(savedInstanceState);
                 actionBarDrawerToggle.syncState();
             }

    }
