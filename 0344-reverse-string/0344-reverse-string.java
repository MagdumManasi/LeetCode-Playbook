class Solution {
    public void reverseString(char[] s) {
      int st=0;
int e=s.length-1;
while(st<e){
 char tep=s[st];
s[st]=s[e];
s[e]=tep;
st++;
e--;
}
 for(int i=0;i<s.length;i++){
System.out.println(s[i]);
}
       }         
    }
