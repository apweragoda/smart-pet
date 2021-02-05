package com.main.smartpet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

public class PetDetails extends AppCompatActivity {
    ImageView detailsArrow;
    TextView detailsName,detailsAge,detailsGender;
    DatePicker detailsDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_details);
        detailsArrow = findViewById(R.id.detailsArrow);

        detailsArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Home.class));
                finish();
            }
        });
    }
}