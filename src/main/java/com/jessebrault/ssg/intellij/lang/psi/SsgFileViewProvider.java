package com.jessebrault.ssg.intellij.lang.psi;

import com.intellij.lang.Language;
import com.intellij.lang.html.HTMLLanguage;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.MultiplePsiFilesPerDocumentFileViewProvider;
import com.intellij.psi.PsiManager;
import com.intellij.psi.impl.source.PsiFileImpl;
import com.jessebrault.gst.intellij.psi.GstFileViewProvider;
import com.jessebrault.ssg.intellij.SsgLanguage;
import com.jessebrault.ssg.intellij.lang.psi.html.SsgHtmlPsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;

/**
 * Can be extended.
 */
public class SsgFileViewProvider extends GstFileViewProvider {

    public SsgFileViewProvider(
            @NotNull PsiManager manager,
            @NotNull VirtualFile virtualFile,
            boolean eventSystemEnabled
    ) {
        super(manager, virtualFile, eventSystemEnabled);
    }

    @Override
    public @NotNull Language getBaseLanguage() {
        return SsgLanguage.INSTANCE;
    }

    @Override
    protected @NotNull MultiplePsiFilesPerDocumentFileViewProvider cloneInner(@NotNull VirtualFile fileCopy) {
        return new SsgFileViewProvider(this.getManager(), fileCopy, false);
    }

    @Override
    public @NotNull Set<Language> getLanguages() {
        final Set<Language> languages = new HashSet<>(super.getLanguages());
        languages.add(SsgLanguage.INSTANCE);
        languages.add(HTMLLanguage.INSTANCE);
        return languages;
    }


    @Override
    protected @Nullable PsiFileImpl createPsiFileImpl(@NotNull Language target) {
        if (super.getLanguages().contains(target)) {
            return super.createPsiFileImpl(target);
        } else if (target.equals(SsgLanguage.INSTANCE)) {
            return new SsgPsiFile(this);
        } else if (target.equals(HTMLLanguage.INSTANCE)) {
            return new SsgHtmlPsiFile(this);
        } else {
            return null;
        }
    }

}
