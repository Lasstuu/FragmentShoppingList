package main.shoppinglist.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
        /*if (getArguments() != null) {
            String dataText = getArguments().getString("dataID");
            txtData.setText(dataText);
        }*/
        return view;
    }

}