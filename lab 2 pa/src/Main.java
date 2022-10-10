//Pelcear Cristian
public class Main
{
    public static void main(String[] args)
    {
        //initialisations ->

        //-> costs
        int[][] matrix = new int[3][3];
        matrix[0][0]=2;
        matrix[0][1]=3;
        matrix[0][2]=1;
        matrix[1][0]=5;
        matrix[1][1]=4;
        matrix[1][2]=8;
        matrix[2][0]=5;
        matrix[2][1]=6;
        matrix[2][2]=8;
       //->destinations
        destination destination1 =new destination("D1",20,SourceType.WAREHOUSE);
        destination destination2 =new destination("D2",25,SourceType.WAREHOUSE);
        destination destination3 =new destination("D3",25,SourceType.WAREHOUSE);
       //->sources
        source source1 = new source("S1", SourceType.FACTORY,10);
        source source2 = new source("S2", SourceType.FACTORY,35);
        source source3 = new source("S3",SourceType.FACTORY,25 );
        //initialisations
        destination[] dest= new destination[3];
        dest[0]=destination1;
        dest[1]=destination2;
        dest[2]=destination3;

        source[] src = new source[3];
        src[0] = source1;
        src[1] = source2;
        src[2] = source3;

        //-> creation
        problem pb=new problem(dest,src,matrix);
        //->print
        System.out.println(pb);
        System.out.println();
        System.out.println();
        System.out.println();


    }

}
