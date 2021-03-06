package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут

           /* User usr = new User();
            usr.setFirstName("Ivan");
            usr.setLastName("Ivanov");
            usr.setBirthDate(new GregorianCalendar(1980, 11, 25).getTime());
            usr.setCountry(User.Country.RUSSIA);
            usr.setMale(true);
            User usrw = new User();
            usrw.setFirstName("Ivan");
            usrw.setLastName("Ivanov");
            usrw.setBirthDate(new GregorianCalendar(1980, 11, 25).getTime());
            usrw.setCountry(User.Country.RUSSIA);
            usrw.setMale(true);

            javaRush.users.add(usr);
            javaRush.users.add(usrw);*/

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            /*System.out.println(javaRush.equals(loadedObject));*/

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream);

            users.forEach(user -> {
                boolean isSet = user.getFirstName() != null;
                printWriter.println(isSet);
                if (isSet)
                    printWriter.println(user.getFirstName());

                isSet = user.getLastName() != null;
                printWriter.println(isSet);
                if (isSet)
                    printWriter.println(user.getLastName());

                isSet = user.getBirthDate() != null;
                printWriter.println(isSet);
                if (isSet)
                    printWriter.println(user.getBirthDate().getTime());

                isSet = user.getCountry().getDisplayedName() != null;
                printWriter.println(isSet);
                if (isSet)
                    printWriter.println(user.getCountry().getDisplayedName());

                printWriter.println(user.isMale());
            });
            printWriter.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            while (reader.ready()) {
                User user = new User();

                boolean isSet = Boolean.parseBoolean(reader.readLine());
                if (isSet)
                    user.setFirstName(reader.readLine());

                isSet = Boolean.parseBoolean(reader.readLine());
                if (isSet)
                    user.setLastName(reader.readLine());

                isSet = Boolean.parseBoolean(reader.readLine());
                if (isSet)
                    user.setBirthDate(new Date(Long.parseLong(reader.readLine())));

                isSet = Boolean.parseBoolean(reader.readLine());
                if (isSet)
                    user.setCountry(User.Country.valueOf(reader.readLine().toUpperCase()));

                user.setMale(Boolean.parseBoolean(reader.readLine()));

                users.add(user);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
