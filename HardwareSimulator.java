import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HardwareSimulator {


    public static void main(String[] args) {
        
        int[] a = {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] c = {0, 0, 1, 0, 0, 0, 0, 0};
        int[] in = {1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1};
        //System.out.println(Arrays.toString(Adders.Add16(a, b)));
        //int[] x = ProgramCounter.pc(in, 0, 1, 0);
        //System.out.println(Arrays.toString(ProgramCounter.pc(ProgramCounter.pc(x, 1, 0, 0), 1, 0, 0)));
        //int[] x = Register.Reg(in, 1);
        //System.out.println(Arrays.toString(x));
        //System.out.println(Arrays.toString(Register.Reg(x, 0)));
 
 
        int[] instruction = {1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] inM = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        CPU.cpu(inM, instruction, 0);
        System.out.println(Arrays.toString(CPU.getPC()));
    }
}