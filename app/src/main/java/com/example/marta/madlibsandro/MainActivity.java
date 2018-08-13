package com.example.marta.madlibsandro;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText txtAnimal;
    public EditText txtCont;
    public EditText txtEat;
    public EditText txtVerb;
    public Button btnStory;
    public EditText txtStory;

    public void make() {
        String animal = txtAnimal.getText().toString();
        String verb = txtVerb.getText().toString();
        String eat = txtEat.getText().toString();
        String cont = txtCont.getText().toString();


        String story = "Once upon a time there was a\n" + animal + " princess " +
                " who " + verb + " in a " + eat + " " + cont;

        txtStory.setText(story);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAnimal = (EditText) findViewById(R.id.txtAnimal);
        txtCont = (EditText) findViewById(R.id.txtCont);
        txtEat = (EditText) findViewById(R.id.txtEat);
        txtVerb = (EditText) findViewById(R.id.txtVerb);
        txtStory = (EditText) findViewById(R.id.txtStory);
        btnStory = (Button) findViewById(R.id.btnStory);
        btnStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                make();

            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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
}
