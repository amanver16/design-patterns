package com.aman.gof.filesystem.app.client;

import com.aman.gof.filesystem.app.component.File;
import com.aman.gof.filesystem.app.composite.Folder;
import com.aman.gof.filesystem.app.leaf.DocumentFile;
import com.aman.gof.filesystem.app.leaf.MusicFile;
import com.aman.gof.filesystem.app.leaf.TextFile;
import com.aman.gof.filesystem.app.leaf.VideoFile;

/**
 * This class represents client which takes a component object and performs
 * operation. It treats all the instances or group of instances uniformly.
 */
public class Disk {

    public static void main(String[] args) {

        Folder entertainment = new Folder();

        File dainikJagran = new DocumentFile("Dainik Jagran", 1024, ".docx");
        File despacito = new MusicFile("Despacito", 5200102, ".mp3");
        File cheatCodes = new TextFile("GTA Cheat Codes", 200, ".txt");
        File gangnamStyle = new VideoFile("Gangnam Style", 51345200, ".mp4");
        Folder favoriteSongs = new Folder();

        entertainment.addFilesOrFolder(dainikJagran);
        entertainment.addFilesOrFolder(despacito);
        entertainment.addFilesOrFolder(cheatCodes);
        entertainment.addFilesOrFolder(gangnamStyle);
        entertainment.addFilesOrFolder(favoriteSongs);

        entertainment.showFileDetails("Entertainment");

        File shapeOfYou = new MusicFile("Shape Of You", 5200102, ".mp3");
        File baby = new MusicFile("Baby", 6200102, ".mp3");
        File cheapThrills = new MusicFile("Cheap Thrills", 4200102, ".mp3");
        File danceAgain = new MusicFile("Dance Again", 5200102, ".mp3");
        File inTheEnd = new MusicFile("In The End", 5200102, ".mp3");

        favoriteSongs.addFilesOrFolder(shapeOfYou);
        favoriteSongs.addFilesOrFolder(baby);
        favoriteSongs.addFilesOrFolder(cheapThrills);
        favoriteSongs.addFilesOrFolder(danceAgain);
        favoriteSongs.addFilesOrFolder(inTheEnd);

        favoriteSongs.showFileDetails("Favorite Songs");

    }

}