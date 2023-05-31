package com.jessebrault.ssg.intellij.lang.parser.html;

import com.intellij.psi.tree.IFileElementType;

public final class SsgHtmlElements {

    public static final IFileElementType SSG_HTML_FILE = new SsgHtmlFileElement("ssgHtmlFile");

    private SsgHtmlElements() {}

}
