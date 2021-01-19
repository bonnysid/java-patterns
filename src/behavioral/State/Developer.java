package behavioral.State;

public class Developer {
    Activity activity;

    public Developer(Activity activity) {
        this.activity = activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if(activity instanceof Sleeping) {
            activity = new Reading();
        } else if (activity instanceof  Reading) {
            activity = new Training();
        } else if ( activity instanceof  Training) {
            activity = new Coding();
        } else if (activity instanceof Coding) {
            activity = new Sleeping();
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
