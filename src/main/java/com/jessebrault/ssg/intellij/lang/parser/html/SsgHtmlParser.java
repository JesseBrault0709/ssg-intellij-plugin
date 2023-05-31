package com.jessebrault.ssg.intellij.lang.parser.html;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.lang.html.HTMLParser;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public final class SsgHtmlParser implements PsiParser {

    @Override
    public @NotNull ASTNode parse(@NotNull IElementType root, @NotNull PsiBuilder builder) {
        return new HTMLParser().parse(root, builder);
    }

}
