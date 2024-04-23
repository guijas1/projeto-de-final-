/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cadastrousuarios.controller;

import br.com.cadastrousuarios.model.Usuario;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Dudu
 */
public class Salvar {
private OutputStream os;
private OutputStreamWriter osw;
private BufferedWriter bw;

public Salvar(){}

public void salvar(Usuario usuario){
        try {
            //Instanciar
    os = new FileOutputStream("dados_usuarios.txt", true);
    osw = new OutputStreamWriter(os);
    //escrita no arquivo
    bw = new BufferedWriter(osw);
    bw.append(usuario.getNome()+", "+usuario.getCpf()+", "+usuario.getUsuario()+", "+usuario.getSenha()+"." );
    //fechar o arquivo
    bw.newLine();
    bw.close();
    osw.close();
    os.close();
    
    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Salvar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
           Logger.getLogger(Salvar.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
}

