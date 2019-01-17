package com.example.demouser.demogituse;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;

/**
 * A simple {@link Fragment} subclass.
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

    ProgressBar pB;
    CheckBox physical, spiritual, mental, emotional;

    public ChecklistFragment()
    {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (getArguments() != null)
        {
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

    /**
     *
     * @param physicalView
     */
    public void physicalCheckBx(View physicalView)
    {
        pB = physicalView.findViewById(R.id.progressBar);
        physical = (CheckBox)physicalView.findViewById(R.id.PhysicalCheckBox);

        physical.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                pB.setProgress(25+pB.getProgress());
            }
        });
    }

    /**
     *
     * @param emotionalView
     */
    public void emotionalCheckBx(View emotionalView)
    {
        pB = emotionalView.findViewById(R.id.progressBar);
        emotional = (CheckBox)emotionalView.findViewById(R.id.EmotionalCheckBox);

        emotional.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                pB.setProgress(25+pB.getProgress());
            }
        });
    }

    /**
     *
     * @param spiritualView
     */
    public void spiritualCheckBx(View spiritualView)
    {
        pB = spiritualView.findViewById(R.id.progressBar);
        spiritual = (CheckBox)spiritualView.findViewById(R.id.SpiritualCheckBox);

        spiritual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                pB.setProgress(25+pB.getProgress());
            }
        });

    }

    /**
     *
     * @param mentalView
     */
    public void mentalCheckBx(View mentalView)
    {
        pB = mentalView.findViewById(R.id.progressBar);
        mental = (CheckBox) mentalView.findViewById(R.id.MentalCheckBox);

        mental.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                pB.setProgress(25+pB.getProgress());
            }
        });

    }
}