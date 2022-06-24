public class Main {
    public static void main(String[] args) {
        Student studentTemp = new Student(" ", " ", 0, 0);
        Student[] studentArr = {
                new Student("Булочка Иван Борисов", "ИВТ", 1, 3.6),
                new Student("Таранов Иван Пивоваров", "ПУСИ", 2, 4.0),
                new Student("Лобанов Лобан Лобанович", "РАЙОТ", 3, 4.2),
                new Student("Саратов Саратов Саратович", "ГЕЙМС", 4, 3.0),
        };

        for (int i = 1; i < studentArr.length; i++) {
            if (studentArr[i].srBal > studentArr[i - 1].srBal) {
                studentTemp = studentArr[i];
                studentArr[i - 1] = studentArr[i];
                studentArr[i] = studentTemp;
            }
        }
        System.out.println("Средний балл > 4:");
        for (Student student : studentArr) {
;            if (student.srBal > 4) {
                System.out.println(" -" + student.sendInfo());
            }
        }
        System.out.println("Средний балл <= 4:");
        for (Student student : studentArr) {
            if (student.srBal <= 4) {
                System.out.println(" -" + student.sendInfo());
            }
        }
    }
}
