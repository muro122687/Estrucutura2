package proyectosgit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class conversordecodigo
{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
 
    void menu()throws IOException
    {
        while(true)
        {
        System.out.println("\nMENU\n 1.-DECIMAL => BINARIO\n 2.-BINARIO => DECIMAL\n 3.-BINARIO => HEXADECIMAL\n 4.-BINARIO => OCTAL\n 5.-HEXADECIMAL => BINARIO\n 6.-OCTAL => BINARIO\n 7.-SALIR\n OPCION: ");
        
        int opc=Integer.parseInt(in.readLine());
        String valor;
        System.out.print("\n");
     
            switch(opc)
            {
                case 1:
                    System.out.println("\n\nDECIMAL => BINARIO");
                    System.out.print("DECIMAL= ");
                    valor=in.readLine();
                    dec_bin(valor);
                    break;
                
                case 2:
                    System.out.println("\n\nBINARIO => DECIMAL");
                    System.out.print("nBINARIO= ");
                    valor=in.readLine();
                    bin_dec(valor);
                    break;
                case 3:
                    System.out.println("\n\nBINARIO => HEXADECIMAL");
                    System.out.print("nBINARIO= ");
                    valor=in.readLine();
                    bin_hex(valor);
                    break;
                case 4:
                    System.out.println("\n\nBINARIO => OCTAL");
                    System.out.print("nBINARIO= ");
                    valor=in.readLine();
                    bin_oct(valor);
                    break;
                case 5:
                    System.out.println("\n\nHEXADECIMAL => BINARIO");
                    System.out.print("nHEXADECIMAL= ");
                    valor=in.readLine();
                    hex_bin(valor);
                    break;
                case 6:
                    System.out.println("\n\nOCTAL => BINARIO");
                    System.out.print("OCTAL= ");
                    valor=in.readLine();
                    oct_bin(valor);
                    break;
                
                case 7:
                    System.exit(0);
                    break;
                default:System.out.println("Ingrese una opcion correta");
            }
        }
    }
 
    void dec_bin(String valor)
    {
        int dec=Integer.parseInt(valor);
        valor=Integer.toBinaryString(dec);
        System.out.print("BINARIO: "+valor);
    }
 
    void bin_dec(String valor)
    {
        int dec=Integer.parseInt(valor,2);
        System.out.print("DECIMAL: "+dec);
    }
 
    void bin_hex(String valor)
    {
        int dec=Integer.parseInt(valor,2);
        valor=Integer.toHexString(dec);
        System.out.print("HEXADECIMAL: "+valor);
    }
 
    void bin_oct(String valor)
    {
        int dec=Integer.parseInt(valor,2);
        valor=Integer.toOctalString(dec);
        System.out.print("OCTAL: "+valor);
    }
 
    void hex_bin(String valor)
    {
        int dec=Integer.parseInt(valor,16);
        valor=Integer.toBinaryString(dec);
        System.out.print("BINARIO: "+valor);
    }
   
    void oct_bin(String valor)
    {
        int dec=Integer.parseInt(valor,8);
        valor=Integer.toBinaryString(dec);
        System.out.print("BINARIO: "+valor);
    }
 
    public static void main(String [] args) throws IOException
    {
        conversordecodigo conversion=new conversordecodigo();
        conversion.menu();
    }
}