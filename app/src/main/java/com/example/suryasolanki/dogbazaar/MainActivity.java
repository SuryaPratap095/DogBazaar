package com.example.suryasolanki.dogbazaar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridHome;
    String[] breeds={
            "Dogs",
            "Cats",
            "Birds",
            "Accessories",
            "Gallery",
            "Contact Us"
    };

    int[] ImageId={
            R.drawable.dog,
            R.drawable.cat,
            R.drawable.bird,
            R.drawable.animalacc,
            R.drawable.galleries,
            R.drawable.contact
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridAdapter gridAdapter=new GridAdapter(MainActivity.this,breeds,ImageId);
        gridHome=(GridView)findViewById(R.id.home_grid);
        gridHome.setAdapter(gridAdapter);
      /*  gridHome.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,"You clicked At"+breeds[+position],Toast.LENGTH_SHORT).show();
            }
        });*/

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
