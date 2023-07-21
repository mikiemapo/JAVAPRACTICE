class Switch {
    public static void main(String[] args) {
        char letter = 'K';
        switch (letter) {
            case 'A':
                System.out.println("Letter is A with acute accent");
                break;
            case 'B':
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
