package pe.com.mobileconsulting.viewcontrollers.entities;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

import pe.com.mobileconsulting.R;
import pe.com.mobileconsulting.viewcontrollers.entities.Service;

public class ServiceCollection {
    private List<Service> service;

    public List<Service> getService(){
        return service;
    }

    public ServiceCollection(Context context) {
        Resources res = context.getResources();
        service = new ArrayList<>();
        service.add(new Service(res.getString(R.string.name_service_consulting),
                res.getString(R.string.description_service_consulting),
                res.getString(R.string.brand_service_consulting),
                R.drawable.service_consulting));
        service.add(new Service(res.getString(R.string.name_service_support),
                res.getString(R.string.description_service_support),
                res.getString(R.string.brand_service_support),
                R.drawable.service_support));
        service.add(new Service(res.getString(R.string.name_service_training),
                res.getString(R.string.description_service_training),
                res.getString(R.string.brand_service_training),
                R.drawable.service_training));

    }
}
