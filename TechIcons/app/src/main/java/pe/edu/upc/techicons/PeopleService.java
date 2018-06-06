package pe.edu.upc.techicons;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

public class PeopleService {
    private List<Person> people;

    public List<Person> getPeople(){
        return people;
    }

    public PeopleService(Context context) {
        Resources res = context.getResources();
        people = new ArrayList<>();
        people.add(new Person(res.getString(R.string.name_bill_gates),
                res.getString(R.string.title_former_ceo_and_founder),
                res.getString(R.string.company_microsoft),
                res.getString(R.string.bio_bill_gates),
                R.drawable.face_bill_gates));
        people.add(new Person(res.getString(R.string.name_larry_ellison),
                res.getString(R.string.title_cto),
                res.getString(R.string.company_oracle),
                res.getString(R.string.bio_larry_ellison),
                R.drawable.face_larry_ellison));
        people.add(new Person(res.getString(R.string.name_mark_zuckerberg),
                res.getString(R.string.title_ceo),
                res.getString(R.string.company_facebook),
                res.getString(R.string.bio_mark_zuckerberg),
                R.drawable.face_mark_zuckerberg));
        people.add(new Person(res.getString(R.string.name_steve_jobs),
                res.getString(R.string.title_former_ceo_and_founder),
                res.getString(R.string.company_apple),
                res.getString(R.string.bio_steve_jobs),
                R.drawable.face_steve_jobs));
        people.add(new Person(res.getString(R.string.name_steve_wozniak),
                res.getString(R.string.title_co_founder),
                res.getString(R.string.company_apple),
                res.getString(R.string.bio_steve_wozniak),
                R.drawable.face_steve_wozniak));

    }
}
