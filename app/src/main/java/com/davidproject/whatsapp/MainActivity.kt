package com.davidproject.whatsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.davidproject.whatsapp.Adapter.TabSwitcher
import com.davidproject.whatsapp.Fragment.ContactFragment
import com.davidproject.whatsapp.Fragment.GroupChatFragment
import com.davidproject.whatsapp.Fragment.ChatFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   // private lateinit var tabSwitcher: TabSwitcher

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(main_toolbar as Toolbar?)
        supportActionBar?.title = "Whatsapp"
//
//        tabSwitcher = TabSwitcher(supportFragmentManager)
//        main_view_pager.adapter = tabSwitcher
//        tab_switcher.setupWithViewPager(main_view_pager)

        main_view_pager.adapter = TabSwitcher(supportFragmentManager)
        tab_switcher.setupWithViewPager(main_view_pager)

    }
}

