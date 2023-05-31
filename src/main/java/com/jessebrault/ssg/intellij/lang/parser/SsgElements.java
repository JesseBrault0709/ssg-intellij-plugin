package com.jessebrault.ssg.intellij.lang.parser;

import com.intellij.psi.tree.IFileElementType;
import com.jessebrault.ssg.intellij.SsgLanguage;

public final class SsgElements {

    public static final IFileElementType SSG_FILE_TYPE = new IFileElementType(
            "ssgFileType", SsgLanguage.INSTANCE
    );

    private SsgElements() {}

}
