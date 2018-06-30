package com.example.jannikokan.timetable.Edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsPageAdapter extends FragmentPagerAdapter {
    private static final String TAG = "SectionsPageAdapter";
    private final List<Fragment> myFragmentList = new ArrayList<>();
    private final List<String> myFragmentTitleList = new ArrayList<>();


    /*Zu jedem Frgment wird ein passender Titel zum anzeigen übergeben*/
    public void addFragment(Fragment fragment, String title){
        myFragmentList.add(fragment);
        myFragmentTitleList.add(title);
    }


    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }


    /* Ermitteln der Akutellen position in der Titelliste der Fragmenttitel*/

    /**
     *
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return myFragmentTitleList.get(position);
    }

    /**
     *
     * @param position
     * @return
     */
    /*Ermitteln der Aktuellen position in der Fragmentliste*/
    @Override
    public Fragment getItem(int position) {
        return myFragmentList.get(position);
    }

    /*Zum ermitteln der Akutellen größe der Frgment liste*/

    /**
     *
     * @return
     */
    @Override
    public int getCount() {
        return myFragmentList.size();
    }
}
