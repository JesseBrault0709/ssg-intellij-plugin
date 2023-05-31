package com.jessebrault.ssg.intellij.lang.psi;

import com.intellij.lang.Language;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.FileViewProviderFactory;
import com.intellij.psi.PsiManager;
import org.jetbrains.annotations.NotNull;

public final class SsgFileViewProviderFactory implements FileViewProviderFactory {

    @Override
    public @NotNull FileViewProvider createFileViewProvider(
            @NotNull VirtualFile file,
            Language language,
            @NotNull PsiManager manager,
            boolean eventSystemEnabled
    ) {
        return new SsgFileViewProvider(manager, file, eventSystemEnabled);
    }

}
