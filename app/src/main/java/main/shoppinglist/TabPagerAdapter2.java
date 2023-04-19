package main.shoppinglist;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;


import main.shoppinglist.fragments.FragmentA;
import main.shoppinglist.fragments.FragmentB;
import main.shoppinglist.fragments.FragmentC;

public class TabPagerAdapter2 extends FragmentStateAdapter {

    public TabPagerAdapter2(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        return new FragmentC();
    }
    @Override
    public int getItemCount() {
        return 3;
    }
}
