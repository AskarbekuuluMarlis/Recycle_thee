package com.example.recycle_three;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCar;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCar = itemView.findViewById(R.id.tv_car);
    }

    public CarViewHolder(@NonNull View itemView, TextView tvCar) {
        super(itemView);
        this.tvCar = tvCar;
    }

    void bind(String car){
        tvCar.setText(car);
    }
}
