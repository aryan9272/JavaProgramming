<<<<<<< HEAD
class PatternPrint{

static void logic1(int size){//as whole
int mid=(size/2)+1;
for(int og_row=1;og_row<=size;og_row++){
int row=og_row;
if(row>mid){
row=size-og_row+1;
}
for(int colm=1;colm<=size;colm++)
{
if(colm==mid-row+1 || colm==mid+row-1)
{
System.out.print("*");
}
else System.out.print(" ");

}
System.out.println();
}
}
static void logic2(int size){//up--mid--down
int mid=(size/2);
//upper

for(int row=1;row<=mid;row++){
//spaces
for(int spaces=1;spaces<=mid+1-row;spaces++)
{
System.out.print(" ");
}
//star
for(int star=1;star<=2*row-1;star++)
{
if(star==1||star==2*row-1) System.out.print("*");		
else System.out.print(" ");
}
System.out.println();
}
//mid
System.out.println("*"+" ".repeat(size-2)+"*");
//down

for(int row=mid;row>=1;row--){
//spaces
for(int spaces=1;spaces<=mid+1-row;spaces++)
{
System.out.print(" ");
}
//star
for(int star=1;star<=2*row-1;star++)
{
if(star==1||star==2*row-1) System.out.print("*");
else System.out.print(" ");
}
System.out.println();
}

}
static void logic3(int size){//up--down
int mid=(size/2)+1;
//upper

for(int row=1;row<=mid;row++){
//spaces
for(int spaces=1;spaces<=mid-row;spaces++)
{
System.out.print(" ");
}
//star
for(int star=1;star<=2*row-1;star++)
{
if(star==1||star==2*row-1) System.out.print("*");
else System.out.print(" ");
}
System.out.println();
}

//down

for(int row=mid-1;row>=1;row--){
//spaces
for(int spaces=1;spaces<=mid-row;spaces++)
{
System.out.print(" ");
}
//star
for(int star=1;star<=2*row-1;star++)
{
if(star==1||star==2*row-1) System.out.print("*");
else System.out.print(" ");
}
System.out.println();
}

}
public static void main(String args[]){
int size=Integer.parseInt(args[0]);
if(size%2==0) {System.out.printf("%d is Even",size);}
else{
System.out.println("method1");
System.out.println();
logic1(size);
System.out.println("method2");
System.out.println();
logic2(size);
System.out.println("method3");
System.out.println();
logic3(size);
}

}
=======
class PatternPrint{

static void logic1(int size){//as whole
int mid=(size/2)+1;
for(int og_row=1;og_row<=size;og_row++){
int row=og_row;
if(row>mid){
row=size-og_row+1;
}
for(int colm=1;colm<=size;colm++)
{
if(colm==mid-row+1 || colm==mid+row-1)
{
System.out.print("*");
}
else System.out.print(" ");

}
System.out.println();
}
}
static void logic2(int size){//up--mid--down
int mid=(size/2);
//upper

for(int row=1;row<=mid;row++){
//spaces
for(int spaces=1;spaces<=mid+1-row;spaces++)
{
System.out.print(" ");
}
//star
for(int star=1;star<=2*row-1;star++)
{
if(star==1||star==2*row-1) System.out.print("*");		
else System.out.print(" ");
}
System.out.println();
}
//mid
System.out.println("*"+" ".repeat(size-2)+"*");
//down

for(int row=mid;row>=1;row--){
//spaces
for(int spaces=1;spaces<=mid+1-row;spaces++)
{
System.out.print(" ");
}
//star
for(int star=1;star<=2*row-1;star++)
{
if(star==1||star==2*row-1) System.out.print("*");
else System.out.print(" ");
}
System.out.println();
}

}
static void logic3(int size){//up--down
int mid=(size/2)+1;
//upper

for(int row=1;row<=mid;row++){
//spaces
for(int spaces=1;spaces<=mid-row;spaces++)
{
System.out.print(" ");
}
//star
for(int star=1;star<=2*row-1;star++)
{
if(star==1||star==2*row-1) System.out.print("*");
else System.out.print(" ");
}
System.out.println();
}

//down

for(int row=mid-1;row>=1;row--){
//spaces
for(int spaces=1;spaces<=mid-row;spaces++)
{
System.out.print(" ");
}
//star
for(int star=1;star<=2*row-1;star++)
{
if(star==1||star==2*row-1) System.out.print("*");
else System.out.print(" ");
}
System.out.println();
}

}
public static void main(String args[]){
int size=Integer.parseInt(args[0]);
if(size%2==0) {System.out.printf("%d is Even.Please Enter ODD value",size);}
else{
System.out.println("logic1");
System.out.println();
logic1(size);
System.out.println("logic2");
System.out.println();
logic2(size);
System.out.println("logic3");
System.out.println();
logic3(size);
}

}
>>>>>>> 17e715c23443bcba1805495944db943f2831d153
}