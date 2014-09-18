package com.example.lyndon.lyndondemoA2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.view.MenuInflater;



public class MainActivity extends Activity {
    public final static String EXTRA_MESSAGE = "com.example.LyndonDemo.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

        // This is for the fancy menu, should only be used in the god damn Display Message Activity
        // MenuInflater inflater = getMenuInflater();
        // inflater.inflate(R.menu.main_activity_actions, menu);
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();
        //if (id == R.id.action_settings) {
        //    return true;
        //}
        //return super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch(); // Created blank methods for these 2
                return true;
            case R.id.action_settings:
                openSettings(); // Here!
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void openSearch()
    {

    }

    public void openSettings(){

    }

}
