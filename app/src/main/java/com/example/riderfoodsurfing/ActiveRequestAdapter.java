package com.example.riderfoodsurfing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class ActiveRequestAdapter extends RecyclerView.Adapter<ActiveRequestAdapter.holder> {

    String data[];
    public ActiveRequestAdapter(String[] data)
    {
        this.data=data;
    }
    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.request_layout_for_recview,parent,false);
        return new holder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        holder.payment.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class holder extends RecyclerView.ViewHolder {

        ConstraintLayout constraintLayout;
        TextView bookingId,bookingIdNumber, addressTxt,address,charge,dollarSign,payment, btnAccept,btnReject;
        View recView;



        public holder(@NonNull View itemView) {
            super(itemView);
            constraintLayout = itemView.findViewById(R.id.constraintRec);
            bookingId= itemView.findViewById(R.id.bookingId);
            bookingIdNumber= itemView.findViewById(R.id.bookingIdNumber);
            addressTxt= itemView.findViewById(R.id.addressTxt);
            address= itemView.findViewById(R.id.addres);
            charge= itemView.findViewById(R.id.charge);
            dollarSign=itemView.findViewById(R.id.dollarSign);
            payment=itemView.findViewById(R.id.payment);
            recView= itemView.findViewById(R.id.recView);
            btnAccept= itemView.findViewById(R.id.btnAccept);
            btnReject= itemView.findViewById(R.id.btnReject);


        }
    }
}
