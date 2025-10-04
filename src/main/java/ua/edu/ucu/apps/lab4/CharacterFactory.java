// package ua.edu.ucu.apps.lab4;
// import java.lang.ReflectiveOperationException;
// import java.util.list;
// import java.lang.reflect.InvocationTargetException;
// import java.util.Random;

// public class CharacterFactory {
//     private static final Random RANDOM = new Random();
//     public static Character createRandomCharacter(){
//         int choice = RANDOM.nextInt(3);
//         switch (choice){
//             case 0:
//             return new Hobbit;
//             case 1:
//                 return new Elf;
//             case 2:
//                 return new Knight;
//             case 3:
//                 return new HKing;
//         }
//         return null;
//     }
//     public static Character createRandomCharacter()
//     throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//         int choice = RANDOM.nextInt(classes.sixe());

//     }
// }
package ua.edu.ucu.apps.lab4;

import java.util.Random;

public class CharacterFactory {
    private static final Random RANDOM = new Random();
    
    public Character createCharacter() {
        int type = RANDOM.nextInt(4);
        switch (type) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new King();
            case 3:
                return new Knight();
            default:
                return new Hobbit();
        }
    }
}