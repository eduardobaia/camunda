package pt.syone.camunda.options;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class MultiplicacaoDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
/*        var a= execution.getVariable("a")
        var b= execution.getVariable("b")

        execution.setVariable("result", a+b)*/
        long a = (long) execution.getVariable("a");
        long b = (long) execution.getVariable("b");

        execution.setVariable("resultado", a*b);
    }
}
