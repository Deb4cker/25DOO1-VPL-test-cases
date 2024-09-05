package App;

import exerc_1_10_e_1_13.ArrayInteirosAvancadoTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main{
    public static void main (String[] args){
        Testador.rodarTodosOsTeste(ArrayInteirosAvancadoTest.class);
    }
}

class Testador{
    private Testador(){}
    private static final String line = "------------------------------------------------------------------------------------------";

    public static void rodarTodosOsTeste(Class<?>... classes){

        Result result = JUnitCore.runClasses(classes);

        final int testCount = result.getRunCount();
        final int failureCount = result.getFailureCount();
        final int diference = testCount - failureCount;
        final double grade = (double)diference * 10 / testCount;

        final StringBuilder out = new StringBuilder();

        for(Failure failure : result.getFailures()) {
            out.append("❌")
                    .append(failure.getMessage())
                    .append("\n")
                    .append(line)
                    .append("\n");
        }

        if (!out.isEmpty()) out.insert(0, "\n❌ FALHAS ❌\n" + line + "\n");

        System.out.println( diference + "/" + testCount + " testes passaram!!");
        System.out.println(out.isEmpty() ? "" : out);
        System.out.println("Nota: " + String.format("%.1f", grade));
    }
}
