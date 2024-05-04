package com.example.studify;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Register extends AppCompatActivity {

    Fragment frag_login;
    Fragment frag_register;

    FragmentManager manager;
    Button  btn_login, btn_rsignup;
    TextView tv_rlogin, tv_lsignup;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();

        tv_lsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (frag_login != null && frag_register.isHidden()) {
                    EditText email =findViewById(R.id.et_email_login);
                    String str=email.getText().toString().trim();
                    if(str!=null)
                    {
                        email=findViewById(R.id.et_email_reg);
                        email.setText(str);
                    }
                    manager.beginTransaction().show(frag_register).hide(frag_login).commit();
                }
            }
        });

        tv_rlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (frag_register != null && frag_login.isHidden()) {
                    EditText email =findViewById(R.id.et_email_reg);
                    String str=email.getText().toString().trim();
                    if(email!=null)
                    {
                        email=findViewById(R.id.et_email_login);
                        email.setText(str);
                    }
                    manager.beginTransaction().show(frag_login).hide(frag_register).commit();
                }
            }
        });
    }

    private void init() {
        // Change the color of the Navigation Bar

        manager = getSupportFragmentManager();
        frag_login = manager.findFragmentById(R.id.frag_login_view);
        frag_register = manager.findFragmentById(R.id.frag_register_view);

        btn_login = findViewById(R.id.btn_login_login);
        btn_rsignup = findViewById(R.id.btn_SignUp_reg);
        tv_lsignup = findViewById(R.id.tv_register_login);
        tv_rlogin = findViewById(R.id.tv_LogIn_reg);

        // Hide the register fragment initially
        manager.beginTransaction().hide(frag_register).commit();
    }
}
