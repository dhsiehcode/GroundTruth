import javassist.*;
import javassist.bytecode.ClassFile;


public class Test_1 {

    public class TestObject {
        private int i;
        public TestObject(int i) {
            System.out.println("Constructed Test Object");
            this.i = i;
        }

        public int getI() {
            return i;
        }
    }

    public static void main(String[] args) throws NotFoundException, CannotCompileException, InstantiationException, IllegalAccessException {

        String base = "C:/Dennis/Purdue/Junior Year/Algorithm Analysis/test";

        //ClassPool pool = ClassPool.getDefault();

        ClassPool pool = ClassPool.getDefault();

        //try {

            pool.insertClassPath(base);

            System.out.println(pool.toString());

            CtClass ctClass =pool.get("src.main.java.Graph");
            //CtClass ctClass =pool.get("target.classes.sample.Graph");

            ctClass.getClassPool();

            ctClass.getFields();

            System.out.println(ctClass.isFrozen());



            //System.out.println(ctClass.toString());
            //CtClass ctClass =pool.get("org.example.src.main.java.Algorithms");

            //CtMethod ctMethod = ctClass.getDeclaredMethod ("Fib");

            CtMethod[] ctMethods = ctClass.getMethods();

            //objCtMethod.insertBefore("{ System.out.println(\"Hello World! at the beggining of method [Runtime from Test class]\"); }");
            // Inject the code at the end of the method
            //objCtMethod.insertAfter("{ System.out.println(\"Hello World! at the end of method [Runtime from Test class]\"); }");
            // Create an object of Class
            //Class objClass = ctClass.toClass();

            // Create an instance of CommonUtil class using objClass
            //Algorithms algo = (Algorithms) objClass.newInstance();
            //Algorithms.Fib(10);



        /*} catch (Exception e) {
            System.out.println(e);
        }*/





    }
}
