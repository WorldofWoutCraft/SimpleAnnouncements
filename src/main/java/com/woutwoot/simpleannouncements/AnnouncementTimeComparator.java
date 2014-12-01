package com.woutwoot.simpleannouncements;

import java.util.Comparator;

/**
 * Created by Wout on 1/12/2014.
 */
public class AnnouncementTimeComparator implements Comparator<Announcement> {

    @Override
    public int compare(Announcement a1, Announcement a2) {
        return a1.getStartDate().compareTo(a2.getStartDate());
    }

}
