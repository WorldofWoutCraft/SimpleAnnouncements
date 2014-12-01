package com.woutwoot.simpleannouncements;

import java.util.Date;

/**
 * Created by Wout on 1/12/2014.
 */
public class Announcement implements Comparable {

    private String announcement;
    private Date startDate;
    private Date endDate;

    public Announcement(String announcement) throws AnnouncementException {
        this.setStartDate(new Date());
        this.setAnnouncement(announcement);
    }

    public Announcement(String announcement, Date endDate) throws AnnouncementException {
        this.setAnnouncement(announcement);
        this.setEndDate(endDate);
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) throws AnnouncementException {
        if(announcement == null || announcement.equals("")){
            throw new AnnouncementException("Announcement can not be empty.");
        }
        this.announcement = announcement;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) throws AnnouncementException {
        if(startDate == null){
            throw new AnnouncementException("Invalid date - date can not be null.");
        }
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) throws AnnouncementException {
        if(endDate == null){
            throw new AnnouncementException("Invalid date - date can not be null.");
        }
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Announcement that = (Announcement) o;

        if (!getAnnouncement().equals(that.getAnnouncement())) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return getAnnouncement().hashCode();
    }

    @Override
    public String toString() {
        return announcement;
    }

    @Override
    public int compareTo(Object o){
        return announcement.toString().compareTo(o.toString());
    }

}
