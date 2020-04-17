package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class Register extends AppCompatActivity {
    @BindView(R.id.btnRegis)
    TextView btnRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);

    }

        @OnClick(R.id.btnRegis)
        void verify() {
            //perintah pindah halaman
            Intent intent = new Intent(this, Verify.class);
            startActivity(intent);
        }
    }
