package com.example.project_rma;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapterMyBooks extends RecyclerView.Adapter<RecyclerAdapterMyBooks.NameViewHolder>  {
    private List<Books> list;

    public class NameViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView tvTitle, tvAuthor, tvCategory;
        private ImageView imageViewBook;
        private ImageButton btnRemove;

        public NameViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvTitle=itemView.findViewById(R.id.tvTitle);
            this.imageViewBook = itemView.findViewById(R.id.image_view_my_books);
            this.tvAuthor = itemView.findViewById(R.id.tvAuthor);
            this.tvCategory = itemView.findViewById(R.id.tvCategory);

            this.btnRemove = itemView.findViewById(R.id.btnRemove);
            itemView.setOnClickListener(this);

        }


        public void setTvTitle(Books books){ tvTitle.setText(books.getTitle());}
        public void setPic(Books books){ imageViewBook.setImageResource(books.getImage()); }
        public void setTvAuthor(Books books) {
            tvAuthor.setText(books.getAuthor());
        }
        public void setTvCategory(Books books) {
            tvCategory.setText(books.getCategory());
        }


        @Override
        public void onClick(View v) {  }
    }


    public RecyclerAdapterMyBooks(List<Books> list){
        this.list=list;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_view_my_books, parent, false);
        return new NameViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.setTvTitle(list.get(position));
        holder.setPic(list.get(position));
        holder.setTvAuthor(list.get(position));
        holder.setTvCategory(list.get(position));
        holder.btnRemove.setOnClickListener(v -> {
            Log.d("TAG", "size" + list.size() + "position: " + position);
            list.remove(position);
            notifyItemRemoved(position);
            notifyItemRangeChanged(position, getItemCount());
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
