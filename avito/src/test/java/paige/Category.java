package paige;

public enum Category {

    Автомобили("Автомобили"),
    Мотоциклы("Мотоциклы и мототехника"),
    ГрузовикиСпецтехника("Грузовики и спецтехника"),
    ВодныйТранспорт("Водный транспорт"),
    ЗапчастиАксесуары("Запчасти и аксессуары"),
    Недвижимость("Недвижимость"),
    Квартиры("Квартиры"),
    Комнаты("Комнаты"),
    ДомаДачиКотеджы("Дома, дачи, коттеджи"),
    ГаражиМашиноместа("Гаражи и машиноместа"),
    ЗемельныеУчастки("Земельные участки"),
    КоммерчискаяНедвижимость("Коммерческая недвижимость"),
    НедвижимостьЗаРубежом("Недвижимость за рубежом"),
    Работа("Работа"),
    Вакансии("Вакансии"),
    Резюме("Вакансии"),
    Оргтехника("Оргтехника и расходники");

    public String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
