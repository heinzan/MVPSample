package com.xan.mvpsample.login;

/**
 * Created by AUng on 10/25/2016.
 */
public interface RegisterView {


    String getUsername();

    String getPasswrod();

    String confirmPassword();

    void showusernameerror(int resId);

    void passwroderror(int resId);

    void confirmpassworderror(int resId);

    void invalidpassworderror(int resId);

    void startActivity();

    void registerError(int resId);
}
