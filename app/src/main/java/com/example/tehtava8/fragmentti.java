package com.example.tehtava8;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class fragmentti extends Fragment {

    private FragmenttiViewModel mViewModel;

    private EditText editext;
    private Button button;
    private TauluDao tauluDao;
    ListView listView;
    ArrayAdapter<String> stringArrayAdapter;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmentti_fragment,container, false);
        this.button = v.findViewById(R.id.nappi);
        this.editext = v.findViewById(R.id.edittext);
        stringArrayAdapter = new ArrayAdapter<>(getActivity().getApplication(), android.R.layout.simple_list_item_1);
        listView.setAdapter(stringArrayAdapter);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyEntity myEntity = new MyEntity();
                String teksti = editext.getText().toString();

                myEntity.teksti = teksti;
                tauluDao.InsertMyEntity(myEntity);

                stringArrayAdapter.clear();
                stringArrayAdapter.addAll(tauluDao.getAllInDescendingOrder());

            }
        });
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FragmenttiViewModel.class);


    }

}
