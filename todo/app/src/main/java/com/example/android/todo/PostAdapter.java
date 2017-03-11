package com.example.android.todo;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.android.todo.databinding.post_bind;

import java.util.List;

/**
 * Created by android on 3/12/2017.
 */

class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder>{
    private Context context;
    private List<PostRequirementDetail> data;

    public PostAdapter(Context context, List<PostRequirementDetail> data) {
        this.context = context;
        this.data = data;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        post_bind bind = DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.textview,parent,false);

        return new MyViewHolder(bind);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        PostRequirementDetail p = data.get(position);
        holder.bind.DisplayName.setText(p.getBloodGroup());
        holder.bind.noOfUnitsBloodGr.setText(p.getCity());
        holder.bind.locationNrelation.setText(p.getCountry());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        post_bind bind ;
        public MyViewHolder(post_bind bind) {
            super(bind.getRoot());
            this.bind = bind;
        }

        @Override
        public void onClick(View view) {
            bind.btnVolunteer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Volunteer", Toast.LENGTH_SHORT).show();
                }
            });
            bind.btnComment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Comment", Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
