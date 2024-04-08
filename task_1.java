@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Ождиается true если пользователю 18 лет и более", true, isAdult);// Напиши код здесь
}
