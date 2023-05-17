
public class Main {
    public static void main(String[] args) {
        Load l1 = new Load(false, 100.00, 2000.0);
        Load l2 = new Load(true,250, 4500 );
        Load l3 = new Load(true, 150, 3000);
        Truck c1 = new Truck("NIA-1234", l1);
        Truck c2 = new Truck("AAA-1234",l2);
        Truck c3 = new Truck("BBB-1234", l3);


        Stack stack = new Stack();
        stack.push(c1);
        stack.push(c2);
        stack.push(c3);
        System.out.println(stack);


    }
}