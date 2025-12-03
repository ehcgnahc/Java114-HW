public class Triangle extends Shape2D{
    int row;
    
    public Triangle(int row){
        this.row = row;
    }

    public double draw(){
        for(int i = 0; i < row - 1; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for(int i = 0; i < row; i++){
            System.out.print("*");
        }
        System.out.println();
        return 0;
    }
}