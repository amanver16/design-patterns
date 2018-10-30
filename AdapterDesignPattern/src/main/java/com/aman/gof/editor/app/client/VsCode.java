package com.aman.gof.editor.app.client;

import com.aman.gof.editor.app.adaptee.IDE;
import com.aman.gof.editor.app.adapter.IdeToCompilerAdapter;

/**
 * This is the client which implements adaptee interface IDE and uses adapter
 * (IdeToCompilerAdapter) to create target interface (Compiler) object to adapt
 * its operation (compile program)
 */
public class VsCode implements IDE {

    // Adpater
    private IdeToCompilerAdapter ideToCompilerAdapter;

    // Using default behaviour from IDE
    @Override
    public void editProgram(String fileType, String fileName) {
        System.out.println("Inside Client...");
        System.out.println("The file " + fileName + "." + fileType + " is now opened in editing mode.");

        // Creating Adapter Object to use adapter features
        ideToCompilerAdapter = new IdeToCompilerAdapter();
        ideToCompilerAdapter.editProgram(fileType, fileName);
    }

}