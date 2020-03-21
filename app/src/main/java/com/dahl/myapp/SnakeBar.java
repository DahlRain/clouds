package com.dahl.myapp;


import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import android.view.View.OnClickListener;



import com.dahl.myapp.CallBack;

public class SnakeBar {
    public void SnakeBar(String text, View view, View anchorView, String actionText, OnClickListener onClick) {
        Snackbar snackbar = Snackbar.make(view, text, Snackbar.LENGTH_SHORT);
        //snackbar.getView().setBackgroundColor(0xFF212121);
        //snackbar.getView().findViewById(R.id.snackbar_text).setTextColor(0xffffffff);
        ((TextView)snackbar.getView().findViewById(R.id.snackbar_text)).setTextColor(0xffffffff);
        snackbar.getView().setBackgroundResource(R.drawable.sbr);
       snackbar.setAnchorView(anchorView);
        snackbar.setAction(actionText, onClick);
        snackbar.getView().setElevation(2);
        //snackbar.getView().setOutlineAmbientShadowColor(0xff222222);

        snackbar.show();

    }
}
