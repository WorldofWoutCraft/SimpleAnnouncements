package com.woutwoot.simpleannouncements;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

/**
 * Created by Wout on 1/12/2014.
 */
public class Main extends JavaPlugin{

    private static Main instance;
    private static AnnouncementSettings settings = new AnnouncementSettings();
    private static AnnouncementController controller = new AnnouncementController();
    private static File folder;

    @Override
    public void onEnable(){
        init();
        loadSettings();
        loadAnnouncements();
        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new AnnounceTask(), 60L, settings.getInterval());
    }

    @Override
    public void onDisable(){

    }

    private void init(){
        instance = this;
        folder = this.getDataFolder();
        folder.mkdir();
    }

    public static Main getInstance(){
        return instance;
    }

    private void loadAnnouncements(){
        //TODO
    }

    private void saveAnnouncements(){
        //TODO
    }

    private void loadSettings(){
        //TODO
    }

    private void saveSettings(){
        //TODO
    }

}
