
<f:ajax execute="input-component-Id" render="output-component-Id" />


package com.codesjava.business;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name="OlaMundo")
@SessionScoped
public class OlaMundo {
 // Propriedade do Bean Gerenciado
 private String NomeUsuario;
 //Getter e setter
 public String getUserName() {
 return NomeUsuario;
 }

  public void setNomeUsuario(String NomeUsuario) {
 this.NomeUsuario = NomeUsuario;
 }
 public String getMensagemOla() {
 if(NomeUsuario == null || NomeUsuario.equals("")){
 return "";
 }else{
 return "Olá, " + NomeUsuario;
            }
        }
    }