package com.example.fishing_handbook;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;
import android.widget.TextView;

public class Text_Content_Activity extends AppCompatActivity {


    private TextView text_content;
    private Typeface face1;
    private ImageView iContent;
    private int category = 0;
    private int position = 0;
    private int [] array_fish = {R.string.fish1};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        init();


        reciveIntent();


    }
    private void  reciveIntent()
    {
        Intent i = getIntent();
        if(i != null)
        {
            category = i.getIntExtra("category",0);
            position = i.getIntExtra("position",0);
        }
        switch (category){
            case 0:

                iContent.setImageResource(array_image_fish[position]);
                text_content.setText(array_fish[position]);
                break;
            case 1:
                text_content.setText([position]);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
        }
    }
    private void init()
    {

        text_content = findViewById(R.id.text_main_content);
        iContent = findViewById(R.id.imageContent);
        face1 = Typeface.createFromAsset(this.getAssets(),"fonts/Lobster-Regular.ttf");
        text_content.setTypeface(face1);
    }

}