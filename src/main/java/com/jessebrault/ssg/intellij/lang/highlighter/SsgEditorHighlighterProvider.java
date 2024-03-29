package com.jessebrault.ssg.intellij.lang.highlighter;

import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.editor.highlighter.EditorHighlighter;
import com.intellij.openapi.fileTypes.EditorHighlighterProvider;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SsgEditorHighlighterProvider implements EditorHighlighterProvider {

    @Override
    public EditorHighlighter getEditorHighlighter(
            @Nullable Project project,
            @NotNull FileType fileType,
            @Nullable VirtualFile virtualFile,
            @NotNull EditorColorsScheme colors
    ) {
        return new SsgLayeredEditorHighlighter(colors);
    }

}
