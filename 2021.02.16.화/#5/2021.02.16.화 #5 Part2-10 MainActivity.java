package com.example.part2_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // �ؽ�Ʈ �� ���� �ϳ� ������
        tv = findViewById(R.id.tv1);
    }

    // �̺�Ʈ �ҽ�
    public void onBtnClick(View view) {

        // Toast.makeText(MainActivity.this, "Button1 click", Toast.LENGTH_LONG).show();

        Button b = (Button) view;

        // �� ������ �ؽ�Ʈ ����
        String txt = b.getText().toString();

        // �� ���� �ؽ�Ʈ �ۼ�
        tv.setText(txt);
    }

}
