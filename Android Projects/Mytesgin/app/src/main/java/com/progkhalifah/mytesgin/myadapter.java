package com.progkhalifah.mytesgin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class myadapter extends FirebaseRecyclerAdapter<model, myadapter.myviewholder> {



    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model) {

        holder.name.setText(model.getName());
        holder.title.setText(model.getTitle());
        holder.description.setText(model.getDescription());
        holder.responsibilities.setText(model.getResponsibilities());
        holder.requirements.setText(model.getRequirements());
        holder.qualification.setText(model.getQualification());
        Glide.with(holder.img.getContext()).load(model.getPurl()).into(holder.img);



    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        CircleImageView img;
        TextView name,title,description,responsibilities,requirements,qualification;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img=(CircleImageView) itemView.findViewById(R.id.img1);
            name=(TextView)itemView.findViewById(R.id.cname);
            title=(TextView)itemView.findViewById(R.id.jtitle);
            description=(TextView)itemView.findViewById(R.id.j_description);
            responsibilities=(TextView)itemView.findViewById(R.id.j_responsibilities);
            requirements=(TextView)itemView.findViewById(R.id.j_requirements);
            qualification=(TextView)itemView.findViewById(R.id.j_qualification);
        }
    }
}
