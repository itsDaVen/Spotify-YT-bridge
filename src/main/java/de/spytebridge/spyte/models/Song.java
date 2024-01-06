package de.spytebridge.spyte.models;

import java.util.List;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Song {

  List<Artist> artists;
  String title;
  Long views;
  Long likes;
  Long length;  //vielleicht passenderen DataType finden

}
