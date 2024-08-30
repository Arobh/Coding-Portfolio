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
