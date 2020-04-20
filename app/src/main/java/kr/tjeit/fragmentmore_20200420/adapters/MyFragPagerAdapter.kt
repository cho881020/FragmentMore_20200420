package kr.tjeit.fragmentmore_20200420.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.tjeit.fragmentmore_20200420.fragments.BoardFragment
import kr.tjeit.fragmentmore_20200420.fragments.GameListFragment
import kr.tjeit.fragmentmore_20200420.fragments.MainFragment

class MyFragPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "메인"
            1 -> "게임 리스트"
            else -> "거래 게시판"
        }
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> MainFragment()
            1 -> GameListFragment()
            else -> BoardFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}