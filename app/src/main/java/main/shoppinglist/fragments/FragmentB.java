package main.shoppinglist.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import main.shoppinglist.Item;
import main.shoppinglist.ItemList;
import main.shoppinglist.R;


public class FragmentB extends Fragment {
    private int id = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        Button addButton = view.findViewById(R.id.btnAddList2);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItems(view);
            }
        });
        return view;
    }
    public void addItems(View view) {
        CheckBox checkBox = view.findViewById(R.id.checkBox);
        EditText etItemName = (EditText) view.findViewById(R.id.etName);
        EditText etItemInfo = (EditText) view.findViewById(R.id.etInfo);

        String itemName = etItemName.getText().toString();
        String itemInfo = etItemInfo.getText().toString();
        ItemList.getInstance().addItem(new Item(itemName, itemInfo, checkBox.isChecked(),id));
        id++;


    }
}