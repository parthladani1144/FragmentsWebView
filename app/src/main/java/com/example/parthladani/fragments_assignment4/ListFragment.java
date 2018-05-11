package com.example.parthladani.fragments_assignment4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class ListFragment extends android.app.ListFragment implements AdapterView.OnItemClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.main_list, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        android.app.FragmentManager fragmentManager = getActivity().getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(position == 0) {

            AnimalsFragment animalsFragment = new AnimalsFragment();
            fragmentTransaction.replace(R.id.listFrameLayout, animalsFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        }

        if(position == 1) {

            PlanetsFragment planetsFragment = new PlanetsFragment();
            fragmentTransaction.replace(R.id.listFrameLayout, planetsFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        }

        if(position == 2) {

            CountriesFragment countriesFragment = new CountriesFragment();
            fragmentTransaction.replace(R.id.listFrameLayout, countriesFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        }

        if(position == 3) {

            WondersFragment wondersFragment = new WondersFragment();
            fragmentTransaction.replace(R.id.listFrameLayout, wondersFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        }

        if(position == 4) {

            LanguagesFragment languagesFragment = new LanguagesFragment();
            fragmentTransaction.replace(R.id.listFrameLayout, languagesFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        }
    }
}
