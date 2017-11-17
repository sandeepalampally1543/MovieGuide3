package easyway.com.movieguide.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

import easyway.com.movieguide.R;

public class StudentProfile extends AppCompatActivity {

android.support.v7.widget.Toolbar toolbar;
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Student Profile");

        relativeLayout = (RelativeLayout) findViewById(R.id.relative1);
        relativeLayout = (RelativeLayout) findViewById(R.id.relative2);
    }
}
