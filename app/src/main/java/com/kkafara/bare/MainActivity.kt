package com.kkafara.bare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.kkafara.bare.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  val TAG: String = MainActivity::class.java.simpleName

  private lateinit var mainLayoutTextView: TextView
  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    Log.i(TAG, "onCreate")

    super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)
    mainLayoutTextView = binding.activityMainTextView

    if (savedInstanceState == null) {
      Log.d(TAG, "Creating Welcome fragment instance with FragmentTransaction")
      supportFragmentManager.commit {
        setReorderingAllowed(true)
        add<WelcomeFragment>(binding.fragmentContainerView.id)
      }
    }

    setContentView(binding.root)
  }

  override fun onDestroy() {
    Log.i(TAG, "onDestroy")
    super.onDestroy()
  }
}
