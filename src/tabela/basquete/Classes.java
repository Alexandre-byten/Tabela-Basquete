/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabela.basquete;

import java.util.ArrayList;

/**
 *
 * @author gmaes
 */
public class Classes {
    
    ArrayList<Pontuacao> tabelaPontos = new ArrayList<>();
    
    public static class Pontuacao {
    
        private int numeroJogos;
        private int minimoTemporada;
        private int maximoTemporada;
        private int recordeMinimo;
        private int recordeMaximo;
        private int pontuacaoAtual;
    
        public void InserePontuacao (int jogo, int minT, int maxT, int recMin, int recMax){
        
            numeroJogos = jogo;
            minimoTemporada = minT;
            maximoTemporada = maxT;
            recordeMinimo = recMin;
            recordeMaximo = recMax;
    
        };
        
        public void AdicionaPontuacao (int pts){
            pontuacaoAtual=pts;    

        };
        
        public int retornaMinimoTemporada(){
            return minimoTemporada;
        }

        public int retornaMaximoTemporada(){
            return maximoTemporada;
        }
        
        public int retornaRecordeMinimo(){
            return recordeMinimo;
        }

        public int retornaRecordeMaximo(){
            return recordeMaximo;
        }

        
    }
    
    

    
    public static int TextoParaNumero(String texto){
    //converte uma String em Inteiro        
        int numero = 0;   
        texto = texto.trim();
        
        for(int i=0; i<texto.length();i++){    

            if(!(texto.charAt(i)=='0'||texto.charAt(i)=='1'||texto.charAt(i)=='2'||texto.charAt(i)=='3'||texto.charAt(i)=='4'||texto.charAt(i)=='5'||texto.charAt(i)=='6'||texto.charAt(i)=='7'||texto.charAt(i)=='8'||texto.charAt(i)=='9')){
                //Se o caracter não for numérico, retornar -1 para tratar o erro
                return -1;
            }
        }        
        return Integer.parseInt(texto);
    }
    
    //public static 
    
}
