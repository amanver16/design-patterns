package com.aman.gof.editor.app.adapter;

import com.aman.gof.editor.app.adaptee.IDE;
import com.aman.gof.editor.app.targetinterface.Compiler;
import com.aman.gof.editor.app.targetinterface.JavaCompiler;

/**
 * The adapter IdeToCompilerAdapter is used by the client to adapts the
 * interface of IDE (Adaptee) to Compiler (Target). So that client (VsCode) can
 * use the both default feature (edit program) and target interface feature
 * (compile program)
 */
public class IdeToCompilerAdapter implements IDE {

    // To be adapt
    private Compiler compiler;

    public IdeToCompilerAdapter() {
        this.compiler = new JavaCompiler();
    }

    @Override
    public void editProgram(String fileType, String fileName) {
        System.out.println("Inside Adapter...");
        compiler.compileProgram(fileName);
    }

}