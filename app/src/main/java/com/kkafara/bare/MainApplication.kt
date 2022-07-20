package com.kkafara.bare

import android.app.Application
import android.content.res.Configuration
import android.util.Log

class MainApplication : Application() {
  val TAG: String = MainActivity::class.java.simpleName;

  override fun onConfigurationChanged(newConfig: Configuration) {
    Log.i(TAG, "onConfigurationChanged")
    super.onConfigurationChanged(newConfig)
  }

  override fun onCreate() {
    Log.i(TAG, "onCreate")
    super.onCreate()
  }
}
