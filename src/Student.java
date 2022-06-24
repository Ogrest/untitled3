public class Student {
    String fio;
    String kaf;

    int curs;
    public double srBal;

    public Student(String fio, String kaf, int curs, double srBal) {
        this.fio = fio;
        this.kaf = kaf;
        this.curs = curs;
        this.srBal = srBal;
    }


    public String sendInfo() {
        return (fio + ", " + kaf + ", " + curs);
    }


}
