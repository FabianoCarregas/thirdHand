package com.example.pg.trote;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class BaseCalculation extends AnAction {

    private final String THIRTEEN = "13";
    public static int baseValue;

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Project project = e.getProject();
        String dialogText = "Insert below the conversion base";
        String title = "CALCULATION INPUT";
        String value = Messages.showInputDialog(project, dialogText, title, null, THIRTEEN, null);
        if (value == null) value = THIRTEEN;
        baseValue = Integer.parseInt(value);
    }

}
