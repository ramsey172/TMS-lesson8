package Ex1;

class Phone {
    private String number;
    private String model;
    private int weight;

    Phone(){

    }

    Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }

    public void receiveCall(String name, String phone){
        System.out.println("Звонит "+name+", телефон звонящего - "+phone);
    }

    public void sendMessage(String... phones){
        StringBuilder phonesAsString = new StringBuilder();
        for(String phone : phones){
            phonesAsString.append(phone+"\n");
        }
        System.out.print("Отправлены сообщения по номерам:\n"+phonesAsString);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("375291111111", "Xiaomi", 125);
        Phone phone2 = new Phone("375292222222", "Apple", 115);
        Phone phone3 = new Phone("375333333333", "Samsung", 135);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Виктор");
        phone2.receiveCall("Володя");
        phone3.receiveCall("Себастьян");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Веста", "375294444444");

        phone1.sendMessage("372955555555","375296666666", "375297777777");

        String[] phones = new String[]{"375298888888","375299999999"};
        phone1.sendMessage(phones);
    }
}