package com.example.diasfu.academytutorialapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mNameField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField = (EditText)findViewById(R.id.enter_name_hint);
        TextView greetingMessage= (TextView) findViewById(R.id.greetings_message);  //setting up the display message, in order to change it later on

        Typeface tf= Typeface.createFromAsset(getAssets(), "fonts/allura.ttf");
        mNameField.setTypeface(tf);
        greetingMessage.setTypeface(tf);
    }

    public void onButtonClicked(View view){
        //this code is executed when a button has been clicked
        //making a toast
        String enteredName = mNameField.getText().toString();
        Toast.makeText(this, "Hello there "+enteredName, Toast.LENGTH_LONG).show();
    }
    //creating the button to go to blanco image
    public void onViewImageButton(View view){
        //this code will start a new activity, and will be triggerend when the appropriate button will be pressed
        /*
        The intent takes two arguments, the first is the context which allows the app to know what activity is currently active.
        The second is the .class field withinn the Activity that you want change to, this way it chenges from the Activity you're currently
        in to the one that you specify as the second parameters.
         */
        Intent intent = new Intent(this, DisplayImageActivity.class);
        startActivity(intent);    //starts the new activity
    }
    public void onViewImageButtonNot(View view){
        Intent intent = new Intent(this, DisplayImageActivity2.class);
        startActivity(intent);
    }

    //this will go to the Form Activity
    public void formButtonOption(View view){
        Intent intent = new Intent(this, DisplayFormActivity.class);
        startActivity(intent);
    }
    public void picturesButton(View view){
        Intent intent = new Intent(this, ImageGridActivity.class);
        startActivity(intent);
    }

    /*
    *   //THIS CODE WILL UNDERLINE THE TEXT!!!!!!!!!!!!!!!!!!!!!!
        Button forgottenPassword = (Button) findViewById(R.id.forgotten_button_id);
        forgottenPassword.setPaintFlags(forgottenPassword.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);


    * */
}
