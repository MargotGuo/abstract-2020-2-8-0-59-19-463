package com;

public enum Direction {
  WEST('W'),
  NORTH('N'),
  EAST('E'),
  SOUTH('S');   // 对于每个direction来说，前一个index是左边的方向，后一个index是右边的方向

  private char direction;

  Direction(char direction) {
    this.direction = direction;
  }

  public Direction turnLeft() {
    return Direction.values()[(this.ordinal() + 3) % 4];
  }

  public Direction turnRight() {
    return Direction.values()[(this.ordinal() + 1) % 4];
  }

  @Override
  public String toString() {
    return "Direction{direction=" + direction + "}";
  }
}
