package com.example.studify;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DrawerLayout dl;
    Toolbar tb;
    RecyclerView rv;
    ChatsAdapter adapter;
    ArrayList<Chat> list;
    FloatingActionButton fab_btnAdd;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        rv.setHasFixedSize(true);
        fab_btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        
    }
    @Override
    public void onBackPressed() {
        if (dl.isDrawerOpen(GravityCompat.START)) {
            dl.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    private void init()
    {
        img=findViewById(R.id.img_dp);
        list = new ArrayList<>();
        list.add(new Chat(img,"Ayesha", "20 ka load kara do", "01:20 PM", 3));
        list.add(new Chat(img,"Saba", "hi how are you", "01:20 PM", 56));
        list.add(new Chat(img,"Muhammad Ibrahim", "Hello", "01:20 PM", 2));
        list.add(new Chat(img,"Rana Waqas Ali", "deadline extension", "01:20 PM", 1));
        list.add(new Chat(img,"Ayesha", "20 ka load kara do", "01:20 PM", 3));
        list.add(new Chat(img,"Saba", "hi how are you", "01:20 PM", 56));
        list.add(new Chat(img,"Muhammad Ibrahim", "Hello", "01:20 PM", 2));
        list.add(new Chat(img,"Rana Waqas Ali", "deadline extension", "01:20 PM", 1));
        list.add(new Chat(img,"Ayesha", "20 ka load kara do", "01:20 PM", 3));
        list.add(new Chat(img,"Saba", "hi how are you", "01:20 PM", 56));
        list.add(new Chat(img,"Muhammad Ibrahim", "Hello", "01:20 PM", 2));
        list.add(new Chat(img,"Rana Waqas Ali", "deadline extension", "01:20 PM", 1));
        list.add(new Chat(img,"Ayesha", "20 ka load kara do", "01:20 PM", 3));
        list.add(new Chat(img,"Saba", "hi how are you", "01:20 PM", 56));
        list.add(new Chat(img,"Muhammad Ibrahim", "Hello", "01:20 PM", 2));
        list.add(new Chat(img,"Rana Waqas Ali", "deadline extension", "01:20 PM", 1));
        list.add(new Chat(img,"Ayesha", "20 ka load kara do", "01:20 PM", 3));
        list.add(new Chat(img,"Saba", "hi how are you", "01:20 PM", 56));
        list.add(new Chat(img,"Muhammad Ibrahim", "Hello", "01:20 PM", 2));
        list.add(new Chat(img,"Rana Waqas Ali", "deadline extension", "01:20 PM", 1));
        list.add(new Chat(img,"Ayesha", "20 ka load kara do", "01:20 PM", 3));
        list.add(new Chat(img,"Saba", "hi how are you", "01:20 PM", 56));
        list.add(new Chat(img,"Muhammad Ibrahim", "Hello", "01:20 PM", 2));
        list.add(new Chat(img,"Rana Waqas Ali", "deadline extension", "01:20 PM", 1));


        rv=findViewById(R.id.rv_chats);
        fab_btnAdd=findViewById(R.id.fab_add_contact);
        dl=findViewById(R.id.drawer_layout);
        tb =findViewById(R.id.toolbar);

        setSupportActionBar(tb);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this, dl,tb,R.string.open_nav,R.string.close_nav);
        dl.addDrawerListener(toggle);
        toggle.syncState();

        adapter=new ChatsAdapter(list);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

    }
}