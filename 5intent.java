activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">
<Button
android:id="@+id/button1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentLeft="true"
android:layout_alignParentTop="true"
android:layout_marginBottom="308dp"
android:text="send"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.498"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/editText2"
app:layout_constraintVertical_bias="1.0" />
<EditText
android:id="@+id/editText1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignRight="@+id/button1"
android:layout_alignParentTop="true"
android:ems="10"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.497"
app:layout_constraintStart_toStartOf="parent"
tools:layout_editor_absoluteY="93dp">
<requestFocus />
</EditText>
<EditText
android:id="@+id/editText2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_below="@+id/editText1"
android:layout_alignRight="@+id/button1"
android:layout_marginTop="140dp"
android:ems="10"
android:inputType="textPassword"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.497"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/editText1" />
</android.support.constraint.ConstraintLayout>

MainActivity.java

package com.example.labprogram5;
import static com.example.labprogram5.R.id;
import static com.example.labprogram5.R.layout;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends Activity
{
@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(layout.activity_main);
final EditText et=(EditText)findViewById(id.editText1);
final EditText et1=(EditText)findViewById(id.editText2);
Button send=(Button)findViewById(id.button1);
send.setOnClickListener(new OnClickListener()
{
@Override
public void onClick(View arg0)
{
String s=et.getText().toString();
String s1=et1.getText().toString();
Intent it=new Intent(MainActivity.this,SecondActivity.class);
it.putExtra("uname", s);
it.putExtra("pwd", s1);
startActivity(it);
}
});
}
@Override
public boolean onCreateOptionsMenu(Menu menu)
{
getMenuInflater().inflate(R.menu.menu_main, menu);
return true;
}
}
activity_second.xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".SecondActivity">
<TextView
android:id="@+id/textView1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentStart="true"
android:layout_alignParentTop="true"
android:text="uname"
app:layout_constraintBottom_toTopOf="@+id/textView2"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent"
app:layout_constraintVertical_bias="0.628"
tools:ignore="RtlHardcoded" />
<TextView
android:id="@+id/textView2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_below="@+id/textView1"
android:layout_alignStart="@+id/textView1"
android:layout_marginBottom="380dp"
android:text="password"
app:layout_constraintBottom_toBottomOf="parent"

app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.498"
app:layout_constraintStart_toStartOmenu_main.xmlf="parent" />
</android.support.constraint.ConstraintLayout>
SecondActivity.java
package com.example.labprogram5;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
public class SecondActivity extends Activity
{
@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_second);
TextView tv=(TextView)findViewById(R.id.textView1);
TextView tv1=(TextView)findViewById(R.id.textView2);
tv.setText(getIntent().getExtras().getString("uname"));
tv1.setText(getIntent().getExtras().getString("pwd"));
}
@Override
public boolean onCreateOptionsMenu(Menu menu)
{
getMenuInflater().inflate(R.menu.menu_main , menu);
return true;
}
}
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:android="http://schemas.android.com/apk/res/android">
<item android:id="@+id/action_camera"
android:title="Camera"
app:showAsAction="always" />
</menu>
