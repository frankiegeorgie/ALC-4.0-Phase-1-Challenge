package com.example.alcphaseonechallenge;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {
    private Profile mProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        setProfileValues();

        getProfileValues(mProfile);
    }

    private Profile setProfileValues(){
        mProfile = new Profile();
        mProfile.setName("George Frank Otoo");
        mProfile.setTrack("Android");
        mProfile.setCountry("Ghana");
        mProfile.setEmail("george.frank.otoo@gmail.com");
        mProfile.setPhoneNo("+233243458684");
        mProfile.setSlackUsername("@George Frank Otoo");

        return mProfile;
    }

    private void getProfileValues(Profile profile){
        TextView textName = findViewById(R.id.text_name);
        textName.setText(profile.getName());

        TextView textTrack = findViewById(R.id.text_track);
        textTrack.setText(profile.getTrack());

        TextView textCountry = findViewById(R.id.text_country);
        textCountry.setText(profile.getCountry());

        TextView textEmail = findViewById(R.id.text_email);
        textEmail.setText(profile.getEmail());

        TextView textPhoneNo = findViewById(R.id.text_phone_no);
        textPhoneNo.setText(profile.getPhoneNo());

        TextView textSlackUsername = findViewById(R.id.text_slack_username);
        textSlackUsername.setText(profile.getSlackUsername());
    }
}
