package com.intanyoshanaoewen.lagu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val id = intent.getIntExtra("select", R.id.navigation_find)

        bottomNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_find -> {
                    loadFindFragment(savedInstanceState)
                }
                R.id.navigation_wishlist -> {
                    loadWishlistFragment(savedInstanceState)
                }
                R.id.navigation_calendar-> {
                    loadCalendarFragment(savedInstanceState)
                }
                R.id.navigation_create-> {
                    loadCreateFragment(savedInstanceState)
                }
                R.id.navigation_logout-> {
                    loadLogoutFragment(savedInstanceState)
                }
            }
            true
        }

        bottomNav.selectedItemId = id
    }

    private fun loadLogoutFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.navigationContainer, FindFragment(), FindFragment::class.java.simpleName)
                .commitAllowingStateLoss()
        }
    }

    private fun loadCreateFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.navigationContainer, CreateFragment(), CreateFragment::class.java.simpleName)
                .commitAllowingStateLoss()
        }
    }

    private fun loadCalendarFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.navigationContainer, LogoutFragment(), LogoutFragment::class.java.simpleName)
                .commitAllowingStateLoss()
        }

    }

    private fun loadWishlistFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.navigationContainer, WishlistFragment(), WishlistFragment::class.java.simpleName)
                .commitAllowingStateLoss()
        }
    }

    private fun loadFindFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.navigationContainer, FindFragment(), FindFragment::class.java.simpleName)
                .commitAllowingStateLoss()
        }

    }


}



