/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cadastrousuarios.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dudu
 */
public class Ler {
    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;
    private ArrayList<String> linha;
    private String valor;
    
    
    public Ler() {}
    
    public void ler(){
        linha = new ArrayList<String>();
        
        try {
        
        is = new FileInputStream("dados_usuarios.txt");
        isr = new InputStreamReader(is);
        
        valor = br.readLine();
        
        while (valor != null){
            valor = br.readLine();
            
        }
        
        br.close();
        isr.close();
        is.close();
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
           Logger.getLogger(Ler.class.getName()).log(Level.SEVERE, null, ex);
       }
}
}