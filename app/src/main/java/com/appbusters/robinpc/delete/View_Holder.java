package com.appbusters.robinpc.delete;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Robin Pc on 12-07-2016.
 */
public class View_Holder extends RecyclerView.ViewHolder {

    CardView cardview;
    TextView word;
    TextView meaning;

    View_Holder(View itemView) {
        super(itemView);
        cardview = (CardView) itemView.findViewById(R.id.cardview);
        word = (TextView) itemView.findViewById(R.id.word);
        meaning = (TextView) itemView.findViewById(R.id.meaning);
    }
}