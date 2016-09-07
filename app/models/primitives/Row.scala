package models.primitives

import models.config.AppConfig


class Row(override val boundingBoxes: List[BoundingBox]) extends ObjectWithBoundingBox(boundingBoxes) {
  var rowBoundingBox: Option[BoundingBox] = computeSelfBoundingBox

}

object Row {
  def apply(boundingBoxes: List[BoundingBox]): Row = new Row(boundingBoxes)
}

