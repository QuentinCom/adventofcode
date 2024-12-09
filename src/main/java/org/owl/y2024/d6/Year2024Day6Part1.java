package org.owl.y2024.d6;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Year2024Day6Part1 {

  private static final String LAB_MAP =
      """
......................#...#..............#.....................................#...#..............##..............................
......#.....#................#....#...........#........#......................#...............................#.....#.#.###..#...#
...#.#.................#........#.................#.........................................................#.....................
.....................................................................................................#.........#..................
.............................#.................#...................................#.....#....#........................#....#.....
..........................#.....................................................................#..#.............#................
.................#...........................#..........................#..............................#.#..#...................#.
..#....#....#......................................................................#....#.........................................
..................................#............#...........#...........................................#.#....#.............#.#...
...#...##....................................................................................#..........#..................#......
..................#.....#......#.....#...#.........#..#.............................#....##.............#...............##.#..#...
......#...............................................................................................................#..........#
...........#................................#.......#.............#...............#...................................#...........
............##...........................#........................................................................#...............
...............................#........#...#.................................#..#.#.............#...........#....................
........#..........#.#....................................................#........#....#..#.................................#....
.........#..............#........................#................................................................................
..................#..........................#.............#..................#.#...........#.....#...............................
...#...........#.#..........#.....................................................................................................
..............#.................#.....................................................................#...#......#.....#..........
..#.....#................................................................................................#.#.....#..........#.....
#.#..........#...#.............................#...............#..................................................#.#.............
..........................#..#.............#................................................................................#.....
...#..............................................................................................#..............#..#.......#.....
........................................#......#........................................#...................##...........#........
.............#..............#...........................##...#............#.....#..#..............................................
..#....#..#...............#........#.................#............................................#........##...............#.....
................................................#.......#...........##.............................#.##...........................
............................#..............#..#...........#...#.....#.#...................#.....#.............................#...
....................#....................................................................................#........................
.......................................................................................#.......................##..#..............
#.............................#.............................................................#............................#........
..............................................................................#.............#...#.........##......................
...............#..........................#.............#............#...........................................#................
................#........................#................................#...#............#.............................#........
..............................................................#.....#..........#.......#........#....#..................#.........
........................................................#..............................................................#.......#..
..#........#............#........#...#.....#.......#..............................................................................
..#..............#.#.....................................#..................................................#....##...............
............#........................#..........##.................................................................#........#.....
............#............#.#...............................................#.......#..............................................
..................#.........................................#............................#......#..................#...........#..
........................................................#.............##................................#........................#
.....................#...#......#.......#............#........#..................#...#.#....................................#.....
...........................................................................................#..............................#....#..
....#...................#.............#..........#..................................#.............................................
......................................#...............................................#..#........................................
.................#..#............................................#.............................................................#.#
............##...................................................................................#.........................#......
.........#.................................................#..#........................................#.....#..........#.....#...
.........#........................................................................................#.#...............#............#
..........#..#...........#...................#.....#.......#......#....#..#.......................#..........#..........#.........
......#...................................................#....#..............#....#.........##...#...............................
.........#........#........................#...........................................................#.......#................#.
.....................#...............................................#.##.........................................................
................................................................................#.............#..............#............#.......
......#..........#............................................#...#....................#...............................#.........#
......................................#....#.........#..............................................................#...#.........
.......##...#.#..........................................................#............#...........#........#...................#..
.....#............................................................................#............................#..................
....#..................#....#......#......#......................#......................#.......................................#.
..#..............#..#............#.................................#............#..................#................#.............
........................................................#....#...................................##.......................#.......
..........#..................................#....#........#.......#..........................#................#...............#..
.....................................#.................#..................#...........#...........................................
.........#..............#...................................................................................#...................#.
.................##.................................#.......#.......................................................#.........#...
...........#.................#..........................#...............................#..#...........................#..........
.....................................#...........................#...................#..............................#..#..........
.............................#.....#.................................................#.................##...............#.......#.
............#.........................................................................................................#...........
..........##.............#...................#.#...........................................#....................................##
..........#..#...#...............#........#........................................................#.................#............
....................#......................#....................................................#.#.....................#.........
.......................................#............#........................##............#....#..#..............................
..........#..........#.....................................#.................................#.......#............................
....#.............#...............................................................................................................
..#..............................................#....#......#........................................#.................#.........
...#......#.....#..............................#....#....................#......#..................#...................#.......#..
...............#..#...........................##..................................................................................
........#..#.....#.........................#.......#.............#..........................................#................#....
...#......#.............#...............#.............................................................................##..........
#.................................#.......#.........#.#.#...................................#...#.#...........#..........#........
#.........#....#...#.........#.#.............................................................#....................................
........................#.#.......#.................................................#.............................................
...#...##...#..#...........................#.....#..........................#...............................#.......#.............
................#..............................#..........##...................................................................#..
.......................................................................#...#..#...#.....#....#..................##..........#.....
#.....................#.........#........#.....................................................................#.....#.......#....
...........#......................#.......#.................................................#........................#............
.......#.........................................#.....#...#...........#................#....#......#...........#......#..........
....#.............#...............................#...#....#..#..#...........................................#.............#......
...#.........#..........................................#.....#...........^.#...#....#...........................#................
.....#..#...............#...........................#.#..........#........................................................#.......
.............#.......#.............................................................................................#...#..........
..#...................#...............................#......#............#...........#.......#...................................
...........#.......................#..........#...#.......................#..............#.............##.............#..#........
..#............#.............#.......................................................#.....##....................................#
.#.........#.....................................................................#.........#......................................
.............#....................................................................#.....#.............#...#...........#..........#
..........................#.....#...#......................#.................................#.....#.................#.......#....
..........#.#.....................................................................................................................
............#.......#....................#.......#.............................................#..................................
.......................................#..#........#...................................................#..........................
...................#........#....#........#..................#..........................................................#.........
........#..............#....................#............#......#...........#.....#..............................#.........#......
.......#.....#.................#.#..#..............................................................#.......#..#...........#......#
.#....................##.....................................................#...#.....#..........................................
...........#..................#.....#....#............#...............#....#............#.......................#.................
........#.....................................#......##............#..........................#..........#....................#...
..........................#...............................................................#.......................................
......................#..................................#.....................#.............................................#...#
.........#..............................................................#........##.........#.......#.............................
....#...#........#...........#....#.............#............#.....#..............................................................
...........#...............................................................................................#.......#..#...........
........#..........................#............................#...........#............#.............................#..........
.......#...........................#...#...............#..#..#...................#.........#......................................
..#..............................#........#...........#.......................................#...#...............................
.............#...#.............#.........#...........#.....................................#................#.....................
.........................#..........................#.................................#...........................................
..................##.............#........#......#............#........................#.......#......................#....#......
.....#............................................................................................................................
.#..................................#.....#.............#...#.............................................#..............#..##..#.
...............#........................................................#.........#..#..........#.........................#.......
.............................................#...................#.................#..................#......................#....
............................#.......................................................................................#.............
............#...............#....................#....#..........#..#..............................#......#.......#.......##......
............#.................................................................................#...................................
........................#...............................................................#......#.......#.......#.......###......#.
......................................#.#.........................................#.....#.............................#.........#.
""";

  private static final List<String> LAB_MAP_LINES = LAB_MAP.lines().toList();

  private static Direction currentDirection = Direction.UP;

  public static void main(final String[] args) {
    final String guardLine =
        LAB_MAP.lines().filter(line -> line.contains("^")).findAny().orElseThrow();
    final Position initialPosition =
        new Position(guardLine.indexOf("^"), LAB_MAP_LINES.indexOf(guardLine));

    final Set<Position> guardPositions = new HashSet<>();
    Position nextPosition = initialPosition;
    while(nextPosition != null) {
      guardPositions.add(nextPosition);
      nextPosition = computeNextPosition(nextPosition);
    }

    System.out.println("Number of distinct positions : " + guardPositions.size());
  }

  private static Position computeNextPosition(final Position currentPosition) {
    try {
      final Position nextPosition = switch (currentDirection) {
        case UP ->
            new Position(currentPosition.colIndex(), currentPosition.lineIndex() - 1);
        case DOWN ->
            new Position(currentPosition.colIndex(), currentPosition.lineIndex() + 1);
        case LEFT ->
            new Position(currentPosition.colIndex() - 1, currentPosition.lineIndex());
        case RIGHT ->
            new Position(currentPosition.colIndex() + 1, currentPosition.lineIndex());
      };

      if(LAB_MAP_LINES.get(nextPosition.lineIndex()).charAt(nextPosition.colIndex) == '#') {
        currentDirection = currentDirection.getNextDirection();
        return computeNextPosition(currentPosition);
      }
      else return nextPosition;
    } catch(final IndexOutOfBoundsException _) {
      return null; // The end
    }
  }

  private enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT;

    public Direction getNextDirection() {
      return switch (this) {
        case UP -> RIGHT;
        case DOWN -> LEFT;
        case LEFT -> UP;
        case RIGHT -> DOWN;
      };
    }
  }

  private record Position(int colIndex, int lineIndex) {}
}