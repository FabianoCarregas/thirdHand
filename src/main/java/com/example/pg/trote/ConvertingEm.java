package com.example.pg.trote;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import static com.example.pg.trote.BaseCalculation.baseValue;

public class ConvertingEm extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        final Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        final Project project = e.getProject();
        final Document document = editor.getDocument();
        final SelectionModel selectionModel = editor.getSelectionModel();
        final CaretModel caretModel = editor.getCaretModel();
        final int start = selectionModel.getSelectionStart();
        final int end = selectionModel.getSelectionEnd();

        String text = caretModel.getCurrentCaret().getSelectedText();
        assert text != null;

        String em = "em";
        String converted = ConvertAction.convertValue(text, em, baseValue);
        replace(project, document, start, end, converted);
    }

    private void replace(Project project, Document document, int start, int end, String arg) {
        WriteCommandAction.runWriteCommandAction(project, () -> document.replaceString(start, end, arg));
    }

}
