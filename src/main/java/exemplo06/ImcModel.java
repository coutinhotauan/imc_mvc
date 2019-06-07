package exemplo06;

public class ImcModel {

    public static String imcValor(float imc) {
        if (imc < 18)
            return "Magreza grave";
        
        else if(imc >= 16 && imc < 17)
            return "Magreza moderada";

        else if(imc >= 17 && imc < 18.5)
            return "Magreza leve";
        
        else if(imc >= 18.5 && imc < 25)
            return "Saudavel";
        
        else if(imc >= 25 && imc < 30)
            return "Sobrepeso";
        
        else if(imc >= 30 && imc < 35)
            return "Obesidade";
        
        else if(imc >= 35 && imc < 40)
            return "Obesidade severa";
        
        else if(imc >= 40)
            return "Obesidade morbida";
            
        return "retorno generico";
	}

}
