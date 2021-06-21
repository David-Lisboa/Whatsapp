package com.davidproject.whatsapp.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.davidproject.whatsapp.Fragment.ChatFragment
import com.davidproject.whatsapp.Fragment.ContactFragment
import com.davidproject.whatsapp.Fragment.GroupChatFragment

class TabSwitcher(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {

        when(position) {
            0 -> {
                var chatFragment = ChatFragment()
                return chatFragment
            }
            1 -> {
                var groupChatFragment = GroupChatFragment()
                return groupChatFragment
            }
            2 -> {
                var contactFragment = ContactFragment()
                return contactFragment
            }
            else -> {
                return null!!
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0->{
                return "Chat Fragment"
            }
            1->{
                return "Group Chat Fragment"
            }
            2->{
                return "Contact Fragment"
            }
            else -> {
                return null!!
            }
        }
    }
}