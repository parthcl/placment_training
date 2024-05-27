class Rectangle:
    def __init__(self, length, breadth):
        self.length = length
        self.breadth = breadth

    def print_area(self):
        area = self.length * self.breadth
        print(f"Rectangle Area: {area}")

    def print_perimeter(self):
        perimeter = 2 * (self.length + self.breadth)
        print(f"Rectangle Perimeter: {perimeter}")

class Square(Rectangle):
    def __init__(self, side):
        super().__init__(side, side)

# Creating an instance of Rectangle
rect = Rectangle(10, 5)
rect.print_area()
rect.print_perimeter()

# Creating an instance of Square
sq = Square(4)
sq.print_area()
sq.print_perimeter()
