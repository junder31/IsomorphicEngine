package jeu2d.map;

import jeu2d.TileVertex;

/**
 * Created by junderwood42 on 5/18/16.
 */
public class Tile {
    public enum VertexPosition {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    private final TileVertex[] vertices;

    private Tile(TileVertex[] vertices) {
        this.vertices = vertices;
    }

    public Tile(TileVertex left, TileVertex top, TileVertex right, TileVertex bottom) {
        TileVertex[] vertices = new TileVertex[4];
        vertices[VertexPosition.LEFT.ordinal()] = left;
        vertices[VertexPosition.TOP.ordinal()] = top;
        vertices[VertexPosition.RIGHT.ordinal()] = right;
        vertices[VertexPosition.BOTTOM.ordinal()] = bottom;
        this.vertices = vertices;
    }

    public TileVertex getVertex(VertexPosition position) {
        return vertices[position.ordinal()];
    }

    public TileVertex getLeftVertex() {
        return getVertex(VertexPosition.LEFT);
    }

    public TileVertex getTopVertex() {
        return getVertex(VertexPosition.TOP);
    }

    public TileVertex getRightVertex() {
        return getVertex(VertexPosition.RIGHT);
    }

    public TileVertex getBottomVertex() {
        return getVertex(VertexPosition.BOTTOM);
    }
}
