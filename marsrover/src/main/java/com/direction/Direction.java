package com.direction;

import java.util.Objects;

public abstract class Direction {

  char direction;

  public abstract Direction turnLeft();

  public abstract Direction turnRight();

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Direction direction1 = (Direction) o;
    return direction == direction1.direction;
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction);
  }

  @Override
  public String toString() {
    return "Direction{direction=" + direction + '}';
  }

}
