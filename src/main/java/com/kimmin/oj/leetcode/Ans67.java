package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/2/16.
 */
public class Ans67 {
    public class Solution {
        public String addBinary(String a, String b) {
            int carry=0;
            int alen=a.length();
            int blen=b.length();
            String ans="";
            StringBuilder sb=new StringBuilder(ans);
            int looplen=alen>blen?blen:alen;
            int i=0;
            for(i=0;i<looplen;i++){
                int na,nb;
                if(a.charAt(alen-i-1)=='1'){
                    na=1;
                }else{ na=0; }
                if(b.charAt(blen-i-1)=='1'){
                    nb=1;
                }else{ nb=0; }

                if(na+nb+carry==3){
                    sb.insert(0,"1");
                    carry=1;
                }else if(na+nb+carry==2){
                    sb.insert(0,"0");
                    carry=1;
                }else if(na+nb+carry==1){
                    sb.insert(0,"1");
                    carry=0;
                }else if(na+nb+carry==0){
                    sb.insert(0,"0");
                    carry=0;
                }else{}
            }

            String rest=alen>blen?a:b;
            int restlen=alen>blen?alen:blen;
            for(;i<restlen;i++){
                int n=0;
                if(rest.charAt(restlen-1-i)=='1'){
                    n=1;
                }else{
                    n=0;
                }
                if(n+carry==2){
                    sb.insert(0,"0");
                    carry=1;
                }else if(n+carry==1){
                    sb.insert(0,"1");
                    carry=0;
                }else{
                    sb.insert(0,"0");
                    carry=0;
                }
            }

            if(carry==1){
                sb.insert(0,"1");
            }
            //System.out.println(sb.toString());
            return sb.toString();
        }
    }
}
