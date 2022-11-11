package com.example.diferenteselecciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    TextView eleccion = findViewById(R.id.Eleccion);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.paper:
                if(checked)
                    eleccion.setText("S'ha triat paper");
                break;
            case R.id.pedra:
                if(checked)
                    eleccion.setText("S'ha triat pedra");
                break;
            case R.id.tisores:
                if(checked)
                    eleccion.setText("Sha triat tisores");
                break;
        }
    }

    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.paper:
                    eleccion.setText("S'ha triat paper");
                break;
            case R.id.pedra:
                    eleccion.setText("S'ha triat pedra");
                break;
            case R.id.tisores:
                    eleccion.setText("Sha triat tisores");
                break;
    }
}

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }
}