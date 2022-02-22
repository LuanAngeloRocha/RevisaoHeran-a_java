public class Principal {
    public static void main (String[] args){
        Empregado empregado = new Empregado();//istanciação 
        empregado.setNome("Luan Angelo ");
        empregado.setEndereco("Paraguaçu Paulista ");
        empregado.setTelefone("18996206138");
        empregado.setSalario(1800);

        Empregado empregado2= new Empregado(); //Setar outro empregado 
        empregado2.setNome("Jhony");
        empregado2.setEndereco("Pompeia - SP");
        empregado2.setTelefone("18555-555");
        empregado2.setSalario(7000);

        System.out.println("==============================");
        System.out.println("Empregado numero 1");
        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        System.out.println(empregado.getSalario());
        System.out.println("==============================");
        System.out.println("Empregado numero 2");
        System.out.println(empregado2.getNome());
        System.out.println(empregado2.getSalario());
        System.out.println(empregado2.getEndereco());
        System.out.println(empregado2.getTelefone());
        System.out.println(empregado2.getSalario());
        System.out.println("==============================");

    }
}
