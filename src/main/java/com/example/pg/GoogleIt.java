package com.example.pg;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Editor;
import org.jetbrains.annotations.NotNull;

public class GoogleIt extends AnAction {

    @Override
    public void update(AnActionEvent e) {
        final Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        final CaretModel carelModel = editor.getCaretModel();
        e.getPresentation().setEnabledAndVisible(carelModel.getCurrentCaret().hasSelection());
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        final Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        final CaretModel carelModel = editor.getCaretModel();
        String selectedText = carelModel.getCurrentCaret().getSelectedText();
        BrowserUtil.browse("https://www.google.com/search?q="+selectedText);
    }
}
