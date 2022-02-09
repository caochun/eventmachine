package com.example.eventmachine;

import org.apache.commons.scxml2.model.State;

public abstract class StateDelegate {

    private String state;

    public String getState(){
        return this.state;
    }

    public StateDelegate(String state){
        this.state = state;
    }

    public abstract void onState();
}
