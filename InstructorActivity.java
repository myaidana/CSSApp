package com.example.aidana.cssapp;

import android.app.Activity;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.PopupWindow;

/**
 * Created by Aidana on 4/13/2015.
 */
public class InstructorActivity extends Activity{
    private EditText nameText;
    private Button insert;
    private PopupWindow popup;


    @Override public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = (EditText)findViewById(R.id.name);
        insert = (Button)findViewById(R.id.insert);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Instructor instructor = new Instructor(nameText.getText().toString());
                Log.d("",nameText.getText().toString());
                popup = new PopupWindow();
                popup.showAtLocation(null, Gravity.NO_GRAVITY, 10, 10);
                popup.update(50, 50, 300, 80);
            }
        });

    }



}
