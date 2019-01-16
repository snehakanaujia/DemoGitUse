package com.example.demouser.demogituse;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


///**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link JournalFragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// * Use the {@link JournalFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class JournalFragment extends Fragment {

    public List<String> journalRecord = new ArrayList<>();
    private Button saveButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivity().setTitle("Journal");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View journalView = inflater.inflate(R.layout.fragment_journal, container, false);

        saveButton = journalView.findViewById(R.id.button);
        saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {



            }
        });

        return journalView;
    }

    /*
    EditText edText1 = (EditText) findViewById(R.id.editText1);

edText1.setInputType(InputType.TYPE_CLASS_TEXT);

String str = edText1.getText().toString();
     */

}
