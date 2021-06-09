import java.util.ArrayList;
class CannotCastException extends Exception{}
class CantCast {
    public boolean deliverMessage() throws CannotCastException{

        ArrayList<Object> noErrors = new ArrayList<Object>();
        noErrors.add("13");
        noErrors.add("hello world");
        noErrors.add(48);
        noErrors.add("Goodbye World");

        for(int i = 0; i < noErrors.size(); i++) {
        Integer castedValue = (Integer) noErrors.get(i);
        }

        // if (castedValue){
        //     return true;
        // }
        throw new CannotCastException();
    }
}
public class ListOfExcpetions{
    public static void main(String[] args){
        CantCast errorMessage = new CantCast();

        try{
            errorMessage.deliverMessage();
            System.out.println("The message was delivered!");
        } catch (CannotCastException e){
            System.out.println("Hey, uh, so, I ran out of gas..");
            // back-up plan here.
        }
    }
}


