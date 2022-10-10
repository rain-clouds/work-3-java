import java.util.Arrays;
import java.lang.String;

//Pelcear Cristian
public class problem
{
    destination[] dest;
    source[] src;
    int[][] matrix;
//constructor
    public  problem(destination[] dest,source[] src, int[][] matrix)
    {
        this.dest=dest;
        this.src=src;
        this.matrix=matrix;
    }

    @Override
    public String toString() {
        String matrice="";
        for(int i=0;i<matrix.length;i++)
        {
            matrice+=Arrays.toString(matrix[i])+ '\n';
        }
        return "Problem{" + '\n' +
                "sources=" + Arrays.toString(src) + '\n' +
                ", destinations=" + Arrays.toString(dest) + '\n'+
                ", Cost=" + '\n' + matrice +'\n'+
                '}';
    }



}
