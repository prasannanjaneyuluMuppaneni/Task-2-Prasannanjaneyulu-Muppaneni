import java.util.*;
class DecodeLabs_Java_P2{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();
        int totalmarks = 0;
        for(int i=1;i<=n;i++){
            int marks=0;
            while(true){
                try{
                    System.out.print("Enter Marks of Subject " + i + ": ");
                    marks = sc.nextInt();
                    if(marks<0 || marks>100){
                        System.out.println("Enter Marks Between 0 and 100 only !!");
                    }
                    else {
                        break;
                    }
                }
                catch(Exception e){
                    System.out.println("All Entries Must be in Numbers Only !!");
                    sc.nextLine();
                }
            }
            totalmarks += marks;
        }
        double average =(double)totalmarks/n;
        System.out.println("Total Marks: "+totalmarks);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        if(average>=90){
            System.out.println("Grade: A");
        } 
        else if(average>= 80 && average<90){
            System.out.println("Grade: B");
        }
        else if(average>=70 && average<80){
            System.out.println("Grade: C");
        }
        else if(average>=60 && average<70){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
        sc.close();
    }
}