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
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapterAllBooks extends RecyclerView.Adapter<RecyclerAdapterAllBooks.NameViewHolder>   {
    private List<Books> list;
    private OnCardClickListener onCardListener;

    public RecyclerAdapterAllBooks(OnCardClickListener listener, List<Books> list){
        this.list = list;
        this.onCardListener = listener;
    }

    public class NameViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView tvTitle, tvAuthor, tvCategory;
        private ImageView imageViewBook;
        private ImageButton btnAdd;
        private CardView bookCard;

        public NameViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvTitle=itemView.findViewById(R.id.tvTitle);
            this.imageViewBook = itemView.findViewById(R.id.image_view_my_books);
            this.tvAuthor = itemView.findViewById(R.id.tvAuthor);
            this.tvCategory = itemView.findViewById(R.id.tvCategory);
            this.bookCard = itemView.findViewById(R.id.item_card_books);
            itemView.setOnClickListener(this);
        }

        public void setName(Books books){ tvTitle.setText(books.getTitle());}
        public void setPic(Books books){ imageViewBook.setImageResource(books.getImage()); }
        public void setTvAuthor(Books books) {
            tvAuthor.setText(books.getAuthor());
        }
        public void setTvCategory(Books books) {
            tvCategory.setText(books.getCategory());
        }

        @Override
        public void onClick(View v) {
        }
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_view_all_books, parent, false);
        return new NameViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.setName(list.get(position));
        holder.setPic(list.get(position));
        holder.setTvAuthor(list.get(position));
        holder.setTvCategory(list.get(position));
        holder.bookCard.setOnClickListener(v -> onCardListener.onCardClick(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

