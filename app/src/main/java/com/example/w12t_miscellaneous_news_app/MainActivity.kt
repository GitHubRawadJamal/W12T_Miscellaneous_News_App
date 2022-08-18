package com.example.w12t_miscellaneous_news_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.w12t_miscellaneous_news_app.databinding.ActivityMainBinding
import com.example.w12t_miscellaneous_news_app.view.HomeFragment
import com.example.w12t_miscellaneous_news_app.view.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {
    val fragmentHome = HomeFragment()

    override fun bindingInflater() = ActivityMainBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initSubView()

    }

    private  fun initSubView(){ addFragment(fragmentHome) }

    private  fun addFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.id_fragment_home,fragment).commit()
    }

}