package com.walidatorkh.backgroundactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayoutMain;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayoutMain = (LinearLayout)findViewById(R.id.linearLayoutMain);
    }


    public void secondActivity(View view) {
        Intent intent =new Intent(this, BackgroundActivity.class);

        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       // super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK) {
            int selectImage = data.getIntExtra("selectedImage" , 0);
            linearLayoutMain.setBackgroundResource(selectImage);
        }
    }
}
