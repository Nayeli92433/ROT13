public class Cifrar {
    public String[] cifrandoRot13(String palabra) {
        String desifrado = "";
        char letra;

        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.charAt(i);
            if(letra>=97 && letra<=109 || letra>=65 && letra<=77){
                letra += 13;
            }
            else {
                letra -= 13;
            }
            desifrado+=letra;
        }
        return new String[]{desifrado};
    }
        public void muestra(String [] palabra, int op){

            for (int i = 0; i < palabra.length; i++) {
                if (op == 1) {
                    System.out.println("-----------------------------------------");
                    System.out.println("Tu palabra cifrada es: " + palabra[i]);
                    System.out.println("-----------------------------------------");
                }
                else {
                    System.out.println("-----------------------------------------");
                    System.out.println("Tu palabra desifrada es: " + palabra[i]);
                    System.out.println("-----------------------------------------");
                }
            }
        }

    }



