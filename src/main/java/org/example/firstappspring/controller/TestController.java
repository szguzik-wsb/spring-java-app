package org.example.firstappspring.controller;

public class TestController extends TestDwaController{

    private String antek;

    public String name(String firstname) {

        this.antek = super.name(firstname);
        return this.antek;
    }
}
