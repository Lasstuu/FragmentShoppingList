package main.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import main.shoppinglist.fragments.FragmentA;
import main.shoppinglist.fragments.FragmentB;
import main.shoppinglist.fragments.FragmentC;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private ItemList itemList;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fragmentA = findViewById(R.id.btnA);
        Button fragmentB = findViewById(R.id.btnB);
        Button fragmentC = findViewById(R.id.btnC);

        fragmentA.setOnClickListener(listener);
        fragmentB.setOnClickListener(listener);
        fragmentC.setOnClickListener(listener);
        ItemList.getInstance().addItem(new Item("Sika","1Kg",0));
        ItemList.getInstance().addItem(new Item("Sika","1Kg",1));
        ItemList.getInstance().addItem(new Item("Sika","1Kg",2));
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment;

            switch (view.getId()) {
                case R.id.btnA:
                    fragment = new FragmentA();
                    break;
                case R.id.btnB:
                    fragment = new FragmentB();
                    Bundle data = new Bundle();
                    data.putString("dataID", "Tekstiä");
                    fragment.setArguments(data);
                    break;
                case R.id.btnC:
                    Intent intent = new Intent(view.getContext(), TabActivity.class);
                    startActivity(intent);
                    return;
                default:
                    fragment = new FragmentA();
                    break;
            }
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame, fragment)
                    .commit();
        }
    };



    public void switchToAddItem(View view){
        Intent intent = new Intent(this, AddItemActivity.class);
        startActivity(intent);
    }
    /*public void onResume(){
        super.onResume();
        recyclerView.setAdapter(new ShoppingListAdapter(getApplicationContext(), itemList.getItems()));
    }*/
    public void listByTime(View view){
        ArrayList<Item> items = ItemList.getInstance().sortByTime();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ShoppingListAdapter(getApplicationContext(), items));
    }
    public void listAlphabetical(View view){
        ArrayList<Item> items = ItemList.getInstance().sortAlphabetical();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ShoppingListAdapter(getApplicationContext(), items));
    }
}