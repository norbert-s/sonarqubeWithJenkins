package sonar;

public class A {
        private A(){

        }
        public static String dummy(int num){
            if(num==0){
                return "zero";
            }
            return "not zero";
        }
}
