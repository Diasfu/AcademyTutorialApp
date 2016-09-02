package com.example.diasfu.academytutorialapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Comment;

import java.lang.NullPointerException;

public class DisplayFormActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "USEERNAME";
    public static final String AGE_KEY = "USERAGE";
    public static final String EMAIL_KEY= "USERMAIL";
    public static final String PHONENUM_KEY= "USERPHONENUM";

//Comment quick change adding more to this amazing comment...

    private EditText mDataField;

    private EditText mNameField;
    private EditText mAgeField;
    private EditText mEmailField;
    private EditText mPhoneField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_form);

        mNameField= (EditText)findViewById(R.id.form_enter_name_hint);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/learning_curve.ttf");
        mNameField.setTypeface(tf);


        mAgeField = (EditText) findViewById(R.id.form_enter_age_hint);
        mAgeField.setTypeface(tf);

        mEmailField= (EditText)findViewById(R.id.form_enter_email_hint);
        mEmailField.setTypeface(tf);

        mPhoneField= (EditText)findViewById(R.id.form_enter_phone_hint);
        mPhoneField.setTypeface(tf);

    }

    public void onSubmitPressed(View view){
        String userName = mNameField.getText().toString();

        int userAge;
        try {
            userAge = Integer.parseInt(mAgeField.getText().toString());
        }catch (NumberFormatException nfe){
            userAge = 0;
        }

        String email = mEmailField.getText().toString();

        String phoneNum = mPhoneField.getText().toString();



        /*this will make a toast
        String output = "Hello there "+userName+ " ,you are "+userAge+" years old.\n"+ "\nYour phone number is: "+phoneNum+ "\nYour email is: "+email;

        Toast.makeText(this, output, Toast.LENGTH_LONG).show();
        */
        //Setting up the bundle
        Bundle bundle = new Bundle();
        bundle.putString(USERNAME_KEY, userName);
        bundle.putInt(AGE_KEY, userAge);
        bundle.putString(EMAIL_KEY, email);
        bundle.putString(PHONENUM_KEY, phoneNum);

        //Creating the intent and adding the bundle to it
        Intent intent = new Intent(this, DisplayInformationActivity.class);   //need to set up activity-> that is the Display Informaion Activity
        intent.putExtras(bundle);

        //Starting the intent
        startActivity(intent);

    }






    /*  This is simpler, but it won't allow me to reference each line, and reuse the information. In order to use the
        information, I need to change the mDataField, to be a searante for each one (look on top)

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_form);

        mDataField= (EditText)findViewById(R.id.form_enter_name_hint);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/abc_fond.ttf");
        mDataField.setTypeface(tf);

        mDataField= (EditText)findViewById(R.id.form_enter_age_hint);
        mDataField.setTypeface(tf);

        mDataField= (EditText)findViewById(R.id.form_enter_email_hint);
        mDataField.setTypeface(tf);

        mDataField= (EditText)findViewById(R.id.form_enter_phone_hint);
        mDataField.setTypeface(tf);

    }
    */




    /*      This thing can be written much simpler (look on top)

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_form);

        mDataField= (EditText)findViewById(R.id.form_enter_name_hint);
        Typeface name = Typeface.createFromAsset(getAssets(), "fonts/abc_fond.ttf");
        mDataField.setTypeface(name);

        mDataField= (EditText)findViewById(R.id.form_enter_age_hint);
        Typeface age = Typeface.createFromAsset(getAssets(), "fonts/abc_fond.ttf");
        mDataField.setTypeface(age);

        mDataField= (EditText)findViewById(R.id.form_enter_email_hint);
        Typeface email = Typeface.createFromAsset(getAssets(), "fonts/abc_fond.ttf");
        mDataField.setTypeface(email);

        mDataField= (EditText)findViewById(R.id.form_enter_phone_hint);
        Typeface phone = Typeface.createFromAsset(getAssets(), "fonts/abc_fond.ttf");
        mDataField.setTypeface(phone);

    }
    */
    //when Submit button is pressed on the Display Form
    public void onSubmitClicked(View view){
        //here

    }
}
