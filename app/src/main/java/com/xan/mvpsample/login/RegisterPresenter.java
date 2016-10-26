package com.xan.mvpsample.login;

import com.xan.mvpsample.R;

/**
 * Created by AUng on 10/25/2016.
 */
public class RegisterPresenter {
    private RegisterView view;
    private registerservice service;

    public RegisterPresenter(RegisterActivity registerActivity, registerservice registerservice) {

        view=registerActivity;
        service=registerservice;
    }

    public void onRegisterclick() {
        String uname=view.getUsername();
        if(uname.isEmpty()){
            view.showusernameerror(R.string.username);
        }

        String pwd1=view.getPasswrod();
        if(pwd1.isEmpty()){
            view.passwroderror(R.string.password1);
        }

        String pwd2=view.confirmPassword();
        if(pwd2.isEmpty()){
            view.confirmpassworderror(R.string.password2);
        }

        if(!(pwd1.equals(pwd2))){
            view.invalidpassworderror(R.string.invalid);
        }


        boolean success=service.register(pwd1,pwd2);
        if(success){
            view.startActivity();
        }else {
            view.registerError(R.string.Fail);
        }

    }
}
