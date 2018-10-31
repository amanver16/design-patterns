package com.aman.gof.filesystem.app.leaf;

import com.aman.gof.filesystem.app.component.File;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextFile implements File {

    private String fileName;
    private long fileSize;
    private String fileExtension;

    @Override
    public void showFileDetails(String folderName) {
        System.out.println("File            :   " + this.fileName);
        System.out.println("Size (In Bytes) :   " + this.fileSize);
        System.out.println("Extension       :   " + this.fileExtension);
        System.out.println("Folder          :   " + folderName);
    }

}