package com.jessebrault.ssg.intellij.lang.parser.html;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilderFactory;
import com.intellij.lang.html.HTMLLanguage;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IFileElementType;
import com.jessebrault.ssg.intellij.lang.lexer.html.SsgHtmlLexer;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public final class SsgHtmlFileElement extends IFileElementType {

    public SsgHtmlFileElement(@NonNls @NotNull String debugName) {
        super(debugName, HTMLLanguage.INSTANCE);
    }
    
    @Override
    protected ASTNode doParseContents(@NotNull ASTNode chameleon, @NotNull PsiElement psi) {
        final var lexer = new SsgHtmlLexer();
        final var builder = PsiBuilderFactory.getInstance().createBuilder(psi.getProject(), lexer, chameleon);
        return new SsgHtmlParser().parse(this, builder).getFirstChildNode();
    }

}
