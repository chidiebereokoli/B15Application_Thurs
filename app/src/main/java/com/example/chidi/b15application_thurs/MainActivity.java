package com.example.chidi.b15application_thurs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 *  javadoc comment pushed
 */
public class MainActivity extends AppCompatActivity {
//Test pushing
    //Test pushing

    Button mybutton1;
    Button mybutton2;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    //this is the bridge between the java core and the xml.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mybutton1 = findViewById(R.id.button1);
        mybutton2 = findViewById(R.id.button2);
        editText1 = findViewById(R.id.etUsername);
        editText2 = findViewById(R.id.etPassword);
        editText3 = findViewById(R.id.etPhoneNumber);

        Log.i("mytag", "Activity onCreate");

        //WE HAVE SET A LISTENER TO THIS BUTTON
        mybutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the peice of code we have here will be executed on the click of a button
                String username1 = editText1.getText().toString();
                String username2 = editText3.getText().toString();
                //Toast.makeText(MainActivity.this, username, Toast.LENGTH_LONG).show();
/*                if ( editText2.getText().toString() == "123"){
                    Toast.makeText(MainActivity.this, "Username and Password correctly entered", Toast.LENGTH_LONG).show();
                }*/
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("key1",username1);
                i.putExtra("key2",username2);
                startActivity(i);



/*                Intent ii = new Intent(MainActivity.this, SecondActivity.class);
                ii.putExtra("key2",username2);
                startActivity(ii);*/



            }
        });

        mybutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the peice of code we have here will be executed on the click of a button
                Toast.makeText(MainActivity.this, "GOD REIGNS", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("mytag", "Activity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("mytag", "Activity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("mytag", "Activity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("mytag", "Activity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("mytag", "Activity onDestroy");
    }
}
