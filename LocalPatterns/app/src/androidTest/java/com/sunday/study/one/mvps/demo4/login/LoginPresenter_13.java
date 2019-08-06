package com.sunday.study.one.mvps.demo4.login;
import com.lzy.okgo.utils.HttpUtils;
import com.sunday.study.one.mvps.demo4.base.impl.MvpBasePresenter_13;



//P层搞定了
//和V层进行交互->接口
public class LoginPresenter_13 extends MvpBasePresenter_13<LoginView_13> {

    private LoginModel_13 loginModel;

    public LoginPresenter_13(){
        this.loginModel = new LoginModel_13();
    }

    public void login(String username, String password){
        getView().onLoginResult("登陆成功");
//        this.loginModel.login(username, password, new HttpUtils.OnHttpResultListener() {
//            @Override
//            public void onResult(String result) {
//                if (getView() != null){
//                    getView().onLoginResult(result);
//                }
//            }
//        });
    }

}
