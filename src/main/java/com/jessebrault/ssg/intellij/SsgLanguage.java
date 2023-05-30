package com.jessebrault.ssg.intellij;

import com.intellij.lang.Language;

public final class SsgLanguage extends Language {

    public static final SsgLanguage INSTANCE = new SsgLanguage();

    private SsgLanguage() {
        super("ssg");
    }

}
