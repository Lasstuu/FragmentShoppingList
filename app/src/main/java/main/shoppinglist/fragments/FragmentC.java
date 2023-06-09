package main.shoppinglist.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import main.shoppinglist.Item;
import main.shoppinglist.ItemList;
import main.shoppinglist.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentC#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentC extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ItemList itemList;
    public FragmentC() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameter

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c, container, false);

        return view;
    }
    public void onResume(){
        super.onResume();
        View view = this.getView();
        TextView txtImportant = view.findViewById(R.id.txtImportant);
        String important = "Tärkeät muistettavat asiat:\n";
        int inte = 0;
        if (ItemList.getInstance().isEmptyList() == true){
        } else {
            itemList = ItemList.getInstance();
            for (Item i : itemList.getItems()) {
                if(i.isImportant()) {
                    important += i.getName() + "\n";
                }
            }
        }
        txtImportant.setText(important);
    }
}