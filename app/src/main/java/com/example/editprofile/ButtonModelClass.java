package com.example.editprofile;

public class ButtonModelClass {

    private String Button_Name;
    private boolean isClick=false;

    public boolean isClick() {
        return isClick;
    }

    public void setClick(boolean click) {
        isClick = click;
    }

    public ButtonModelClass(String button_Name) {
        Button_Name = button_Name;
    }

    public String getButton_Name() {
        return Button_Name;
    }
}
