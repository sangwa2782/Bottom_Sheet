package com.ajayam.bottom_sheet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ajayam.bottom_sheet.R;
import com.ajayam.bottom_sheet.model.ArrayModel;

import java.util.ArrayList;

public class BottomSheetAdapter extends RecyclerView.Adapter<BottomSheetAdapter.ViewHolder> {

    Context context;
    ArrayList<ArrayModel> arrayModels;

    public BottomSheetAdapter(View.OnClickListener context, ArrayList<ArrayModel> arrayModels) {
        this.context = context;
        this.arrayModels = arrayModels;
    }

    @NonNull
    @Override
    public BottomSheetAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BottomSheetAdapter.ViewHolder holder, int position) {
        holder.dataname.setText(arrayModels.get(position).name);
    }

    @Override
    public int getItemCount() {return arrayModels.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView dataname;
        public ViewHolder(@NonNull View itemView) {
            super((itemView));

            dataname = itemView.findViewById(R.id.list_item);
        }
    }
}
