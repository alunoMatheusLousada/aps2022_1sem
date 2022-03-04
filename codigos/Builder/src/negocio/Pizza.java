/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Pizza {

    private int tamanho;
    private boolean queijo;
    private boolean bacon;
    private boolean tomate;    
    
    public static class Builder {
        private int tamanho;
        private boolean queijo = false;
        private boolean bacon = false;
        private boolean tomate = false;

        public Builder(int tamanho) {
            this.tamanho = tamanho;
        }

        public Builder queijo() {
            this.queijo = true;
            return this;
        }

        public Builder tomate() {
            this.tomate = true;
            return this;
        }

        public Builder bacon() {
            this.bacon = true;
            return this;
        }
        
        public Pizza build(){
            return new Pizza(this);
        }

    }

    private Pizza(Builder builder) {
        this.tamanho = builder.tamanho;
        this.queijo = builder.queijo;
        this.tomate = builder.tomate;
        this.bacon = builder.bacon;

    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isQueijo() {
        return queijo;
    }

    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isTomate() {
        return tomate;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }
    
    
    

}
