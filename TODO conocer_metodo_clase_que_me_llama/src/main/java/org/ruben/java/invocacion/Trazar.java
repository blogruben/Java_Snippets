package org.ruben.java.invocacion;

public class Trazar  {
    private final static MySecurityManager mySecurityManager = new MySecurityManager();

    void quienMeLLama(){
        //Es muy costoso, Current Thread StackTrace: 5886.964 ms.
        //StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        //StackTraceElement ste = stackTraceElements[2];       
        //System.out.println(ste.getClassName()+" "+ste.getMethodName()+" "+ste.getLineNumber());

        //algo menos costoso Throwable StackTrace: 4700.073 ms.
        //new Throwable().getStackTrace()[2].getClassName();

        //mas eficiente SecurityManager: 1046.804 ms.
        mySecurityManager.getCallerClassName(2);
    }

      /** 
       * A custom security manager that exposes the getClassContext() information
       */
        static class MySecurityManager extends SecurityManager {
            public void getCallerClassName(int callStackDepth) {
                System.out.println(getClassContext()[callStackDepth].getName());
        }


    }




}
