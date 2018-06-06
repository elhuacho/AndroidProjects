package pe.com.mobileconsulting.viewcontrollers.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import pe.com.mobileconsulting.R;
import pe.com.mobileconsulting.viewcontrollers.entities.ServiceAdapter;
import pe.com.mobileconsulting.viewcontrollers.entities.ServiceCollection;
import pe.com.mobileconsulting.viewcontrollers.entities.Service;


/**
 * A simple {@link Fragment} subclass.
 */
public class ServicesFragment extends Fragment {
    List<Service> service;
    RecyclerView.LayoutManager serviceLayoutManager;
    RecyclerView serviceRecyclerView;
    ServiceAdapter serviceAdapter;

    public ServicesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View servicesView = inflater.inflate(R.layout.fragment_services, container, false);
        ServiceCollection serviceCollection = new ServiceCollection(getContext());
        service = serviceCollection.getService();
        serviceLayoutManager = new LinearLayoutManager(getActivity());
        serviceAdapter = new ServiceAdapter();
        serviceAdapter.setService(service);
        serviceRecyclerView = (RecyclerView) servicesView.findViewById(R.id.servicesRecyclerView);
        serviceRecyclerView.setLayoutManager(serviceLayoutManager);
        serviceRecyclerView.setAdapter(serviceAdapter);
        getActivity().setTitle("Services");
        return servicesView;
    }

}
