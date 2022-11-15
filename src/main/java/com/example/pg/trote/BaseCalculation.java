package com.example.pg.trote;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.pom.Navigatable;
import org.jetbrains.annotations.NotNull;

public class BaseCalculation extends AnAction {

    public static int baseValue;

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Project project = e.getProject();
        StringBuilder message = new StringBuilder(e.getPresentation().getText() + "this one here");
        Navigatable selectedOne = e.getData(CommonDataKeys.NAVIGATABLE);
        if ( selectedOne !=  null) message.append("null one").append(selectedOne);

        String title = e.getPresentation().getDescription();
        final String value = Messages.showInputDialog(project, message.toString(), title, null);
        assert value != null;
        baseValue = Integer.parseInt(value);
    }

}
