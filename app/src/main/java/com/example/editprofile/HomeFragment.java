package com.example.editprofile;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;


public class HomeFragment extends Fragment {

    Spinner spinner4;

    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private int year, month, day;
    EditText date;

    String monthName;
    private DatePickerDialog.OnDateSetListener mDateSetListener;


    private static final String TAG = "MainActivity";


    private TextView mDisplayDate;

//    public HomeFragment() {
//        // Required empty public constructor
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        date=view.findViewById(R.id.date);
        setUserVisibleHint(true);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Calendar cal = Calendar.getInstance();

                int year = cal.get(Calendar.YEAR);

                int month = cal.get(Calendar.MONTH);

                int day2 = cal.get(Calendar.DAY_OF_MONTH);

                DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
                DatePickerDialog dialog = new DatePickerDialog(getContext(),

                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day2);
              Button button= dialog.getButton(1);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                dialog.getButton(DatePickerDialog.BUTTON_NEGATIVE).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                dialog.getButton(DatePickerDialog.BUTTON_NEGATIVE).setTextColor(Color.WHITE);

                dialog.getButton(DatePickerDialog.BUTTON_POSITIVE).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                dialog.getButton(DatePickerDialog.BUTTON_POSITIVE).setTextColor(Color.WHITE);

            }
        });


        mDateSetListener = new DatePickerDialog.OnDateSetListener() {


            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month;
                Log.d(TAG, "onDateSet: mm/dd/yyy: " + month + "/" + dayOfMonth + "/" + year);

                switch(month) {
                    case Calendar.JANUARY:
                        monthName = "Jan";
                        break;
                    case Calendar.FEBRUARY:
                        monthName = "Feb";
                        break;

                    case Calendar.MARCH:
                        monthName = "Mar";
                        break;

                    case Calendar.APRIL:
                        monthName = "Apr";
                        break;


                    case Calendar.MAY:
                        monthName = "May";
                        break;

                    case Calendar.JUNE:
                        monthName = "Jun";
                        break;
                    case Calendar.JULY:
                        monthName = "Jul";
                        break;

                    case Calendar.AUGUST:
                        monthName = "Aug";
                        break;

                    case Calendar.SEPTEMBER:
                        monthName = "Sep";
                        break;


                    case Calendar.OCTOBER:
                        monthName = "Oct";
                        break;

                    case Calendar.NOVEMBER:
                        monthName = "Nov";
                        break;

                    case Calendar.DECEMBER:
                        monthName = "Des";
                        break;

                }

                String date3 = dayOfMonth + "   " + monthName+ "   " + year;
                date.setText(date3);
            }



        };


//        Next=view.findViewById(R.id.next);
//        Next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                JavaFragment fragment = new JavaFragment();
//                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.frameLayout, fragment);
//                fragmentTransaction.addToBackStack(null);
//                fragmentTransaction.commit();
//            }
//        });

//        String[] values =
//                {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
//        Spinner spinner = (Spinner) view.findViewById(R.id.spinner);
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.text_view_layout, values);
////        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
//        spinner.setAdapter(adapter);
//
//
//        String[] values2 =
//                {"Jan", "Fab", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
//        Spinner spinner2 = (Spinner) view.findViewById(R.id.spinner2);
//
//        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this.getActivity(), R.layout.text_view_layout, values2);
////        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
//        spinner2.setAdapter(adapter2);
//
//
//        String[] values3 =
//                {"1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"};
//        Spinner spinner3 = (Spinner) view.findViewById(R.id.spinner3);
//
//        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this.getActivity(), R.layout.text_view_layout, values3);
////        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
//        spinner3.setAdapter(adapter3);

//
        String[] values4 =
                {"Select Industry Type(Optional)", "Accounting/Finance", "Advertising/PR/MR/Events", "Agriculture/Dairy",
                        "Architecture", "BPO",
                        "Chemical",
                        "Consumer",
                        "Education",
                        "Hotel",
                        "Industrial Product",
                        "IT-Software", "IT-Hardware", "Legal" };
        spinner4 = (Spinner) view.findViewById(R.id.spinner4);

        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this.getActivity(), R.layout.text_view_layout, values4);
//        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner4.setAdapter(adapter4);



        return view;
    }

//    public static HomeFragment newInstance(String text) {
//
//        HomeFragment f = new HomeFragment();
//        Bundle b = new Bundle();
//        b.putString("msg", text);
//
//        f.setArguments(b);
//
//        return f;
//    }

}
