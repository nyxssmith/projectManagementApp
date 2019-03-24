package com.example.projectmanagementproject.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            switch (input) {
                default:
                    return WelcomeString();
                case 1:
                    return WelcomeString();
                case 2:
                    return TicketsString();
                case 3:
                    return ScheduleString();
            }
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }

    public String TicketsString() {

        String tickets_string = "      Tickets can be purchased at the main office\n" +
                "      Located at 12 Main St.\n" +
                "      Or online on out site: www.get_tickets_here.com";

        return tickets_string;
    }

    public String WelcomeString() {

        String location_string = "      Located at 10 Main Street\n      Boston MA";
        String time_string = "      From 10am Saturday March 23 to 6pm Sunday March 24th";
        //Old string, new one is same but bold unicode
        //String welcome_string = "      Welcome to the Women in Technology Summit";
        String welcome_string = "      \uD835\uDC16\uD835\uDC1E\uD835\uDC25\uD835\uDC1C\uD835\uDC28\uD835\uDC26\uD835\uDC1E \uD835\uDC2D\uD835\uDC28 \uD835\uDC2D\uD835\uDC21\uD835\uDC1E \uD835\uDC16\uD835\uDC28\uD835\uDC26\uD835\uDC1E\uD835\uDC27 \uD835\uDC22\uD835\uDC27 \uD835\uDC13\uD835\uDC1E\uD835\uDC1C\uD835\uDC21\uD835\uDC27\uD835\uDC28\uD835\uDC25\uD835\uDC28\uD835\uDC20\uD835\uDC32 \uD835\uDC12\uD835\uDC2E\uD835\uDC26\uD835\uDC26\uD835\uDC22\uD835\uDC2D";

        return welcome_string + "\n" + location_string + "\n" + time_string;
    }

    public String ScheduleString() {
        //TODO make this return the schedule loaded as a big string
        String schedule_string = "" +//Line below is "Saturday March 23" in bold unicode
                "      \uD835\uDC12\uD835\uDC1A\uD835\uDC2D\uD835\uDC2E\uD835\uDC2B\uD835\uDC1D\uD835\uDC1A\uD835\uDC32 \uD835\uDC0C\uD835\uDC1A\uD835\uDC2B\uD835\uDC1C\uD835\uDC21 \uD835\uDFD0\uD835\uDFD1\n" +
                "      10:00 | Starting Keynote\n" +
                "      11:00 | Salary Negotiation Workshop\n" +
                "      12:00 | Networking Lunch\n" +
                "      1:00 | \"Sexism in the Workplace\"\n" +
                "      2:00 | \"Machine Learning is the Future\"\n" +
                "      3:00 | \"Privacy in 2019\"\n" +
                "      4:00 | \"Supercomputing 101\"\n" +
                "      5:00 | Ending Keynote\n\n" +//Line below is "Sunday March 24" in bold unicode
                "      \uD835\uDC12\uD835\uDC2E\uD835\uDC27\uD835\uDC1D\uD835\uDC1A\uD835\uDC32 \uD835\uDC0C\uD835\uDC1A\uD835\uDC2B\uD835\uDC1C\uD835\uDC21 \uD835\uDFD0\uD835\uDFD2\n" +
                "      10:00 | Starting Keynote\n" +
                "      11:00 | \"Cookies, Coffee and You\"\n" +
                "      12:00 | Networking Lunch\n" +
                "      1:00 | Intro to Big Data Workshop\n" +
                "      2:00 | \"IOT is a Bad Idea\"\n" +
                "      3:00 | Salary Negotiation Workshop\n" +
                "      4:00 | \"Location Services Don't Believe in Off Buttons\"\n" +
                "      5:00 | Ending Keynote\n";

        return schedule_string;
    }

}