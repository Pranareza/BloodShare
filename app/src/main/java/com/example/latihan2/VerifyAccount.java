package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class VerifyAccount extends AppCompatActivity {
    @BindView(R.id.txtVerify)
    TextView txtVerify;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);
        ButterKnife.bind(this);

        txtVerify.setText(Html.fromHtml(getString(R.string.txtVerify)));

    }

    @OnClick(R.id.btnSend)
    void mulai() {
        //perintah pindah halaman
        Intent intent = new Intent(this, Hasil.class);
        startActivity(intent);
    }
}
