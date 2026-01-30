class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmissiion = transmission
        self.color = color
    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")
    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")
c1=Car("Toyata","Innova",2020,"Manual","White")
c2=Car("Hyundai","Creta",2022,"Automatic","Black")
c3=Car("Tata","Nexon",2021,"Manual","Red")
c1.accelerate()
c1.stop()
c2.accelerate()
c2.stop()
c3.accelerate()
c3.stop()