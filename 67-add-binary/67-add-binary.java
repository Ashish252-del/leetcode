class Solution {
    public String addBinary(String a, String b) {
       String ans = "";
        int i =a.length()-1, j=b.length()-1;
        boolean c = false;
        while(i>=0&&j>=0){
          if(a.charAt(i)=='1'&&b.charAt(j)=='1')
          {  if(!c)
          { ans = ("0")+(ans); }
           else if (c) ans = ("1")+(ans);
           c=true;
          }
         else if ((a.charAt(i)=='1'&&b.charAt(j)=='0')||(a.charAt(i)=='0'&&b.charAt(j)=='1'))
         {
            if(!c)
              ans = ("1")+(ans); 
           else {ans = ("0")+(ans);  c=true; }
          
         }
     else {
         if(!c)
              ans = ("0")+(ans); 
           else ans = ("1")+(ans);
           c=false;  
     }
       i--; j--;     
        }
       
    while (i>=0) {
         if(c==false){
              ans = (a.charAt(i))+(ans); }
           else{ if(a.charAt(i)=='1'){
               ans = ("0")+(ans); c = true;}
                else {
               ans = ("1")+(ans); c = false;}
          }
        i--;
    }  
   while (j>=0) {
         if(!c)
              ans = (b.charAt(j))+(ans); 
           else{ if(b.charAt(j)=='1'){
               ans = ("0")+(ans); c = true;}
                else {
               ans = ("1")+(ans); c = false;}
          }
       j--;
    }    
    if(c) ans = ("1")+(ans);
        return ans;
    }
}