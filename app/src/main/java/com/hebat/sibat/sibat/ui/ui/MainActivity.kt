package com.hebat.sibat.sibat.ui.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

//    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {item->
//        when(item.itemId){
//            R.id.navigation_beranda -> {
//                println("home pressed")
//                replaceFragment(BerandaFragment())
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_layanan -> {
//                println("map pressed")
//                replaceFragment(LayananFragment())
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_petanagari -> {
//                println("cart pressed")
//                replaceFragment(PetanagariFragment())
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_pengaduan -> {
//                println("cart pressed")
//                replaceFragment(PengaduanFragment())
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_lainnya -> {
//                println("cart pressed")
//                replaceFragment(LainnyaFragment())
//                return@OnNavigationItemSelectedListener true
//            }
//        }
//
//        false
//
//    }
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        bottom.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
//        replaceFragment(BerandaFragment())
//    }
//
//
//    private fun replaceFragment(fragment: Fragment){
//        val fragmentTransaction = supportFragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.container, fragment)
//        fragmentTransaction.commit()
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.hebat.sibat.sibat.R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(com.hebat.sibat.sibat.R.id.container, BerandaFragment())
            .commit()

        bottom.setOnNavigationItemSelectedListener {
            when (it.itemId){
                com.hebat.sibat.sibat.R.id.navigation_beranda -> {
                    supportFragmentManager.beginTransaction()
                        .replace(com.hebat.sibat.sibat.R.id.container, BerandaFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }

                com.hebat.sibat.sibat.R.id.navigation_layanan -> {
                    supportFragmentManager.beginTransaction()
                        .replace(com.hebat.sibat.sibat.R.id.container, LayananFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                com.hebat.sibat.sibat.R.id.navigation_petanagari -> {
                    supportFragmentManager.beginTransaction()
                        .replace(com.hebat.sibat.sibat.R.id.container, PetanagariFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                com.hebat.sibat.sibat.R.id.navigation_pengaduan -> {
                    supportFragmentManager.beginTransaction()
                        .replace(com.hebat.sibat.sibat.R.id.container, PengaduanFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                com.hebat.sibat.sibat.R.id.navigation_lainnya -> {
                    supportFragmentManager.beginTransaction()
                        .replace(com.hebat.sibat.sibat.R.id.container, LainnyaFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            return@setOnNavigationItemSelectedListener false
        }
    }

}

