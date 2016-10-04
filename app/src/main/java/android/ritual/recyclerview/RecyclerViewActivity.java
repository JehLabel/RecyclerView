package android.ritual.recyclerview;

import android.os.Bundle;
import android.ritual.recyclerview.adapter.RecyclerViewAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity{
    private RecyclerViewAdapter myRecyclerViewAdapter;
    private RecyclerView recyclerView;
    private List<String> listItem = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        myRecyclerViewAdapter = new RecyclerViewAdapter(RecyclerViewActivity.this);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(RecyclerViewActivity.this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(myRecyclerViewAdapter);
        addItem();
    }

    public void addItem(){
        for (int i = 0; i<20; i++){
            listItem.add("Item "+i);
        }
        myRecyclerViewAdapter.addItem(listItem);
    }
}
