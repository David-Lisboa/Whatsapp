package com.davidproject.whatsapp.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.davidproject.whatsapp.Adapter.TabSwitcher
import com.davidproject.whatsapp.Fragment.ChatFragment
import com.davidproject.whatsapp.Fragment.ContactFragment
import com.davidproject.whatsapp.Fragment.GroupChatFragment

class TabSwitcher(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {

    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment {
        var getFragment: Fragment? = null

        when(position) {
            0 -> getFragment = ChatFragment()
            1 -> getFragment = GroupChatFragment()
            2 -> getFragment = ContactFragment()
        }
        return getFragment!!
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        when(position) {
            0 -> title = "Chat Fragment"
            1 -> title = "Group Chat Fragment"
            2 -> title = "Contact Fragment"
        }
        return title
    }
}