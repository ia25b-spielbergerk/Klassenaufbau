package exercise3;

public class Car {
    public double fuelLevel;
    public double mileage;
    public String licensePlate;
    public double fuelConsumption;
    public int fuelCapacity;

    public Car(String licensePlate, double mileage, int fuelCapacity, double fuelConsumption, double fuelLevel ) {
        this.licensePlate = licensePlate;
        this.mileage = mileage;
        this.fuelConsumption = fuelConsumption;
        this.fuelCapacity = fuelCapacity;

        if (fuelLevel > fuelCapacity) {
            this.fuelLevel = fuelCapacity;
        } else {
            this.fuelLevel = fuelLevel;
        }
    }

    public void drive(int distance) {
        double fuelNeeded = distance * fuelConsumption;

        if (fuelNeeded <= fuelLevel) {
            this.fuelLevel -= fuelNeeded;
            this.mileage += distance;
        } else {
            double maxDistance = fuelLevel / fuelConsumption;
            this.mileage += maxDistance;
            this.fuelLevel = 0;

            this.mileage = Math.round(this.mileage * 100.0) / 100.0;
        }
    }

    public void refuel(int amount) {
        this.fuelLevel += amount;

        if (this.fuelLevel > this.fuelCapacity) {
            this.fuelLevel = this.fuelCapacity;
        }
    }

    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", mileage=" + mileage +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}