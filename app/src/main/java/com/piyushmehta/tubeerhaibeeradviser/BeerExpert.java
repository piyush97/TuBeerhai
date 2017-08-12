package com.piyushmehta.tubeerhaibeeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piyush on 8/12/2017.
 */

public class BeerExpert {

    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("Amber")) {
            brands.add("Ale Industries Dueling Pipers ");
            brands.add("Hoegaarden");
            brands.add("Asahi");
            brands.add("Foster’s");
            brands.add("Heineken");
            brands.add("Leffe Blond");
            brands.add("Kingfisher Ultra");
        } else if (color.equals("light")) {
            brands.add("Tuborg");
            brands.add("Heineken");
            brands.add("Budweiser");
            brands.add("Foster’s");
            brands.add("Corona Extra");
            brands.add("Coors Lite");

        } else {
            brands.add("Baad me dalta hun");
        }
        return brands;
    }
}