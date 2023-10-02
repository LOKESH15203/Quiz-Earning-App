package com.example.quizearningapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.quizearningapp.databinding.ActivityHomeBinding
import com.example.quizearningapp.fragments.HistoryFragment
import com.example.quizearningapp.fragments.HomeFragment
import com.example.quizearningapp.fragments.ProfileFragment
import com.example.quizearningapp.fragments.SpinFragment

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.homeFragment -> replaceFragment(HomeFragment())
                R.id.historyFragment -> replaceFragment(HistoryFragment())
                R.id.spinFragment -> replaceFragment(SpinFragment())
                R.id.profileFragment -> replaceFragment(ProfileFragment())

                else -> {

                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
        fragmentTransaction.commit()
    }
}