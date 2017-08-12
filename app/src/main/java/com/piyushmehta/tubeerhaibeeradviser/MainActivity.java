package com.piyushmehta.tubeerhaibeeradviser;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //call when the user clicks the button

    public void onClickFindBeer(View view) {
        //get reference to the textview
        TextView brands = (TextView) findViewById(R.id.brands);
        brands.setText("Gottle Of Geer");
        //reference to the spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //get the selected item
        String beerType = String.valueOf(color.getSelectedItem());
        //display the selected Item
        brands.setText(beerType);


    }
}