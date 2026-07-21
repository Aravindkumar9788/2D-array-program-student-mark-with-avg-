class array{
public static void main(String[] args){
    String[] name={"abuu","ajay","abii","akash"};
    int[][] marks={
        {50,40,30,20,60},
        {90,95,97,98,99},
        {66,77,98,91,55},
        {65,75,85,92,93}
        
    };
    System.out.println("name\t Tamil \t english \t Maths \t Science  \t Social \t Average");
    for(int i=0;i<name.length;i++)
    {
        System.out.print(name[i]+"\t");
        double total=0;
        for(int j=0;j<marks[i].length;j++)
        {
            System.out.print(marks[i][j]+"\t\t\t");
            total+=marks[i][j];
        }
        
     System.out.println((total/5)+"%");
      System.out.println();
    }
}
}
        
