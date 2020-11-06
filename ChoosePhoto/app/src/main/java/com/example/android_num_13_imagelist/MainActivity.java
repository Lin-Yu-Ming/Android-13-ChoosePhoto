package com.example.android_num_13_imagelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int[] PhotoId = {R.mipmap.photo1, R.mipmap.photo2, R.mipmap.photo3,
            R.mipmap.photo4, R.mipmap.photo5, R.mipmap.photo6,
            R.mipmap.photo7, R.mipmap.photo8, R.mipmap.photo9, R.mipmap.photo10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Show_Photo = (Button)findViewById(R.id.ShowPhoto);
        Show_Photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Input_Number = (EditText)findViewById(R.id.InputNumber);
                ImageView ChoosePhoto = (ImageView)findViewById(R.id.Image);
                int Number = Integer.parseInt(Input_Number.getText().toString());

                if (Number == 1){
                    ChoosePhoto.setImageResource(PhotoId[0]);
                }
                else if (Number == 2){
                    ChoosePhoto.setImageResource(PhotoId[1]);
                }
                else if (Number == 3){
                    ChoosePhoto.setImageResource(PhotoId[2]);
                }
                else if (Number == 4){
                    ChoosePhoto.setImageResource(PhotoId[3]);
                }
                else if (Number == 5){
                    ChoosePhoto.setImageResource(PhotoId[4]);
                }
                else if (Number == 6){
                    ChoosePhoto.setImageResource(PhotoId[5]);
                }
                else if (Number == 7){
                    ChoosePhoto.setImageResource(PhotoId[6]);
                }
                else if (Number == 8){
                    ChoosePhoto.setImageResource(PhotoId[7]);
                }
                else if (Number == 9){
                    ChoosePhoto.setImageResource(PhotoId[8]);
                }
                else if (Number == 10){
                    ChoosePhoto.setImageResource(PhotoId[9]);
                }
            }
        });
    }
}