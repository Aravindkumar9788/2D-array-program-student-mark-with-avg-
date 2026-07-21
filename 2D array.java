class array{
public static void main(String[] args){
    String[] name={"abu","ajay","abi","akash"};
    int[][] marks={{50,40,30,20,60},{90,95,97,98,99},{66,77,98,91,55},{65,75,85,92,93}};
    for(int i=0;i<name.length;i++)
    {
        System.out.println("name="+name[i]);
        double total=0;
        for(int j=0;j<marks[i].length;j++)
        {
            System.out.println(marks[i][j]+"");
            total+=mark[i][j];
        }
        System.out.println();
     System.out.println("Average"+(total/5)+"%");
      System.out.println();
    }
}
}
        
