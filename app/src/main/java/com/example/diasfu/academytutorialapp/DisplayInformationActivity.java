package com.example.diasfu.academytutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class DisplayInformationActivity extends AppCompatActivity {
    private EditText userName;
    private EditText userAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_information);

        //retrieves the intent which started this activity
        //we then get the bundle out of the intent
        Intent intent= getIntent();
        Bundle bundle= intent.getExtras();

        String userName= bundle.getString(DisplayFormActivity.USERNAME_KEY);
        int userAge= bundle.getInt(DisplayFormActivity.AGE_KEY);
        String userEmail= bundle.getString(DisplayFormActivity.EMAIL_KEY);
        String userPhone= bundle.getString(DisplayFormActivity.PHONENUM_KEY);

        TextView displayName= (TextView) findViewById(R.id.display_name_field);
        displayName.setText(userName);

        if(userAge != 0) {
            TextView displayAge = (TextView) findViewById(R.id.display_age_field);
            displayAge.setText(Integer.toString(userAge));
        }
        TextView displayEmail= (TextView) findViewById(R.id.display_email_field);
        displayEmail.setText(userEmail);

        TextView displayPhone= (TextView) findViewById(R.id.display_phone_field);
        displayPhone.setText(userPhone);

    }
    //save button
    public void saveButton(View view){
        //code to save information
        SaveInfo(view);
        toast_newcus(view);

    }

    public void toast_newcus(View view)
    {


        TextView userName = (TextView) findViewById(R.id.display_name_field);
        TextView userAge = (TextView) findViewById(R.id.display_age_field);
        TextView userEmail = (TextView) findViewById(R.id.display_email_field);
        TextView userPhone = (TextView) findViewById(R.id.display_phone_field);
        Toast.makeText(this, userName.getText() + " " + userAge.getText() + " is saved!" .toString(), Toast.LENGTH_LONG).show();


    }

    public void SaveInfo(View view){

    }
}
