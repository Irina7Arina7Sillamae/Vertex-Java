
package random;

public class Random {

   
    public static void main(String[] args) {
        /*
        //Генерация случайных чисел
        int a = (int)(Math.random()*2+1);
        System.out.println(a);*/

        /*
        //Округление чисел
        float num = 6.75f;
        System.out.println(Math.round(num));
        System.out.println(Math.floor(num));
        System.out.println(Math.ceil(num));*/
        
        /*
        // min и max в java
        float num1 = 4.025f;
        int num2 = 5;
         System.out.println("Большее число из двух чисел: " + Math.max(num1, num2));
         System.out.println("Меньшее число из двух чисел: " + Math.min(num1, num2));*/

        /*
        //метод lenght() в Java - возвращает длину строки
        String fraza = "Обожаю Java";
        System.out.println(fraza.length());*/
                
        /*
        //Метод concat() в Java - добавляет одну строку в конец другой строке
         String fr = "У меня есть цель на ближайший год. ";
         fr = fr.concat("Я должна стать Java разработчиком.");
         System.out.println(fr);*/
        
        /*
        //Метод charAt - возвращает символ стоящий на определенном индексе
        String fr = "Осенняя пора очей очарованье";
        char ch1 = fr.charAt(0);
        char ch2 = fr.charAt(15);
        char ch3 = fr.charAt(20);
        System.out.println("Индекс 0 - это буква: " + ch1);
        System.out.println("Индекс 15 - это буква: " + ch2);
        System.out.println("Индекс 20 - это буква: " + ch3);*/
        
        /*
        //Метод substring в java - возвращает часть строки по индексам
        String fr = "Я спросила у кукушки,\n" +
"Сколько лет я проживу…\n" +
"Сосен дрогнули верхушки.\n" +
"Желтый луч упал в траву.\n" +
"Но ни звука в чаще свежей…\n" +
"Я иду домой,\n" +
"И прохладный ветер нежит\n" +
"Лоб горячий мой.";
        //System.out.println(fr);
        //System.out.println(fr.substring(10));
        System.out.println(fr.substring(11,20));*/
        
        /*
        // Метод trim() - позволяет удалить пробелы в начале и конце строки.
        String fr1 = "     Java - очень крутой язык программирования.    ";
        String fr12= "     Java - очень крутой язык программирования.    ";
                
        System.out.println(fr1); 
        System.out.println(fr1.trim()); */
                
        /*
        // Метод endsWith - определяет заканчивается ли строка заданным значением.
        String fr = "Good morning";
        boolean b1 = fr.endsWith("morning");
        boolean b2 = fr.endsWith("evening");
        System.out.println("Строка " + fr + " заканчивается 'morning'?   " + b1);
        System.out.println("Строка " + fr + " заканчивается 'evening'?   " + b2);*/
       
        /*
        // Метод toUpperCase - делает все буквы в строке заглавными
        String fr = "Красною кистью\nРябина зажглась.\nПадали листья.\nЯ родилась.";
        System.out.println(fr);
        System.out.println(fr.toUpperCase());*/
        
        /*
        // Метод toLowerCase() в Java - сделать буквы строчными
        String fr = "Красною Кистью Рябина Зажглась. Падали Листья, Я Родилсь.";
        System.out.println(fr);
        System.out.println(fr.toLowerCase());*/
        
        
        // Метод equals() в Java - проверяет равны ли два объекта.
        String fr1 = "Шоколадом лечить печаль";
        String fr2 = "Шоколадом лечить печаль";
        String fr3 = "И смеяться в лицо прохожим!";
        System.out.println("Сравниваем fr1 и fr2:  " + fr1.equals(fr2));
        System.out.println(fr1.equals(fr3)); 






    }
    
}
