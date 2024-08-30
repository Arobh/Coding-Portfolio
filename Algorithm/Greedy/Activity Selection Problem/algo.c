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
