package com.example.project_rma;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class BookInfoFragment extends Fragment {
    private ButtonExitFFromAboutListener mButtonListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        ImageButton mExitButton;
        ImageButton mAddToMyBooks;
        view = inflater.inflate(R.layout.about_books_fragment, container, false);

        TextView textViewDescription = view.findViewById(R.id.tvAboutBooksText);
        TextView textViewName = view.findViewById(R.id.aboutTitle);
        mExitButton = (ImageButton) view.findViewById(R.id.aboutExit);
        mAddToMyBooks = (ImageButton) view.findViewById(R.id.btnAddToBooks);

        Bundle arguments = getArguments();
        int position = arguments.getInt("position");
        ContentPage contentPage= (ContentPage) getActivity();
        Books books = contentPage.getBooks(position);
        textViewDescription.setText(books.getDescription());
        textViewName.setText(books.getTitle());

        mExitButton.setOnClickListener(v -> {
            if (mButtonListener != null)
                mButtonListener.onButtonCLicked(true);
        });

        mAddToMyBooks.setOnClickListener((View v) -> {
            contentPage.addToMyBooks(position);
        });
        return  view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof ButtonExitFFromAboutListener) {
            mButtonListener = (ButtonExitFFromAboutListener) context;
        }
    }
}
