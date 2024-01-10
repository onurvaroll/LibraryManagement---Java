/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author berka
 */
public abstract class RankUserAbstract {
    String name;
    String no;
    String password;
    
    abstract void Create();
    abstract void Delete();
    abstract void Update(String name);
}
