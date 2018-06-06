package pe.com.mobileconsulting.viewcontrollers.entities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pe.com.mobileconsulting.viewcontrollers.activities.IconActivity;
import pe.com.mobileconsulting.R;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.ViewHolder> {

    List<Service> service;

    public void setService(List<Service> service){
        this.service = service;
    }

    @Override
    public ServiceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_service, parent, false)
        );
    }
    @Override
    public void onBindViewHolder(ServiceAdapter.ViewHolder holder, final int position) {
        holder.nameTextView.setText(service.get(position).getName());
        holder.pictureImageView.setImageResource(service.get(position).getPictureId());
        holder.serviceCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("currentPosition", position);

                Intent iconIntent = new Intent(view.getContext(), IconActivity.class);
                iconIntent.putExtras(bundle);
                view.getContext().startActivity(iconIntent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return service.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView serviceCardView;
        ImageView pictureImageView;
        TextView nameTextView;
        TextView shortDescriptionTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            serviceCardView = (CardView) itemView.findViewById(R.id.serviceCardView);
            pictureImageView = (ImageView) itemView.findViewById(R.id.pictureImageView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
        }
    }
}
