package MainPackage.JavaBasics.IdentifierRules;

public class IdentifierRule1 { //RULES FOR IDENTIFIER IN JAVA
                     // FIRST RULE
                     //A valid identifier must have characters [A-Z] or [a-z] or numbers [0-9], and underscore(_) or
                     // a dollar sign ($)
    public static void main(String[] args)
    {
        int ABCD = 10;
        int abcd = 20;
        int abcd123=30;
        int _abcd$=40;
        int $abd=50;
        System.out.println(ABCD);
        System.out.println(abcd);
        System.out.println(abcd123);
        System.out.println(_abcd$);
        System.out.println($abd);

    }
}
