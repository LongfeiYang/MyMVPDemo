package com.favor.mymvpdemo.presenter;

import android.text.TextUtils;

import com.favor.mymvpdemo.usecase.LoginUseCase;
import com.favor.mymvpdemo.view.LoginView;

/**
 * author： Longfei Yang on 2016/6/13.
 * email：yanglongfei@yuanchuangyun.com
 */
public class LoginPresenter {
    private LoginView loginView;
    private LoginUseCase loginUseCase;

    public LoginPresenter(){
        loginUseCase = new LoginUseCase();
    }

    public void onCreate(LoginView loginView){
        this.loginView = loginView;
        this.loginView.initViews();
    }

    public void login(String name){
        if (TextUtils.isEmpty(name)) return;

        boolean isUser = loginUseCase.isUser(name);
        if (isUser){
            loginView.startMainActivity(name);
        }else{
            loginView.showErrorMessage("用户名错误！");
        }
    }

}
