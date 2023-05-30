package com.jessebrault.ssg.intellij;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class SsgFileType extends LanguageFileType {

    public static final SsgFileType INSTANCE = new SsgFileType();

    private SsgFileType() {
        super(SsgLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "ssg";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "Page, template, and part files for Ssg.";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "ssg";
    }

    @Override
    public Icon getIcon() {
        return AllIcons.FileTypes.Html; // TODO: create custom icon
    }

}
