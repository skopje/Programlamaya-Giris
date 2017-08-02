public static void main(String[] args) {
        System.out.print("Lutfen Kare Matrisin boyutunu giriniz:  ");
        Scanner s = new Scanner(System.in);
        int sayi = s.nextInt();
        for (int i = 1; i < sayi; i++) {
            for (int j = 1; j < sayi; j++) {
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println("");

        }

    }
}
