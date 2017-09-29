/*
 * HIVE UDF to perform the operation of CONCAT_WS(String sep,  array<String>)
 */

package udfConcat;

import org.apache.hadoop.hive.ql.exec.UDF;

public class ConcatString extends UDF{
	
	public String evaluate(String sep, String... input){
		String sepConcat=" "; // Declaring sepConcat
		String result =" ";//Declaring result to hold the final result
//For loop till the number of string specified
		for(int init=0;init <input.length;init++){
	
//If the string is the last element then concatenate with previous string , do not concat with separator
		if(init == input.length-1){		
		result=result.concat(input[init]);//concatenating with last element of string array and returning out of  loop
				continue;
		}
//else perform concatenate with separator
		else
		{
		sepConcat = input[init].concat(sep);//concatenating each element with separator sep	
		result=result.concat(sepConcat);//concatenating sepConcat with result
		}
		
	}
	//Return final result as concatenation output
	return result;
	
	}


}

