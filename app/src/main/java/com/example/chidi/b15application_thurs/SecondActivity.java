package com.example.chidi.b15application_thurs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    Button mybutton1;
    Button mybutton2;
    TextView tvResult1;
    TextView tvPhoneNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvResult1 =findViewById(R.id.etResult);
        tvPhoneNumber2 = findViewById(R.id.etPhoneNumber);
        String res1 = getIntent().getExtras().getString("key1");
        String res2 = getIntent().getExtras().getString("key2");
        //Log.i("mytag", res2);
        tvResult1.setText(res1);
        tvPhoneNumber2.setText(res2);





        mybutton1 = findViewById(R.id.btPrevious);
        mybutton2 = findViewById(R.id.btNext);
        mybutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        mybutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("mytag", "SecondActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("mytag", "SecondActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("mytag", "SecondActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("mytag", "SecondActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("mytag", "SecondActivity onDestroy");
    }

}
