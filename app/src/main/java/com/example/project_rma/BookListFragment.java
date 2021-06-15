package com.example.project_rma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class  BookListFragment extends Fragment implements OnCardClickListener {

    protected RecyclerView mRecyclerView;
    protected RecyclerAdapterAllBooks mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.books_list_fragment, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_all_books);
        mLayoutManager = new GridLayoutManager(requireActivity(), 1);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ContentPage contentPage = (ContentPage) getActivity();
        List<Books> list = contentPage.getAllBooks();

        mAdapter = new RecyclerAdapterAllBooks(this, list);
        mRecyclerView.setAdapter(mAdapter);


        return rootView;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

    }


    @Override
    public void onCardClick(int position) {
        Bundle arguments = new Bundle();
        arguments.putInt("position" , position);
        BookInfoFragment bookInfoFragment = new BookInfoFragment();
        bookInfoFragment.setArguments(arguments);
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.about_books_frame_layout, bookInfoFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
