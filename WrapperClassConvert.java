public class WrapperClassConvert {

    public static Object convertToWrapper(Object value){

        Class valueClass = value.getClass();

        //checks for null object or if object is primitive or not
        if(value == null || valueClass.isPrimitive()){
            System.out.println("Give proper primitive as input");
        }

        //Converts primitive into wrapper class
        Integer wrapperObject = Integer.valueOf((int) value);

        //checking the instance
        if(wrapperObject instanceof Integer){
            return wrapperObject;
        }
        else{
            System.out.println("Give proper primitive as input");
        }

        return wrapperObject;

    }
    public static void main(String[] args) {

        int n = 5;

        System.out.println("After converting into wrapper object: " + convertToWrapper(n));
    }
}
