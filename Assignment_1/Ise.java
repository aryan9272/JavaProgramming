class Ise{
public static void main(String args[]){
int size=5;
if(size%2==0) {
System.out.printf("%d is a Even Please enter ODD size",size);
}
else{
for(int i=1;i<=size;i++){
for(int j=1;j<=size;j++){
if(i==j || i==size-j+1){
System.out.print("X");
}
else System.out.print(" ");
}
System.out.println();
}

}

}
}