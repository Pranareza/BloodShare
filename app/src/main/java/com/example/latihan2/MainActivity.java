package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.txtRegister)
    TextView txtRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        txtRegister.setText(Html.fromHtml(getString(R.string.txtRegister)));

    }

    @OnClick(R.id.txtRegister)
    void mulai() {
        //perintah pindah halaman
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
