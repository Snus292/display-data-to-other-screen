package com.example.nimiteiseleekraanile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText lastname;
    private EditText age;
    private EditText  city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.name);
        lastname=(EditText) findViewById(R.id.lastname);
        age=(EditText) findViewById(R.id.age);
        city=(EditText) findViewById(R.id.city);
    }//onCreate
    //*************************************************
    public void goNewView(View v){
        switch(v.getId()){
            case R.id.btnActTwo:
                //указываем связь с каким activity будем работать
                Intent intent=new Intent(this, activity_teine__ekraan.class);
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("lastname", lastname.getText().toString());
                intent.putExtra("age", age.getText().toString());
                intent.putExtra("city", city.getText().toString());
                //показать новое activity (другой экран)
                startActivity(intent);
                break;
            default:
                break;
        }//switch
    }
}