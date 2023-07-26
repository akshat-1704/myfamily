package com.example.myfamily

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class mainactivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity)


        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()

        var bottom = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottom.setOnItemSelectedListener {

            if(it.itemId == R.id.nav_guard){
                inflateFragment(guardFragment.newInstance())
            }
            else if(it.itemId == R.id.nav_home){
                inflateFragment(homeFragment.newInstance())
            }


            true
        }



    }

    private fun inflateFragment(newInstance: Fragment) {
        var transcation = supportFragmentManager.beginTransaction()
        transcation.replace(R.id.container,newInstance)
        transcation.commit()
    }




}