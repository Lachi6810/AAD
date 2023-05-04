MainActivity.java
--------------------------
package com.example.exp_8;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioButton genderradioButton;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
    }
    public void onclickbuttonMethod(View v){
        int selectedId = radioGroup.getCheckedRadioButtonId();
        genderradioButton = (RadioButton) findViewById(selectedId);
        if(selectedId==-1){
            Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
        }

    }
}
-----------------------------
activity_main.xml
-----------------------------
?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:id="@+id/textView2"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:gravity="center_horizontal"
        android:text="Radio button inside RadioGroup"
        android:textSize="22dp" />

    <RadioGroup
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/radioGroup">

        <RadioButton
            android:id="@+id/radioMale"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="  Male"
            android:layout_marginTop="10dp"
            android:checked="false"
            android:textSize="20dp" />

        <RadioButton
            android:id="@+id/radioFemale"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:text="   Female"
            android:layout_marginTop="20dp"
            android:checked="false"

            android:textSize="20dp" />
    </RadioGroup>

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:onClick="onclickbuttonMethod"
        android:text="Show Selected" />
</LinearLayout>
