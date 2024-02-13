package com.example.febathampantask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.febathampantask2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Binding
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

        //Setting listeners
        activityMainBinding.registerBtn.setOnClickListener(this);
        activityMainBinding.loginBtn.setOnClickListener(this);
    }

    /**
     *  Overriding on click
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
 if(v.getId() == R.id.register_btn){

     //Display name, email and address
     Toast.makeText(getApplicationContext(),
             activityMainBinding.name.getText().toString()+     " \t"+
                     activityMainBinding.email.getText().toString() +" \t"+
                     activityMainBinding.address.getText().toString()             , Toast.LENGTH_LONG).show();
 }else if (v.getId() == R.id.login_btn){

     //Display text message
     Toast.makeText(getApplicationContext(),"Validating the credentials", Toast.LENGTH_LONG).show();

 }
    }
}