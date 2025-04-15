package org.example.atividade_polimorfismo;

public class Teste {

    static void listaPartes(String titulo, Parte[] partes) {
        System.out.println(titulo);
        for (Parte p : partes) {
            System.out.println(p.toString());
        }
    }

    static Item[] criaItens(Parte[] partes) {
        Item[] itens = new Item[4];
        for (Parte p : partes) {
            if(p.cod == 112) {
                itens[0] = new Item(p, 10);
            } else if(p.cod == 232) {
                itens[1] = new Item(p, 50);
            } else if(p.cod == 234) {
                itens[2] = new Item(p, 30);
            } else if(p.cod == 111) {
                itens[3] = new Item(p, 5);
            }
        }
        return itens;
    }

    static void listaItens(String titulo, Item[] itens) {
        float valorTotal = 0;
        System.out.println(titulo);
        for (Item item : itens) {
            System.out.println(item.toString());
            valorTotal += item.calculaValor();
        }
        System.out.println("Valor total:" + valorTotal);
    }

    static Parte[] criaPartes() {
        Parte[] partes = new Parte[8];
        partes[0] = new Motor(112, "motor m112", "motor de avanco do cabecote", 100.0f, 1.2f, 1.1f, 1250);
        partes[1] = new Motor(114, "motor m114", "motor auxiliar", 60.0f, 0.6f, 0.8f, 1250);
        partes[2] = new Motor(111, "motor m111", "motor de ventilador", 70.0f, 1.0f, 1.0f, 3000);
        partes[3] = new Motor(110, "motor m110", "motor principal", 120.0f, 1.8f, 1.5f, 1250);
        partes[4] = new Parafuso(231, "parafuso p1", "parafuso de fixacao do cabecete", 2.5f, 100.0f, 8.0f);
        partes[5] = new Parafuso(232, "parafuso p2", "parafuso de fixacao do motor", 2.5f, 80.0f, 6.0f);
        partes[6] = new Parafuso(233, "parafuso p3", "parafuso de fixacao do ventilador", 2.0f, 60.0f, 6.0f);
        partes[7] = new Parafuso(234, "parafuso p4", "parafuso de uso geral", 3.0f, 120.0f, 12.0f);
        return partes;
    }

    public static void main(String[] args) {
        Parte[] partes = criaPartes();
        Item[] itens = criaItens(partes);
        listaPartes("*** Partes utilizadas na produção ****", partes);
        listaItens("*** Itens solicitados ***", itens);
    }
}


