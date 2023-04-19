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


        Intent intent = new Intent(this, TabActivity.class);
        startActivity(intent);
        /*Button fragmentA = findViewById(R.id.btnA);
        Button fragmentB = findViewById(R.id.btnB);
        Button fragmentC = findViewById(R.id.btnC);

        fragmentA.setOnClickListener(listener);
        fragmentB.setOnClickListener(listener);
        fragmentC.setOnClickListener(listener);
        Intent intent = new Intent(this, TabActivity.class);
        startActivity(intent);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };


    public void switchToAddItem(View view){
        Intent intent = new Intent(this, AddItemActivity.class);
        startActivity(intent);
    }

    public void listByTime(View view){
        ArrayList<Item> items = ItemList.getInstance().sortByTime();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ShoppingListAdapter(getApplicationContext(), items));
    }
    public void listAlphabetical(View view){
        ArrayList<Item> items = ItemList.getInstance().sortAlphabetical();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ShoppingListAdapter(getApplicationContext(), items));
    }*/


}}