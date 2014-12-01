package com.woutwoot.simpleannouncements;

import java.util.List;

/**
 * Created by Wout on 1/12/2014.
 */
public class AnnouncementController {

    private AnnouncementService announcementService = new AnnouncementService();

    public String addAnnouncement(String announcement){
        try {
            Announcement a = new Announcement(announcement);
            this.announcementService.addAnnouncement(a);
            return "Success! Announcement added.";
        } catch (AnnouncementException e) {
            return e.getMessage();
        }
    }

    public String removeAnnouncement(String announcement){
        try {
            this.announcementService.removeAnnouncement(announcement);
            return "Success! Announcement removed.";
        } catch (AnnouncementException e) {
            return e.getMessage();
        }
    }

    public List<String> getAnnouncements(){
        return announcementService.getAnnouncements(null);
    }

    public List<String> getAnnouncementsRandomOrder(){
        return announcementService.getAnnouncements(Order.RANDOM);
    }

    public List<String> getAnnouncementsAlphabeticOrder(){
        return announcementService.getAnnouncements(Order.ALPHABET);
    }

    public List<String> getAnnouncementsStartDateOrder(){
        return announcementService.getAnnouncements(Order.TIME);
    }

}
