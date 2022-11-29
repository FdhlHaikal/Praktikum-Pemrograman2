/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.soal1;

/**
 *
 * @author LENOVO
 */
public abstract class Shape {
    protected String shapeName;
    
    public Shape(String name){
        shapeName = name;
    }
    
    protected abstract double area();
    
    public String toString(){
        return shapeName;
    }
}