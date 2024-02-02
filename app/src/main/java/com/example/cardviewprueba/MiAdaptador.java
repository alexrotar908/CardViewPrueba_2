package com.example.cardviewprueba;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
public class MiAdaptador extends RecyclerView.Adapter<MyViewHolder> {

    private Context contexto;
    private List<DataClass> Lista;

    public void setSearchList(List<DataClass> dataSearchList){
        this.Lista = dataSearchList;
        notifyDataSetChanged();
    }
    public MiAdaptador(Context contexto, List<DataClass> Lista){
        this.contexto = contexto;
        this.Lista = Lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.Imagen.setImageResource(Lista.get(position).getDataImagen());
        holder.Nombre.setText(Lista.get(position).getDataNombre());
        holder.Desc.setText(Lista.get(position).getDataDesc());
        holder.Instrucciones.setText(Lista.get(position).getDataInst());
        holder.recCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contexto, detail.class);
                intent.putExtra("Image", Lista.get(holder.getAdapterPosition()).getDataImagen());
                intent.putExtra("Title", Lista.get(holder.getAdapterPosition()).getDataNombre());
                intent.putExtra("Desc", Lista.get(holder.getAdapterPosition()).getDataDesc());
                contexto.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return Lista.size();
    }
}

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView Imagen;
        TextView Nombre, Desc, Instrucciones;
        CardView recCard;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Imagen = itemView.findViewById(R.id.Imagen);
            Nombre = itemView.findViewById(R.id.Nombre);
            Desc = itemView.findViewById(R.id.recDesc);
            Instrucciones = itemView.findViewById(R.id.Ingredientes);
            recCard = itemView.findViewById(R.id.recCard);
        }

}
