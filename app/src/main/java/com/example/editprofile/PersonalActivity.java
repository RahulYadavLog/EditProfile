package com.example.editprofile;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PersonalActivity extends AppCompatActivity {
    private final int PERSONAL_INFORMATION_TAB_ID = 0;
    private final int SOCIAL_MEDIA_TAB_ID = 1;
    private final int MORE_ABOUT_YOU_TAB_ID = 2;
    TabLayout tabLayout;
    FrameLayout frameLayout;
    Toolbar toolbar;
    Button next;
    private MyPagerAdapter myPagerAdapter;
    private ViewPager pager;
    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private int year, month, day;

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);



        toolbar = (Toolbar) findViewById(R.id.payment);
        setSupportActionBar(toolbar);

               getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tabLayout.getSelectedTabPosition() == PERSONAL_INFORMATION_TAB_ID) {
                    tabLayout.getTabAt(SOCIAL_MEDIA_TAB_ID).select();
                } else if (tabLayout.getSelectedTabPosition() == SOCIAL_MEDIA_TAB_ID) {
                    tabLayout.getTabAt(MORE_ABOUT_YOU_TAB_ID).select();
                } else if (tabLayout.getSelectedTabPosition() == MORE_ABOUT_YOU_TAB_ID) {
                    Toast.makeText(PersonalActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                }


//                if (pager.getCurrentItem() < 4 &&  tabLayout.getSelectedTabPosition()<5) {
//                    pager.setCurrentItem(pager.getCurrentItem() + 1);
//                    tabLayout.setScrollPosition(tabLayout.getSelectedTabPosition()+1,0f,true);
//                }


            }
        });

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        pager = (ViewPager) findViewById(R.id.ViewPager);
        tabLayout.setupWithViewPager(pager);
        pager.setOffscreenPageLimit(3);
        FragmentManager fragmentManager=getSupportFragmentManager();
        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());

        pager.setAdapter(myPagerAdapter);

//        for (int i = 0; i < tabLayout.getTabCount(); i++) {
//            TabLayout.Tab tab = tabLayout.getTabAt(i);
//            if(tab != null){
//                tab.setCustomView()
//            }
//        }
        tabLayout.getTabAt(PERSONAL_INFORMATION_TAB_ID).select();
//        fragment = new HomeFragment();
//        fragmentManager = getSupportFragmentManager();
//        fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frameLayout, fragment);
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//        fragmentTransaction.commit();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(final TabLayout.Tab tab) {
//                // Fragment fragment =
                switch (tab.getPosition()) {
                    case PERSONAL_INFORMATION_TAB_ID:
                        next.setText("Next");
                        break;
                    case SOCIAL_MEDIA_TAB_ID:
                        next.setText("Next");
                        break;
                    case MORE_ABOUT_YOU_TAB_ID:
                        next.setText("Submit");
                        break;
                }


//                FragmentManager fm = getSupportFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                ft.replace(R.id.frameLayout, fragment);
//                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//                ft.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }

    class MyPagerAdapter extends FragmentStatePagerAdapter {
        private List<String> stringList = new ArrayList<>();

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
            stringList.add("Personal information");
            stringList.add("Social Media");
            stringList.add("More About You");
        }


        @Override
        public Fragment getItem(int position) {
            Fragment fragment;
            switch (position) {
                case PERSONAL_INFORMATION_TAB_ID:
                    fragment = new HomeFragment();
                    return fragment;
                case SOCIAL_MEDIA_TAB_ID:
                    fragment = new SocialInformationTab();
                    return fragment;
                case MORE_ABOUT_YOU_TAB_ID:
                    fragment = new MoreABTTAB();
                    return fragment;
            }
            return null;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return stringList.get(position);
        }

        @Override
        public int getCount() {
            return stringList.size();
        }
    }
}