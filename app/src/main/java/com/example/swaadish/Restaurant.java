package com.example.swaadish;

public class Restaurant {

    String resname;
    String res;

    public Restaurant(){

    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname;
    }

    public String getres() {
        return res;
    }

    public void setres(String res) {
        this.res = res;
    }

    public Restaurant(String resname, String res){
        this.resname = resname;
        this.res = res;

    }
}
