/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author nelsonfonseca
 */
@WebService(serviceName = "InfoipService")
public class InfoipService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "enderecoIp")
    public String sobr(@WebParam(name = "name2") String pgIp) {
        String ips = (pgIp);
        return "Endereço IP: " +pegaIp(ips);
    }
    @WebMethod(operationName = "classe")
    public String clas(@WebParam(name = "pgClass") String pgClass) {
        String ips = (pgClass);
        return "Classe: "+pegaClasse(pegaIp(ips));
    }
    @WebMethod(operationName = "mascaraRede")
    public String mask(@WebParam(name = "mascara") String pgMascara) {    
        String mascaraRede = pegaMascara(pgMascara);
        return "Mascarade rede: " + mascara(mascaraRede);
    }
    @WebMethod(operationName = "broadcast")
    public String broa(@WebParam(name = "broadcast") String pgBroadcast) {
        String mascaraRede = pegaMascara(pgBroadcast);
        String broad = broadcast(Integer.parseInt(infoClasse(mascaraRede)), pgBroadcast);
        return "Broadcast: " + broad;
    }
    @WebMethod(operationName = "gateway")
    public String gate(@WebParam(name = "gateway") String pgGateway) {   
        String mascaraRede = pegaMascara(pgGateway);
        return "Gateway: " + gateway(Integer.parseInt(infoClasse(mascaraRede)), pgGateway);
    }
    @WebMethod(operationName = "capacidadeEnderecos")
    public String info(@WebParam(name = "info") String pgInfo) {
        String mascaraRede = pegaMascara(pgInfo);
        int cap = (Integer.parseInt(infoClasse(mascaraRede))-2);
        return "Capacidade: " + cap +" endereços hosts.";
    }
    @WebMethod(operationName = "infoCompleta")
    public String infoCompleta(@WebParam(name = "infoCompleta") String pgInfoCompleta) {
        String ips = (pgInfoCompleta);
        String mascaraRede = pegaMascara(pgInfoCompleta);
        int cap = (Integer.parseInt(infoClasse(mascaraRede))-2);
        String broad = broadcast(Integer.parseInt(infoClasse(mascaraRede)), pgInfoCompleta);
        String gate = gateway(Integer.parseInt(infoClasse(mascaraRede)), pgInfoCompleta);
        return "Endereço IP: " +pegaIp(ips)+" - Classe: "+ pegaClasse(pegaIp(ips))+
        " - Mascarade rede: " + mascara(mascaraRede)+
                "- Broadcast: " + broad+
                "- Gateway: " + gate+
                "- Capacidade: " + cap+" endereços hosts.";
    }
    
    
    String gateway (int capacidade, String ip){
        int b, c, d ;
        String gateway = ip;
        String[] arrayItens = ip.split("/");
        String[] arrayIp = arrayItens[0].split("\\.");
        if (capacidade <= 256){
            d = 1;
            gateway = (arrayIp[0]+"."+arrayIp[1]+"."+arrayIp[2]+"."+d);
        }if ((capacidade/256)<=256 && capacidade > 256){
            d = 1;
            c = 0;
            gateway = (arrayIp[0]+"."+arrayIp[1]+"."+c+"."+d);
        }if (((capacidade/256)/256)<=256 && capacidade > 65536){
            d = 1;
            c = 0;
            b = 0;
            gateway = (arrayIp[0]+"."+b+"."+c+"."+d);
        }
            return gateway;
    } 
    
    String broadcast (int capacidade, String ip){
        int b, c, d ;
        String broadcast = ip;
        String[] arrayItens = ip.split("/");
        String[] arrayIp = arrayItens[0].split("\\.");
        if (capacidade <= 256){
            d = capacidade-1;
            broadcast = (arrayIp[0]+"."+arrayIp[1]+"."+arrayIp[2]+"."+d);
        }if ((capacidade/256)<=256 && capacidade > 256){
            d = 255;
            c = (capacidade/256)-1;
            broadcast = (arrayIp[0]+"."+arrayIp[1]+"."+c+"."+d);
        }if (((capacidade/256)/256)<=256 && capacidade > 65536){
            d = 255;
            c = 255;
            b = ((capacidade/256)/256)-1;
            broadcast = (arrayIp[0]+"."+b+"."+c+"."+d);
        }
            return broadcast;
    }    
        String pegaIp(String ips){
        String[] separando = ips.split("/");
        return separando[0];
    }
    String pegaMascara(String ips){
        String[] separando = ips.split("/");
        int num = Integer.parseInt(separando[1]);
        String ipClass = ("nulo");
        switch (num){
        case 8:
            ipClass = ("255.0.0.0/16777216");
        break;
        case 16:
            ipClass = ("255.255.0.0/65536");
        break;
        case 20:
            ipClass = ("255.255.240.0/4096");
        break;
        case 21:
            ipClass = ("255.255.248.0/2048");
        break;
        case 22:
            ipClass = ("255.255.252.0/1024");
        break;
        case 23:
            ipClass = ("255.255.254.0/512");
        break;
        case 24:
            ipClass = ("255.255.255.0/256");
        break;
        case 25:
            ipClass = ("255.255.255.128/128");
        break;
        case 26:
            ipClass = ("255.255.255.192/64");
        break;
        case 27:
            ipClass = ("255.255.255.224/32");
        break;
        case 28:
            ipClass = ("255.255.255.240/16");
        break;
        case 29:
            ipClass = ("255.255.255.248/8");
        break;
        case 30:
            ipClass = ("255.255.255.252/4");
        break;
        case 31:
            ipClass = ("255.255.255.254/2");
        break;
        case 32:
            ipClass = ("255.255.255.255/1");
        break;
        default:
            ipClass = ("--/O IP digitado é inválido, pois não possui classe");
        break;
        }
        return ipClass;
    }
    String mascara(String mascaraRede){
        String[] a = mascaraRede.split("/");
        String b = a[0];
        return b;
    }
    String infoClasse (String mascaraRede){
        String[] a = mascaraRede.split("/");
        String b = a[1];
        return b;
    }
    String pegaClasse(String ip){
        String[] a = ip.split("\\.");
        int b = Integer.parseInt(a[0]);
        String vClass;
                 if ((b >=   0) && (b <=127)) vClass = ("A");
            else if ((b >= 128) && (b <=191)) vClass = ("B");
            else if ((b >= 192) && (b <=223)) vClass = ("C");
            else if ((b >= 224) && (b <=239)) vClass = ("D");
            else if ((b >= 240) && (b <=247)) vClass = ("E");
            else vClass = ("IP Inválido");
        return vClass;
    }    
}
