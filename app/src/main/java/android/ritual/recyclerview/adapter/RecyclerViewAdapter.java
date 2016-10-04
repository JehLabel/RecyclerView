package android.ritual.recyclerview.adapter;

import android.content.Context;
import android.ritual.recyclerview.R;
import android.ritual.recyclerview.viewholder.RecyclerViewViewHolder;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewViewHolder> {

    private List<String> bungkus = new ArrayList<String>();
    Context c;
    private LayoutInflater layoutInflater;


    public RecyclerViewAdapter(Context context) {
        this.c = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout itemLayout = (LinearLayout)layoutInflater.inflate(R.layout.recycler_view_item, parent, false);
        RecyclerViewViewHolder itemViewHolder = new RecyclerViewViewHolder(itemLayout);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewViewHolder holder, final int position) {
        holder.name.setText(bungkus.get(position));
    }

    @Override
    public int getItemCount() {
        return bungkus.size();
    }

    public void addItem(List<String> listData){
        bungkus.addAll(listData);
        notifyDataSetChanged();
    }

    public void clearItem(){
        bungkus.clear();
        notifyDataSetChanged();
    }
}
