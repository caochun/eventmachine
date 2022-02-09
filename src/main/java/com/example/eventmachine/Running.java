package com.example.eventmachine;

import org.apache.commons.scxml2.model.State;

public class Running extends StateDelegate {

    public Running(){
        super("running");
    }

    @Override
    public void onState() {
        System.out.println("running!");

    }
}
