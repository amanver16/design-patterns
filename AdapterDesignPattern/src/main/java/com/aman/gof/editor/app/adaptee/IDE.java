package com.aman.gof.editor.app.adaptee;

/**
 * The adaptee defines interface IDE which needs adapting of target interface
 * Compiler in order to run and compile program. This adapting is implemented in
 * the Adapter
 */
public interface IDE {

    public void editProgram(String fileType, String fileName);

}