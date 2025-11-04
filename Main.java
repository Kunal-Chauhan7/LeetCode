package kunal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

interface Connactable{
    void ConnectToWifi(String network);
}

abstract class SmartDevice{
    private String deviceName;
    private boolean isOn;
    abstract void turnOn();
    abstract void turnOff();
    void ShowStatus(){
        System.out.println("Device is " + isOn);
    }
    void setDeviceName(String deviceName){
        this.deviceName = deviceName;
    }
    String getDeviceName(){
        return deviceName;
    }
    Boolean getStatus(){
        return isOn;
    }
    void setStatus(boolean status){
        this.isOn = status;
    }

    SmartDevice(String deviceName , boolean isOn){
        this.isOn = isOn;
        this.deviceName = deviceName;
    }
    SmartDevice(){}
}

class SmartFan extends SmartDevice implements Connactable{

    private int minutes;

    private String mode;

    int getMinutes(){
        return minutes;
    }
    String getMode(){
        return mode;
    }

    void setMinutes(int minutes){
        this.minutes = minutes;
    }
    void setMode(String mode){
        this.mode = mode;
    }

    void setTimer(int minutes){
        setMinutes(minutes);
    }
    void setTimer(int minutes , String mode){
        setMinutes(minutes);
        setMode(mode);
    }

    private String network;

    void setNetwork(String network){
        this.network = network;
    }

    String getNetwork(){
        return network;
    }

    SmartFan(String deviceName , boolean status){
        super(deviceName,status);
        System.out.println("Object of SmartLight Created");
    }

    @Override
    public void ConnectToWifi(String network) {
        setNetwork(network);
        System.out.println("wifi connected");
    }

    @Override
    void turnOn() {
        setStatus(true);
    }

    @Override
    void turnOff() {
        setStatus(false);
    }
}


class SmartLight extends SmartDevice implements Connactable{

    private int minutes;

    private String mode;

    int getMinutes(){
        return minutes;
    }
    String getMode(){
        return mode;
    }

    void setMinutes(int minutes){
        this.minutes = minutes;
    }
    void setMode(String mode){
        this.mode = mode;
    }

    void setTimer(int minutes){
        setMinutes(minutes);
    }
    void setTimer(int minutes , String mode){
        setMinutes(minutes);
        setMode(mode);
    }

    private String network;

    void setNetwork(String network){
        this.network = network;
    }

    String getNetwork(){
        return network;
    }

    SmartLight(String deviceName , boolean status){
        super(deviceName,status);
        System.out.println("Object of SmartLight Created");
    }

    @Override
    public void ConnectToWifi(String network) {
        setNetwork(network);
        System.out.println("wifi connected");
    }

    @Override
    void turnOn() {
        setStatus(true);
    }

    @Override
    void turnOff() {
        setStatus(false);
    }
}

class SmartAC extends SmartDevice implements Connactable{

    private int minutes;

    private String mode;

    int getMinutes(){
        return minutes;
    }
    String getMode(){
        return mode;
    }

    void setMinutes(int minutes){
        this.minutes = minutes;
    }
    void setMode(String mode){
        this.mode = mode;
    }

    void setTimer(int minutes){
        setMinutes(minutes);
    }
    void setTimer(int minutes , String mode){
        setMinutes(minutes);
        setMode(mode);
    }

    private String network;

    void setNetwork(String network){
        this.network = network;
    }

    String getNetwork(){
        return network;
    }

    SmartAC(String deviceName , boolean status){
        super(deviceName,status);
        System.out.println("Object of SmartLight Created");
    }

    @Override
    public void ConnectToWifi(String network) {
        setNetwork(network);
        System.out.println("wifi connected");
    }

    @Override
    void turnOn() {
        setStatus(true);
    }

    @Override
    void turnOff() {
        setStatus(false);
    }
}


//public class Main{
//    public static void main(String[] args){
//        int x = 7;
//        int y = 10;
//        x = x + y;
//        y= x - y;
//        x = x - y;
//        System.out.println(x);
//
//    }
//}

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

//public class Main {
//    public static void main(String[] args) {
//        // Anonymous class that overrides makeSound()
//        Animal myAnimal = new Animal() {
//            int age = 20;
//            public void makeSound() {
//                System.out.println("Woof woof" + age);
//            }
//        }; // semicolon is required to end the line of code that creates the object
//
//        myAnimal.makeSound();
//
//    }
//}


//class Main2{
//    int age;
//}
//
//public class Main{
//    static void change( Main2 obj){
//        obj.age++;
//    }
//    public static void main(String[] args) {
//        Main2 obj = new Main2();
//        obj.age = 1;
//        change(obj);
//        System.out.println(obj.age);
//    }
//}


class Solution {

    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> IllegalNodeValue = new HashSet<>();
        for(int i : nums) IllegalNodeValue.add(i);
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        ListNode curr = head;
        while (curr != null){
            if(IllegalNodeValue.contains(curr.val)){
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr =curr.next;
        }
        return temp.next;
    }
}

