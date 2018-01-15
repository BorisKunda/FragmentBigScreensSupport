package com.example.jbt.citiesfragments;

//import android.support.v4.app.FragmentManager;--> if you choose support old devices
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    //YOU WILL SEE DIFFERENT LAYOUTS IN PHONE AND TABLET 10 INCH
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //generate a new Fragment
        MyListFragment myListFragment= new MyListFragment();
        //call the Fragment Manager
     //   FragmentManager fragmentManager= getSupportFragmentManager();--> if you choose support old devices
        FragmentManager fragmentManager= getFragmentManager();
        //add the fragment to the layout
        //don't forget commit!
        fragmentManager.beginTransaction().add(R.id.MainActLayout, myListFragment).commit();//add MyListFragment to sub-layout of xlarge version of MainActivity xml called MainActLayout or to normal version also called MainActLayout

        /*ActivityMain xml layout xlarge version is divided to two sub-layouts -
        "MainActLayout" and  "DetailActLayout",while at the same time ActivityMain xml layout normal version has only "MainActlayout".
        */


        if(isTablet())//means device used xlarge xml layout of MainActivity,due to device large screen(tablet)
    {
        DetailsFragment detailsFragment= new DetailsFragment();

        fragmentManager.beginTransaction().add(R.id.DetailActLayout, detailsFragment).commit();//we add DetailsFragment only  to sub layout of xlarge MainActivity called DetailActLayout ,and only if its not null(its null if device detected normal size screen)
    }


}


    public  boolean isTablet()
    {
        boolean isTab= false;
        LinearLayout detailsLayout= findViewById(R.id.DetailActLayout);
        if(detailsLayout != null)//if device chose xlarge xml layout of MainActivity then its sub layout  DetailActLayout wont be null
        {
            isTab=true;
        }

        return isTab;
    }





}
