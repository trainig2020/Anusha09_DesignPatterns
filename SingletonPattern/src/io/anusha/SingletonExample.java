package io.anusha;


class SingletonEager{
	
	   private static SingletonEager instance = new SingletonEager();
    
        private SingletonEager(){}

        public static SingletonEager getInstance(){
                   return instance;
    }
}
	
//Lazy Initialisation
class Singleton{
	 private static Singleton instance;
	 
	 private  Singleton() {}
	 
	 public static Singleton getInstance() {
		 
		 if(instance == null) {
			 instance = new Singleton();
			  }
		 
		 return instance;
	 }
	 
}
	
//thread safe
//Method Synchronized
class SingletonSynchronizedMethod{
	
	private static SingletonSynchronizedMethod instance;
	
	private SingletonSynchronizedMethod() {}
	
	 // Only one thread can execute this at a time 
	public static synchronized SingletonSynchronizedMethod getInstance() {
		 if(instance == null) {
			 instance = new SingletonSynchronizedMethod();
			  }
		 
		 return instance;
	 }
	 
		
	}


//block synchronized
//Double Checked Locking based Java implementation of 
//singleton design pattern 
class SingletonSynchronized {
	
	private static SingletonSynchronized instance;
	
	private SingletonSynchronized() {}
	
	public static synchronized SingletonSynchronized getInstance() {
		 if(instance == null) {
			// To make thread safe
			 synchronized(SingletonSynchronized.class) {
				 
				// check again as multiple threads 
	                // can reach above step 
				 if(instance == null) {
					 instance = new SingletonSynchronized();
				 }
			 }
		
			  }
		 
		 return instance;
	 }
	
}
    
public class SingletonExample {
		
       public static void main(String[] args) {
		/*
		 * SingletonEager instance = SingletonEager.getInstance();
		 * System.out.println(instance);
		 * 
		 * 
		 * SingletonEager instance1 = SingletonEager.getInstance();
		 * System.out.println(instance1);
		 */
    	   
    	   Singleton instance = Singleton.getInstance();
    	   System.out.println(instance);
    	   

    	   Singleton instance1 = Singleton.getInstance();
    	   System.out.println(instance1);
    	   
    	   
    	
    }
		
	}


