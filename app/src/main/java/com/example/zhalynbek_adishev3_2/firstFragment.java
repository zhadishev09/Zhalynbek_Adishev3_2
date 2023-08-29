package com.example.zhalynbek_adishev3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class firstFragment extends Fragment {

    private TextView textView;
    private int currentValue = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = requireActivity().findViewById(R.id.tv_chek);
        Button Plus = requireActivity().findViewById(R.id.btn_plus);
        Button Minus = requireActivity().findViewById(R.id.btn_minus);
        Plus.setOnClickListener(view1 -> {
            currentValue++;
            uppDateTextView();
        });

        Minus.setOnClickListener(view12 -> {
            currentValue--;
            uppDateTextView();

        });
    }

    private void uppDateTextView() {
        textView.setText(String.valueOf(currentValue));
    }
}