package ejercicio0319;
// =====================================================================
// DESCRIPCION: contiene únicamente la clase Teclado en la

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//		que se recogen un conjunto de métodos para el manejo de
//		la entrada desde teclado.
//              
//		Estos métodos permiten la lectura de datos de todos
//		los tipos básicos java (a excepción de booleanos): char,
//		byte, short, int, double y float. También se incorporan
//		métodos para la entrada de String.
//
//		La entrada se hace por líneas => se lee una línea
//		(String) y se busca en ella el tipo de dato requerido
//		llamando a al método parse correspondiente.
//
//		Ninguno de los métodos lanza excepciones. Si se
//		producen, se capturan y se muestra un mensaje de error
//		pero en ningún caso se relanzan.
// =====================================================================

public class Teclado {
	public static final byte 	BYTE_ERR 	=	Byte.MAX_VALUE;
	public static final short 	SHORT_ERR 	= 	Short.MAX_VALUE;
	public static final int 	INT_ERR 	=	Integer.MAX_VALUE;
	public static final double 	DOUBLE_ERR 	= 	Double.MAX_VALUE;
	public static final float  	FLOAT_ERR 	= 	Float.MAX_VALUE;
	public static final char  	CHAR_ERR 	= 	Character.MAX_VALUE;
	public static final String	STRING_ERR 	= 	null;

/**
 *  Método que lee una línea de teclado y devuelve el <code><b>byte</b></code> escrito por el usuario.
 *  @return Devuelve el <code><b>byte</b></code> introducido por el usuario o <code><b>Teclado.BYTE_ERR</b></code> si no se introdujo un byte.
 */
    public static byte readByte () {
        byte val=BYTE_ERR;
        try	{
                BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
                val = Byte.parseByte (in.readLine());
        } catch (IOException ioe) {
                System.out.println (">> Excepción (readLnByte): Imposible leer línea");
        } catch (NumberFormatException nfe) {
                System.out.println (">> Excepción (readLnByte): Valor introducido no byte");
        } catch (Exception e) {
                System.out.println (">> Excepción (readLnByte): Ocurrió una excepción");
        }
        return val;
    }

/**
 *  Método que lee una línea de teclado y devuelve el <code><b>short</b></code> escrito por el usuario.
 *  @return Devuelve el <code><b>short</b></code> introducido por el usuario o <code><b>Teclado.SHORT_ERR</b></code> si no se introdujo un byte.
 */
    public static short readShort () {
        short val=SHORT_ERR;
        try	{
                BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
                val = Short.parseShort (in.readLine());
        } catch (IOException ioe) {
                System.out.println (">> Excepción (readLnShort): Imposible leer línea");
        } catch (NumberFormatException nfe) {
                System.out.println (">> Excepción (readLnShort): Valor introducido no short");
        } catch (Exception e) {
                System.out.println (">> Excepción (readLnShort): Ocurrió una excepción");
        }
        return val;
    }

/**
 *  Método que lee una línea de teclado y devuelve el <code><b>int</b></code> escrito por el usuario.
 *  @return Devuelve el <code><b>int</b></code> introducido por el usuario o <code><b>Teclado.INT_ERR</b></code> si no se introdujo un byte.
 */
    public static int readInt () {
        int val=INT_ERR;
        try	{
                BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
                val = Integer.parseInt (in.readLine());
        } catch (IOException ioe) {
                System.out.println (">> Excepción (readLnInt): Imposible leer línea");
        } catch (NumberFormatException nfe) {
                System.out.println (">> Excepción (readLnInt): Valor introducido no entero");
        } catch (Exception e) {
                System.out.println (">> Excepción (readLnInt): Ocurrió una excepción");
        }
        return val;
    }

/**
 *  Método que lee una línea de teclado y devuelve el <code><b>double</b></code> escrito por el usuario.
 *  @return Devuelve el <code><b>double</b></code> introducido por el usuario o <code><b>Teclado.DOUBLE_ERR</b></code> si no se introdujo un byte.
 */
    public static double readDouble () {
        double val=DOUBLE_ERR;
        try	{
                BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
                val = Double.parseDouble (in.readLine());
        } catch (IOException ioe) {
                System.out.println (">> Excepción (readLnDouble): Imposible leer línea");
        } catch (NumberFormatException nfe) {
                System.out.println (">> Excepción (readLnDouble): Valor introducido no double");
        } catch (Exception e) {
                System.out.println (">> Excepción (readLnDouble): Ocurrió una excepción");
        }
        return val;
    }

/**
 *  Método que lee una línea de teclado y devuelve el <code><b>float</b></code> escrito por el usuario.
 *  @return Devuelve el <code><b>float</b></code> introducido por el usuario o <code><b>Teclado.FLOAT_ERR</b></code> si no se introdujo un byte.
 */
    public static float readFloat () {
        float val=FLOAT_ERR;
        try	{
                BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
                val = Float.parseFloat (in.readLine());
        } catch (IOException ioe) {
                System.out.println (">> Excepción (readLnFloat): Imposible leer línea");
        } catch (NumberFormatException nfe) {
                System.out.println (">> Excepción (readLnFloat): Valor introducido no float");
        } catch (Exception e) {
                System.out.println (">> Excepción (readLnFloat): Ocurrió una excepción");
        }
        return val;
    }

/**
 *  Método que lee una línea de teclado y devuelve el <code><b>char</b></code> escrito por el usuario.
 *  @return Devuelve el <code><b>char</b></code> introducido por el usuario o <code><b>Teclado.CHAR_ERR</b></code> si no se introdujo un byte.
 */

    public static char readChar () {
        char val = CHAR_ERR;
        try	{
                BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
                val = (char) in.read();
        } catch (IOException ioe) {
                System.out.println (">> Excepción (readLnChar): Imposible leer caracter");
        } catch (Exception e) {
                System.out.println (">> Excepción (readLnChar): Ocurrió una excepción");
        }
        return val;
    }

/**
 *  Método que lee una línea de teclado y devuelve el <code><b>String</b></code> escrito por el usuario.
 *  @return Devuelve el <code><b>String</b></code> introducido por el usuario o <code><b>Teclado.STRING_ERR</b></code> si no se introdujo un byte.
 */
    public static String readString () {
        String val=STRING_ERR;
        try	{
                BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
                val = in.readLine();
        } catch (IOException ioe) {
                System.out.println (">> Excepción (readLnString): Imposible leer línea");
        } catch (Exception e) {
                System.out.println (">> Excepción (readLnString): Ocurrió una excepción");
        }
        return val;
    }
}
