package com.aman.gof.filesystem.app.component;

/**
 * This class represents the root node also known as component in the composite
 * tree structure. A component consists of leaf or a composit. It specifies an
 * interface for objects in the composition. Contains default behavior
 * (showFileDetails method) common for the all child classes in the composition
 * (file system)
 */
public interface File {

    public void showFileDetails(String folderName);

}