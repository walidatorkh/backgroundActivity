package com.walidatorkh.backgroundactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BackgroundActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);
    }
    public void selectImage(View view) {

        int selectedImage = 0;

        switch ( view.getId()) {
            case R.id.imageView1 :
            selectedImage = R.drawable.background1;
            break;
        }
        switch ( view.getId()) {
            case R.id.imageView2 :
                selectedImage = R.drawable.background2;
                break;
        }
        switch ( view.getId()) {
            case R.id.imageView3 :
                selectedImage = R.drawable.background3;
                break;
        }
        switch ( view.getId()) {
            case R.id.imageView4 :
                selectedImage = R.drawable.background4;
                break;
        }

        Intent intent = new Intent();

        intent.putExtra("selectedImage" , selectedImage);

        setResult(RESULT_OK, intent);

        finish();
    }

}
