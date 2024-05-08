package com.example.studify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class textChat extends AppCompatActivity {

    RecyclerView rv_textchat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_chat);
        init();
    }
    private void init(){
        rv_textchat=findViewById(R.id.grp_chat_rv);
    }

}