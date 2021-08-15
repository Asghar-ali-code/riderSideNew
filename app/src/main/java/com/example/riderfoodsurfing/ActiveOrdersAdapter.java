package com.example.riderfoodsurfing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class ActiveOrdersAdapter extends RecyclerView.Adapter<ActiveOrdersAdapter.activeOrder> {
    public ActiveOrdersAdapter(String[] dataActiveOrders) {
        this.dataActiveOrders = dataActiveOrders;
    }

    String dataActiveOrders[];

    @NonNull
    @Override
    public activeOrder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.progress_request_recview,parent,false);
        return new activeOrder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull activeOrder holder, int position) {
             holder.chargesPro.setText(dataActiveOrders[position]);
    }

    @Override
    public int getItemCount() {
        return dataActiveOrders.length;
    }

    class activeOrder extends RecyclerView.ViewHolder{
       ConstraintLayout constraintPro;
       View recViewPro;
       TextView bookingIdPro,bookingIdNumberPro,addressTxtPro,addresPro,chargePro,dollarPro,chargesPro,texProgress;
        public activeOrder(@NonNull View itemView) {
            super(itemView);
            constraintPro= itemView.findViewById(R.id.constraintPro);
            recViewPro= itemView.findViewById(R.id.recViewPro);
            bookingIdPro= itemView.findViewById(R.id.bookingIdPro);
            bookingIdNumberPro= itemView.findViewById(R.id.bookingIdNumberPro);
            addressTxtPro= itemView.findViewById(R.id.addressTxtPro);
            addresPro=itemView.findViewById(R.id.addresPro);
            chargePro=itemView.findViewById(R.id.chargePro);
            dollarPro=itemView.findViewById(R.id.dollarPro);
            chargesPro=itemView.findViewById(R.id.chargesPro);
            texProgress=itemView.findViewById(R.id.texProgress);



        }
    }
}
