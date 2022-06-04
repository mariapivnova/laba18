import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x ");
        int x = scanner.nextInt();
        System.out.print("Введите y ");
        int y = scanner.nextInt();
        Formula formula=Formula.getFormula();
        formula.setFormula(x,y);
        formula.displayFormula();
        Formula formula1=Formula.getFormula();
        if (formula.hashCode()==formula1.hashCode()){
            System.out.println("OK");
        }
        else {
            System.out.println("ERROR");
        }
        }
       /* Formula formula1=Formula.getY();
        System.out.println(Formula.getX());
        System.out.println(Formula.getY());
        Formula formula2 =Formula.getFormula();*/
    }


class Formula{
    private static Formula formula = new Formula();
    private static Formula Formula;
    private int x;
    private int y;
    private Formula(){
       /* this.y=5;
        this.x =7;*/
    }
    public static Formula getFormula(){
        return formula;
    }
    public void setFormula(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    public static Formula getInstance(){
        return Formula;
    }
    public void displayFormula() {
        double vector = 2 * x + 3 / y;
        System.out.println(vector);

    }
}