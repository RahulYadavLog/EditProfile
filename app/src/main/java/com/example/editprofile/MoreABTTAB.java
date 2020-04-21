package com.example.editprofile;

import android.content.Context;
import android.content.Intent;
import android.media.JetPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MoreABTTAB extends Fragment {
    private boolean isViewShown = false;
    Button sport, entertainment, news, lifestyle, business, wallpaper, art, travel, brands, technology, education, lifestyle2, banking, marketing, politics, other;
    //    public AndroidFragment() {
//        // Required empty public constructor
//    }
    private Boolean isStarted = false;
    private Boolean isVisible = false;

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ButtonAdapter recyclerViewAdapter;

    ArrayList<ButtonModelClass> lstBook;
    private JetPlayer KeyboardVisibilityEvent;


//    @Override
//    public void setUserVisibleHint(boolean isVisibleToUser) {
//        super.setUserVisibleHint(isVisibleToUser);
//        if (getActivity() != null) {
//            if (isVisibleToUser) {
//
//            }
//        }
//    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstBook = new ArrayList<>();
        lstBook.add(new ButtonModelClass("Govt. and Politics"));
        lstBook.add(new ButtonModelClass("Social"));
        lstBook.add(new ButtonModelClass("Travel"));
        lstBook.add(new ButtonModelClass("Banking and Finances"));
        lstBook.add(new ButtonModelClass("Marketing"));
        lstBook.add(new ButtonModelClass("Art"));
        lstBook.add(new ButtonModelClass("Entertainment"));
        lstBook.add(new ButtonModelClass("Sport"));
        lstBook.add(new ButtonModelClass("Business"));
        lstBook.add(new ButtonModelClass("Wallpaper"));
        lstBook.add(new ButtonModelClass("Technology"));
        lstBook.add(new ButtonModelClass("Education"));
        lstBook.add(new ButtonModelClass("Other"));
        lstBook.add(new ButtonModelClass("Brands"));
        lstBook.add(new ButtonModelClass("Lifestyle"));


        lstBook.add(new ButtonModelClass("News"));


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {




        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_android, container, false);
//        sport=view.findViewById(R.id.sport);
//        entertainment=view.findViewById(R.id.Entertainment);
//        news=view.findViewById(R.id.News);
//        lifestyle=view.findViewById(R.id.Lifestyle);
//        business=view.findViewById(R.id.Business);
//        wallpaper=view.findViewById(R.id.Wallpaper);
//
//
//
//        art=view.findViewById(R.id.Art);
//        travel=view.findViewById(R.id.Travel);
//        brands=view.findViewById(R.id.Brands);
//        technology=view.findViewById(R.id.Technology);
//        education=view.findViewById(R.id.Education);
//        lifestyle2=view.findViewById(R.id.Life);
//
//
//        banking=view.findViewById(R.id.Banking);
//        marketing=view.findViewById(R.id.Marketing);
//        politics=view.findViewById(R.id.Govt);
//        other=view.findViewById(R.id.Other);

//        sport.setOnClickListener(this);
//        entertainment.setOnClickListener(this);
//
//        news.setOnClickListener(this);
//        lifestyle.setOnClickListener(this);
//
//        business.setOnClickListener(this);
//        wallpaper.setOnClickListener(this);
//
//        art.setOnClickListener(this);
//        travel.setOnClickListener(this);
//
//        brands.setOnClickListener(this);
//        technology.setOnClickListener(this);
//
//        education.setOnClickListener(this);
//        lifestyle2.setOnClickListener(this);
//
//
//
//        banking.setOnClickListener(this);
//        marketing.setOnClickListener(this);
//
//        politics.setOnClickListener(this);
//        other.setOnClickListener(this);
//
//        return view;
//    }
//
//
//    @Override
//    public void onClick(View v) {
//
//
//
//        sport.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        sport.setTextColor(getResources().getColor(R.color.colorWhite));
//
//        entertainment.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        entertainment.setTextColor(getResources().getColor(R.color.colorWhite));
//
//
//        news.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        news.setTextColor(getResources().getColor(R.color.colorWhite));
//
//        lifestyle.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        lifestyle.setTextColor(getResources().getColor(R.color.colorWhite));
//
//        business.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        business.setTextColor(getResources().getColor(R.color.colorWhite));
//
//
//        wallpaper.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        wallpaper.setTextColor(getResources().getColor(R.color.colorWhite));
//
//
//
//        art.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        art.setTextColor(getResources().getColor(R.color.colorWhite));
//
//        travel.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        travel.setTextColor(getResources().getColor(R.color.colorWhite));
//
//
//        brands.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        brands.setTextColor(getResources().getColor(R.color.colorWhite));
//
//
//
//
//
//
//        technology.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        technology.setTextColor(getResources().getColor(R.color.colorWhite));
//
//        education.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        education.setTextColor(getResources().getColor(R.color.colorWhite));
//
//
//        lifestyle2.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        lifestyle2.setTextColor(getResources().getColor(R.color.colorWhite));
//
//
//
//        banking.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        banking.setTextColor(getResources().getColor(R.color.colorWhite));
//
//        marketing.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        marketing.setTextColor(getResources().getColor(R.color.colorWhite));
//
//
//        politics.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        politics.setTextColor(getResources().getColor(R.color.colorWhite));
//
//
//
//
//        other.setBackgroundColor(getResources().getColor(R.color.colorApp));
//        other.setTextColor(getResources().getColor(R.color.colorWhite));
//
//
//    }

//    public static AndroidFragment newInstance(String text) {
//
//        AndroidFragment f = new AndroidFragment();
//        Bundle b = new Bundle();
//        b.putString("msg", text);
//
//        f.setArguments(b);
//
//        return f;
//    }


        recyclerView = view.findViewById(R.id.button_recycler);
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

//                layoutManager=new GridLayoutManager(getActivity(),3);
//        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new ButtonAdapter(getActivity(), lstBook, new ButtonAdapter.IsClicked() {
            @Override
            public void sendPositon(int position) {
                if (lstBook.get(position).isClick()) {
                    lstBook.get(position).setClick(false);
                } else {
                    lstBook.get(position).setClick(true);
                }

                recyclerViewAdapter.notifyDataSetChanged();

            }
        });
        InputMethodManager imm = (InputMethodManager) getActivity()
                .getSystemService(Context.INPUT_METHOD_SERVICE);

        if (imm.isAcceptingText()) {

        } else {

            recyclerViewAdapter.notifyDataSetChanged();
            final Handler timerHandler;
            timerHandler = new Handler();

            Runnable timerRunnable = new Runnable() {
                @Override
                public void run() {
                    recyclerViewAdapter.notifyDataSetChanged();
                    timerHandler.postDelayed(this, 1000);
                }
            };

            timerHandler.postDelayed(timerRunnable, 1000);


        }




        recyclerView.setAdapter(recyclerViewAdapter);
//        layoutManager=new GridLayoutManager(getActivity(),3);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerViewAdapter =new ButtonAdapter(getActivity(), lstBook,

//        recyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }


}