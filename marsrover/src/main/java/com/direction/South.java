package com.direction;

public class South extends Direction {

  public South() {
    this.direction = 'S';
  }

  @Override
  public Direction turnLeft() {
    return new East();
  }

  @Override
  public Direction turnRight() {
    return new West();
  }
}
