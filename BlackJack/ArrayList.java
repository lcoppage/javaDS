
public class ArrayList_jds<T> {
    T[] array;

     ArrayList_jds(){
        array = new T[10];
    }
    ArrayList_jds(int size){
        array = new T[size];
    }

    void Add(T element){
        for(int i = 0; i < array.length; i++){
            if(array[i] == null || array[i]==0){
                array[i] = element;
                return;
            }
        }
        T [] new_array = new T[array.length + 1];
        
        for(int i = 0; i<array.length; i++){
            new_array[i] = array[i];
        }                 
        new_array[array.length] = element;
        array = new_array;
    }

    void printStrings(){
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}

