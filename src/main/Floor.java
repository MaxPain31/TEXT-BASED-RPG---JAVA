/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

public class Floor {
    private String floorName;
    private String enterMsg;
    private String exitMsg;
    ArrayList<Floor> dataFloor;
    
    public Floor(String floorName,String enterMsg, String exitMsg){
        this.floorName = floorName;
        this.enterMsg = enterMsg;
        this.exitMsg = exitMsg;
        this.dataFloor = new ArrayList<>();
    }
    public ArrayList<Floor>getFloor(){
        return this.dataFloor;
    }
    public String getFloorName(){
        return this.floorName;
    }
    public String getEnterMsg(){
        return this.enterMsg;
    }
    public String getExitMsg(){
        return this.exitMsg;
    }
}
