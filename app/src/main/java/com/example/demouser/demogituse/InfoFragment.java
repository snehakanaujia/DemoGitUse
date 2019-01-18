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
// * {@link InfoFragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// * Use the {@link InfoFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class InfoFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivity().setTitle("M.H.C Health Application!");
        
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        WebView myWebView = view.findViewById(R.id.infoweb);
        myWebView.loadUrl("file:///android_asset/info_page.html");

        myWebView.setWebViewClient(new WebViewClient());

        return view;

    }

}
