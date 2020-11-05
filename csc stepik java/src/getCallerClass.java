public class getCallerClass {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        Throwable g = new Throwable();
        StackTraceElement[] stackTrace = g.getStackTrace();
        if (stackTrace.length < 3){
            return null;
        }
        return stackTrace[2].getClassName() + "#" + stackTrace[2].getMethodName();
    }
}