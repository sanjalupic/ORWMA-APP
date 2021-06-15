package com.example.project_rma;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProfileFragment extends Fragment implements View.OnClickListener {

    private TextView tvAbout;
    private Button AddDesc;
    private EditText etDesc;

    protected RecyclerView mRecyclerView;
    protected RecyclerAdapterMyBooks mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onResume() {
        super.onResume();
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.profile_fragment, container, false);

        tvAbout = (TextView) rootView.findViewById(R.id.aboutmetv);
        AddDesc = (Button) rootView.findViewById(R.id.AddDesc);
        etDesc = (EditText) rootView.findViewById(R.id.etDesc);
        this.AddDesc.setOnClickListener(this);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_my_books);
        mLayoutManager = new GridLayoutManager(requireActivity(), 1);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ContentPage contentPage = (ContentPage) getActivity();
        List<Books> list = contentPage.getMyBooks();

        mAdapter = new RecyclerAdapterMyBooks(list);
        mRecyclerView.setAdapter(mAdapter);


        return rootView;

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.AddDesc){
            this.tvAbout.setText(etDesc.getText());
        }
    }
}
