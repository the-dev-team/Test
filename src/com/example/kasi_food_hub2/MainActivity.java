package com.example.kasi_food_hub2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	
    private Button buttonLogin;
    private Button buttonCreateAccount;
    private TextView label_forgot_password;
 
   
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        buttonLogin = findViewById(R.id.btnLogin);
        buttonLogin.setOnClickListener(this);
        buttonCreateAccount = findViewById(R.id.btnCreateAccount);
        buttonCreateAccount.setOnClickListener(this);
        label_forgot_password = findViewById(R.id.lbl_forgot_password);
        label_forgot_password.setOnClickListener(this);
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


	@Override
	public void onPointerCaptureChanged(boolean hasCapture) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View view) {
		
		if (view == buttonLogin) {
			Toast.makeText(MainActivity.this, "login", Toast.LENGTH_SHORT).show();
            Intent gotologin= new Intent(MainActivity.this,HomePageActivity.class);
			
			startActivity(gotologin);
		} else if (view == buttonCreateAccount) {
			
			//Toast.makeText(MainActivity.this, "Account Created", Toast.LENGTH_SHORT).show();
			
			Intent intent= new Intent(MainActivity.this,RegistrationActivity.class);
			
			startActivity(intent);
		}
		if (view == label_forgot_password) {
			Intent gotoforgot = new Intent(MainActivity.this,ForgotPasswordActivity.class);
			startActivity(gotoforgot);
		}
		
		
	}


}


