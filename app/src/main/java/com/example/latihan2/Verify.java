package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Verify extends AppCompatActivity {
    @BindView(R.id.btnVerify)
    TextView btnVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnVerify)
    void mulai() {
        //perintah pindah halaman
        Intent intent = new Intent(this, VerifyAccount.class);
        startActivity(intent);
    }
}
