package com.favor.mymvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.favor.mymvpdemo.presenter.LoginPresenter;
import com.favor.mymvpdemo.view.LoginView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LoginAct extends AppCompatActivity implements LoginView {
    @Bind(R.id.et_login_name)
    EditText nameET;

    @Bind(R.id.btn_login_submit)
    Button submitBtn;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_login);

        ButterKnife.bind(this);

        loginPresenter = new LoginPresenter();
        loginPresenter.onCreate(this);
    }

    @Override
    public void initViews() {
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameET.getText().toString();
                loginPresenter.login(name);
            }
        });
    }

    @Override
    public void startMainActivity(String name) {
        startActivity(MainAct.newIntent(LoginAct.this, name));
    }

    @Override
    public void showErrorMessage(String message) {
        Toast.makeText(LoginAct.this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

}
