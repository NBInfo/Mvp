package com.yhb.text.mvp.presonter;

import android.content.Context;
import android.widget.Toast;

import com.yhb.text.mvp.modle.UserModle;
import com.yhb.text.mvp.modle.impl.UserModleImpl;
import com.yhb.text.mvp.view.IUserView;

/**
 * Created by hasee on 2017/2/26.
 */
public class UserPresonter {
    private IUserView userView;
    private UserModle userModle;
    public UserPresonter(IUserView iUserView) {
        this.userView=iUserView;
        userModle=new UserModleImpl();
    }
    public void ShowText(Context context,String username,String password){
        Toast.makeText(context, username+"/////"+password, Toast.LENGTH_SHORT).show();
    }
}
