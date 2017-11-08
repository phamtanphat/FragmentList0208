package com.ptp.phamtanphat.fragmentlist0208;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 8/11/2017.
 */

public class FragmentListView extends ListFragment {

//    String[] arraycity = {"Hà Nội","Vũng Tàu","Huế","Nghệ An","Hà Tĩnh","Bến Tre","Long An"};
//    ArrayAdapter arrayAdapter;
    ArrayList<Animal> mangthucung;
    AnimalAdapter animalAdapter;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        arrayAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,arraycity);
//        setListAdapter(arrayAdapter);
//        AdapterView.OnItemLongClickListener onItemLongClickListener = new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getActivity().getBaseContext(), arraycity[i], Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        };
//        getListView().setOnItemLongClickListener(onItemLongClickListener);
        mangthucung = new ArrayList<>();
        mangthucung.add(new Animal("Con chó",R.drawable.dog));
        mangthucung.add(new Animal("Con mèo",R.drawable.cat));
        mangthucung.add(new Animal("Con bò",R.drawable.cow));
        mangthucung.add(new Animal("Con gấu",R.drawable.bear));

        animalAdapter = new AnimalAdapter(getActivity(),android.R.layout.simple_list_item_1,mangthucung);
        setListAdapter(animalAdapter);
        super.onActivityCreated(savedInstanceState);
    }

}
