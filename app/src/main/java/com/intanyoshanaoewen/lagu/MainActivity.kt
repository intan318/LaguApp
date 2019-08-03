package com.intanyoshanaoewen.lagu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item->
        when(item.itemId){
            R.id.navigation_find -> {
                println("Find pressed")
                replaceFragment(FindFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_wishlist -> {
                println("Wishlist pressed")
                replaceFragment(WishlistFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_calendar -> {
                println("Calendar pressed")
                replaceFragment(CalendarFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_create -> {
                println("Create pressed")
                replaceFragment(CreateFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_logout -> {
                println("Logout pressed")
                replaceFragment(LogoutFragment())
                return@OnNavigationItemSelectedListener true
            }

        }

        false

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(FindFragment())
    }


    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.navigationContainer, fragment)
        fragmentTransaction.commit()
    }

}



