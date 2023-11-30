package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AlertDialog(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setNegativeButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
    EditText fio;
    EditText phone;
    EditText address;
    public void OnArrange(View view) {
        fio = findViewById(R.id.fio);
        phone = findViewById(R.id.phone);
        address = findViewById(R.id.address);

        if(fio.getText().length() == 0) AlertDialog("Уведомление", "Пожалуйста, укажите Фамилию, Имя и Отчество.");
        else if (phone.getText().length() == 0) AlertDialog("Уведомление", "Пожалуйста, укажите номер телефона.");
        else if (address.getText().length() == 0) AlertDialog("Уведомление", "Пожалуйста, укажите адрес доставки.");
        else {
            AlertDialog("Уведомление", "Заказ оформлен.");
        }
    }
}