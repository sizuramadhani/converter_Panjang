package com.example.sizura.convertermada;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    TextView textkm;
    TextView texthm;
    TextView textdam;
    TextView textm;
    TextView textdm;
    TextView textcm;
    TextView textmm;
    EditText hasil;

    private String [] list = {
            "Km","hm","dam","m","dm","cm","mm"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        spinner = (Spinner)findViewById(R.id.spinner);
        textkm = (TextView)findViewById(R.id.txt1);
        texthm = (TextView) findViewById(R.id.txt2);
        textdam = (TextView) findViewById(R.id.txt3);
        textm = (TextView) findViewById(R.id.txt4);
        textdm = (TextView) findViewById(R.id.txt5);
        textcm = (TextView) findViewById(R.id.txt6);
        textmm = (TextView) findViewById(R.id.txt7);
        hasil = (EditText) findViewById(R.id.edit);


        spinner.setOnItemSelectedListener(this);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
    }



    @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Double a = 0.0;

        try {
             a = Double.parseDouble(hasil.getText().toString());

        }catch (NumberFormatException e){
            Log.e ("error" ,"" +e);
        }
        if (list [i] == "Km"){
            double km = a*1 ;
            textkm.setText(""+km);
            double hm = a * 10;
            texthm.setText(""+hm);
            double dam = a * 100;
            textdam.setText( "" + dam);
            double m = a * 1000;
            textm.setText( "" + m);
            double dm = a * 10000;
            textdm.setText( "" + dm);
            double cm = a * 100000;
            textcm.setText( "" + cm);
            double mm = a * 1000000;
            textmm.setText( "" + mm);

        }
        else if (list[i] == "hm"){
            double km = a*0.1 ;
            textkm.setText(""+km);
            double hm = a * 1;
            texthm.setText(""+hm);
            double dam = a * 10;
            textdam.setText( "" + dam);
            double m = a * 100;
            textm.setText( "" + m);
            double dm = a * 1000;
            textdm.setText( "" + dm);
            double cm = a * 10000;
            textcm.setText( "" + cm);
            double mm = a * 100000;
            textmm.setText( "" + mm);
        }
        else if (list[i] == "dam"){
            double km = a*0.01 ;
            textkm.setText(""+km);
            double hm = a * 0.1;
            texthm.setText(""+hm);
            double dam = a * 1;
            textdam.setText( "" + dam);
            double m = a * 10;
            textm.setText( "" + m);
            double dm = a * 100;
            textdm.setText( "" + dm);
            double cm = a * 1000;
            textcm.setText( "" + cm);
            double mm = a * 10000;
            textmm.setText( "" + mm);
        }
        else if (list[i] == "m"){
            double km = a*0.001 ;
            textkm.setText(""+km);
            double hm = a * 0.01;
            texthm.setText(""+hm);
            double dam = a * 0.1;
            textdam.setText( "" + dam);
            double m = a * 1;
            textm.setText( "" + m);
            double dm = a * 10;
            textdm.setText( "" + dm);
            double cm = a * 100;
            textcm.setText( "" + cm);
            double mm = a * 1000;
            textmm.setText( "" + mm);
        }
        else if (list[i] == "dm"){
            double km = a*0.0001 ;
            textkm.setText(""+km);
            double hm = a * 0.001;
            texthm.setText(""+hm);
            double dam = a * 0.01;
            textdam.setText( "" + dam);
            double m = a * 0.1;
            textm.setText( "" + m);
            double dm = a * 1;
            textdm.setText( "" + dm);
            double cm = a * 10;
            textcm.setText( "" + cm);
            double mm = a * 100;
            textmm.setText( "" + mm);
        }
        else if (list[i] == "cm"){
            double km = a*0.00001 ;
            textkm.setText(""+km);
            double hm = a * 0.0001;
            texthm.setText(""+hm);
            double dam = a * 0.001;
            textdam.setText( "" + dam);
            double m = a * 0.01;
            textm.setText( "" + m);
            double dm = a * 0.1;
            textdm.setText( "" + dm);
            double cm = a * 1;
            textcm.setText( "" + cm);
            double mm = a * 10;
            textmm.setText( "" + mm);
        }
        else if (list[i] == "mm"){
            double km = a*0.000001 ;
            textkm.setText(""+km);
            double hm = a * 0.00001;
            texthm.setText(""+hm);
            double dam = a * 0.0001;
            textdam.setText( "" + dam);
            double m = a * 0.001;
            textm.setText( "" + m);
            double dm = a * 0.01;
            textdm.setText( "" + dm);
            double cm = a * 0.1;
            textcm.setText( "" + cm);
            double mm = a * 1;
            textmm.setText( "" + mm);
        }
    }




    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    }

