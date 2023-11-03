/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Entity {
    private Entity path, word;

    public Entity() {
    }

    public Entity(Entity path, Entity word) {
        this.path = path;
        this.word = word;
    }

    public Entity getPath() {
        return path;
    }

    public void setPath(Entity path) {
        this.path = path;
    }

    public Entity getWord() {
        return word;
    }

    public void setWord(Entity word) {
        this.word = word;
    }
    
    
}
