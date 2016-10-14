package com.chat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.novoda.notils.logger.simple.Log;

/**
 * Created by techteam on 14/10/16.
 */

public class BaseActivity extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.setShowLogs(BuildConfig.DEBUG);
  }
}
