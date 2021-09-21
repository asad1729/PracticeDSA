import java.util.Scanner;

public class levelOrder
        {
            String arr[];
            int lastUsedIndex;
            public levelOrder(int size)
            {
                arr=new String[size+1];
                this.lastUsedIndex=0;
                System.out.println("A binary Tree of size"+size+"is created");
            }
            public boolean isFull()
            {
                if((arr.length-1)==lastUsedIndex) {
                    return true;
                } else {
                    return false;
                }
            }
            public void insert( String value)
            {
                if(isFull()==false){
                    arr[lastUsedIndex+1]=value;
                    lastUsedIndex++;
                    System.out.println("The Value is inserted");
                }
                else{
                    System.out.println("The Binary Tree is full");
                }
            }
            public void  traversal()
            {
                int i;
                for(i=1;i< arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            public static void main(String[] args)throws java.lang.Exception
            {
                Scanner in=new Scanner(System.in);
                System.out.println("Enter the size");
                int num=in.nextInt();
                levelOrder obj=new levelOrder(num);
                obj.insert("70");
                obj.insert("30");
                obj.insert("50");
                obj.insert("600");
                obj.insert("30");
                obj.insert("20");
                obj.insert("10");
                obj.traversal();

            }
        }