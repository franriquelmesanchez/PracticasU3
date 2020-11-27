package ejercicio0319;

/**
19. Un centro cultural se dedica al préstamo de dos tipos de materiales de préstamo: 
discos y libros. Para los dos se guarda información general, como su código identificativo, 
el título y el autor. En el caso de los libros, almacenamos también su número de páginas,
y para los discos el nombre de la discográfica.

Al centro cultural acuden una serie de clientes (de los que se guarda su DNI y nombre),
que realizan una serie de peticiones de discos o libros (como mucho hasta 5 peticiones).
Para cada petición se guarda la fecha de inicio y fin del préstamo.

Escribir el esqueleto de las clases que estimes apropiadas para el supuesto planteado
anteriormente. 
*/
public class Ejercicio0319 {

    public static void main(String[] args) {
        Biblioteca_Disco misdiscos[] = new Biblioteca_Disco[3];
        Biblioteca_Libro mislibros[] = new Biblioteca_Libro[3];
        Biblioteca_Disco midisco1 = new Biblioteca_Disco(1,"A Kind of Magic","Queen","EMI");
        misdiscos[0] = midisco1;
        Biblioteca_Disco midisco2 = new Biblioteca_Disco(2,"The Miracle","Queen","EMI");
        misdiscos[1] = midisco2;
        Biblioteca_Disco midisco3 = new Biblioteca_Disco(3,"Innuendo","Queen","EMI");
        misdiscos[2] = midisco3;
        Biblioteca_Libro milibro1 = new Biblioteca_Libro(4,"El médico","Noah Gordon",1000);
        mislibros[0] = milibro1;
        Biblioteca_Libro milibro2 = new Biblioteca_Libro(5,"Territorio Comanche","Arturo Perez Reverte",200);
        mislibros[1] = milibro2;
        Biblioteca_Libro milibro3 = new Biblioteca_Libro(6,"El niño con el pijama de rayas","John Boyne",300);
        mislibros[2] = milibro3;
        Biblioteca_Usuarios miusuario1 = new Biblioteca_Usuarios("DNI1","Nombre1");
        int codigos[];
        int i,j,opcion,codigo;
        boolean encontrado = false;
        boolean continuar = true;

        while(continuar){
            System.out.println("");
            System.out.println("Menú");
            System.out.println("1: Alquilar disco");
            System.out.println("2: Devolver disco");
            System.out.println("3: Alquilar libro");
            System.out.println("4: Devolver libro");
            System.out.println("5: Ver tus reservas");
            System.out.println("6: Salir");
            System.out.print("Elige una opcion: ");
            opcion=Teclado.readInt();
            System.out.println("");
            switch(opcion){
                case 1:
                    System.out.println("Los discos disponibles son: ");
                    for(i=0;i<misdiscos.length;i++){
                        if(!misdiscos[i].isPrestado()){
                            misdiscos[i].imprimir();
                        }
                    }
                    System.out.print("Introduce la referencia del disco a alquilar: ");
                    codigo = Teclado.readInt();
                    encontrado = false;
                    for(i=0;i<misdiscos.length;i++){
                        if(misdiscos[i].getCodigo()==codigo){
                            if(misdiscos[i].isPrestado()){
                                encontrado=true;
                                System.out.println("");
                                System.out.print("Error: No está disponible. Pulse una tecla para volver al menú");
                                Teclado.readChar();
                                break;
                            }else{
                                encontrado=true;
                                miusuario1.reservar(codigo);
                                misdiscos[i].setPrestado(true);
                                System.out.println("");
                                System.out.print("Alquiler completado. Pulse una tecla para volver al menú");
                                Teclado.readChar();
                                break;
                            }
                        }
                    }
                    if(!encontrado){
                        System.out.println("");
                        System.out.print("Error: Código incorrecto. Pulse una tecla para volver al menú");
                        Teclado.readChar();
                    }
                    break;
                case 2:
                    codigos=miusuario1.getCodigos();
                    System.out.println("Discos que tiene alquilados: ");
                    encontrado=false;
                    for(i=0;i<codigos.length;i++){
                        for(j=0;j<misdiscos.length;j++){
                            if(misdiscos[j].getCodigo()==codigos[i]){
                                misdiscos[j].imprimir();
                                encontrado=true;
                                break;
                            }
                        }
                    }
                    if(!encontrado){
                        System.out.println("");
                        System.out.print("Error: No tiene discos alquilados. Pulse una tecla para volver al menú");
                        Teclado.readChar();
                    }else{
                        System.out.print("Introduce la referencia del disco a devolver: ");
                        codigo = Teclado.readInt();
                        encontrado = false;
                        for(i=0;i<misdiscos.length;i++){
                            if(misdiscos[i].getCodigo()==codigo){
                                encontrado=true;
                                misdiscos[i].setPrestado(false);
                                miusuario1.devolver(codigo);
                            }
                        }
                        if(!encontrado){
                            System.out.println("");
                            System.out.print("Error: Código incorrecto. Pulse una tecla para volver al menú");
                            Teclado.readChar();
                        }else{
                            System.out.println("");
                            System.out.print("Devolución completada. Pulse una tecla para volver al menú");
                            Teclado.readChar();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Los libros disponibles son: ");
                    for(i=0;i<mislibros.length;i++){
                        if(!mislibros[i].isPrestado()){
                            mislibros[i].imprimir();
                        }
                    }
                    System.out.print("Introduce la referencia del disco a alquilar: ");
                    codigo = Teclado.readInt();
                    encontrado = false;
                    for(i=0;i<mislibros.length;i++){
                        if(mislibros[i].getCodigo()==codigo){
                            if(mislibros[i].isPrestado()){
                                encontrado=true;
                                System.out.print("Error: No está disponible. Pulse una tecla para volver al menú");
                                Teclado.readChar();
                                break;
                            }else{
                                encontrado=true;
                                miusuario1.reservar(codigo);
                                mislibros[i].setPrestado(true);
                                System.out.print("Alquiler completado. Pulse una tecla para volver al menú");
                                Teclado.readChar();
                                break;
                            }
                        }
                    }
                    if(!encontrado){
                        System.out.print("Error: Código incorrecto. Pulse una tecla para volver al menú");
                        Teclado.readChar();
                    }
                    break;
                case 4:
                    codigos=miusuario1.getCodigos();
                    System.out.println("Libros que tiene alquilados: ");
                    encontrado=false;
                    for(i=0;i<codigos.length;i++){
                        for(j=0;j<mislibros.length;j++){
                            if(mislibros[j].getCodigo()==codigos[i]){
                                mislibros[j].imprimir();
                                encontrado=true;
                                break;
                            }
                        }
                    }
                    if(!encontrado){
                        System.out.println("");
                        System.out.print("Error: No tiene libros alquilados. Pulse una tecla para volver al menú");
                        Teclado.readChar();
                    }else{
                        System.out.print("Introduce la referencia del libro a devolver: ");
                        codigo = Teclado.readInt();
                        encontrado = false;
                        for(i=0;i<mislibros.length;i++){
                            if(mislibros[i].getCodigo()==codigo){
                                encontrado=true;
                                mislibros[i].setPrestado(false);
                                miusuario1.devolver(codigo);
                            }
                        }
                        if(!encontrado){
                            System.out.println("");
                            System.out.print("Error: Código incorrecto. Pulse una tecla para volver al menú");
                            Teclado.readChar();
                        }else{
                            System.out.println("");
                            System.out.print("Devolución completada. Pulse una tecla para volver al menú");
                            Teclado.readChar();
                        }
                    }
                    break;
                case 5:
                    codigos=miusuario1.getCodigos();
                    System.out.println("Discos: ");
                    encontrado=false;
                    for(i=0;i<codigos.length;i++){
                        for(j=0;j<misdiscos.length;j++){
                            if(misdiscos[j].getCodigo()==codigos[i]){
                                misdiscos[j].imprimir();
                                encontrado=true;
                                break;
                            }
                        }
                    }
                    if(!encontrado){
                        System.out.println("No tiene discos alquilados");
                    }
                    encontrado=false;
                    System.out.println("Libros: ");
                    for(i=0;i<codigos.length;i++){
                        for(j=0;j<mislibros.length;j++){
                            if(mislibros[j].getCodigo()==codigos[i]){
                                mislibros[j].imprimir();
                                encontrado=true;
                                break;
                            }
                        }
                    }
                    if(!encontrado){
                        System.out.println("No tiene libros alquilados");
                    }
                    System.out.println("");
                    System.out.print("Pulse una tecla para volver al menú");
                    Teclado.readChar();
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Error: Opcion incorrecta. Pulse una tecla para volver al menú");
                    Teclado.readChar();
            }
        }
        System.out.println("");
    }
}
