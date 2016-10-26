package com.xan.mvpsample.login;

/**
 * Created by AUng on 10/25/2016.
 */
public class registerservice {
    String mpwd1,mpwd2;

    public boolean register(String pwd1, String pwd2) {
        mpwd1=pwd1;
        mpwd2=pwd2;
        if (!mpwd1.equals(pwd2) ){
            return false;
        }else {
            return true;
        }

    }
}
