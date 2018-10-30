package com.aman.gof.editor.app.targetinterface;

/**
 * The client uses the target interface object to perform some operation. The
 * client VsCode will use Compiler object to compile a program.
 */
public interface Compiler {

    public void compileProgram(String fileName);

}