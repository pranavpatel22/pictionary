package com.example.pictonary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class start extends AppCompatActivity {

    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=editText.getText().toString();
                Intent intent=new Intent(start.this,draw.class);
                intent.putExtra("name",name);
                startActivity(intent);
                YoYo.with(Techniques.RubberBand).duration(300).repeat(1).playOn(button);
            }
        });


    }

}

