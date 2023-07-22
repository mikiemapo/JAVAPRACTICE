class VarExamples {
    static int stcNum = 100;

    int objNum = 999;

    void createAndPrint() {
        int mtdNum = 77;
        System.out.println("Method Scope Num " + mtdNum);

        if (true) {
            int blcNum = 55;
            System.out.println("Block Scope Num: " + blcNum);
        }
    }
}