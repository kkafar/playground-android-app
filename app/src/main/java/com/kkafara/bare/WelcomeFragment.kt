package com.kkafara.bare

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.kkafara.bare.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
  val TAG: String = WelcomeFragment::class.java.simpleName

  private lateinit var binding: FragmentWelcomeBinding
  private lateinit var navigationButton: Button

  override fun onCreate(savedInstanceState: Bundle?) {
    Log.i(TAG, "onCreate")
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    Log.i(TAG, "onCreateView")

    binding = FragmentWelcomeBinding.inflate(inflater, container, false)
    navigationButton = binding.testButton
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    Log.i(TAG, "onViewCreated")
    super.onViewCreated(view, savedInstanceState)

    navigationButton.setOnClickListener {
      Log.d(TAG, "Navigation button clicked")
      parentFragmentManager.commit {
        setReorderingAllowed(true)
        replace<LoginFragment>(R.id.fragment_container_view)
      }
    }
  }
}