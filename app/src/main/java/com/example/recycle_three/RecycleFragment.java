package com.example.recycle_three;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecycleFragment extends Fragment {

    private ArrayList<String> carList = new ArrayList<>();
    private RecyclerView carRecycleView;
    private CarAdapter adapter = new CarAdapter(carList);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycle, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        carRecycleView = view.findViewById(R.id.recycler_view);
        carRecycleView.setAdapter(adapter);
    }

    private void loadData() {
        carList.add("Nissan");
        carList.add("BMW");
        carList.add("Tayota");
        carList.add("Opel");
        carList.add("Honda");
        carList.add("Lamborgini");
        carList.add("Cavasacy");
        carList.add("Lexsus");
        carList.add("Ferari");
        carList.add("Tesla");
        carList.add("Porhe");
        carList.add("Islam!!!");
        carList.add("Zeekr");
        carList.add("mitsubishi");
        carList.add("Goltph");
        carList.add("Mersedes");
        carList.add("Daewoo");
    }
}