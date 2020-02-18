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
    Direction[] directions = Direction.values();
    int index = this.ordinal();
    return (index == 0) ? directions[directions.length - 1] : directions[index - 1];
  }

  public Direction turnRight() {
    Direction[] directions = Direction.values();
    int index = this.ordinal();
    return (index == directions.length - 1) ? directions[0] : directions[index + 1];
  }

  @Override
  public String toString() {
    return "Direction{direction=" + direction + "}";
  }
}
