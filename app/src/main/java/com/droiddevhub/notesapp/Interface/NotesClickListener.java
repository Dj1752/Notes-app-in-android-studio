package com.droiddevhub.notesapp.Interface;

import androidx.cardview.widget.CardView;

import com.droiddevhub.notesapp.Model.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongPress(Notes notes, CardView cardView);
}
