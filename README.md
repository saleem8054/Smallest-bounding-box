This program fills a collection with several regular shapes (circle, regular triangle, square, regular hexagon).
it determines the smallest bounding box, which contains all the shapes, and its sides parallel with
an x or y axis.

Description:

Each shape can be represented by its center and side length (or radius), if we assume that one
side of the polygons are parallel with x axis, and its nodes lies on or above this side.
Load and create the shapes from a text file. The first line of the file contains the number of the
shapes, and each following line contain a shape. The first character will identify the type of the
shape, which is followed by the center coordinate and the side length or radius.
Manage the shapes uniformly, so derive them from the same super class.
