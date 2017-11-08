package com.ptp.phamtanphat.fragmentlist0208;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KhoaPhamPC on 8/11/2017.
 */

public class AnimalAdapter extends BaseAdapter {

    Context context;
    ArrayList<Animal> animalArrayList;

    public AnimalAdapter(Context context, ArrayList<Animal> animalArrayList) {
        this.context = context;
        this.animalArrayList = animalArrayList;
    }

    @Override
    public int getCount() {
        return animalArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return animalArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.dong_animal,null);
        TextView txtten = view.findViewById(R.id.textviewanimal);
        ImageView imageView = view.findViewById(R.id.imageviewanimal);
        Animal animal = (Animal) getItem(i);
        txtten.setText(animal.getTen());
        imageView.setImageResource(animal.getHinhanh());

        return view;
    }
    // cách 2 cho customAdapter
//    public class AnimalAdapter extends ArrayAdapter<Animal> {
//
//
//        public AnimalAdapter(@NonNull Context context, int resource, @NonNull List<Animal> objects) {
//            super(context, resource, objects);
//        }
//
//        @NonNull
//        @Override
//        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//            View view = convertView;
//            LayoutInflater inflater = LayoutInflater.from(getContext());
//            view = inflater.inflate(R.layout.dong_animal,null);
//            TextView txtten = view.findViewById(R.id.textviewanimal);
//            ImageView imageView = view.findViewById(R.id.imageviewanimal);
//            Animal animal = (Animal) getItem(position);
//            txtten.setText(animal.getTen());
//            imageView.setImageResource(animal.getHinhanh());
//            return view;
//        }
//    }
}
