package com.demo.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class TestMethods {

    public void enterMessage(Context context,String s){
        Toast.makeText(context,s,Toast.LENGTH_SHORT).show();

    }
}
