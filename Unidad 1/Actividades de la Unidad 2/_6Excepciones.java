package excepciones;
public class _6Excepciones {
 public static void main(String[] args) {

		_6Excepciones t = initT();
		
		t.foo("Hi");
		
	}

	private static _6Excepciones initT() {
		return null;
	}
	public void foo(String s) {
		System.out.println(s.toLowerCase());
	}
        //Obtenemos NullPointerException en la declaración t.foo(Hola); porque \t” es nulo aquí.
}
