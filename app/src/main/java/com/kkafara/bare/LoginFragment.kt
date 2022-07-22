package com.kkafara.bare

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kkafara.bare.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
  val TAG: String = LoginFragment::class.java.simpleName;

  private lateinit var binding: FragmentLoginBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    Log.i(TAG, "onCreate")
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    Log.i(TAG, "onCreateView")
    binding = FragmentLoginBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    Log.i(TAG, "onViewCreated")
    super.onViewCreated(view, savedInstanceState)
  }

//  companion object {
//    @JvmStatic
//    fun newInstance(param1: String, param2: String) =
//      LoginFragment().apply {
//        arguments = Bundle().apply {
//          putString(ARG_PARAM1, param1)
//          putString(ARG_PARAM2, param2)
//        }
//      }
//  }
}