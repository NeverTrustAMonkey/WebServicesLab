package edu.tacoma.uw.plsanch.webserviceslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.tacoma.uw.plsanch.webserviceslab.course.Course;

public class CourseActivity extends AppCompatActivity implements CourseFragment.OnListFragmentInteractionListener {

    @Override
    public void onListFragmentInteraction(Course course) {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        if (savedInstanceState == null || getSupportFragmentManager().findFragmentById(R.id.list) == null) {
            CourseFragment courseFragment = new CourseFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, courseFragment)
                    .commit();
        }

    }
}
