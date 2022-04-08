package com.llopez.carsmotors.splash;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.llopez.carsmotors.R;

public class SplashFragment extends Fragment {
    public SplashFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_splash, container, false);
        NavHostFragment.findNavController(this).navigate(R.id.action_splashFragment_to_loginFragment);
        return layout;
    }
}