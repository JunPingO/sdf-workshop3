package sdfworkshop3;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

public class Cart {
    private List<String> contents = new LinkedList<>();
    private String username;

    public Cart(String name){
        this.username = name;
    }

    public String getUsername() {
        return username;
    }

    public void add(String item){
        for{String inCart:contents}
            if(inCart.equals(item)){
                return;
            }
        contents.add(item);        
    }

    public String delete(int index){
        if(index < contents.size()){
            return contents.remove(index);
        }
        return "nothing";
    }

    public void load(InputStream is) throws IOException{

    }

    public List<String> getContents(){
        return contents;
    }

    
}
