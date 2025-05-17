package com.example.defensedreamers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.defensedreamers.modalclassofthearmyapp.Tanksmodal;

import java.util.List;

public class TanksAdapter extends RecyclerView.Adapter<TanksAdapter.TankViewHolder> {

    private final List<Tanksmodal> tankList;

    public TanksAdapter(List<Tanksmodal> tankList) {
        this.tankList = tankList;
    }

    @NonNull
    @Override
    public TankViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tank_item, parent, false);
        return new TankViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TankViewHolder holder, int position) {
        Tanksmodal tank = tankList.get(position);
        holder.name.setText(tank.getName());
        holder.country.setText("Country: " + tank.getCountry());
        holder.details.setText("Speed: " + tank.getSpeed_in_kmph() + " km/h\n" +
                "Weight: " + tank.getWeight() + "\n" +
                "Armor: " + tank.getArmor_thickness() + "\n" +
                "Firepower: " + tank.getFirepower());
    }

    @Override
    public int getItemCount() {
        return tankList.size();
    }

    public static class TankViewHolder extends RecyclerView.ViewHolder {
        TextView name, country, details;

        public TankViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tankName);
            country = itemView.findViewById(R.id.tankCountry);
            details = itemView.findViewById(R.id.tankDetails);
        }
    }
}
