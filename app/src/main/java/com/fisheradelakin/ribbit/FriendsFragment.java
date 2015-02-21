package com.fisheradelakin.ribbit;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Fisher on 2/20/15.
 */
public class FriendsFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // in the case i don't understand what the return state is doing
        // it's returning the line of code that's commented out.
        // View rootView = inflater.inflate(R.layout.fragment_inbox, container, false);

        return inflater.inflate(R.layout.fragment_friends, container, false);
    }
}
