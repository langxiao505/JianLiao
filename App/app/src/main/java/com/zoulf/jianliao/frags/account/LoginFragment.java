package com.zoulf.jianliao.frags.account;


import android.content.Context;
import com.zoulf.common.app.MyFragment;
import com.zoulf.jianliao.R;

/**
 * 登录的界面.
 */
public class LoginFragment extends MyFragment {

  private AccountTrigger mAccountTrigger;

  public LoginFragment() {
    // Required empty public constructor
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    // 拿到Activity的引用
    mAccountTrigger = (AccountTrigger) context;

  }

  @Override
  protected int getContentLayoutId() {
    return R.layout.fragment_login;
  }

  @Override
  public void onResume() {
    super.onResume();

    // 进行一次切换，默认切换为注册界面
    mAccountTrigger.triggerView();
  }
}