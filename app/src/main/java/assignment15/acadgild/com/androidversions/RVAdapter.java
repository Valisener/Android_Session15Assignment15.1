package assignment15.acadgild.com.androidversions;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder>{
//    variable that holds the context
    private Context context;
//    variable that holds the list of android versions
    private List<String> list;

//    Constructor
    public RVAdapter(Context context, List<String> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        Create view with the custom layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);
//        make a new viewholder with the view
        ViewHolder viewHolder = new ViewHolder(view);
//        return the viewholder
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        Sets the text on the item in the viewholder
        holder.textView.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
//        returns the number of items in the list
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
//        initialize textview variable
        private TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
//            reference it to the id in the layout
            textView = itemView.findViewById(R.id.androidversion);
        }
    }
}