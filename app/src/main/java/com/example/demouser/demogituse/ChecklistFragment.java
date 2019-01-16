package com.example.demouser.demogituse;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ChecklistFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ChecklistFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChecklistFragment extends Fragment
{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    ProgressBar pB;
    CheckBox physical, spiritual, mental, emotional;

    public ChecklistFragment()
    {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ChecklistFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ChecklistFragment newInstance(String param1, String param2)
    {
        ChecklistFragment fragment = new ChecklistFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment

        View checklistView = inflater.inflate(R.layout.fragment_checklist, container, false);
        physicalCheckBx(checklistView);
        emotionalCheckBx(checklistView);
        spiritualCheckBx(checklistView);
        mentalCheckBx(checklistView);
        return checklistView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri)
    {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public void physicalCheckBx(View physicalView)
    {
        pB = physicalView.findViewById(R.id.PhysicalCheckBox);
        physical = (CheckBox)physicalView.findViewById(R.id.PhysicalCheckBox);

        physical.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                pB.setProgress(25);
            }
        });
    }

    public void emotionalCheckBx(View emotionalView)
    {
        pB = emotionalView.findViewById(R.id.progressBar);
        emotional = (CheckBox)emotionalView.findViewById(R.id.EmotionalCheckBox);

        emotional.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                pB.setProgress(25);
            }
        });
    }

    public void spiritualCheckBx(View spiritualView)
    {
        pB = spiritualView.findViewById(R.id.progressBar);
        spiritual = (CheckBox)spiritualView.findViewById(R.id.SpiritualCheckBox);

        emotional.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                pB.setProgress(25);
            }
        });

    }

    public void mentalCheckBx(View mentalView)
    {
        pB = mentalView.findViewById(R.id.progressBar);
        mental = mentalView.findViewById(R.id.MentalCheckBox);

        mental.setOnClickListener(new View.OnClickListener()
        {
            @TargetApi(Build.VERSION_CODES.N)
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v)
            {
                pB.setProgress(25, true);
            }
        });
    }
}
