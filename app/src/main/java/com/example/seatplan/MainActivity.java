package com.example.seatplan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.seatplan.R;
import com.example.seatplan.about_me;
import com.example.seatplan.aunit;
import com.example.seatplan.bunit;
import com.example.seatplan.cunit;
import com.example.seatplan.dunit;

public class MainActivity extends AppCompatActivity {
    private Button unita;
    private Button unitb;
    private Button unitc;
    private Button unitd;
    private TextView textView;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unita=(Button)findViewById(R.id.unita);
        unitb=(Button)findViewById(R.id.unitb);
        unitc=(Button)findViewById(R.id.unitc);
        unitd=(Button)findViewById(R.id.unitd);


        unita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, aunit.class);
                startActivity(intent);

            }
        });
        unitb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, bunit.class);
                startActivity(intent);

            }
        });

        unitc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, cunit.class);
                startActivity(intent);

            }
        });
        unitd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, dunit.class);
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
                Intent intent=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
        }

        switch (item.getItemId())
        {
            case R.id.people:
                Intent intent=new Intent(MainActivity.this, about_me.class);
                startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }





}
