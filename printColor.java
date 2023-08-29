public class printColor {
    public static void main(String[] args) {
        int Value = 8;
        if (Value <= 0){
            System.out.println("Красный");
        }
        else if (Value >0 && Value <= 100){
            System.out.println("Жёлтый");
        }
        else if (Value > 100){
            System.out.println("Зелёный");
        }
    }
}
