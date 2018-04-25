/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;
public class ordenamientoobjetos {
    public static void main(String[] args) {
        Estudiante [] arrayEstudiante = new Estudiante[5];
        arrayEstudiante[0] = new Estudiante("Juan", "Polania", "123", 5, 5.0);
        arrayEstudiante[1] = new Estudiante("Carlos", "Rodriguez", "456", 3, 4.0);
        arrayEstudiante[2] = new Estudiante("Camilo", "Lopez", "789", 6, 2.0);
        arrayEstudiante[3] = new Estudiante("Paula ", "Zuñiga", "012", 2, 2.5);
        arrayEstudiante[4] = new Estudiante("Carlos", "Cortez", "345", 1, 4.5);
        arrayEstudiante[5] = new Estudiante("Sebastian", "Ospina", "678", 4, 3.5);
        int temp;
        for(int i=1;i < arrayEstudiante.length;i++){
            for (int j=0 ; j < arrayEstudiante.length- 1; j++){
                if (arrayEstudiante[j].getNota() < arrayEstudiante[j+1].getNota()){
                    temp = arrayEstudiante[j].getPuesto();
                    arrayEstudiante[j].setPuesto(arrayEstudiante[j+1].getPuesto());
                    arrayEstudiante[j+1].setPuesto(temp);
                }
            }
        }
    }
}
