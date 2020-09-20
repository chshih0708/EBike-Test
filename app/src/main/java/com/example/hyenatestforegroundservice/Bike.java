package com.example.hyenatestforegroundservice;

public class Bike {

    public int status_disconnect = 0;
    public int status_connect = 1;
    public int status_now = status_disconnect;

    private OnChangeListener = null;

    public interface OnChangeListener{
        void onChange();
    }

    public Bike{

    }

    public void connect(){
        status_now = status_connect;
    }

    public void disconnect(){
        status_now = status_disconnect;
    }

    public void setOnChangeListener(OnChangeListener listener){
        OnChangeListener = listener;
    }
}