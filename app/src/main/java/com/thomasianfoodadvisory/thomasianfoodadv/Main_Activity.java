package com.thomasianfoodadvisory.thomasianfoodadv;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;



public class Main_Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_, menu);
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

    public void Estreet(View view) {                                //copy sa mga main
        // Do something in response to button
        Intent intent = new Intent(this, Espana_act.class);//name of sub pages
        startActivity(intent);}

    public void Dstreet(View view) {                                //copy sa mga main
        // Do something in response to button
        Intent intent = new Intent(this, Dapitan_activity.class);//name of sub pages
        startActivity(intent);}

    public void Lstreet(View view) {                                //copy sa mga main
        // Do something in response to button
        Intent intent = new Intent(this, Lacson_Activity.class);//name of sub pages
        startActivity(intent);}

    public void Pstreet(View view) {                                //copy sa mga main
        // Do something in response to button
        Intent intent = new Intent(this, Pnoval_activity.class);//name of sub pages
        startActivity(intent);
    }

    public void findStreet (View view) {                                //copy sa mga main
        // Do something in response to button
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com.ph/?gfe_rd=cr&ei=1IVgVMTqAYiK8QeavICQDA&gws_rd=ssl"));
        startActivity(i);
    }
    public void mapStreet (View view) {                                //copy sa mga main
        // Do something in response to button
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com.ph/maps/@14.5653015,121.0246344,11z?hl=en"));
        startActivity(i);
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
            View rootView = inflater.inflate(R.layout.fragment_main_, container, false);
            return rootView;
        }
    }
}
