package Variables;

public class VarScopeMain {
    static String stcStr = "Class/Static Scope";
    String objStr = "Object/Instance Scope";

    public static void main(String[] args) {

        System.out.println(stcStr);
        System.out.println(VarExamples.stcNum);

        VarScopeMain m = new VarScopeMain();
        System.out.println(m.objStr);
        VarExamples ex = new VarExamples();
        System.out.println(ex.objNum);

        m.methodScopeExample();
        ex.createAndPrint();

        m.takeInput("Mike");
        System.out.println(stcStr);
        System.out.println(m.objStr);
    }

    void takeInput(String stcStr) {
        String objStr = "ObjStr inside of method";
        System.out.println("Obj" + objStr);
        System.out.println("Stc" + stcStr);
    }

    void methodScopeExample() {
        String mtdStr = "Method Scope";
        System.out.println(mtdStr);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Block Scope" + i);
        }
    }
}
