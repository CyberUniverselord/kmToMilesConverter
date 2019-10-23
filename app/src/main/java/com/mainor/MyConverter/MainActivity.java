package com.mainor.MyConverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editMiles = (EditText) findViewById(R.id.editMiles);
        final EditText editKilometers =  (EditText) findViewById(R.id.editKilometers);
        Button convert_Btn = (Button) findViewById(R.id.convert_Btn);

        convert_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kilometers = Double.valueOf(editKilometers.getText().toString());
                double miles = kilometers * 0.621371192;
                editMiles.setText(String.valueOf(miles));
            }
        });

    }

}
