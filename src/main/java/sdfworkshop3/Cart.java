package sdfworkshop3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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
        for(String inCart:contents)
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

    //read a file always use InputStream
    public void load(InputStream is) throws IOException{
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String item;
        //no semicolon required for just 1 line of code after while/if/for statements
        while ((item = br.readLine()) != null)
            contents.add(item);

        //close in terms of first in last out
        br.close();
        isr.close();
    }

    //save a file always use OutputStream
    public void save(OutputStream os) throws IOException{
        OutputStreamWriter ows = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(ows);
        for (String item: contents)
            bw.write(item + "\n");
        
        //no need to first in last out for output
        bw.flush();
        ows.flush();
        bw.close();
        ows.close();
    }

    public List<String> getContents(){
        return contents;
    }

    
}
