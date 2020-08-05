package util;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class Utils {
	private static int stringCount = 0;
	public static String getNumberStr(int len){
		if(len<0){
			return null;
		}
		String numberStr="";
		Random r = new Random();
		for(int i=0;i<len;i++){
			Integer a=r.nextInt(10);
			numberStr+=a.toString();
		}
		return numberStr;
	}
	
	public static synchronized String getNewID() {
		String newid=new Date().getTime()+"";
		return newid;
	}
	static Random ra =new Random();
	public static HashMap<String,Object> getHashMap(String key,String value){
		HashMap<String,Object> hashmap=new HashMap<>();
		hashmap.put(key, value);
		return hashmap;
	}
	
	public static HashMap<String,Object> getHashMap(){
		return new HashMap<>();
}
	
	public static int[] randomArray(int min,int max,int n){//根据范围获得一个随机数组
        int len = max-min+1;

        if(max < min || n > len){
            return null;
        }

        //初始化给定范围的待选数组
        int[] source = new int[len];
        for (int i = min; i < min+len; i++){
            source[i-min] = i;
        }

        int[] result = new int[n];
        Random rd = new Random();
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            //待选数组0到(len-2)随机一个下标
            index = Math.abs(rd.nextInt() % len--);
            //将随机到的数放入结果集
            result[i] = source[index];
            //将待选数组中被随机到的数，用待选数组(len-1)下标对应的数替换
            source[index] = source[len];
        }
        return result;
 }
	static int subIndex =0;
	public int getSubIndex(){
		if(subIndex==5){
			subIndex=0;
		}
		subIndex++;
		return subIndex;
	}
	
	//MD5加密
	

}
