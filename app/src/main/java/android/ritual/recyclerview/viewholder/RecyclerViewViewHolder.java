package android.ritual.recyclerview.viewholder;

import android.ritual.recyclerview.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * RecyclerView.ViewHolder extension created to render a DragonBallHeader instance.
 */
public class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
  public final TextView name;

  public RecyclerViewViewHolder(View itemView) {
    super(itemView);
    name = (TextView)itemView.findViewById(R.id.name);
  }

}
