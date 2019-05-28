package design.pattern;

public class EagerInitializedSingleton {

	//Private Constructor so that the object of this class is not instantiated anywhere else.
	private EagerInitializedSingleton() {
		
	}
	
	//private static instance variable to hold instance reference
	private static EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	//public static method that is globally accessed to get the instance of the class.
	public static EagerInitializedSingleton getInstance( ) {
		return instance;
	}
}

/*
The instance is created at the time of class loading only. If the application doesnt use the instane also,
the object is created. Instead better way is to create the instance when there is a
request. ie, when getInstance() method is called.
*/