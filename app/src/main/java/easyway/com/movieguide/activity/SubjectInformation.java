package easyway.com.movieguide.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import easyway.com.movieguide.R;

public class SubjectInformation extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Toolbar toolbar;
    TextView clss, section, subject;
    Spinner clsspinner;
    ArrayAdapter arrayAdapter;
    String[] classes = {"First","Second","Third","Fourth"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_information);

        toolbar = (Toolbar) findViewById(R.id.include);
        setSupportActionBar(toolbar);
        clss = (TextView) findViewById(R.id.select_class);
        section = (TextView) findViewById(R.id.select_section);
        subject = (TextView) findViewById(R.id.select_section);

        clsspinner = (Spinner) findViewById(R.id.class_spinner);

        clsspinner.setOnItemSelectedListener(this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(SubjectInformation.this,android.R.layout.simple_spinner_item,classes);

//        arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,classes);
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        clsspinner.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
