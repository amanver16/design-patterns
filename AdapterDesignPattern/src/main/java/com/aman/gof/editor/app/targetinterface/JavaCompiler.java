package com.aman.gof.editor.app.targetinterface;

/**
 * Concrete implementation of Compiler interface which can compile program
 */
public class JavaCompiler implements Compiler {

    @Override
    public void compileProgram(String fileName) {
        System.out.println("The file " + fileName + " has been compiled using Java compiler.");
    }

}