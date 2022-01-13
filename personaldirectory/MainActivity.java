package com.example.personaldirectory;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase rootnode;
    DatabaseReference reference;
    String name,phone,email;
    public void enterinfo(View view){
        EditText Name = (EditText) findViewById(R.id.nameEditText);
        EditText Phone= (EditText) findViewById(R.id.phNumberEditText);
        EditText Email= (EditText) findViewById(R.id.emailEditText);
        String name= Name.getText().toString();
        String phone= Phone.getText().toString();
        String email= Email.getText().toString();

        rootnode=FirebaseDatabase.getInstance();
        reference=rootnode.getReference("user");

        userHelperClass helperClass= new userHelperClass(name,phone,email);
        reference.child(phone).setValue(helperClass);
        Toast.makeText(this,"Database updated",Toast.LENGTH_SHORT).show();
        Log.i("INFO","BUTTON PRESSED");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}