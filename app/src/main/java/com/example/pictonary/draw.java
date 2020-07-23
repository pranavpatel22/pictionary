package com.example.pictonary;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class draw extends AppCompatActivity {

    private CanvasView canvasView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.draw_main);
        String s=getIntent().getStringExtra("name");
        button=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=getIntent().getStringExtra("name");
                Intent intent=new Intent(draw.this,check.class);
                intent.putExtra("name",s);
                startActivity(intent);
                YoYo.with(Techniques.RubberBand).duration(300).repeat(1).playOn(button);
            }
        });
        canvasView = (CanvasView) findViewById(R.id.canvas);
    }

    public void clearCanvas(View v) {
         canvasView.clearCanvas();
    }
}
