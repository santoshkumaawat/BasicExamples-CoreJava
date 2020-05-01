package Example;

//In this class we have own toString() Method.
public class ToStringMethodTwo {

    @Override
    public String toString() {
        return "India";
    }

    public static void main(String[] args) {
        String s1 = "Santosh", s2 = "Kumawat";
        System.out.println(s1 + s2);

        boolean b1 = true, b2 = false;
        //compile time error: bad operand types for binary operator
        //System.out.println(b1 + b2);
        System.out.println(s1 + b1);

        ToStringMethodTwo ob1 = new ToStringMethodTwo();
        //by default calling toString() method
        System.out.println(ob1);
        ToStringMethodTwo ob2 = new ToStringMethodTwo();

        //here we need to call toString method for any of the one object.
        String res = ob1.toString() + ob2;
        System.out.println(res);

        /*here toString method automatically called on object(ob1.toString();)
         because one operand(s1) is type of string so here we dont need to call*/
        String res2 = s1 + ob1;
        System.out.println(res2);

        String res3 = s1 + ob1 + ob2;
        System.out.println(res3);

        String res4 = ob1 + s1 + ob2;
        System.out.println(res4);

        /*String res5 = ob1 + ob2 + s1; 
         //it is like (ob1 + ob2) + s1
         //because associativity of + operator is left to right
         System.out.println(res5);*/
    }
}
