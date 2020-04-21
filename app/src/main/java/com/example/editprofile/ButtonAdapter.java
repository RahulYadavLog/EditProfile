package com.example.editprofile;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ButtonAdapter extends RecyclerView.Adapter<ButtonAdapter.ButtonView>{

 private    Context context;
  private   List<ButtonModelClass> data;
     IsClicked isClicked;




//  int flag=0;
//    int flag2=0;
//    int flag1=0,flag3=0,flag4=0,flag5=0,flag6=0,flag7=0,flag8=0,flag9=0,flag10=0,flag11=0,flag12=0,flag13=0,flag14=0,flag15=0,flag16=0;

    public interface IsClicked{

        void sendPositon(int position);


    }
    public ButtonAdapter(Context context, List<ButtonModelClass> data,IsClicked isClicked) {
        this.context = context;
        this.data = data;
        this.isClicked = isClicked;
    }

    @NonNull
    @Override
    public ButtonView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater=LayoutInflater.from(context);
        view=inflater.inflate(R.layout.button_list,parent,false);

        return new  ButtonAdapter.ButtonView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ButtonView holder, final int position) {

        holder.button.setText(data.get(position).getButton_Name());

                if (data.get(position).isClick())
                {

                    holder.button.setBackgroundResource(R.drawable.payment_history_button_background);
                    holder.button.setTextColor(Color.WHITE);

                }
                else
                {
                    holder.button.setBackgroundResource(R.drawable.cancle_button_background);
                    holder.button.setTextColor(Color.BLACK);
                }

            holder.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    isClicked.sendPositon(position);
                }

//
//                switch (holder.button.getText().toString())
//                {
//
//                    case "Sport":
//
//
//                        if(flag1==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag1=1;
//
//                        }
//                        else if (flag1==1)
//                        {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag1=0;
//
//
//
//                        }
//                               break;
//
//
//
//                    case "Wallpaper":
//
//
//                        if(flag2==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag2=1;
//
//                        }
//                        else if (flag2==1)
//                        {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag2=0;
//
//
//
//                        }
//                        break;
//                    case "Banking":
//
//
//                        if(flag3==0) {
//
//                        holder.button.setBackgroundResource(R.drawable.onclick_button);
//                        holder.button.setTextColor(Color.WHITE);
//                        flag3=1;
//
//                    }
//                    else if (flag3==1) {
//
//                        holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                        holder.button.setTextColor(Color.BLACK);
//                        flag3 = 0;
//                    }
//
//                            break;
//                    case "Entertainment":
//
//                        if(flag4==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag4=1;
//
//                        }
//                        else if (flag4==1) {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag4 = 0;
//                        }
//                        break;
//
//
//
//
//
//                    case "Education":
//                        if(flag5==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag5=1;
//
//                        }
//                        else if (flag5==1) {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag5 = 0;
//                        }
//                        break;
//
//                    case "Other":
//
//
//                        if(flag6==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag6=1;
//
//                        }
//                        else if (flag6==1) {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag6 = 0;
//                        }
//                        break;
//
//
//                    case "News":
//
//                        if(flag7==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag7=1;
//
//                        }
//                        else if (flag7==1) {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag7 = 0;
//                        }
//                        break;
//
//                    case "Art":
//
//                        if(flag8==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag8=1;
//
//                        }
//                        else if (flag8==1) {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag8 = 0;
//                        }
//                        break;
//
//
//                    case "Technology":
//                        if(flag9==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag9=1;
//
//                        }
//                        else if (flag9==1) {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag9 = 0;
//                        }
//                        break;
//
//
//                    case "Politics":
//
//                        if(flag10==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag10=1;
//
//                        }
//                        else if (flag10==1) {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag10 = 0;
//                        }
//                        break;
//                    case "Social":
//
//
//                        if(flag11==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag11=1;
//
//                        }
//                        else if (flag11==1) {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag11 = 0;
//                        }
//                        break;
//                    case "Business":
//
//                        if(flag12==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag12=1;
//
//                        }
//                        else if (flag12==1) {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag12 = 0;
//                        }
//                        break;
//
//
//                    case "Brands":
//
//                        if(flag13==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag13=1;
//
//                        }
//                        else if (flag13==1) {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag13 = 0;
//                        }
//                        break;
//
//                    case "Marketing":
//
//                        if(flag14==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag14=1;
//
//                        }
//                        else if (flag14==1) {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag14 = 0;
//                        }
//                        break;
//
//                    case "Travel":
//
//                        if(flag15==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag15=1;
//
//                        }
//                        else if (flag15==1) {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag15 = 0;
//                        }
//                        break;
//
//                    case "Lifestyle":
//
//                        if(flag16==0) {
//
//                            holder.button.setBackgroundResource(R.drawable.onclick_button);
//                            holder.button.setTextColor(Color.WHITE);
//                            flag16=1;
//
//                        }
//                        else if (flag16==1) {
//
//                            holder.button.setBackgroundResource(R.drawable.cancle_button_background);
//                            holder.button.setTextColor(Color.BLACK);
//                            flag16 = 0;
//                        }
//                        break;
//
//
//                }
//                }
//            });


            });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ButtonView extends RecyclerView.ViewHolder {
        RelativeLayout relativeLayout;
        boolean flag3;
        Button button;
        public ButtonView(@NonNull View itemView) {
            super(itemView);
            relativeLayout=itemView.findViewById(R.id.button_layout);
            button=itemView.findViewById(R.id.button_list);
        }
    }
}
