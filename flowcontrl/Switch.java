package flowcontrl;

class Switch {
    public static void main(String[] args) {
        char letter = 'B';
        switch (letter) {
            case 'A':
                // for (int i = 0; i < 5; i++) {
                // System.out.println("i is :" + i);
                // }
                // System.out.println("Letter is A with acute accent");
                break;
            case 'B':
                int x = 10;
                // if (x < 20) {
                // System.out.println("x is less than20");
                // } else {
                // System.out.println("x greater or equal to 20 and not equals to");
                // }
                System.out.println("Letter is B with acute accent");
                break;
            case 'C':
                System.out.println("Letter is C with acute accent");
                break;
            default:
                System.out.println("Letter is not a b or c");
        }
    }
}
