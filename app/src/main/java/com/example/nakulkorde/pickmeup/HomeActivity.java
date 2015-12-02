package com.example.nakulkorde.pickmeup;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button Search;
    Button EditProfile;
    Button OfferRide;
    String dName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            dName = extras.getString("tempName");
        }
        //Toast.makeText(getApplicationContext(),dName,Toast.LENGTH_SHORT).show();
        Search = (Button)findViewById(R.id.buttonSearch);
        EditProfile = (Button)findViewById(R.id.buttonUpdate);
        OfferRide = (Button)findViewById(R.id.offer);

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), MapsActivity.class);
                startActivityForResult(myIntent, 0);
                finish();
            }
        });

       /* EditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), RegisterActivity.class);
                startActivityForResult(myIntent, 0);
                finish();
            }
        });
*/
       /* OfferRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), RideOffer.class);
                myIntent.putExtra("tempName",dName);
                startActivityForResult(myIntent, 0);
                finish();
            }
        });*/






        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
