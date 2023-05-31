package com.jessebrault.ssg.intellij.lang.psi.html;

import com.intellij.psi.FileViewProvider;
import com.intellij.psi.impl.source.html.HtmlFileImpl;
import com.jessebrault.ssg.intellij.lang.parser.html.SsgHtmlElements;

public final class SsgHtmlPsiFile extends HtmlFileImpl {

    public SsgHtmlPsiFile(FileViewProvider provider) {
        super(provider);
        this.setContentElementType(SsgHtmlElements.SSG_HTML_FILE);
    }

    @Override
    public String toString() {
        return "ssgHtmlPsiFile";
    }

}
