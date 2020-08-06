package util;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_all_nums_array_list {//Mrkian____markian
    public static ArrayList<String> remove_numbers(ArrayList<String>list){

        System.out.println(list);
        for(int i=0;i<list.size();i++){
            int count=0;
            for(int j=0;j<list.get(i).length();j++){
                if(list.get(i).charAt(j)>='0'&&list.get(i).charAt(j)>='9'){
                    count++;
                }
            }
            System.out.println(count);
            if(count==0){
                list.remove(i);
                i--;
            }
        }
       return list;
    }
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.addAll(Arrays.asList("ASD","123","as","2","3231313a","dasd","2","312t33","321"));
        System.out.println( remove_numbers(list));


    }
}


