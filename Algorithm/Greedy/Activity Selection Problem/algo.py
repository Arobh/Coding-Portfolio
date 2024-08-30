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
