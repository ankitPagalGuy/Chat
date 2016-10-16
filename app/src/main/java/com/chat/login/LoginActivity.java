package com.chat.login;

import android.os.Bundle;
import android.view.View;
import butterknife.Bind;
import com.chat.BaseActivity;
import com.chat.R;

/**
 * Created by techteam on 16/10/16.
 */

public class LoginActivity  extends BaseActivity{

 @Bind(R.id.sign_in_button) View signInButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);

  }
  



}
