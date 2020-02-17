package com.example.myhub.inputbottom;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import com.example.myhub.R;

import java.util.Objects;

public class TestFragment extends Fragment {

    private static String tag;

    private TextView textView;

    private LinearAdapter adapter;

    private RecyclerView recyclerView;

    public TestFragment(String tag) {
        // Required empty public constructor
        this.tag = tag;
    }

    public TestFragment() {
        tag = "";
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return LayoutInflater.from(getContext()).inflate(R.layout.fragment_test, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new LinearAdapter();

        recyclerView = Objects.requireNonNull(getView()).findViewById(R.id.stragger_recycler);

        recyclerView.setAdapter(adapter);
    }
}
