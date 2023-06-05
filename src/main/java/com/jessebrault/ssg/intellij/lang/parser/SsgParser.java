package com.jessebrault.ssg.intellij.lang.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import com.jessebrault.gst.intellij.parser.EGstParser;
import org.jetbrains.annotations.NotNull;

public final class SsgParser implements PsiParser {

    @Override
    public @NotNull ASTNode parse(@NotNull IElementType root, @NotNull PsiBuilder builder) {
        return new EGstParser().parse(root, builder);
    }

}
