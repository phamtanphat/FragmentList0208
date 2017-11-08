package com.ptp.phamtanphat.fragmentlist0208;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;

/**
 * Created by KhoaPhamPC on 8/11/2017.
 */

public class FragmentListView extends ListFragment {

    String[] arraycity = {"Hà Nội","Vũng Tàu","Huế","Nghệ An","Hà Tĩnh","Bến Tre","Long An"};
    ArrayAdapter arrayAdapter;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        arrayAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,arraycity);
        setListAdapter(arrayAdapter);
        super.onActivityCreated(savedInstanceState);

    }
}
