package com.example.demouser.demogituse;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

    private Button saveButton;
    private EditText jEntry;
    private RecordDatabase recordDatabase;
    private RecordRepository recordRepository;
    private Record record;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        recordRepository = new RecordRepository(getActivity().getApplication());

        recordRepository.getRecords().observe(this,
                new Observer<List<Record>>() {
                    @Override
                    public void onChanged(@Nullable List<Record> records) {
                        Toast.makeText(getActivity(), records.get(0).getContent(), Toast.LENGTH_LONG).show();
                        Log.i("Toasted", "Toast works!!");
                    }
                });

        getActivity().setTitle("Journal");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View journalView = inflater.inflate(R.layout.fragment_journal, container, false);

        jEntry = journalView.findViewById(R.id.journalEntry);
        saveButton = journalView.findViewById(R.id.button);
        saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                record = new Record(jEntry.getText().toString());
                recordRepository.insert(record);
                Log.i("Record Data", recordRepository.getRecords().toString());

            }
        });

        return journalView;
    }

}
