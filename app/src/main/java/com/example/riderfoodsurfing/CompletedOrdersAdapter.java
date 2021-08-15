package com.example.riderfoodsurfing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class CompletedOrdersAdapter  extends RecyclerView.Adapter<CompletedOrdersAdapter.completedHolder> {

    public CompletedOrdersAdapter(String[] dataComp) {
        this.dataComp = dataComp;
    }

    String dataComp[];
    @NonNull
    @Override
    public completedHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater= LayoutInflater.from(parent.getContext());
            View view= inflater.inflate(R.layout.completed_order_recyclview,parent,false);
      return new completedHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull completedHolder holder, int position) {
             holder.chargesComp.setText(dataComp[position]);
    }

    @Override
    public int getItemCount() {
        return dataComp.length;
    }

    class completedHolder extends RecyclerView.ViewHolder{
       ConstraintLayout constraintComp;
       View viewCompletedOrders;
       TextView bookingIdComp,bookingIdNumberComp,addressTextComp,addresComp,chargeComp,dollarSignComp,chargesComp,completed;

        public completedHolder(@NonNull View itemView) {
            super(itemView);

            constraintComp= itemView.findViewById(R.id.constraintComp);
            viewCompletedOrders= itemView.findViewById(R.id.viewCompletedOrders);
            bookingIdComp= itemView.findViewById(R.id.bookingIdComp);
            bookingIdNumberComp= itemView.findViewById(R.id.bookingIdNumberComp);
            addressTextComp=itemView.findViewById(R.id.addressTextComp);
            addresComp= itemView.findViewById(R.id.addresComp);
            chargeComp=itemView.findViewById(R.id.chargeComp);
            dollarSignComp= itemView.findViewById(R.id.dollarSignComp);
            chargesComp= itemView.findViewById(R.id.chargesComp);
            completed= itemView.findViewById(R.id.completed);


        }
    }
}
