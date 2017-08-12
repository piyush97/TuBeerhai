package com.piyushmehta.tubeerhaibeeradviser;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
    private BeerExpert expert=new BeerExpert();

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
        //Get Recommendations from the BeerExpert Class
        List<String> brandsList=expert.getBrands(beerType);//get a list of brand
        StringBuilder brandsFormatted=new StringBuilder();//build a string from the values of the list
        for(String brand:brandsList){
            brandsFormatted.append(brand).append("\n");//display each brand in a new line
        }
        //displays the beer
        brands.setText(brandsFormatted);

    }
}