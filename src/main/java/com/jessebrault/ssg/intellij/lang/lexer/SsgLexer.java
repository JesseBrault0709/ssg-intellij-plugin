package com.jessebrault.ssg.intellij.lang.lexer;

import com.intellij.lexer.Lexer;
import com.intellij.lexer.LexerBase;
import com.intellij.psi.tree.IElementType;
import com.jessebrault.gst.intellij.lexer.GstLexer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SsgLexer extends LexerBase {

    private final Lexer delegate = new GstLexer();

    @Override
    public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
        this.delegate.start(buffer, startOffset, endOffset, initialState);
    }

    @Override
    public int getState() {
        return this.delegate.getState();
    }

    @Override
    public @Nullable IElementType getTokenType() {
        return this.delegate.getTokenType();
    }

    @Override
    public int getTokenStart() {
        return this.delegate.getTokenStart();
    }

    @Override
    public int getTokenEnd() {
        return this.delegate.getTokenEnd();
    }

    @Override
    public void advance() {
        this.delegate.advance();
    }

    @Override
    public @NotNull CharSequence getBufferSequence() {
        return this.delegate.getBufferSequence();
    }

    @Override
    public int getBufferEnd() {
        return this.delegate.getBufferEnd();
    }

}
