MainActivity.java
package com.example.exp3;

import android.app.*;
import android.os.*;
import android.text.method.ScrollingMovementMethod;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {
    private Button b;
    EditText etname;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {   //You initialize most of your activity’s class-wide variables here.
        super.onCreate(savedInstanceState);            //This line directs the base Activity class to perform setup work for the MainActivity class
        setContentView(R.layout.activity_main);        //To set the content view for the activity
        b=(Button)findViewById(R.id.click);
        tv=(TextView)findViewById(R.id.display);
        tv.setMovementMethod(new ScrollingMovementMethod());
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                etname=(EditText)findViewById(R.id.name);

                tv.setText("Hello "+etname.getText().toString()+"..!\n");
            }
        });
    }
}

activity_main.xml
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:gravity="center_horizontal"
    android:orientation="vertical"
    android:scrollbarAlwaysDrawVerticalTrack="true"
    android:scrollbars="vertical"
    android:showDividers="none">
    <TextView
        android:id="@+id/title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="20dp"
        android:layout_marginTop="30dp"
        android:text="Enter Text"
        android:textAppearance="?android:attr/textAppearanceLarge"
        android:textStyle="bold"/>

    <EditText
        android:id="@+id/name"
        android:layout_width="300dp"
        android:layout_height="50dp"
        android:ems="10"
        android:hint="Your Name"
        android:inputType="textPersonName">
        <requestFocus/>
    </EditText>

    <Button
        android:id="@+id/click"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:layout_marginTop="10dp"
        android:text="Submit" />

    <TextView
        android:id="@+id/display"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:padding="10dp"
        android:scrollbars="vertical"
        android:textAppearance="?android:attr/textAppearanceLarge"
        android:textSize="18sp"/>
</LinearLayout>
