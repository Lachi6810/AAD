==================
activitymain.xml
================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="MainActivity">
    <fragment
        android:id="@+id/topFragment"
        android:name="com.example.ex7.TopFragment"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_margin="20dp"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toTopOf="@+id/bottomFragment"
        tools:layout="@layout/fragment_top" />
    <fragment
        android:id="@+id/bottomFragment"
        android:name="com.example.ex7.BottomFragment"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_margin="20dp"
        app:layout_constraintTop_toBottomOf="@+id/topFragment"
        app:layout_constraintBottom_toBottomOf="parent"
        />
</androidx.constraintlayout.widget.ConstraintLayout>
==============
mainactivity.java
===============
package com.example.ex7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
=======================
fragmenttop.xml
=====================
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_margin="20dp"
    android:background="#DDDDDD"
    tools:context=".TopFragment">

    <!-- TODO: Update blank fragment layout -->
    <TextView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:textSize="30sp"
        android:textAlignment="center"
        android:text="Top Fragment"
        android:textStyle="bold"
        android:textColor="#000"
        android:layout_margin="20dp"
        />

</FrameLayout>
=================
fragmenttop.java
================
package com.example.ex7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TopFragment extends Fragment {



    public TopFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top, container, false);
    }
}
=====================
fragmentbottom.xml
==================
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_margin="20dp"
    android:background="#dddddd"
    tools:context=".BottomFragment">

    <!-- TODO: Update blank fragment layout -->
    <TextView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:text="Fragment Bottom"
        android:textStyle="bold"
        android:textAlignment="center"
        android:textSize="30sp"
        android:layout_margin="20dp"
        />

</FrameLayout>
=================
fragmentbottom.java
====================
package com.example.ex7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BottomFragment extends Fragment {



    public BottomFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom, container, false);
    }
}
