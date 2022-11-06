package com.example.laundryapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Username, Password;
    Button tombol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.username);
        Password = findViewById((R.id.password_toggle));
        tombol = findViewById(R.id.buttonOKE);


        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = Username.getText().toString().trim();
                String password = Password.getText().toString().trim();

                if(email.isEmpty()){
                    Username.setError("Username wajib diisi !!");
                    return;
                }
                if(password.isEmpty()){
                    Password.setError("Password harus diisi !!");
                    return;

                }
                Intent intent = new Intent(MainActivity.this, layout2.class);
                startActivities (intent);
            }

            private void startActivities(Intent intent) {
            }
        });
    }
}