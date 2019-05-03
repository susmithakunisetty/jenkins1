package com.mkyong.hashing;

/**
 * Hello world! This is a new file
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! i am here" );
    }

public boolean isPrime(int n){
		boolean val = true;

for(int i=2; i<=n/2;i++){
	if(n%2 == 0){
		val = false;
		break;
	}

}
return val;
}


}