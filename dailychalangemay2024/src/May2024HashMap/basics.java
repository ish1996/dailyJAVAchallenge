package May2024HashMap;

public class basics {

    //default capacity 16 and can be expanded eg(32) - default initial capacity(max no of entries) diffrent from size
    //load factor 0.75 *16 = 12 - when the hashmap will increase size dynamically
    //threshold -> capacity * load factor = 16 * 12 -> how many times hashmap can increase

    // how hashmap is stored - > the key value pair is sent through hash funtion taht is %10 (%capacity it 16) and that will be index
    // same for fetching


    //when string key then how is it stored?
    //HASHCODE - when name is sent then itt is converted to nurmerical value - > addition on ascii value then apply hashfunction


    //hash(hashcode(key)) -> is our hashvalue that is the index of our hashmap keyvalue pair
    //when 2 key value pair tyies to access ame hashvalue its a COLLISSION

    //IF COLLISSION then hashmap will internally create its own linked list to store key value pair. 



}
