package com.example.dunasys.jetpackprojects;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedHashMap;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] mDataset;
    private Context mContext;



    public MyAdapter(String[] myDataset,Context context) {
        //Log
        Log.w("TAG","------------ENTERD");
        Log.w("TAG","------------length"+myDataset.length);
        this.mDataset = myDataset;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,final int i) {

        // create a new view
        View v =  LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.content_recycler_view, viewGroup, false);


        ViewHolder vh = new ViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder,final  int i) {
        Log.w("TAAG","------DATA_DISPLAY"+mDataset[i]);
       viewHolder.display(mDataset[i]);

        /**
         * Setting On Click Event ..
         */
        viewHolder.container.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                    Toast.makeText(mContext,""+mDataset[i],Toast.LENGTH_LONG).show();
           }
       });
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        // each data item is just a string in this case
        public static TextView mTextView;
        public static CardView cardView;
        public static LinearLayout container;
        public static String mData;


        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.textView);
            container =(LinearLayout) v.findViewById(R.id.container);
            cardView =(CardView) v.findViewById(R.id.card_view);
            cardView.setRadius(8);


        }

        public static void display(String s){
            mData =s ;
          mTextView.setText(s);

        }


    }


}
