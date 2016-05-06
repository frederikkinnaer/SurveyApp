package com.edocent.surveyapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ankursrivastava on 5/4/16.
 */
public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.ViewHolder> {

    String[] textData;

    public SampleAdapter(String[] textData) {
        this.textData = textData;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView mCardView;
        public ViewHolder(View itemView) {
            super(itemView);
            mCardView = (CardView) itemView;
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_sample,parent,false);

        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.mCardView;
        TextView cardText = (TextView) cardView.findViewById(R.id.cardTextId);
        cardText.setText(textData[position]);
    }

    @Override
    public int getItemCount() {
        return textData.length;
    }
}
