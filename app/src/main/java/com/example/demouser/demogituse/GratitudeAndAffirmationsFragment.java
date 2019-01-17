package com.example.demouser.demogituse;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


///**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link GratitudeAndAffirmationsFragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// * Use the {@link GratitudeAndAffirmationsFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class GratitudeAndAffirmationsFragment extends Fragment {

    public Random random = new Random();

    private Button affirmationButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle("Gratitude and Affirmations");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_gratitude_and_affirmations, container, false);

        affirmationButton = view.findViewById(R.id.abutton);
        affirmationButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int picNum = random.nextInt(30) + 1;
                final String pic = "a" + picNum;
                ((ImageView) view.findViewById(R.id.affirmation)).setImageResource(getResources().getIdentifier(pic, "drawable", getActivity().getPackageName()));
                Log.i("Image", pic);
            }

        });

        return view;
    }

}
