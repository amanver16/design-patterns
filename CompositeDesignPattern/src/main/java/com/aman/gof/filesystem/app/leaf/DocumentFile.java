package com.aman.gof.filesystem.app.leaf;

import com.aman.gof.filesystem.app.component.File;

import lombok.AllArgsConstructor;

/**
 * This class represents leaf node in composite tree structure. A leaf node
 * always belongs to a composite. In case if leaf velongs to root node, then the
 * root node is nothing but a Component. In this example component is File. A
 * leaf node does not have a child. A leaf node implements the behaviour defined
 * in composite and also defines additional operations relative to leaf
 */
@AllArgsConstructor
public class DocumentFile implements File {

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