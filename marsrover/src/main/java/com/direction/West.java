package com.direction;

public class West extends Direction {

  public West() {
    this.direction = 'W';
  }

  @Override
  public Direction turnLeft() {
    return new South();
  }

  @Override
  public Direction turnRight() {
    return new North();
  }
}
