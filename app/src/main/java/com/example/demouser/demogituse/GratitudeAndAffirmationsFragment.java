package com.example.demouser.demogituse;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


///**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link GratitudeAndAffirmationsFragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// * Use the {@link GratitudeAndAffirmationsFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class GratitudeAndAffirmationsFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivity().setTitle("Gratitude and Affirmations");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gratitude_and_affirmations, container, false);

        return view;

    }

}
