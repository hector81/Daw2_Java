package Ejercicios_Tema4_POO;

public class Main2 {
	// main
	public static void main(String[] args) {
		// declaramos atributo
		int j;
		//el bucle recorre de 1 a 3
		for (int i = 0; i < 3; i++) {
			//realizamos calculo
			j = i + 1;
			//mientras j sea menor de 4
			while (j < 4) {
				//imprimir el resultado de j-i
				System.out.println(j - i);
				//aumentamos j
				j++;
			}//fin while
		}//fin for
	}//fin main
}//fin clase

////////////////////////////////traza////////////////

//j-----i ----- for (int i = 0; i < 3; i++) --------- j = i + 1 --------------- while (j < 4)  ----------- System.out.println(j - i); --- j++
//*     0             v                                   1                          v                            1                        2
//*     *             *                                   *                          v                            2                        3
//*     *             *                                   *                          V                            3                        4
//*     *             *                                   *                          F                            *                        *
//*     1             v                                   2                          v                            1                        3
//*     *             *                                   *                          v                            2                        4
//*     *             *                                   *                          f                            *                        *
//*     2             v                                   3                          v                            1                        4
//*     *             *                                   *                          f                            *                        *
//*     3             f                                   *                          *                            *                        *
//rESULTADO
// 1 2 3 1 2 1
