//package com.example.editprofile;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentPagerAdapter;
//import androidx.fragment.app.FragmentStatePagerAdapter;
//
//public class MyPagerAdapter extends FragmentStatePagerAdapter {
//    public MyPagerAdapter(@NonNull FragmentManager fm) {
//        super(fm);
//    }
//
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//
//
//        switch (position) {
//
//            case 0:
//                return new HomeFragment();
//            case 1:
//                return new SocialInformationTab();
//            case 2:
//                return new MoreABTTAB();
//            default:
//                return MoreABTTAB.newInstance("MoreABTTAB, Default");
//        }
//
//    }
//
//
//    @Override
//    public int getCount() {
//        return 3;
//    }
//}
