# Activity Selection Problem

## Problem Description
The Activity Selection Problem is a classic optimization problem where the goal is to select the maximum number of activities that do not overlap, given their start and end times. This problem is particularly useful in scheduling scenarios where one needs to maximize the number of non-conflicting activities.

## Use Case
This problem is widely applicable in various scheduling scenarios, such as:
- **Meeting Scheduling:** Determine the maximum number of meetings that can be scheduled in a day without overlap.
- **Event Planning:** Select the maximum number of events that can be attended without any time conflicts.
- **Task Management:** Choose non-overlapping tasks that maximize productivity in a given time frame.

## Approach
1. **Sort Activities:** 
   - Sort the activities based on their end time. Sorting helps in choosing the activity that finishes the earliest, leaving room for subsequent activities.
   
2. **Select Activities:** 
   - Start with the first activity (after sorting) and iterate through the list.
   - Select an activity if its start time is greater than or equal to the end time of the last selected activity.
   
This greedy approach ensures that the maximum number of non-overlapping activities are selected.

## Time Complexity
- **O(n log n):** The overall time complexity is dominated by the sorting step, which is O(n log n). The activity selection process is O(n), making the total time complexity O(n log n).

## Code Implementation

### C

```c

#include <stdio.h>
#include <stdlib.h>

struct Activity {
    int start, end;
};

// Comparator function to sort activities based on end time
int compare(const void *a, const void *b) {
    struct Activity *activityA = (struct Activity *)a;
    struct Activity *activityB = (struct Activity *)b;
    return (activityA->end - activityB->end);
}

int maxActivities(struct Activity activities[], int n) {
    // Sort activities by their end time
    qsort(activities, n, sizeof(struct Activity), compare);

    int count = 1; // At least one activity can always be selected
    int lastEnd = activities[0].end;

    // Iterate through the sorted activities
    for (int i = 1; i < n; i++) {
        // If the start time of the current activity is greater than or equal
        // to the end time of the last selected activity, select it
        if (activities[i].start >= lastEnd) {
            count++;
            lastEnd = activities[i].end;
        }
    }

    return count;
}

int main() {
    struct Activity activities[] = {{1, 3}, {2, 4}, {3, 5}, {0, 6}, {5, 7}, {8, 9}, {5, 9}};
    int n = sizeof(activities) / sizeof(activities[0]);
    printf("Maximum number of activities: %d\n", maxActivities(activities, n));
    return 0;
}

```
### C++

```c
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

struct Activity {
    int start, end;
};

bool compare(Activity a, Activity b) {
    return a.end < b.end;
}

int maxActivities(vector<Activity> &activities) {
    sort(activities.begin(), activities.end(), compare);
    int count = 1;
    int lastEnd = activities[0].end;

    for (int i = 1; i < activities.size(); i++) {
        if (activities[i].start >= lastEnd) {
            count++;
            lastEnd = activities[i].end;
        }
    }
    return count;
}

int main() {
    vector<Activity> activities = {{1, 3}, {2, 4}, {3, 5}, {0, 6}, {5, 7}, {8, 9}, {5, 9}};
    cout << "Maximum number of activities: " << maxActivities(activities) << endl;
    return 0;
}

```

### Java

```c
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

```

### Python

```c
def max_activities(activities):
    activities.sort(key=lambda x: x[1])
    count = 1
    last_end = activities[0][1]

    for i in range(1, len(activities)):
        if activities[i][0] >= last_end:
            count += 1
            last_end = activities[i][1]

    return count

activities = [(1, 3), (2, 4), (3, 5), (0, 6), (5, 7), (8, 9), (5, 9)]
print("Maximum number of activities:", max_activities(activities))

```

## Advantages

- **Efficiency**: The algorithm is efficient and runs in O(n log n) time, making it suitable for large inputs.
- **Simplicity**: The greedy approach is straightforward to implement and understand.

## Disadvantages

- **Assumption**: The algorithm assumes that all activities have the same priority, which may not be the case in real-- world applications where different activities might have different importance.
