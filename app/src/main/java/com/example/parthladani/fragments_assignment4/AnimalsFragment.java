package com.example.parthladani.fragments_assignment4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class AnimalsFragment extends android.app.ListFragment implements AdapterView.OnItemClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.animals_list, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
        WebViewFragment webViewFragment = new WebViewFragment();

        String value = (String) getListAdapter().getItem(position);

        Bundle bundle = new Bundle();
        bundle.putString("a", value);
        webViewFragment.setArguments(bundle);
        transaction.replace(R.id.listFrameLayout, webViewFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
