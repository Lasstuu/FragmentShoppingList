package main.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import main.shoppinglist.fragments.FragmentA;

public class TabActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ItemList itemList;
    FragmentA fragmentA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);


        TabLayout tabLayout = findViewById(R.id.tabArea);
        ViewPager2 fragmentArea = findViewById(R.id.fragmentArea);
        ViewPager2 fragmentArea2 = findViewById(R.id.fragmentArea2);
        TabPagerAdapter tabPagerAdapter = new TabPagerAdapter(this);
        TabPagerAdapter2 tabPagerAdapter2 = new TabPagerAdapter2(this);
        fragmentArea2.setAdapter(tabPagerAdapter2);
        fragmentArea.setAdapter(tabPagerAdapter);
        itemList = ItemList.getInstance();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                fragmentArea.setCurrentItem(tab.getPosition());
                fragmentArea2.setCurrentItem(tab.getPosition());


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                fragmentArea2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                fragmentArea2.setCurrentItem(tab.getPosition());
            }
        });

        fragmentArea.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();

            }
        });
        fragmentArea2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();

            }
        });
    }


}