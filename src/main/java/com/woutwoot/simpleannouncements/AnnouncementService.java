package com.woutwoot.simpleannouncements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Wout on 1/12/2014.
 */
public class AnnouncementService {

    private List<Announcement> announcements = new LinkedList<>();

    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public List<String> getAnnouncements(Order order){
        List<String> res;
        switch (order){
            case ALPHABET:
                res = new LinkedList<>();
                for(Announcement a : this.getAnnouncements()){
                    res.add(a.toString());
                }
                Collections.sort(res);
                return res;
            case RANDOM:
                res = new ArrayList<>();
                for(Announcement a : this.getAnnouncements()){
                    res.add(a.toString());
                }
                Collections.shuffle(res);
                return res;
            case TIME:
                Collections.sort(announcements, new AnnouncementTimeComparator());
                res = new LinkedList<>();
                for(Announcement a : this.getAnnouncements()){
                    res.add(a.toString());
                }
                return res;
            default:
                res = new ArrayList<>();
                for(Announcement a : this.getAnnouncements()){
                    res.add(a.toString());
                }
                return res;
        }
    }

    public void addAnnouncement(Announcement announcement) throws AnnouncementException {
        if(announcement == null){
            throw new AnnouncementException("Failed to add announcement. Announcement can not be null.");
        }
        this.announcements.add(announcement);
    }

    public void removeAnnouncement(Announcement announcement) throws AnnouncementException {
        if(!announcements.remove(announcement)){
            throw new AnnouncementException("Failed to remove announcement. Announcement not found.");
        }
    }

    public void removeAnnouncement(String announcement) throws AnnouncementException {
        if(!announcements.remove(announcement)){
            throw new AnnouncementException("Failed to remove announcement. Announcement not found.");
        }
    }


}
