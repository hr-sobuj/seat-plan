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
import android.widget.TextView;

public class dresult extends AppCompatActivity {
    private TextView sroll;
    private TextView build;
    private TextView sroom;
    private TextView time1;
    private TextView date1;
    private TextView shift1;
    private Button serchagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aresult);
        sroll=(TextView) findViewById(R.id.roll2);
        build=(TextView) findViewById(R.id.building);
        sroom=(TextView) findViewById(R.id.room);
        time1=(TextView) findViewById(R.id.time);
        date1=(TextView) findViewById(R.id.date);
        shift1=(TextView) findViewById(R.id.shift);
        serchagain=(Button) findViewById(R.id.search_again);
        serchagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(dresult.this,dunit.class);
                startActivity(intent);
            }
        });
        int num=Integer.parseInt(getIntent().getStringExtra("data")) ;
        if(num==1200)
        {
            sroll.setText(getIntent().getStringExtra("data"));
            build.setText("ওয়াজেদ ভবন");
            sroom.setText("234");
            date1.setText("2/12/19");
            shift1.setText("A1");
            time1.setText("11:00 PM");
        }
        if(num>=1200&&num<=1300)
        {
            sroll.setText(getIntent().getStringExtra("data"));
            build.setText("ওয়াজেদ ভবন");
            sroom.setText("235");
            date1.setText("3/12/19");
            shift1.setText("A2");
            time1.setText("12:00 PM");
        }

        else if(num>=1300&&num<=1400)
        {
            sroll.setText(getIntent().getStringExtra("data"));
            build.setText("ওয়াজেদ ভবন");
            sroom.setText("236");
            date1.setText("4/12/19");
            shift1.setText("A3");
            time1.setText("1:00");
        }






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
                Intent intent=new Intent(dresult.this,MainActivity.class);
                startActivity(intent);
        }

        switch (item.getItemId())
        {
            case R.id.people:
                Intent intent=new Intent(dresult.this,about_me.class);
                startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }

}
