package com.example.buddy.amusement;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Buddy on 8/5/2016.
 */
public class AmusementRecyclerViewAdapter extends RecyclerView.Adapter<AmusementRecyclerViewAdapter.ViewHolder> {
    Context context;
    public static final int staticamuse = 0;
    public static final int dynamicamuse = 1;


    List<GetDataAdapter> getDataAdapter;

    public AmusementRecyclerViewAdapter(List<GetDataAdapter> getDataAdapter, Context context){

        super();

        this.getDataAdapter = getDataAdapter;
        this.context = context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items, parent, false);
//
//        ViewHolder viewHolder = new ViewHolder(v);
        if(viewType==staticamuse)
        {
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.amusementrecyclerview,parent,false);
            return new ViewHolder(v);
        }
        else
        {
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.amusementrecyclerview,parent,false);
            return new ViewHolder(v);
        }



        //return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final GetDataAdapter getDataAdapter1 =  getDataAdapter.get(position);
        if(holder.getItemViewType()==staticamuse)
        {
            holder.AmusementImage.setImageResource(getDataAdapter1.getAmusement_photo1());
            holder.AmusementName.setText(getDataAdapter1.getAmusement_name());
            holder.AmusementAddress.setText(getDataAdapter1.getAmusement_address());
            holder.AmusementPhone.setText("Phone: "+getDataAdapter1.getAmusement_phone());
            holder.AmusementOpeningTime.setText(getDataAdapter1.getAmusement_openingtime());
            holder.AmusementFee.setText(getDataAdapter1.getAmusement_fee());



//            Double fromLat = getDataAdapter1.getNight_latitude();
//            Double fromLong = getDataAdapter1.getNight_longitude();
//            final Bundle args = new Bundle();
//            final String nightlife = getDataAdapter1.getNight_name();
        }
        else if(holder.getItemViewType()==dynamicamuse){
            Glide.with(context).load("http://192.168.0.111/" + getDataAdapter1.getAmusement_photo()).centerCrop().into(holder.AmusementImage);
            holder.AmusementName.setText(getDataAdapter1.getAmusement_name());
            holder.AmusementAddress.setText(getDataAdapter1.getAmusement_address());
            holder.AmusementPhone.setText("Phone: "+getDataAdapter1.getAmusement_phone());
            holder.AmusementOpeningTime.setText(getDataAdapter1.getAmusement_openingtime());
            holder.AmusementFee.setText(getDataAdapter1.getAmusement_fee());
//
//            holder.NightPhone.setText(getDataAdapter1.getNight_phone());
//            Double fromLat = getDataAdapter1.getNight_latitude();
//            Double fromLong = getDataAdapter1.getNight_longitude();
//            final Bundle args = new Bundle();
//            final String nightlife = getDataAdapter1.getNight_name();
        }


        // holder.IdTextView.setText(String.valueOf(getDataAdapter1.getId()));

       /* LatLng fromPostion = new LatLng(fromLat, fromLong);
        holder.NightMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(context, MapActivity.class);
                inten.putExtras(args);
                inten.putExtra("city", nightlife);
                context.startActivity(inten);
            }
        });*/

    }

    @Override
    public int getItemCount() {

        return getDataAdapter.size();
    }

    public int getItemViewType(int position) {
        return getDataAdapter.get(position).getAmusement_type();
    }
    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView AmusementImage;
        public TextView AmusementName;
        public TextView AmusementAddress;
        public TextView AmusementPhone;
        public TextView AmusementOpeningTime;
        public TextView AmusementFee;
        public TextView EntranceFee;
        public TextView OpeningTime;

        public Button AmusementMap;


        public ViewHolder(View itemView) {

            super(itemView);
            //itemView.setOnClickListener(this);

            //IdTextView = (TextView) itemView.findViewById(R.id.textView2) ;
            AmusementImage = (ImageView) itemView.findViewById(R.id.amuseImage);
            AmusementName = (TextView) itemView.findViewById(R.id.amuseName) ;
            AmusementAddress = (TextView) itemView.findViewById(R.id.amuseAddress) ;
            AmusementPhone=(TextView)itemView.findViewById(R.id.amusePhone);
            AmusementOpeningTime=(TextView)itemView.findViewById(R.id.amuseOpening);
            AmusementFee=(TextView)itemView.findViewById(R.id.amuseFee);
            AmusementMap=(Button)itemView.findViewById(R.id.amusementMap);
            EntranceFee=(TextView)itemView.findViewById(R.id.amuseEntranceFee);
            OpeningTime=(TextView)itemView.findViewById(R.id.amuseOpeningTime);


        }
    }
}
