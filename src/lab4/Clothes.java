package lab4;

public class Clothes {
    private Sex sex;
    private TypeClothes type;
    private String color;
    private Style style;
    private Size size;
    private int price;

    public Clothes(Sex sex, TypeClothes type, String color, Style style, Size size, int price) {
        this.sex = sex;
        this.type = type;
        this.color = color;
        this.style = style;
        this.size = size;
        this.price = price;
    }

    public Clothes() {
        sex = Sex.MALE;
        type = TypeClothes.DRESS;
        color = "black";
        style = Style.CASUAL;
        size = Size.M;
        price = 100;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "sex=" + sex +
                ", type=" + type +
                ", color='" + color + '\'' +
                ", style=" + style +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}

enum Sex {
    MALE,
    FEMALE
}

enum TypeClothes {
    DRESS(),
    VEST,
    SWEATSHIRT,
    CARDIGAN,
    SKIRT,
    SHORT,
    TROUSERS,
    OUTEWEAR,
    BLOUSE

}


enum Style {
    SPORTY,
    CASUAL,
    FORMAL,
    FULL
}

enum Size {
    XS,
    S,
    M,
    L,
    XL,
    XXL
}
