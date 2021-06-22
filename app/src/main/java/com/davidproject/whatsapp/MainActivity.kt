package com.davidproject.whatsapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.davidproject.whatsapp.Adapter.TabSwitcher
import com.davidproject.whatsapp.Fragment.ContactFragment
import com.davidproject.whatsapp.Fragment.GroupChatFragment
import com.davidproject.whatsapp.Fragment.ChatFragment
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   var currentUser : FirebaseUser? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(main_toolbar as Toolbar?)
        supportActionBar?.title = "Whatsapp"


        main_view_pager.adapter = TabSwitcher(supportFragmentManager)
        tab_switcher.setupWithViewPager(main_view_pager)

    }
//
//    override fun onStart(){
//        super.onStart()
//
//        if(currentUser == null){
////            sendToLoginActivity()
//        }
//
//    }
//
//    private fun sendToLoginActivity() {
//        var intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//    }
}

