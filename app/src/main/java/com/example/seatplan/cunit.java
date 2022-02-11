package com.example.seatplan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cunit extends AppCompatActivity {
    private EditText eroll;
    private Button esearch;
    private TextView eresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aunit);
        eroll=(EditText) findViewById(R.id.roll);
        esearch=(Button) findViewById(R.id.search);

        esearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=eroll.getText().toString();
                Intent intent= new Intent(cunit.this,cresult.class);
                intent.putExtra("data",data);
                startActivity(intent);


            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.simple_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Intent intent=new Intent(cunit.this,MainActivity.class);
                startActivity(intent);
        }

        switch (item.getItemId())
        {
            case R.id.people:
                Intent intent=new Intent(cunit.this,about_me.class);
                startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }

}
