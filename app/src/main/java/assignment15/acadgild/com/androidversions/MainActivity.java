package assignment15.acadgild.com.androidversions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
// initialize the recycler view
    private RecyclerView recyclerView;
    //Create array and load it with android versions
    private ArrayList<String> arrayVersions = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Cupcake","Donut","Eclair","Froyo","Gingerbread","Honeycomb","Ice Cream Sandwich","Jelly Bean",
            "KitKat","Lollipop","Marshmallow","Nougart","Oreo"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Set layout
        setContentView(R.layout.activity_main);
//        reference the toolbar
        Toolbar toolbar =  findViewById(R.id.toolbar);
//        Set the toolbar
        setSupportActionBar(toolbar);
//      reference the recycler view
        recyclerView = findViewById(R.id.recyclerView);
//        Create new adapter
        RVAdapter rvAdapter = new RVAdapter(MainActivity.this, arrayVersions);
//        Create a linearlayout manager with it being vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
//        Set the layout manager
        recyclerView.setLayoutManager(linearLayoutManager);
//        Set the adapter
        recyclerView.setAdapter(rvAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        Get inflater
        MenuInflater menuInflater = getMenuInflater();
//        inflate menu
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem  item) {
        return super.onOptionsItemSelected(item);
    }
}