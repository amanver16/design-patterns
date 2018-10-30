package com.aman.gof.editor.app;

import com.aman.gof.editor.app.client.VsCode;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        VsCode vsCode = new VsCode();
        vsCode.editProgram("java", "Hello World");
    }

}