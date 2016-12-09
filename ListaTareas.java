import java.util.ArrayList;
public class ListaTareas
{
                                 //Atributos
    private ArrayList<String> listaDeTareas;
    
    /**
     * Constructor for objects of class ListaTareas
     */
    public ListaTareas()
    {
        listaDeTareas = new ArrayList<String>();
    }
    
    public void verTareas(){
        System.out.println(listaDeTareas);
    }
    
    public void addTarea(String nuevaTarea){
        listaDeTareas.add(nuevaTarea);
    }
    
    public int verNumeroTareas(){
        return listaDeTareas.size();
    }
    
    public void eliminarTarea(int posicion){
        if(esValidoElIndice(posicion - 1)){
            listaDeTareas.remove(posicion - 1);
        }
        else {
            System.out.println("Error, el numero especificado no es válido");
        }
    }
    
    public boolean esValidoElIndice(int indice){
        boolean arsa;
        if(indice >=0 && indice < listaDeTareas.size()){
            arsa = true;
        }
        else{
            arsa = false;
        }
        return arsa;
    }
    
    public boolean hayTareasPendientes(){ 
        boolean tareas = false;
        if(!listaDeTareas.isEmpty()){
            tareas = true;
        }
        return tareas;
    }
    
    public void mostrarTareas(){
        int x = 1;
        for (String tarea : listaDeTareas){
            System.out.println(x + "-" + tarea);
            x = x + 1;
        }
    }
    public void mostrarTareasCoincidentes(String texto){
        int x = 0;
        int coincidencias = 0;
        for (String tarea : listaDeTareas){
            x = x + 1;
            if(tarea.contains(texto)){
                System.out.println(x + "-" + tarea);
                coincidencias = coincidencias + 1;
            }
        }
        if(coincidencias == 0){
            System.out.println("Error");
        }
    }
    public void mostrarTareas2(){
        int chisme = 0;
        int x = 1;
        while(chisme < listaDeTareas.size()){
            System.out.println(x + "- " + listaDeTareas.get(chisme));
            chisme = chisme + 1;
            x = x + 1;
        }
    }
    public void mostrarNTareas(int cuantas){
        int chisme = 0;
        int x = 1;
        if(cuantas < listaDeTareas.size()){
            while(chisme < cuantas){
                System.out.println(x + "- " + listaDeTareas.get(chisme));
                chisme = chisme + 1;
                x = x + 1;
            }
        }
        else{
             while(chisme < cuantas){
                 System.out.println(x + "- " + listaDeTareas.get(chisme));
                 chisme = chisme + 1;
                 x = x + 1;
             }
        }
    }
    /**
     * Devuelve la posicion que contiene el texto indicado como parametro. -1 en caso contrario.
     */
    public int hayTareasCoincidentes (String textoABuscar){
        boolean chisme = false;
        int index = 0;
        int valorADevolver = -1;
        while(index < listaDeTareas.size() && !chisme){
            if(listaDeTareas.get(index).contains(textoABuscar)){
                chisme = true;
                valorADevolver = index + 1;
            }
            index++;
        }
        return valorADevolver;
    }
}