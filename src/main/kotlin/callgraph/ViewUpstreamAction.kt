package callgraph

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class ViewUpstreamAction: AnAction() {
    override fun actionPerformed(anActionEvent: AnActionEvent) {
        Utils.runCallGraphFromAction(anActionEvent, CanvasConfig.BuildType.UPSTREAM)
    }

    override fun update(anActionEvent: AnActionEvent) {
        Utils.setActionEnabledAndVisibleByContext(anActionEvent)
    }
}
