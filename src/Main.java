//this project is to test if i can create a calculator from scratch with what ive learnt so far no gui just simple two number input and methods

public static void main (String[] args){
    Scanner sc = new Scanner(System.in);//scanner fro input

    System.out.println("--Pick the operation--");
    System.out.println("+");
    System.out.println("-");
    System.out.println("*");
    System.out.println("/");
    System.out.println("EXIT");

    String options = sc.nextLine();

    System.out.println("Enter the first number: ");
    double num1 = sc.nextDouble();
    System.out.println("Enter the second number: ");
    double num2 = sc.nextDouble();

    switch(options){
        case "+" -> {
            double result = sum(num1, num2);
            System.out.println(num1 + " + " + num2 + " = " + result);
        }
        case "-" ->{
            double result = taway(num1, num2);
            System.out.println(num1+" - "+num2+" = "+result);
        }
        case "*" ->{
            double result = mult(num1, num2);
            System.out.println(num1+" * "+num2+" = "+result);
        }
        case "/" -> {
            double result = div(num1, num2);
            System.out.println(num1+" / "+num2+" = "+result);
        }
    }
}

public static double sum(double x, double y){
    return x+y;
}
public static double taway(double x, double y){
    return x-y;
}
public static double mult(double x, double y){
    return x*y;
}
public static double div(double x, double y){
    return x/y;
}