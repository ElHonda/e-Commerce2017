package eCommerce.core.impl.negocio;

public class ValidadorCNPJ {

	public static String validar(String cnpj) {
        if (!cnpj.substring(0, 1).equals("")) {
            try {
                cnpj = cnpj.replace('.', ' ');//onde h� ponto coloca espa�o
                cnpj = cnpj.replace('/', ' ');//onde h� barra coloca espa�o
                cnpj = cnpj.replace('-', ' ');//onde h� tra�o coloca espa�o
                cnpj = cnpj.replaceAll(" ", "");//retira espa�o
                int soma = 0, dig;
				String cnpj_calc = cnpj.substring(0, 12);
                
                if (cnpj.length() != 14) {
                    return "CNPJ deve conter 14 digitos";
                }
                char[] chr_cnpj = cnpj.toCharArray();
                /* Primeira parte */
                for (int i = 0; i < 4; i++) {
                    if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                        soma += (chr_cnpj[i] - 48) * (6 - (i + 1));
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9) {
                        soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));
                    }
                }
                dig = 11 - (soma % 11);
                cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(
                        dig);
                /* Segunda parte */
                soma = 0;
                for (int i = 0; i < 5; i++) {
                    if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                        soma += (chr_cnpj[i] - 48) * (7 - (i + 1));
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9) {
                        soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));
                    }
                }
                dig = 11 - (soma % 11);
                cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(
                        dig);
                if( cnpj.equals(cnpj_calc) )
                	return null;
                else
                	return "D�gito verificador do CNPJ inv�lido !";
            }
            catch (Exception e) {
                return "N�o foi poss�vel verificar o CNPJ especificado !";
            }
        }
        else {
            return "CNPJ n�o informado";
        }
	}

}
