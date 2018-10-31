package com.aman.gof.filesystem.app.composite;

import java.util.ArrayList;
import java.util.List;

import com.aman.gof.filesystem.app.component.File;

/**
 * This class represents the composite in the composition tree structure. A
 * composit contains list of leaf nodes and enforce them to perform a task. The
 * composite may further contain another compoite and so on
 */
public class Folder implements File {

    private List<File> fileList = new ArrayList<>();

    @Override
    public void showFileDetails(String folderName) {
        System.out.println("In " + folderName + " folder.");
        for (File file : this.fileList) {
            file.showFileDetails(folderName);
        }
    }

    public void addFilesOrFolder(File file) {
        this.fileList.add(file);
    }

    public void removeFileOrFolder(File file) {
        this.fileList.remove(file);
    }

    public void removeAllFilesAndFolders() {
        this.fileList.clear();
    }

}