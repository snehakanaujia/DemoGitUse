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

    ProgressBar pB;
    CheckBox physical, spiritual, mental, emotional;
    Boolean PChecked, SChecked, MChecked, EChecked;

    public ChecklistFragment()
    {
        PChecked = false;
        SChecked = false;
        MChecked = false;
        EChecked = false;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
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
                PChecked = !PChecked;
                if(PChecked) {
                    pB.setProgress(pB.getProgress() + 25);
                }
                else
                {
                    pB.setProgress(pB.getProgress() - 25);
                }
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
                EChecked = !EChecked;
                if(EChecked) {
                    pB.setProgress(pB.getProgress() + 25);
                }
                else
                {
                    pB.setProgress(pB.getProgress() - 25);
                }
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
                SChecked = !SChecked;
                if(SChecked) {
                    pB.setProgress(pB.getProgress() + 25);
                }
                else
                {
                    pB.setProgress(pB.getProgress() - 25);
                }
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
                MChecked = !MChecked;
                if(MChecked) {
                    pB.setProgress(pB.getProgress() + 25);
                }
                else
                {
                    pB.setProgress(pB.getProgress() - 25);
                }
            }
        });

    }
}