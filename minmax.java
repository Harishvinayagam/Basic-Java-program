import java.io.*;
class MinMax{
public static void main(String[] args)throws IOException{
int my_array[] = new int[5];
InputStreamReader obj = new InputStreamReader(System.in);
BufferedReader d = new BufferedReader(obj);
System.out.println("Enter array elemts");
for (int i= 0;i<5;i++){
my_array[i]=Integer.parseInt(d.readLine());
}
Check m = new Check();
System.out.println("MAXIMUM IN AN ARRAY"+" " + m.max(my_array));
System.out.println("MinIMUM IN AN ARRAY"+" " + m.min(my_array));
}
}
class Check{
int min(int array[]){
int min = array[0];
for(int i =0;i<5;i++){
if(array[i]<min){
min = array[i];}
}
return min;
}

int max(int array[]){
int max = array[0];
for(int i =0;i<5;i++){
if(array[i]>max){
max = array[i];}
}
return max;
}
}

