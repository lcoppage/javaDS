public class ArrayList{
    Object[] array;

     public ArrayList(){
        array = new Object[10];
    }
   public ArrayList(int size){
        array = new Object[size];
    }

    public void add(Object element){
        for(int i = 0; i < array.length; i++){
            if(array[i] == null){
                array[i] = element;
                return;
            }
        }
        Object [] new_array = new Object[array.length + 1];
            for(int i = 0; i<array.length; i++){
            new_array[i] = array[i];
        }                 
        new_array[array.length] = element;
        array = new_array;
    }

    public void add(int index, Object element){
        Object[] new_array = new Object[array.length + 1];
        for(int i = 0; i<index; i++){
                new_array[i]= array[i];
            }
            new_array[index] = element;

            for(int j = 0; j<array.length; j++){
                new_array[j] = array[j-1];
            }
            array = new_array;
    }
    
    public void set(int index, Object element){
        array[index] = element;
    }

    public int lastIndexOf(Object element){
        for(int i = array.length - 1; i>0; i--){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }

    public int indexOf(Object element){
        for(int i = 0; i<array.length; i++){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity){
        
    }
    

    public boolean isEmpty(){
        for(int i = 0; i<array.length; i++){
            if(array[i] != null){
                return false;
            }
        }
        return true;
    }

    public void printStrings(){
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void remove(Object element){
        for(int i = 0; i < array.length; i++){
            if(array[i] == element){
                array[i] = null;
                break;
            }
        }
            Object [] new_array; 
            new_array = new Object[array.length -1];
            for(int i = 0; i < array.length; i++){
                    if(array[i] != null){
                        if(i < new_array.length){
                        new_array[i] = array[i];
                    } else{
                        new_array[i-1] = array[i];
                    }
                }
                else{
                    new_array[i] = array[i+1];
                    i++;
                }
            }
            array = new_array;
    }
    
    public void remove(int index){
        Object [] new_array;
        new_array = new Object[array.length -1];
        array[index] = null;
        for(int i = 0; i<array.length; i++){
            if(array[i] != null){
                if(i < new_array.length){
                    new_array[i] = array[i];
                } else{
                    new_array[i-1] = array[i];
                }
            }
            else{
                new_array[i] = array[i+1];
                i++;
            }
        }
        array = new_array;
        }

    public int size(){
        return array.length;
    }

    public Object get(int index){
        return array[i];
    }

    public void clear(){
        for(int i = 0; i<array.length; i++){
            remove(i);
        }
    }

    public Object clone(){
        return array;
    }

    boolean contains(Object element){
        for(int i = 0; i < array.length; i++){
            if(array[i] == element){
                return true;
            }
        }
            return false;
    
    }   
}
    
