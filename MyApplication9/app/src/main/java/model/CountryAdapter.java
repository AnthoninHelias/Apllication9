package model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.RequestManager;
import com.example.myapplication.R;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {

    private List<Country> countries;
    private RequestManager glide;

    // Constructor
    public CountryAdapter(List<Country> countries, RequestManager glide) {
        this.countries = countries;
        this.glide = glide;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.country_layout, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        Country country = countries.get(position);
        holder.afficher(country);
        glide.load(country.getFlagUrl()).into(holder.flag);
    }

    @Override
    public int getItemCount() {
        return countries != null ? countries.size() : 0;
    }

    public static class CountryViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView flag;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvc_name);
            flag = itemView.findViewById(R.id.tvc_flag);
        }

        public void afficher(Country country) {
            name.setText(country.getCommonName());
        }
    }
}