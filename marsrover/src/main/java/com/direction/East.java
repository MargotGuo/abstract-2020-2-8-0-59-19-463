package com.direction;

public class East extends Direction {

  public East() {
    this.direction = 'E';
  }

  @Override
  public Direction turnLeft() {
    return new North();
  }

  @Override
  public Direction turnRight() {
    return new South();
  }
}
