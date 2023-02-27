package com.example.swaadish;

public class UserModelC {
    private String namec, phonec, emailc, addressc;

    public UserModelC(String namec, String phonec, String emailc, String addressc){

        this.namec = namec;
        this.phonec = phonec;
        this.emailc = emailc;
        this.addressc = addressc;

    }

    public String getAddressc() {
        return addressc;
    }

    public void setAddressc(String addressc) {
        this.addressc = addressc;
    }

    public String getNamec(){
        return namec;
    }

    public  void setNamec(String namec){
        this.namec = namec;
    }

    public String getPhonec(){
        return phonec;
    }

    public  void setPhonec(String phonec){
        this.phonec = phonec;
    }

    public String getEmailc(){
        return emailc;
    }

    public  void setEmailc(String emailc){
        this.emailc = emailc;
    }


}
