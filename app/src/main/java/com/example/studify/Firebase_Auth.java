package com.example.studify;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.concurrent.atomic.AtomicBoolean;

public class Firebase_Auth {
    private static final String TAG = "Firebase_Auth";
    private FirebaseAuth mAuth;

    boolean b;

    public Firebase_Auth() {
        // Initialize Firebase Authentication
        mAuth = FirebaseAuth.getInstance();
    }

    // Register user with email and password
    public boolean registerUserOnFirebase(String firstName, String lastName, String email, String password, Bitmap userImage, OnRegisterResultListener listener) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        // Registration successful, sign in the user
                        signInWithEmailAndPassword(email, password, listener);
                    } else {
                        // Registration failed
                        Log.w(TAG, "registerUserOnFirebase: Failed", task.getException());
                        listener.onRegisterResult(false);

                    }
                });
        if(isUserSignedIn())
        {
            return true;
        }
        return false;

    }

    // Sign in with email and password
    public void signInWithEmailAndPassword(String email, String password, OnRegisterResultListener listener) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        // Authentication successful
                        FirebaseUser user = mAuth.getCurrentUser();
                        if (user != null) {
                            Log.d(TAG, "User signed in: " + user.getEmail());
                            listener.onRegisterResult(true);
                        }
                    } else {
                        // Authentication failed
                        Log.w(TAG, "signInWithEmailAndPassword: Failed", task.getException());
                        listener.onRegisterResult(false);
                    }
                });
    }

    public interface OnRegisterResultListener {
        void onRegisterResult(boolean isSuccess);
    }


    // Sign out the current user
    public void signOut() {
        mAuth.signOut();
        Log.d(TAG, "User signed out");
    }

    // Check if a user is currently signed in
    public boolean isUserSignedIn() {
        return mAuth.getCurrentUser() != null;
    }
}

