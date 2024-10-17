package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car () {

    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Car started");
        } else {
            System.out.println("Car was already started");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Car stopped");
        } else {
            System.out.println("You can't stop the car");
        }
    }

    public void accelerate() {
        if (this.tachometer > 0) {
            if (this.speedometer < MAX_SPEED) {
                this.speedometer += 10;
                System.out.println("Accelerating");
            } else {
                System.out.println("You can't accelerate");
            }
        }
    }

    public void brake() {
        if (this.tachometer > 0) {
            if (this.speedometer > 0) {
                this.speedometer -= 10;
                System.out.println("Braking");
            } else {
                System.out.println("You can't brake");
            }
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (this.tachometer > 0) {
            if (this.wheelsAngle <= 45 && this.wheelsAngle >= -45) {
                if (this.wheelsAngle + angle < 45 && this.wheelsAngle + angle > -45) {
                    this.wheelsAngle += angle;
                    System.out.println("Angle has turned " + this.wheelsAngle + " degrees");
                } else {
                    if (angle > 0) {
                        this.wheelsAngle = 45;
                    } else {
                        this.wheelsAngle = -45;
                    }
                    System.out.println("You can only turn the steering wheel between 45 or -45 degrees");
                }
            } else {
                System.out.println("You can't turn " + angle + " degrees");
            }
        }
    }

    public String showWheelsAngleDetail() {
        return "Angle is " + this.wheelsAngle;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        if (this.tachometer > 0) {
            if (this.speedometer == 0) {
                this.reverse = reverse;
                this.gear = "R";
                System.out.println("Car is now in reverse");
            } else {
                System.out.println("Car must stop completely before going in reverse");
            }
        } else {
            System.out.println("Car is off, you can't go in reverse");
        }
    }

    public void showDetails() {
        System.out.println("\n\tBrand: " + this.brand + "\n\tModel: " + this.model + "\n\tFuel: " + this.fuel);
    }

    public boolean isTachometerGreaterThanZero() {
        if (this.tachometer > 0) {
            System.out.println("Tachometer value is greater than 0");
            return true;
        } else {
            System.out.println("Tachometer value is 0");
            return false;
        }
    }

    public boolean isTachometerEqualToZero() {
        if (this.tachometer == 0) {
            System.out.println("Tachometer value is equal to 0");
            return true;
        } else {
            System.out.println("Tachometer value is greater than 0");
            return false;
        }
    }
}
