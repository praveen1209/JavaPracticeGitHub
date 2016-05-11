package javaLearing;

public class OuterClass
{
    private int private_member_variable = 100;
    public class InnerClass
    {
        public void printPrivateVariable()
        {
            System.out.println(private_member_variable);
        }
    }
    public void callInnerClassMethod()
    {
        InnerClass innerClass = new InnerClass();
        innerClass.printPrivateVariable();
    }
    public static void main(String args[])
    {
        OuterClass outerClass = new OuterClass();
        outerClass.callInnerClassMethod();
    }
}
	
