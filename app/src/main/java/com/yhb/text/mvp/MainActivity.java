package com.yhb.text.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yhb.text.mvp.presonter.UserPresonter;
import com.yhb.text.mvp.view.IUserView;

public class MainActivity extends AppCompatActivity implements IUserView, View.OnClickListener {
    private EditText username;
    private EditText password;
    private Button submit;
    private UserPresonter userPresonter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        findViewById(R.id.submit).setOnClickListener(this);
        userPresonter=new UserPresonter(this);

    }

    @Override
    public String getusername() {
        return username.getText().toString();
    }

    @Override
    public String getpassword() {
        return password.getText().toString();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.submit:
                userPresonter.ShowText(this,getusername(),getpassword());
                break;
        }
    }
}
