package com.example.tmt_cau1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText tenTK, maTK;
    CheckBox luutt;
    Button login,thoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tenTK=findViewById(R.id.edt_ten);
        maTK = findViewById(R.id.edt_ma);
        login = findViewById(R.id.btn_dangnhap);
        luutt = findViewById(R.id.ckb_luutt);
        thoat=findViewById(R.id.button_thoat);
        luutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu",Toast.LENGTH_SHORT).show();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
