package com.favor.mymvpdemo.presenter;

import com.favor.mymvpdemo.view.MainView;

/**
 * author： Longfei Yang on 2016/6/13.
 * email：yanglongfei@yuanchuangyun.com
 */
public class MainPresenter {
    private MainView mainView;

    public void onCreate(MainView mainView){
        this.mainView = mainView;
        this.mainView.initViews();
    }

}
