// Today we are going to learn the Lambda functions 
// This Lambda functions are updated in java 8 before there is no thing called lambda.

public class lambdaFun {
    public static void main(String[] args) {

        //this is the old traditional method
        bmw c2=new bmw();
        c2.drive();

        // this is Annomonus class method
        car c1=new car() {            
            @Override
            public void drive(){
            System.out.println("I am driving a normal car");
            }
        };
        c1.drive();

        // this is Lambda function
        car audi = () -> System.out.println("I am driving a Audi car");
        audi.drive();
    }
}

// old implementation method
class bmw implements car{
    @Override
    public void drive(){
            System.out.println("I am driving a BMW car");
            }
}

// to create a lambda function we need to use the @FunctionalInterface annotation
@FunctionalInterface
interface car{
    public void drive();
}