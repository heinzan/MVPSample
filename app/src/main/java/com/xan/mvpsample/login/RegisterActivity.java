package com.xan.mvpsample.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.xan.mvpsample.R;
import com.xan.mvpsample.main.MainActivity;

/**
 * Created by AUng on 10/25/2016.
 */

public class RegisterActivity extends AppCompatActivity implements RegisterView{
    private RegisterPresenter presenter;
    private RegisterView view;
    EditText user_name,password1,password2;
    Button register;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        presenter=new RegisterPresenter(this,new registerservice());

        user_name= (EditText) findViewById(R.id.username_txt);
        password1= (EditText) findViewById(R.id.password1_txt);
        password2= (EditText) findViewById(R.id.password2_txt);
        register= (Button) findViewById(R.id.register_btn);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                presenter.onRegisterclick();
            }
        });



    }

    @Override
    public String getUsername() {
        return user_name.getText().toString();
    }

    @Override
    public String getPasswrod() {
        return password1.getText().toString();
    }

    @Override
    public String confirmPassword() {
        return password2.getText().toString();
    }

    @Override
    public void showusernameerror(int resId) {

        user_name.setError(getString(resId));
    }

    @Override
    public void passwroderror(int resId) {
        password1.setError(getString(resId));

    }

    @Override
    public void confirmpassworderror(int resId) {
        password2.setError(getString(resId));
    }

    @Override
    public void invalidpassworderror(int resId) {
        password2.setError(getString(resId));
    }

    @Override
    public void startActivity() {

        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    @Override
    public void registerError(int resId) {

        Toast.makeText(getApplicationContext(),getString(resId),Toast.LENGTH_LONG).show();
    }
}
