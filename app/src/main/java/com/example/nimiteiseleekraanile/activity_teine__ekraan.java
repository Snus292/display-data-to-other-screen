package com.example.nimiteiseleekraanile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_teine__ekraan extends AppCompatActivity {
    private TextView name;
    private TextView lastname;
    private TextView age;
    private TextView  city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teine_ekraan);
        name=(TextView) findViewById(R.id.nametxt);
        lastname=(TextView) findViewById(R.id.lastnametxt);
        age=(TextView) findViewById(R.id.agetxt);
        city=(TextView) findViewById(R.id.citytxt);
        //принимаем имя
        String txtName=getIntent().getStringExtra("name");
        //принимаем perekonnanimi
        String txtLastname=getIntent().getStringExtra("lastname");
        String txtAge=getIntent().getStringExtra("age");
        String txtCity=getIntent().getStringExtra("city");
        //Показываем полученные значения в наши вьюшки TextView
        name.setText(name.getText().toString()+" "+txtName);
        lastname.setText(lastname.getText().toString()+" "+txtLastname);
        age.setText(age.getText().toString()+" "+txtAge);
        city.setText(city.getText().toString()+" "+txtCity);
    }
    public void back(View v){
        switch (v.getId()){
            case R.id.back_button:
                Intent intent =new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}