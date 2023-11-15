
import javax.swing.JOptionPane;


public class Inventario {
    
    public Object[][] todos_productos = {
        {"COD-ALI-001", "Arroz Tio Pelon", 1230, 45},
        {"COD-ALI-002", "Frijoles Rojos_", 1020, 25},
        {"COD-ALI-003", "Atun Saldimar__", 2750, 54},
        {"COD-ALI-004", "Cereal Kelloggs", 3450, 34},
        {"COD-ALI-005", "Matequilla LALA", 1130, 103},
        {"COD-ART-001", "Basos de bidrio", 9999, 78},
        {"COD-ART-002", "Cuchillos_____", 5890, 47},
        {"COD-ART-003", "Sartenes hierro", 8700, 66},
        {"COD-ART-004", "Ollas Oster___", 14999, 38},
        {"COD-ART-005", "Refrigeradora  ", 41030, 67},
        {"COD-MED-001", "Paracetamol    ", 3040, 65},
        {"COD-MED-002", "Simvastatina   ", 4000, 55},
        {"COD-MED-003", "Aspirina______", 3460, 92},
        {"COD-MED-004", "Ramipril______", 2950, 46},
        {"COD-MED-005", "Amlodipina____", 1025, 49}
    };
    
    public void mostrar(){ //Imprime todo el inventario del arreglo multidimencional.
        String imprimir = "---------------------Grupo1 Market-----------------\n\n"+ 
                "    Código                Nombre             Precio   Cant \n";
        for (int i = 0; i < todos_productos.length; i++) {
            for (int j = 0; j < todos_productos[i].length; j++) {
                imprimir += (todos_productos[i][j] + "      ");
            }
            imprimir += "\n"; 
        }
        JOptionPane.showMessageDialog(null, imprimir);
    }
    
    public void modificar_num_articulos(){//Cambia la cantidad de articulos de un producto
        String imprimir = "---------------------Grupo1 Market-----------------\n\n"+ 
                "Num.  Producto           Cantidad\n";
        int num_producto;
        for (int i = 0; i < todos_productos.length; i++) {
            imprimir += i + ".    " + todos_productos[i][1] + "         " + todos_productos[i][3] + "\n";
        }
        num_producto = Integer.parseInt(JOptionPane.showInputDialog(null, imprimir +
                "\n\nDigite el número del producto que desea modificar la cantidad de artículos:  "));
        todos_productos[num_producto][3] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad de articulos del producto(" +todos_productos[num_producto][1]+") : "));
    }
    
    public void nuevo_produto(){//Agrega un nuevo producto al final del arreglo
        String codigo, producto;
        int precio, num_articulos;
        
        codigo = JOptionPane.showInputDialog("Digite el codigo del producto: ");
        producto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
        precio = Integer.parseInt(JOptionPane.showInputDialog("Cual es el precio de este producto?: "));
        num_articulos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos articulos de este producto se han adquirido?: "));
        
        Object[][] nuevos_productos = new Object[todos_productos.length + 1][4];

        for (int i = 0; i < todos_productos.length; i++) {
            for (int j = 0; j < 4; j++) {
                nuevos_productos[i][j] = todos_productos[i][j];
            }
        }
        nuevos_productos[todos_productos.length][0] = codigo;
        nuevos_productos[todos_productos.length][1] = producto;
        nuevos_productos[todos_productos.length][2] = precio;
        nuevos_productos[todos_productos.length][3] = num_articulos;

        todos_productos = nuevos_productos;
    }
    
    public void eliminar_producto(){//Elimina toda la informacion de un producto
        String producto_eliminar = JOptionPane.showInputDialog("---------------------Grupo1 Market-----------------\n\n"+
                "Ingrese el código del producto que desea eliminar: ");
        boolean codigo_encontrado = false;
        
        for (int i = 0; i < todos_productos.length; i++){
            for (int j = 0; j < todos_productos[i].length; j++) {
                if (todos_productos[i][j].equals(producto_eliminar)){
                    codigo_encontrado = true;
                    for (int e = i; e < todos_productos.length - 1; e++){
                        todos_productos[e] = todos_productos[e + 1];
                        }
                        todos_productos = java.util.Arrays.copyOf(todos_productos, todos_productos.length - 1);
                        JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente.");
                        break;
                }
            }
        }   
        if (!codigo_encontrado){
            JOptionPane.showMessageDialog(null, "Código del producto no existente.");
        }
    }
}

