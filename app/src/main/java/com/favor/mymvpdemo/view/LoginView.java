package com.favor.mymvpdemo.view;

/**
 * author： Longfei Yang on 2016/6/13.
 * email：yanglongfei@yuanchuangyun.com
 */
public interface LoginView {
    void initViews();
    void startMainActivity(String name);
    void showErrorMessage(String message);
}
