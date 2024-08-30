import java.util.Arrays;
import java.util.Comparator;

class Activity {
    int start, end;
    
    Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class ActivitySelection {
    public static int maxActivities(Activity[] activities) {
        Arrays.sort(activities, Comparator.comparingInt(a -> a.end));
        int count = 1;
        int lastEnd = activities[0].end;
        
        for (int i = 1; i < activities.length; i++) {
            if (activities[i].start >= lastEnd) {
                count++;
                lastEnd = activities[i].end;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Activity[] activities = {new Activity(1, 3), new Activity(2, 4), new Activity(3, 5), 
                                 new Activity(0, 6), new Activity(5, 7), new Activity(8, 9), 
                                 new Activity(5, 9)};
        System.out.println("Maximum number of activities: " + maxActivities(activities));
    }
}
