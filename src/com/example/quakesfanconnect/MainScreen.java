package com.example.quakesfanconnect;


import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        
        final Button FBButton =(Button)findViewById(R.id.button1);
        final Button SignUpButton =(Button)findViewById(R.id.button2);
        final Button SignInButton =(Button)findViewById(R.id.button3);
        FBButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(MainScreen.this, SignIn.class);
                startActivity(i);	 
                // close this activity
                // finish();
                overridePendingTransition(R.animator.right_in, R.animator.left_out);
            }
        });
        SignUpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(MainScreen.this, SignUp.class);
                startActivity(i);	 
                // close this activity
                //finish();
                overridePendingTransition(R.animator.right_in, R.animator.left_out);
            }
        });
        SignInButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(MainScreen.this, SignIn.class);
                startActivity(i);	 
                // close this activity
                //finish();
                overridePendingTransition(R.animator.right_in, R.animator.left_out);
            }
        });
    }   

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_screen, menu);
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_main_screen, container, false);
            return rootView;
        }
    }

}
