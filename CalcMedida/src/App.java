import java.util.Scanner;
 
public class App {
    static Scanner tcl = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {

        System.out.println("- Olá, bem vindo ao conversor de medidas");
        System.out.println("Por favor, escolha uma das opções abaixo");
        System.out.println("----------------Menu--------------------");
        System.out.println("1 - converter Centímetros para Polegadas");
        System.out.println("2 - Converter Polegadas para Centímetros");
        System.out.println("3 - Converter de Celsius para Fahrenheit");
        System.out.println("4 - Converter de Fahrenheit para Celsius");
        int opcao = tcl.nextInt();


        switch (opcao) {
            case 1:
            
            centimetroParaPolegada();
            
            break;
            case 2:
            polegadaParaCentimetro();  

            
            break;

            case 3:


            celsiusParaFahrenheit();
            
            break;
            case 4:
            fahrenParaCelsius();
            
            break;

            default:
                    
            
            break;
        }

    }

        public static boolean validadados(String valor) {
            try {
                Double.parseDouble(valor);
                return true;
            } catch (Exception e) {
                return false;
            }
        }



    public static void centimetroParaPolegada() {  
        do {
            try {            
                System.out.println("Digite o valor em centímetros");
                double centimetro = tcl.nextDouble();
                double polegada = centimetro / 2.54;
                System.out.println("O valor em polegadas é: " + polegada);
                break;

            } catch (Exception e) {
            // TODO: handle exception
                System.out.println("Digite um valor válido");
                tcl.next();
            }

        } while (true);
        
        
    }

    public static void polegadaParaCentimetro() {  
        do {
             try {
            System.out.println("Digite o valor em polegadas");
            double polegada = tcl.nextDouble();
            double centimetro = polegada * 2.54;
            System.out.println("O valor em centímetros é: " + centimetro);
            break;
            } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Digite um valor válido");
            tcl.next();
            } 

        } while (true);
      

    }

    public static void celsiusParaFahrenheit() {  
       do {
        
          try {
             System.out.println("Digite o valor em Celsius");
            double celsius = tcl.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("O valor em Fahrenheit é: " + fahrenheit);
            break;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Digite um valor válido");
            tcl.next();
        }

       } while (true);
       
      
       
    }

    public static void fahrenParaCelsius() {

        do {
            

              try {
            System.out.println("Digite o valor em Fahrenheit");
            double fahrenheit = tcl.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("O valor em Celsius é: " + celsius);
            break;
            } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Digite um valor válido");
            tcl.next();
            }
            
        } while (true);
      
        
    }
      
}
