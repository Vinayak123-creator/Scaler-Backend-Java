package SingletonDesignPatterns;

import java.util.concurrent.locks.Lock;

public class dbConnection {

    public static dbConnection dbinstance=null;
        private dbConnection(){

        }
        public static synchronized dbConnection getInstance(){
             
            if(dbinstance == null){

                dbinstance=new dbConnection();
            }
            return  dbinstance;
        }

}
