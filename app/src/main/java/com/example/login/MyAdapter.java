package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    List<ApplicationForm> applicationFormList;
    Context context;


    public MyAdapter(List<ApplicationForm> applicationFormList, Context context) {
        this.applicationFormList = applicationFormList;
        this.context = context;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_form_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);


        view.findViewById(R.id.btn_del).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applicationFormList.remove(viewType);
                notifyDataSetChanged();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.layoutId.setText(String.valueOf(cardFormList.get(position).getID()));
        holder.layoutStudentName.setText(applicationFormList.get(position).getStudentName());
        holder.layoutRollNo.setText(String.valueOf(applicationFormList.get(position).getRollNo()));

    }

    @Override
    public int getItemCount() {
        return applicationFormList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        //        TextView layoutId;
        TextView layoutStudentName;
        TextView layoutRollNo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
//            layoutId = itemView.findViewById(R.id.tv_formLayoutId);
            layoutStudentName = itemView.findViewById(R.id.tv_formLayoutName);
            layoutRollNo = itemView.findViewById(R.id.tv_formLayoutRollNo);

        }
    }
}

