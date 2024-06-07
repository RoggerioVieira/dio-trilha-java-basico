
package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
        felipe.setSexo("Masculino");
		felipe.setIdade(8);
		
		System.out.println("O aluno " + felipe.getNome()+ " do sexo " + felipe.getSexo()+ " tem " + felipe.getIdade() + " anos ");
				 		
	}
}



