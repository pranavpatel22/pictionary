package com.example.pictonary;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class check extends AppCompatActivity {

    private CanvasView canvasView;
    private Button button;
    private EditText ed;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_main);

        textView=findViewById(R.id.textView3);
        ed=findViewById(R.id.editText);

        final Editable string;
        string = ed.getText();
        final String x=getIntent().getStringExtra("name");
        button=findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand).duration(300).repeat(1).playOn(button);
                if(x.compareTo(String.valueOf(string)) == 0){
                    textView.setText("Yehh!! You Done A Great Job!!");
                }
                else{
                    textView.setText("Oops! Better luck next time::");
                }

            }
        });
    }
}

