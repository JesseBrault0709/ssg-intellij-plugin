package com.jessebrault.ssg.intellij.lang.highlighter;

import com.intellij.ide.highlighter.HtmlFileHighlighter;
import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.editor.ex.util.LayerDescriptor;
import com.jessebrault.gst.intellij.highlighter.GstLayeredEditorHighlighter;
import com.jessebrault.gst.intellij.lexer.GstTokenType;
import org.jetbrains.annotations.NotNull;

public class SsgLayeredEditorHighlighter extends GstLayeredEditorHighlighter {

    public SsgLayeredEditorHighlighter(@NotNull EditorColorsScheme scheme) {
        super(scheme);
        this.registerLayer(GstTokenType.TEXT, new LayerDescriptor(new HtmlFileHighlighter(), ""));
    }

}
