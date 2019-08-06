package com.sunday.study.one.mvps.demo3;

import com.sunday.study.one.mvps.demo2.LoginModel_2;
import com.sunday.study.one.mvps.demo3.base.BasePresenter;

public class LoginPresenter extends BasePresenter<LoginView> {

      LoginModule loginModule;
      public LoginPresenter(){
        this.loginModule  = new LoginModule();

    }
     public void  login(String name, String pwd){
          loginModule.logins(name,pwd);

    }

}
