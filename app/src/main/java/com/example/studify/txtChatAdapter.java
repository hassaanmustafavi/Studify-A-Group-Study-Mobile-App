package com.example.studify;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class txtChatAdapter extends RecyclerView.Adapter {

    ArrayList<Msg> list;
    public txtChatAdapter(ArrayList<Msg> l) {
        list=l;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rcv_msg_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        Msg msg;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            msg.setId(itemView.findViewById(R.id));
//            tvTime = itemView.findViewById(R.id.tvTime);
//            tvName = itemView.findViewById(R.id.tvContactName);
//            tvCount = itemView.findViewById(R.id.tvMsgCount);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Toast.makeText(itemView.getContext(), tvTime.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
