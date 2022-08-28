package com.codewithmosh.structural.composite_done;

public class HumanResource implements Resource{
  @Override
  public void deploy() {
    System.out.println("Deploying a human resource");
  }
}
