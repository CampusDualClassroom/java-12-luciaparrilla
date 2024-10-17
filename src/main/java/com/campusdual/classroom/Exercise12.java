package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Citröen", "Xsara", "Diesel");

        //Método booleano que verifique si el valor del tacómetro es 0

        myCar.isTachometerGreaterThanZero();

        //Encender el coche investigando el valor correcto del tacómetro

        myCar.start();

        //Intentar encender el coche cuando ya está encendido

        myCar.start ();


        //Apagar el coche comprobando que el valor del tacómetro es correcto

        myCar.stop();

        //Intentar apagar el coche mientras todavía está en movimiento

        myCar.start();
        myCar.accelerate();
        myCar.stop();

        //Acelerar el coche

        myCar.accelerate();

        //Intentar acelerar intentando superar la velocidad máxima

        myCar.speedometer = 120;
        myCar.accelerate();

        //Frenar la velocidad

        myCar.brake();

        //Intentar frenar hasta un valor negativo

        myCar.speedometer = 0;
        myCar.brake();

        //Girar el volante 20 grados

        myCar.turnAngleOfWheels(20);

        //Intentar girar el volante más de 45 grados o -45 grados

        myCar.turnAngleOfWheels(-200);

        //Detener el coche y poner marcha atrás

        myCar.stop();
        myCar.setReverse(true);

        //Intentar poner el coche marcha atrás mientras todavía va hacia adelante

        myCar.start();
        myCar.accelerate();
        myCar.setReverse (true);

    }
}