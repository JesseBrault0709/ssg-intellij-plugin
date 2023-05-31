package com.jessebrault.ssg.intellij.lang.parser;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.jessebrault.ssg.intellij.SsgFileType;
import com.jessebrault.ssg.intellij.SsgLanguage;
import org.jetbrains.annotations.NotNull;

public class SsgPsiFile extends PsiFileBase {

    public SsgPsiFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SsgLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return SsgFileType.INSTANCE;
    }

}
