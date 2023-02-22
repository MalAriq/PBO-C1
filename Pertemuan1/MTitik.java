class MTitik{
    public static void main(String[] args){
        Titik t1;
        Titik t2;
        Titik t3;

        t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        t2 = new Titik();
        t2.setAbsis(4);
        t2.setOrdinat(3);

        t3 = new Titik();
        t3.setAbsis(8);
        t3.setOrdinat(5);

        System.out.println("Absis dari t1 : "+ t1.getAbsis());
        System.out.println("Ordinat dari t1 : "+ t1.getAbsis());
        System.out.println("Jumlah objek titik : "+ t1.getCounterTitik());

        System.out.println("Absis dari t1 : "+ t2.getAbsis());
        System.out.println("Ordinat dari t1 : "+ t2.getAbsis());
        System.out.println("Jumlah objek titik : "+ t2.getCounterTitik());

        System.out.println("Absis dari t1 : "+ t3.getAbsis());
        System.out.println("Ordinat dari t1 : "+ t3.getAbsis());
        System.out.println("Jumlah objek titik : "+ t3.getCounterTitik());
    }
}