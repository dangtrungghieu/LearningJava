package Source;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class DictionarySystem {
    TreeMap<String, String> dictionary;

    //Constructor
    public DictionarySystem() {
        dictionary = new TreeMap<String, String>();
    }

    //Get, set
    public TreeMap<String, String> getDictionary() {
        return dictionary;
    }
    public void setDictionary(TreeMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    //Yeu cau 1: Them tu moi
    public void put(String key, String value){
        this.dictionary.put(key, value);
    }
    //Yeu cau 2: Xoa tu
    public String remove(String key){
        return this.dictionary.remove(key);
    }
    //Yeu cau 3: Tra tu
    public void search(String key){
        System.out.println(this.dictionary.get(key));
    }
    //Yeu cau 4: In toan bo dictionary
    public void printAllKey(){
        HashSet<String> set = new HashSet<>();
        set.addAll(dictionary.keySet());
        System.out.println(Arrays.toString(set.toArray()));
    }

    //Yeu cau 5: Dem so luong tu hien co
    public int count(){
        return this.dictionary.size();
    }

    //Yeu cau 6: Xoa tat ca cac tu khoa
    public void deleteAll(){
        this.dictionary.clear();
    }

    //Yeu cau 7: In tu khoa kem theo y nghia
    public void printFull(){
        for(String s : this.dictionary.keySet()){
            System.out.println("Tu khoa la: " + s + " co y nghia la: " + this.dictionary.get(s));
        }
    }
}
