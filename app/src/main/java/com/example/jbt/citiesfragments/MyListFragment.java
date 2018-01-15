package com.example.jbt.citiesfragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyListFragment extends Fragment {


    public MyListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView =inflater.inflate(R.layout.fragment_my_list, container, false);

        ListView citiesLV=(ListView) myView.findViewById(R.id.citiesLV);

        ArrayList<String> allCities= new ArrayList<>();
        allCities.add("Budapest");
        allCities.add("Paris");
        allCities.add("London");
        allCities.add("Buenos Aires");
        ArrayAdapter<String> myAdapter= new ArrayAdapter<String>( getActivity() ,
                android.R.layout.simple_list_item_1,allCities );

        citiesLV.setAdapter(myAdapter);




        return myView;
    }

}
