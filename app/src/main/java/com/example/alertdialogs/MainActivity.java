package com.example.alertdialogs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);

        Toast.makeText(MainActivity.this,"Toast Mesajı",Toast.LENGTH_LONG).show();
    }

    public void save(View view){
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setTitle("Kaydet");
        alert.setMessage("Kaydetmek istediğinize emin misiniz?");
        alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Kaydedildi", Toast.LENGTH_LONG).show();
            }
        });
        alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Kaydedilmedi!", Toast.LENGTH_SHORT).show();
            }
        });
        alert.show();

    }
}