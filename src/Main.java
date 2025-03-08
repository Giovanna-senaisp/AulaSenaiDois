import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        System.out.println("nome da empresa: "+empresa.NomeEmpresa);
        System.out.println("trabalha no endereço: "+empresa.Endereco);
        System.out.println("meu nome é: "+empresa.NomeFuncionario);
        System.out.println("meu cargo é: "+empresa.CargoFuncionario);
        System.out.println("Salario de: "+empresa.ValorSalarioFuncionario);

        EmpresaSetor empresaSetor = new EmpresaSetor();
        System.out.println(empresaSetor.nomeSetorJuridico);

//       Funcionario funcionario = new Funcionario();
//
//        System.out.println("Meu Nome é: "+funcionario.NomeFuncionario);
//        System.out.println("salario de: "+funcionario.ValorSalarioFuncionario);
//        System.out.println("Meu cargo é: "+funcionario.CargoFuncionario);
//
//        Empresa empresa = new Empresa();
//        System.out.println("nome da empresa: "+empresa.NomeEmpresa);
//        System.out.println("CNPJ é: "+empresa.CNPJ);
//        System.out.println("Tipo: "+empresa.Tipo);
//        System.out.println("Endereço: "+empresa.Endereco);

    }
}