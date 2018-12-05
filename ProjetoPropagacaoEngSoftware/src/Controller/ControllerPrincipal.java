/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Marcos
 */
public class ControllerPrincipal {

    public double calculaRaio(double distancia, double frequencia) {
        double raio = 0;

        raio = (550 * Math.sqrt(((distancia / 2) * (distancia / 2)) / (distancia * frequencia)));

        return (double) raio;
    }

    public double calculaAe(double distancia, double frequencia, double atenuacaoCabo, double atenuacaoConector) {
        return (32.44 + 20 * Math.log10(distancia) + 20 * Math.log10(frequencia)) + (atenuacaoCabo * distancia) + atenuacaoConector;
    }
    
    public double calculaPotenciaEfetivamenteIrradiadaPeirp (double potenciaTransmissorPx, double ganhoAntenaTx, double ganhoAntenaRx) {
        double potenciaTransmissorPxdBm = (10 * Math.log10(potenciaTransmissorPx/0.001));
        return potenciaTransmissorPxdBm + ganhoAntenaRx + ganhoAntenaTx;
    }
    
    public double calculaPotenciaRecebidaPr (double pEirp, double aE) {
        return pEirp - aE;
    }

}
