package com.example.studify;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Map;

public class FirebaseHelper {
    private FirebaseFirestore db_user;
    private FirebaseFirestore db_grp;

    public FirebaseHelper() {
        db_user = FirebaseFirestore.getInstance().collection("fdfgd").getFirestore();
        db_grp = FirebaseFirestore.getInstance().collection("jfdns").getFirestore();
    }

    public void addDataToFirestore(String collection, String documentId, Map<String, Object> data) {
        db_user.collection(collection).document(documentId).set(data);
        db_grp.collection(collection).document(documentId).set(data);
    }

    // Add more methods for querying, updating, and deleting data
}

