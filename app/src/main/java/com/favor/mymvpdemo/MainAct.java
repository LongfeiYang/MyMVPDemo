package com.favor.mymvpdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.favor.mymvpdemo.presenter.MainPresenter;
import com.favor.mymvpdemo.view.MainView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainAct extends AppCompatActivity implements MainView {
    @Bind(R.id.tv_main_name)
    TextView nameTV;

    private String name;

    private MainPresenter mainPresenter;

    public static Intent newIntent(Context context, String name){
        Intent intent = new Intent(context, MainAct.class);
        intent.putExtra("name", name);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        ButterKnife.bind(this);

        name = getIntent().getStringExtra("name");

        mainPresenter = new MainPresenter();
        mainPresenter.onCreate(this);
    }

    @Override
    public void initViews() {
        nameTV.setText(name);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

}
